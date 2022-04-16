// Generated from C:/Users/pauli/Documents/uni/6_sem/pvsus/md02/pam-interpreter-antlr\Pam.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PamParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PamVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PamParser#progr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgr(PamParser.ProgrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeries(PamParser.SeriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PamParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(PamParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#output_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_stmt(PamParser.Output_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(PamParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#cond_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_stmt(PamParser.Cond_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(PamParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expr(PamParser.Logical_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#logical_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_term(PamParser.Logical_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#logical_neg_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_neg_elem(PamParser.Logical_neg_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#logical_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_elem(PamParser.Logical_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#compar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompar(PamParser.ComparContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(PamParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PamParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PamParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PamParser#elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem(PamParser.ElemContext ctx);
}