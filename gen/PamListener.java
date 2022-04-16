// Generated from C:/Users/pauli/Documents/uni/6_sem/pvsus/md02/pam-interpreter-antlr\Pam.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PamParser}.
 */
public interface PamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PamParser#progr}.
	 * @param ctx the parse tree
	 */
	void enterProgr(PamParser.ProgrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#progr}.
	 * @param ctx the parse tree
	 */
	void exitProgr(PamParser.ProgrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#series}.
	 * @param ctx the parse tree
	 */
	void enterSeries(PamParser.SeriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#series}.
	 * @param ctx the parse tree
	 */
	void exitSeries(PamParser.SeriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PamParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PamParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(PamParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(PamParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOutput_stmt(PamParser.Output_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#output_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOutput_stmt(PamParser.Output_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(PamParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(PamParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCond_stmt(PamParser.Cond_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCond_stmt(PamParser.Cond_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(PamParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(PamParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expr(PamParser.Logical_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expr(PamParser.Logical_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#logical_term}.
	 * @param ctx the parse tree
	 */
	void enterLogical_term(PamParser.Logical_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#logical_term}.
	 * @param ctx the parse tree
	 */
	void exitLogical_term(PamParser.Logical_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#logical_neg_elem}.
	 * @param ctx the parse tree
	 */
	void enterLogical_neg_elem(PamParser.Logical_neg_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#logical_neg_elem}.
	 * @param ctx the parse tree
	 */
	void exitLogical_neg_elem(PamParser.Logical_neg_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#logical_elem}.
	 * @param ctx the parse tree
	 */
	void enterLogical_elem(PamParser.Logical_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#logical_elem}.
	 * @param ctx the parse tree
	 */
	void exitLogical_elem(PamParser.Logical_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#compar}.
	 * @param ctx the parse tree
	 */
	void enterCompar(PamParser.ComparContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#compar}.
	 * @param ctx the parse tree
	 */
	void exitCompar(PamParser.ComparContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(PamParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(PamParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PamParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PamParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PamParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PamParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PamParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(PamParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PamParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(PamParser.ElemContext ctx);
}