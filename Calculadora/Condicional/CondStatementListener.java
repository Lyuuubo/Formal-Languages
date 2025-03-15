// Generated from CondStatement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CondStatementParser}.
 */
public interface CondStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CondStatementParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(CondStatementParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondStatementParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(CondStatementParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CondStatementParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CondStatementParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CondStatementParser.ExpContext ctx);
}