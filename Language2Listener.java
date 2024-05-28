// Generated from Language2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Language2Parser}.
 */
public interface Language2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Language2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Language2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Language2Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Language2Parser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(Language2Parser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(Language2Parser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Language2Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(Language2Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(Language2Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Language2Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(Language2Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(Language2Parser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Language2Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Language2Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Language2Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Language2Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(Language2Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(Language2Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Language2Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(Language2Parser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(Language2Parser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link Language2Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(Language2Parser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(Language2Parser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link Language2Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(Language2Parser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(Language2Parser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link Language2Parser#i}.
	 * @param ctx the parse tree
	 */
	void enterI(Language2Parser.IContext ctx);
	/**
	 * Exit a parse tree produced by {@link Language2Parser#i}.
	 * @param ctx the parse tree
	 */
	void exitI(Language2Parser.IContext ctx);
}