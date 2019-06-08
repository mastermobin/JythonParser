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
	 * Enter a parse tree produced by {@link JythonParser#importclass}.
	 * @param ctx the parse tree
	 */
	void enterImportclass(JythonParser.ImportclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#importclass}.
	 * @param ctx the parse tree
	 */
	void exitImportclass(JythonParser.ImportclassContext ctx);
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
	 * Enter a parse tree produced by {@link JythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(JythonParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(JythonParser.Class_bodyContext ctx);
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
	 * Enter a parse tree produced by {@link JythonParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(JythonParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(JythonParser.Return_typeContext ctx);
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
	 * Enter a parse tree produced by {@link JythonParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(JythonParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(JythonParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statment(JythonParser.Return_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#return_statment}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statment(JythonParser.Return_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#condition_list}.
	 * @param ctx the parse tree
	 */
	void enterCondition_list(JythonParser.Condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#condition_list}.
	 * @param ctx the parse tree
	 */
	void exitCondition_list(JythonParser.Condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statment(JythonParser.While_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#while_statment}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statment(JythonParser.While_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_statment(JythonParser.If_else_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#if_else_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_statment(JythonParser.If_else_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#ifexp}.
	 * @param ctx the parse tree
	 */
	void enterIfexp(JythonParser.IfexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#ifexp}.
	 * @param ctx the parse tree
	 */
	void exitIfexp(JythonParser.IfexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#elifexp}.
	 * @param ctx the parse tree
	 */
	void enterElifexp(JythonParser.ElifexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#elifexp}.
	 * @param ctx the parse tree
	 */
	void exitElifexp(JythonParser.ElifexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#elseexp}.
	 * @param ctx the parse tree
	 */
	void enterElseexp(JythonParser.ElseexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#elseexp}.
	 * @param ctx the parse tree
	 */
	void exitElseexp(JythonParser.ElseexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statment(JythonParser.Print_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statment(JythonParser.Print_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void enterFor_statment(JythonParser.For_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#for_statment}.
	 * @param ctx the parse tree
	 */
	void exitFor_statment(JythonParser.For_statmentContext ctx);
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
	 * Enter a parse tree produced by {@link JythonParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(JythonParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(JythonParser.Method_callContext ctx);
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
	 * Enter a parse tree produced by {@link JythonParser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operators(JythonParser.Assignment_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#assignment_operators}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operators(JythonParser.Assignment_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#eq_neq}.
	 * @param ctx the parse tree
	 */
	void enterEq_neq(JythonParser.Eq_neqContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#eq_neq}.
	 * @param ctx the parse tree
	 */
	void exitEq_neq(JythonParser.Eq_neqContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#relation_operators}.
	 * @param ctx the parse tree
	 */
	void enterRelation_operators(JythonParser.Relation_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#relation_operators}.
	 * @param ctx the parse tree
	 */
	void exitRelation_operators(JythonParser.Relation_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(JythonParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(JythonParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link JythonParser#mult_mod_div}.
	 * @param ctx the parse tree
	 */
	void enterMult_mod_div(JythonParser.Mult_mod_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link JythonParser#mult_mod_div}.
	 * @param ctx the parse tree
	 */
	void exitMult_mod_div(JythonParser.Mult_mod_divContext ctx);
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
}