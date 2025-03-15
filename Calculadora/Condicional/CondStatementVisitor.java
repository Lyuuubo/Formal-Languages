// Generated from CondStatement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CondStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CondStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CondStatementParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(CondStatementParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(CondStatementParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HigherEqExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigherEqExpr(CondStatementParser.HigherEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LowerEqExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerEqExpr(CondStatementParser.LowerEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(CondStatementParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarnameExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarnameExpr(CondStatementParser.VarnameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExpr(CondStatementParser.ExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(CondStatementParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(CondStatementParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LowerExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerExpr(CondStatementParser.LowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HiguerExpr}
	 * labeled alternative in {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHiguerExpr(CondStatementParser.HiguerExprContext ctx);
}