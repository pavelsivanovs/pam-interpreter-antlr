# Generated from C:/Users/pauli/Documents/uni/6_sem/pvsus/md02/pam-interpreter-antlr\Pam.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PamParser import PamParser
else:
    from PamParser import PamParser

# This class defines a complete listener for a parse tree produced by PamParser.
class PamListener(ParseTreeListener):

    # Enter a parse tree produced by PamParser#progr.
    def enterProgr(self, ctx:PamParser.ProgrContext):
        pass

    # Exit a parse tree produced by PamParser#progr.
    def exitProgr(self, ctx:PamParser.ProgrContext):
        pass


    # Enter a parse tree produced by PamParser#series.
    def enterSeries(self, ctx:PamParser.SeriesContext):
        pass

    # Exit a parse tree produced by PamParser#series.
    def exitSeries(self, ctx:PamParser.SeriesContext):
        pass


    # Enter a parse tree produced by PamParser#stmt.
    def enterStmt(self, ctx:PamParser.StmtContext):
        pass

    # Exit a parse tree produced by PamParser#stmt.
    def exitStmt(self, ctx:PamParser.StmtContext):
        pass


    # Enter a parse tree produced by PamParser#input_stmt.
    def enterInput_stmt(self, ctx:PamParser.Input_stmtContext):
        pass

    # Exit a parse tree produced by PamParser#input_stmt.
    def exitInput_stmt(self, ctx:PamParser.Input_stmtContext):
        pass


    # Enter a parse tree produced by PamParser#output_stmt.
    def enterOutput_stmt(self, ctx:PamParser.Output_stmtContext):
        pass

    # Exit a parse tree produced by PamParser#output_stmt.
    def exitOutput_stmt(self, ctx:PamParser.Output_stmtContext):
        pass


    # Enter a parse tree produced by PamParser#assign_stmt.
    def enterAssign_stmt(self, ctx:PamParser.Assign_stmtContext):
        pass

    # Exit a parse tree produced by PamParser#assign_stmt.
    def exitAssign_stmt(self, ctx:PamParser.Assign_stmtContext):
        pass


    # Enter a parse tree produced by PamParser#cond_stmt.
    def enterCond_stmt(self, ctx:PamParser.Cond_stmtContext):
        pass

    # Exit a parse tree produced by PamParser#cond_stmt.
    def exitCond_stmt(self, ctx:PamParser.Cond_stmtContext):
        pass


    # Enter a parse tree produced by PamParser#loop.
    def enterLoop(self, ctx:PamParser.LoopContext):
        pass

    # Exit a parse tree produced by PamParser#loop.
    def exitLoop(self, ctx:PamParser.LoopContext):
        pass


    # Enter a parse tree produced by PamParser#logical_expr.
    def enterLogical_expr(self, ctx:PamParser.Logical_exprContext):
        pass

    # Exit a parse tree produced by PamParser#logical_expr.
    def exitLogical_expr(self, ctx:PamParser.Logical_exprContext):
        pass


    # Enter a parse tree produced by PamParser#logical_term.
    def enterLogical_term(self, ctx:PamParser.Logical_termContext):
        pass

    # Exit a parse tree produced by PamParser#logical_term.
    def exitLogical_term(self, ctx:PamParser.Logical_termContext):
        pass


    # Enter a parse tree produced by PamParser#logical_neg_elem.
    def enterLogical_neg_elem(self, ctx:PamParser.Logical_neg_elemContext):
        pass

    # Exit a parse tree produced by PamParser#logical_neg_elem.
    def exitLogical_neg_elem(self, ctx:PamParser.Logical_neg_elemContext):
        pass


    # Enter a parse tree produced by PamParser#logical_elem.
    def enterLogical_elem(self, ctx:PamParser.Logical_elemContext):
        pass

    # Exit a parse tree produced by PamParser#logical_elem.
    def exitLogical_elem(self, ctx:PamParser.Logical_elemContext):
        pass


    # Enter a parse tree produced by PamParser#compar.
    def enterCompar(self, ctx:PamParser.ComparContext):
        pass

    # Exit a parse tree produced by PamParser#compar.
    def exitCompar(self, ctx:PamParser.ComparContext):
        pass


    # Enter a parse tree produced by PamParser#varlist.
    def enterVarlist(self, ctx:PamParser.VarlistContext):
        pass

    # Exit a parse tree produced by PamParser#varlist.
    def exitVarlist(self, ctx:PamParser.VarlistContext):
        pass


    # Enter a parse tree produced by PamParser#expr.
    def enterExpr(self, ctx:PamParser.ExprContext):
        pass

    # Exit a parse tree produced by PamParser#expr.
    def exitExpr(self, ctx:PamParser.ExprContext):
        pass


    # Enter a parse tree produced by PamParser#term.
    def enterTerm(self, ctx:PamParser.TermContext):
        pass

    # Exit a parse tree produced by PamParser#term.
    def exitTerm(self, ctx:PamParser.TermContext):
        pass


    # Enter a parse tree produced by PamParser#elem.
    def enterElem(self, ctx:PamParser.ElemContext):
        pass

    # Exit a parse tree produced by PamParser#elem.
    def exitElem(self, ctx:PamParser.ElemContext):
        pass



del PamParser