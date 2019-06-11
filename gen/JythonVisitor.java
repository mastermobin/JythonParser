// Generated from C:/Users/Mobin/IdeaProjects/Antlr\Jython.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#importClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportClass(JythonParser.ImportClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#classDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDec(JythonParser.ClassDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JythonParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(JythonParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#arrayDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDec(JythonParser.ArrayDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#methodDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDec(JythonParser.MethodDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(JythonParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(JythonParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JythonParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JythonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JythonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JythonParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#conditionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionList(JythonParser.ConditionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JythonParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(JythonParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#ifExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(JythonParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#elifExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifExp(JythonParser.ElifExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#elseExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseExp(JythonParser.ElseExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(JythonParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JythonParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#varDecAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecAssign(JythonParser.VarDecAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(JythonParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#arrayRightDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayRightDec(JythonParser.ArrayRightDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JythonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#rightExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightExp(JythonParser.RightExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#leftExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftExp(JythonParser.LeftExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#leftFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftFun(JythonParser.LeftFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JythonParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(JythonParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(JythonParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(JythonParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#parentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(JythonParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(JythonParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(JythonParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#assignmentOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperators(JythonParser.AssignmentOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#eqNeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqNeq(JythonParser.EqNeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#relationOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationOperators(JythonParser.RelationOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(JythonParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#multModDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultModDiv(JythonParser.MultModDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JythonParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#jythonType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJythonType(JythonParser.JythonTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(JythonParser.BoolContext ctx);
}