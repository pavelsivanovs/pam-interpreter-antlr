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
        '<>': operator.neg,
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
            raise Exception('Empty data file! Please check the contents of: ', constant.DATA)

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
            print(variable, ': ', str(self.variables.get(variable)))

    # Visit a parse tree produced by PamParser#assign_stmt.
    # assign_stmt : VARNAME ':=' (expr | logical_expr);
    def visitAssign_stmt(self, ctx: PamParser.Assign_stmtContext):
        # TODO check types
        varname = ctx.VARNAME()
        value = self.visit(ctx.getChild(2))

        # print(varname, value)
        self.variables[varname] = value

    # Visit a parse tree produced by PamParser#cond_stmt.
    # cond_stmt : 'if' (logical_expr) 'then' series ('else' series)? 'fi';
    def visitCond_stmt(self, ctx: PamParser.Cond_stmtContext):
        logical_expr_cond = ctx.logical_expr()

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
        expr_right = self.visit(ctx.getChild(2))

        return expr_left or expr_right

    # Visit a parse tree produced by PamParser#logical_term.
    def visitLogical_term(self, ctx: PamParser.Logical_termContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#logical_neg_elem.
    def visitLogical_neg_elem(self, ctx: PamParser.Logical_neg_elemContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#logical_elem.
    def visitLogical_elem(self, ctx: PamParser.Logical_elemContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#compar.
    def visitCompar(self, ctx: PamParser.ComparContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#varlist.
    def visitVarlist(self, ctx: PamParser.VarlistContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#expr.
    def visitExpr(self, ctx: PamParser.ExprContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#term.
    def visitTerm(self, ctx: PamParser.TermContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PamParser#elem.
    def visitElem(self, ctx: PamParser.ElemContext):
        return self.visitChildren(ctx)
