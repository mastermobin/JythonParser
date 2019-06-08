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
	 * Visit a parse tree produced by {@link JythonParser#importclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportclass(JythonParser.ImportclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#classDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDec(JythonParser.ClassDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(JythonParser.Class_bodyContext ctx);
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
	 * Visit a parse tree produced by {@link JythonParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(JythonParser.Return_typeContext ctx);
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
	 * Visit a parse tree produced by {@link JythonParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(JythonParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#return_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statment(JythonParser.Return_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_list(JythonParser.Condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#while_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statment(JythonParser.While_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#if_else_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_statment(JythonParser.If_else_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#ifexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexp(JythonParser.IfexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#elifexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifexp(JythonParser.ElifexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#elseexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseexp(JythonParser.ElseexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#print_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statment(JythonParser.Print_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#for_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statment(JythonParser.For_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JythonParser.AssignmentContext ctx);
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
	 * Visit a parse tree produced by {@link JythonParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(JythonParser.Method_callContext ctx);
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
	 * Visit a parse tree produced by {@link JythonParser#assignment_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operators(JythonParser.Assignment_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#eq_neq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_neq(JythonParser.Eq_neqContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#relation_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_operators(JythonParser.Relation_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#add_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub(JythonParser.Add_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link JythonParser#mult_mod_div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_mod_div(JythonParser.Mult_mod_divContext ctx);
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
}