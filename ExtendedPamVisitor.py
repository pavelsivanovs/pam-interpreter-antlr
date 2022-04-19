from gen.PamParser import PamParser
from gen.PamVisitor import PamVisitor
import constant
import operator


# PAM language visitor
class ExtendedPamVisitor(PamVisitor):
    variables = {}
    input_data = []
    operators = {
        '+': operator.add,
        '-': operator.sub,
        '*': operator.mul,
        '/': operator.truediv,
        '<>': operator.ne,
        '=<': operator.le,
        '>=': operator.ge,
        '=': operator.eq,
        '<': operator.lt,
        '>': operator.gt,
        'and': operator.and_,
        'or': operator.or_,
        'not': operator.not_
    }

    def __init__(self):
        data_text = open(constant.DATA, mode='r').read()

        if data_text != '':
            data = data_text.split(',')

            for datum in data:
                self.input_data.append(int(datum))
        else:
            raise Exception(f"Empty data file! Please check the contents of: {constant.DATA}")

    # Visit a parse tree produced by PamParser#input_stmt.
    # input_stmt : 'read' varlist;
    def visitInput_stmt(self, ctx: PamParser.Input_stmtContext):
        varlist = self.visitChildren(ctx)

        for variable in varlist:
            self.variables[variable] = int(self.input_data.pop(0))

    # Visit a parse tree produced by PamParser#output_stmt.
    # output_stmt : 'write' varlist;
    def visitOutput_stmt(self, ctx: PamParser.Output_stmtContext):
        varlist = self.visitChildren(ctx)

        for variable in varlist:
            print(f"{variable}: {str(self.variables.get(variable))}")

    # Visit a parse tree produced by PamParser#assign_stmt.
    # assign_stmt : VARNAME ':=' (expr | logical_expr);
    def visitAssign_stmt(self, ctx: PamParser.Assign_stmtContext):
        varname = str(ctx.VARNAME())
        value = self.visit(ctx.getChild(2))

        self.variables[varname] = value

    # Visit a parse tree produced by PamParser#cond_stmt.
    # cond_stmt : 'if' (logical_expr) 'then' series ('else' series)? 'fi';
    def visitCond_stmt(self, ctx: PamParser.Cond_stmtContext):
        logical_expr_cond = self.visit(ctx.logical_expr())

        if logical_expr_cond:
            return self.visit(ctx.series(0))
        else:
            if ctx.series(1):
                return self.visit(ctx.series(1))

    # Visit a parse tree produced by PamParser#loop.
    # loop : 'while' (logical_expr) 'do' series 'end';
    def visitLoop(self, ctx: PamParser.LoopContext):
        while self.visit(ctx.logical_expr()):
            self.visit(ctx.series())

    # Visit a parse tree produced by PamParser#logical_expr.
    # logical_expr : logical_expr DISJ logical_term | logical_term;
    def visitLogical_expr(self, ctx: PamParser.Logical_exprContext):
        if ctx.getChildCount() == 1:
            return self.visitChildren(ctx)

        expr_left = self.visit(ctx.getChild(0))

        # Optimization
        # If it is already known that the left part of the disjunction is true
        # then there is no need in evaluating the right part of the expression
        if expr_left:
            return expr_left

        expr_right = self.visit(ctx.getChild(2))

        return self.operators[str(ctx.DISJ())](expr_left, expr_right)

    # Visit a parse tree produced by PamParser#logical_term.
    # logical_term : logical_term CONJ logical_neg_elem | logical_neg_elem;
    def visitLogical_term(self, ctx: PamParser.Logical_termContext):
        if ctx.getChildCount() == 1:
            return self.visitChildren(ctx)

        expr_left = self.visit(ctx.logical_term())

        # Optimization
        # If it is already known that the left part of the conjunction is false
        # then there is no need in evaluating the right part of the expression
        if not expr_left:
            return expr_left

        expr_right = self.visit(ctx.logical_neg_elem())

        return self.operators[str(ctx.CONJ())](expr_left, expr_right)

    # Visit a parse tree produced by PamParser#logical_neg_elem.
    # logical_neg_elem : NEG logical_elem | logical_elem;
    def visitLogical_neg_elem(self, ctx: PamParser.Logical_neg_elemContext):
        elem = self.visit(ctx.logical_elem())

        return self.operators[str(ctx.NEG())](elem) if ctx.NEG() else elem

    # Visit a parse tree produced by PamParser#logical_elem.
    # logical_elem : '('logical_expr')' | BOOL | compar | VARNAME;
    def visitLogical_elem(self, ctx: PamParser.Logical_elemContext):
        if ctx.logical_expr():
            return self.visit(ctx.logical_expr())

        if ctx.compar():
            return self.visit(ctx.compar())

        if ctx.VARNAME():
            return self.variables.get(ctx.VARNAME().text)

        if ctx.BOOL():
            return True if ctx.BOOL().text == 'TRUE' else False

    # Visit a parse tree produced by PamParser#compar.
    # compar : expr RELATION expr;
    def visitCompar(self, ctx: PamParser.ComparContext):
        elem_left = self.visit(ctx.expr(0))
        elem_right = self.visit(ctx.expr(1))

        return self.operators[str(ctx.getChild(1))](elem_left, elem_right)

    # Visit a parse tree produced by PamParser#varlist.
    # varlist : VARNAME (',' VARNAME)*;
    def visitVarlist(self, ctx: PamParser.VarlistContext):
        varlist = []

        for i in range(0, ctx.getChildCount(), 2):
            varlist.append(str(ctx.getChild(i)))
        return varlist

    # Visit a parse tree produced by PamParser#expr.
    # expr : term (WEAKOP term)*;
    def visitExpr(self, ctx: PamParser.ExprContext):
        if ctx.getChildCount() == 1:
            return self.visitChildren(ctx)

        elem_left = self.visit(ctx.getChild(0))
        elem_right = self.visit(ctx.getChild(2))

        return round(self.operators[str(ctx.getChild(1))](elem_left, elem_right))

    # Visit a parse tree produced by PamParser#term.
    # term : elem (STRONGOP elem)*;
    def visitTerm(self, ctx: PamParser.TermContext):
        if ctx.getChildCount() == 1:
            return self.visitChildren(ctx)

        elem_left = self.visit(ctx.getChild(0))
        elem_right = self.visit(ctx.getChild(2))

        return self.operators[str(ctx.getChild(1))](elem_left, elem_right)

    # Visit a parse tree produced by PamParser#elem.
    # elem : NUMBER | VARNAME | '(' expr ')';
    def visitElem(self, ctx: PamParser.ElemContext):
        if ctx.expr():
            return self.visit(ctx.expr())

        elem = str(ctx.getChild(0))

        if elem.isnumeric():
            return int(elem)
        return self.variables.get(elem)
