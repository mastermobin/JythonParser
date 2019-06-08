// Generated from C:/Users/Mobin/IdeaProjects/Antlr\Jython.g4 by ANTLR 4.7.2

import Models.*;
import Models.Basic.Class;
import Models.Basic.Method;
import Models.Basic.Property;
import Models.Basic.Variable;
import Models.Error;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PhaseOneListener implements JythonListener {
    private String fileName;
    private Node node;
    private ClassTable classTable;

    PhaseOneListener(String fileName, Node root) {
        node = new Node(root, fileName);
        this.fileName = fileName;
        this.classTable = Node.getClassTable();
    }

    private Class currentClass;
    private Method currentMethod;

    @Override
    public void enterProgram(JythonParser.ProgramContext ctx) {

    }

    @Override
    public void exitProgram(JythonParser.ProgramContext ctx) {

    }

    @Override
    public void enterImportclass(JythonParser.ImportclassContext ctx) {

    }

    @Override
    public void exitImportclass(JythonParser.ImportclassContext ctx) {

    }

    @Override
    public void enterClassDec(JythonParser.ClassDecContext ctx) {
        node = new Node(node, "Class " + ctx.className.getText());
        Class cls = new Class(ctx.className.getText(), ctx.className.getLine(), fileName, node);
        if (ctx.parentClass != null) {
            cls.setParent(ctx.parent.getText());
        }
        classTable.addClass(cls);
        currentClass = cls;
    }

    @Override
    public void exitClassDec(JythonParser.ClassDecContext ctx) {
        node = node.parent;
        currentClass = null;
    }

    @Override
    public void enterClass_body(JythonParser.Class_bodyContext ctx) {

    }

    @Override
    public void exitClass_body(JythonParser.Class_bodyContext ctx) {

    }

    @Override
    public void enterVarDec(JythonParser.VarDecContext ctx) {
        if (currentMethod == null) {
            Property property = new Property(ctx.varType.getText(), ctx.varName.getText(), currentClass, ctx.varName.getLine(), fileName);
            node.addProperty(property);
            currentClass.addProperty(property);
        } else {
            Variable variable = new Variable(ctx.varType.getText(), ctx.varName.getText(), ctx.varName.getLine(), fileName);
            node.addVariable(variable);
        }
    }

    @Override
    public void exitVarDec(JythonParser.VarDecContext ctx) {

    }

    @Override
    public void enterArrayDec(JythonParser.ArrayDecContext ctx) {
        if (currentMethod == null) {
            Property property = new Property(ctx.varType.getText(), ctx.varName.getText(), currentClass, ctx.varName.getLine(), fileName, true);
            node.addProperty(property);
            currentClass.addProperty(property);
        } else {
            Variable variable = new Variable(ctx.varType.getText(), ctx.varName.getText(), ctx.varName.getLine(), fileName, true);
            node.addVariable(variable);
        }
    }

    @Override
    public void exitArrayDec(JythonParser.ArrayDecContext ctx) {

    }

    @Override
    public void enterMethodDec(JythonParser.MethodDecContext ctx) {
        Method method = new Method(ctx.name.getText(), ctx.methodType.getText(), currentClass, ctx.name.getLine(), fileName);
        if (ctx.parameters(0) != null)
            for (JythonParser.VariableContext var :
                    ctx.parameters(0).variable()) {
                method.addParameter(new Variable(var.varDec().varType.getText(), var.varDec().varName.getText(), var.varDec().varName.getLine(), fileName));
            }
        node.addMethod(method);
        currentClass.addMethod(method);
        node = new Node(node, "Method " + method.getName());
        currentMethod = method;

    }

    @Override
    public void exitMethodDec(JythonParser.MethodDecContext ctx) {
        node = node.parent;
        currentMethod = null;
    }

    @Override
    public void enterReturn_type(JythonParser.Return_typeContext ctx) {

    }

    @Override
    public void exitReturn_type(JythonParser.Return_typeContext ctx) {

    }

    @Override
    public void enterConstructor(JythonParser.ConstructorContext ctx) {

    }

    @Override
    public void exitConstructor(JythonParser.ConstructorContext ctx) {

    }

    @Override
    public void enterVariable(JythonParser.VariableContext ctx) {

    }

    @Override
    public void exitVariable(JythonParser.VariableContext ctx) {

    }

    @Override
    public void enterParameters(JythonParser.ParametersContext ctx) {

    }

    @Override
    public void exitParameters(JythonParser.ParametersContext ctx) {

    }

    @Override
    public void enterStatment(JythonParser.StatmentContext ctx) {

    }

    @Override
    public void exitStatment(JythonParser.StatmentContext ctx) {

    }

    @Override
    public void enterReturn_statment(JythonParser.Return_statmentContext ctx) {

    }

    @Override
    public void exitReturn_statment(JythonParser.Return_statmentContext ctx) {

    }

    @Override
    public void enterCondition_list(JythonParser.Condition_listContext ctx) {

    }

    @Override
    public void exitCondition_list(JythonParser.Condition_listContext ctx) {

    }

    @Override
    public void enterWhile_statment(JythonParser.While_statmentContext ctx) {
        node = new Node(node, "While");
    }

    @Override
    public void exitWhile_statment(JythonParser.While_statmentContext ctx) {
        node = node.parent;
    }

    @Override
    public void enterIf_else_statment(JythonParser.If_else_statmentContext ctx) {

    }

    @Override
    public void exitIf_else_statment(JythonParser.If_else_statmentContext ctx) {

    }

    @Override
    public void enterIfexp(JythonParser.IfexpContext ctx) {
        node = new Node(node, "If");
    }

    @Override
    public void exitIfexp(JythonParser.IfexpContext ctx) {
        node = node.parent;
    }

    @Override
    public void enterElifexp(JythonParser.ElifexpContext ctx) {
        node = new Node(node, "Else If");
    }

    @Override
    public void exitElifexp(JythonParser.ElifexpContext ctx) {
        node = node.parent;
    }

    @Override
    public void enterElseexp(JythonParser.ElseexpContext ctx) {
        node = new Node(node, "Else");
    }

    @Override
    public void exitElseexp(JythonParser.ElseexpContext ctx) {
        node = node.parent;
    }

    @Override
    public void enterPrint_statment(JythonParser.Print_statmentContext ctx) {

    }

    @Override
    public void exitPrint_statment(JythonParser.Print_statmentContext ctx) {

    }

    @Override
    public void enterFor_statment(JythonParser.For_statmentContext ctx) {
        node = new Node(node, "For");
        Variable variable = new Variable("int", ctx.it.getText(), ctx.it.getLine(), fileName);
        node.addVariable(variable);
    }

    @Override
    public void exitFor_statment(JythonParser.For_statmentContext ctx) {
        node = node.parent;
    }

    @Override
    public void enterMethod_call(JythonParser.Method_callContext ctx) {

    }

    @Override
    public void exitMethod_call(JythonParser.Method_callContext ctx) {

    }

    @Override
    public void enterVar(JythonParser.VarContext ctx) {

    }

    @Override
    public void exitVar(JythonParser.VarContext ctx) {

    }

    @Override
    public void enterFunc(JythonParser.FuncContext ctx) {

    }

    @Override
    public void exitFunc(JythonParser.FuncContext ctx) {

    }

    @Override
    public void enterIndex(JythonParser.IndexContext ctx) {

    }

    @Override
    public void exitIndex(JythonParser.IndexContext ctx) {

    }

    @Override
    public void enterParentheses(JythonParser.ParenthesesContext ctx) {

    }

    @Override
    public void exitParentheses(JythonParser.ParenthesesContext ctx) {

    }

    @Override
    public void enterAssignment(JythonParser.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(JythonParser.AssignmentContext ctx) {

    }

    @Override
    public void enterExpression(JythonParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(JythonParser.ExpressionContext ctx) {

    }

    @Override
    public void enterRightExp(JythonParser.RightExpContext ctx) {

    }

    @Override
    public void exitRightExp(JythonParser.RightExpContext ctx) {

    }


    @Override
    public void enterLeftExp(JythonParser.LeftExpContext ctx) {

    }

    @Override
    public void exitLeftExp(JythonParser.LeftExpContext ctx) {

    }

    @Override
    public void enterLeftFun(JythonParser.LeftFunContext ctx) {

    }

    @Override
    public void exitLeftFun(JythonParser.LeftFunContext ctx) {

    }

    @Override
    public void enterArgs(JythonParser.ArgsContext ctx) {

    }

    @Override
    public void exitArgs(JythonParser.ArgsContext ctx) {

    }

    @Override
    public void enterExplist(JythonParser.ExplistContext ctx) {

    }

    @Override
    public void exitExplist(JythonParser.ExplistContext ctx) {

    }

    @Override
    public void enterAssignment_operators(JythonParser.Assignment_operatorsContext ctx) {

    }

    @Override
    public void exitAssignment_operators(JythonParser.Assignment_operatorsContext ctx) {

    }

    @Override
    public void enterEq_neq(JythonParser.Eq_neqContext ctx) {

    }

    @Override
    public void exitEq_neq(JythonParser.Eq_neqContext ctx) {

    }

    @Override
    public void enterRelation_operators(JythonParser.Relation_operatorsContext ctx) {

    }

    @Override
    public void exitRelation_operators(JythonParser.Relation_operatorsContext ctx) {

    }

    @Override
    public void enterAdd_sub(JythonParser.Add_subContext ctx) {

    }

    @Override
    public void exitAdd_sub(JythonParser.Add_subContext ctx) {

    }

    @Override
    public void enterMult_mod_div(JythonParser.Mult_mod_divContext ctx) {

    }

    @Override
    public void exitMult_mod_div(JythonParser.Mult_mod_divContext ctx) {

    }

    @Override
    public void enterType(JythonParser.TypeContext ctx) {

    }

    @Override
    public void exitType(JythonParser.TypeContext ctx) {

    }

    @Override
    public void enterJythonType(JythonParser.JythonTypeContext ctx) {

    }

    @Override
    public void exitJythonType(JythonParser.JythonTypeContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}