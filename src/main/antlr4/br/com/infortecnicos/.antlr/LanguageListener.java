// Generated from /home/everaldo/Projetos/Compiladores/antlr4_java/src/main/antlr4/br/com/infortecnicos/Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecVar}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDecVar(LanguageParser.DecVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecVar}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDecVar(LanguageParser.DecVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecAtrib}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDecAtrib(LanguageParser.DecAtribContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecAtrib}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDecAtrib(LanguageParser.DecAtribContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecIf}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDecIf(LanguageParser.DecIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecIf}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDecIf(LanguageParser.DecIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecWhile}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDecWhile(LanguageParser.DecWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecWhile}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDecWhile(LanguageParser.DecWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecFor}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDecFor(LanguageParser.DecForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecFor}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDecFor(LanguageParser.DecForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecPrint}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDecPrint(LanguageParser.DecPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecPrint}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDecPrint(LanguageParser.DecPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecInp}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDecInp(LanguageParser.DecInpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecInp}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDecInp(LanguageParser.DecInpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(LanguageParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(LanguageParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LanguageParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LanguageParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(LanguageParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(LanguageParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(LanguageParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(LanguageParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(LanguageParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(LanguageParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(LanguageParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(LanguageParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#inputStat}.
	 * @param ctx the parse tree
	 */
	void enterInputStat(LanguageParser.InputStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#inputStat}.
	 * @param ctx the parse tree
	 */
	void exitInputStat(LanguageParser.InputStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LanguageParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LanguageParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaMe}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMaMe(LanguageParser.MaMeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaMe}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMaMe(LanguageParser.MaMeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnit(LanguageParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnit(LanguageParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExp(LanguageParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExp(LanguageParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefNum}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDefNum(LanguageParser.DefNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefNum}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDefNum(LanguageParser.DefNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefIden}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDefIden(LanguageParser.DefIdenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefIden}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDefIden(LanguageParser.DefIdenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefExp}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDefExp(LanguageParser.DefExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefExp}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDefExp(LanguageParser.DefExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(LanguageParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(LanguageParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LanguageParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LanguageParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LanguageParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LanguageParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpNo}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterExpNo(LanguageParser.ExpNoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpNo}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitExpNo(LanguageParser.ExpNoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpCom}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterExpCom(LanguageParser.ExpComContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpCom}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitExpCom(LanguageParser.ExpComContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpT}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterExpT(LanguageParser.ExpTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpT}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitExpT(LanguageParser.ExpTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpF}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterExpF(LanguageParser.ExpFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpF}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitExpF(LanguageParser.ExpFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpBol}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterExpBol(LanguageParser.ExpBolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpBol}
	 * labeled alternative in {@link LanguageParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitExpBol(LanguageParser.ExpBolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(LanguageParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(LanguageParser.ComparisonContext ctx);
}