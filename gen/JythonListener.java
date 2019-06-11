// Generated from C:/Users/Mobin/IdeaProjects/Antlr\Jython.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JythonParser}.
 */
public interface JythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#importClass}.
	 * @param ctx the parse tree
	 */
	void enterImportClass(JythonParser.ImportClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#importClass}.
	 * @param ctx the parse tree
	 */
	void exitImportClass(JythonParser.ImportClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#classDec}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(JythonParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#classDec}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(JythonParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JythonParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JythonParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(JythonParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(JythonParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(JythonParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(JythonParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(JythonParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(JythonParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(JythonParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(JythonParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(JythonParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(JythonParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JythonParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JythonParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(JythonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(JythonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JythonParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JythonParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#conditionList}.
	 * @param ctx the parse tree
	 */
	void enterConditionList(JythonParser.ConditionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#conditionList}.
	 * @param ctx the parse tree
	 */
	void exitConditionList(JythonParser.ConditionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JythonParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JythonParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(JythonParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(JythonParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(JythonParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(JythonParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#elifExp}.
	 * @param ctx the parse tree
	 */
	void enterElifExp(JythonParser.ElifExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#elifExp}.
	 * @param ctx the parse tree
	 */
	void exitElifExp(JythonParser.ElifExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#elseExp}.
	 * @param ctx the parse tree
	 */
	void enterElseExp(JythonParser.ElseExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#elseExp}.
	 * @param ctx the parse tree
	 */
	void exitElseExp(JythonParser.ElseExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(JythonParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(JythonParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JythonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JythonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#varDecAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarDecAssign(JythonParser.VarDecAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#varDecAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarDecAssign(JythonParser.VarDecAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(JythonParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(JythonParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#arrayRightDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayRightDec(JythonParser.ArrayRightDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#arrayRightDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayRightDec(JythonParser.ArrayRightDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JythonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JythonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#rightExp}.
	 * @param ctx the parse tree
	 */
	void enterRightExp(JythonParser.RightExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#rightExp}.
	 * @param ctx the parse tree
	 */
	void exitRightExp(JythonParser.RightExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#leftExp}.
	 * @param ctx the parse tree
	 */
	void enterLeftExp(JythonParser.LeftExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#leftExp}.
	 * @param ctx the parse tree
	 */
	void exitLeftExp(JythonParser.LeftExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#leftFun}.
	 * @param ctx the parse tree
	 */
	void enterLeftFun(JythonParser.LeftFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#leftFun}.
	 * @param ctx the parse tree
	 */
	void exitLeftFun(JythonParser.LeftFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JythonParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JythonParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(JythonParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(JythonParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(JythonParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(JythonParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(JythonParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(JythonParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(JythonParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#parentheses}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(JythonParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(JythonParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(JythonParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(JythonParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(JythonParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#assignmentOperators}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperators(JythonParser.AssignmentOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#assignmentOperators}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperators(JythonParser.AssignmentOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#eqNeq}.
	 * @param ctx the parse tree
	 */
	void enterEqNeq(JythonParser.EqNeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#eqNeq}.
	 * @param ctx the parse tree
	 */
	void exitEqNeq(JythonParser.EqNeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#relationOperators}.
	 * @param ctx the parse tree
	 */
	void enterRelationOperators(JythonParser.RelationOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#relationOperators}.
	 * @param ctx the parse tree
	 */
	void exitRelationOperators(JythonParser.RelationOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(JythonParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(JythonParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#multModDiv}.
	 * @param ctx the parse tree
	 */
	void enterMultModDiv(JythonParser.MultModDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#multModDiv}.
	 * @param ctx the parse tree
	 */
	void exitMultModDiv(JythonParser.MultModDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JythonParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JythonParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#jythonType}.
	 * @param ctx the parse tree
	 */
	void enterJythonType(JythonParser.JythonTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#jythonType}.
	 * @param ctx the parse tree
	 */
	void exitJythonType(JythonParser.JythonTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(JythonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(JythonParser.BoolContext ctx);
}