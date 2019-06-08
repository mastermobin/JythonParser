// Generated from C:/Users/Mobin/IdeaProjects/Antlr\Jython.g4 by ANTLR 4.7.2

import Models.*;
import Models.Error;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PhaseTwoListener implements JythonListener {
    private String fileName;
    private Node node;
    private static int memory = 0;
    private Stack<Tracer> tracers = new Stack<>();
    private List<Error> errors = new ArrayList<>();
    private Stack<List<String>> args = new Stack<>();
    private Stack<Expression> expressions = new Stack<>();
    private String lastType = "Init";
    private List<String> lastArgs = new ArrayList<>();

    PhaseTwoListener(String fileName, Node root) {
        node = root.nodes.get(memory++);
        this.fileName = fileName;
    }

    List<Error> getErrors() {
        return errors;
    }

    private void chainErrorCheck(int line, String methodName) {
        Tracer tracer = tracers.pop();
        if (lastArgs.contains("unknown")) {
            lastType = "unknown";
            errors.add(Error.error112(line, methodName, fileName, lastArgs));
            return;
        }

        ValidationResult res = tracer.validate(node, line, fileName, lastArgs);

        if (res != null) {
            if (!res.isSuccess()) {
                errors.add(res.getError());
                lastType = "unknown";
            } else
                lastType = res.getType();
        } else
            System.out.println("Internal Error Method");

    }

    private void chainErrorCheck(int line) {
        Tracer tracer = tracers.pop();

        ValidationResult res = tracer.validate(node, line, fileName, lastArgs);

        if (res != null) {
            if (!res.isSuccess()) {
                errors.add(res.getError());
                lastType = "unknown";
            } else
                lastType = res.getType();
        } else
            System.out.println("Internal Error Variable");

    }

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
        node = node.move();
    }

    @Override
    public void exitClassDec(JythonParser.ClassDecContext ctx) {
        node = node.move();
    }

    @Override
    public void enterClass_body(JythonParser.Class_bodyContext ctx) {

    }

    @Override
    public void exitClass_body(JythonParser.Class_bodyContext ctx) {

    }

    @Override
    public void enterVarDec(JythonParser.VarDecContext ctx) {

    }

    @Override
    public void exitVarDec(JythonParser.VarDecContext ctx) {

    }

    @Override
    public void enterArrayDec(JythonParser.ArrayDecContext ctx) {

    }

    @Override
    public void exitArrayDec(JythonParser.ArrayDecContext ctx) {

    }

    @Override
    public void enterMethodDec(JythonParser.MethodDecContext ctx) {
        node = node.move();
    }

    @Override
    public void exitMethodDec(JythonParser.MethodDecContext ctx) {
        node = node.move();
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
        node = node.move();
    }

    @Override
    public void exitWhile_statment(JythonParser.While_statmentContext ctx) {
        node = node.move();
    }

    @Override
    public void enterIf_else_statment(JythonParser.If_else_statmentContext ctx) {

    }

    @Override
    public void exitIf_else_statment(JythonParser.If_else_statmentContext ctx) {

    }

    @Override
    public void enterIfexp(JythonParser.IfexpContext ctx) {
        node = node.move();
    }

    @Override
    public void exitIfexp(JythonParser.IfexpContext ctx) {
        node = node.move();
    }

    @Override
    public void enterElifexp(JythonParser.ElifexpContext ctx) {
        node = node.move();
    }

    @Override
    public void exitElifexp(JythonParser.ElifexpContext ctx) {
        node = node.move();
    }

    @Override
    public void enterElseexp(JythonParser.ElseexpContext ctx) {
        node = node.move();
    }

    @Override
    public void exitElseexp(JythonParser.ElseexpContext ctx) {
        node = node.move();
    }

    @Override
    public void enterPrint_statment(JythonParser.Print_statmentContext ctx) {

    }

    @Override
    public void exitPrint_statment(JythonParser.Print_statmentContext ctx) {

    }

    @Override
    public void enterFor_statment(JythonParser.For_statmentContext ctx) {
        node = node.move();
    }

    @Override
    public void exitFor_statment(JythonParser.For_statmentContext ctx) {
        node = node.move();
    }

    @Override
    public void enterMethod_call(JythonParser.Method_callContext ctx) {
        tracers.push(new Tracer());
        if (ctx.start.getText().equals("self"))
            tracers.peek().addRing(new Tracer.Ring(Tracer.RefType.VARIABLE, "self"));
    }

    @Override
    public void exitMethod_call(JythonParser.Method_callContext ctx) {
        chainErrorCheck(ctx.start.getLine(), ctx.func().funcName.getText());
    }

    @Override
    public void enterVar(JythonParser.VarContext ctx) {
        tracers.peek().addRing(new Tracer.Ring(Tracer.RefType.VARIABLE, ctx.varName.getText()));
    }

    @Override
    public void exitVar(JythonParser.VarContext ctx) {

    }

    @Override
    public void enterFunc(JythonParser.FuncContext ctx) {
        tracers.peek().addRing(new Tracer.Ring(Tracer.RefType.METHOD, ctx.funcName.getText()));
    }

    @Override
    public void exitFunc(JythonParser.FuncContext ctx) {

    }

    @Override
    public void enterIndex(JythonParser.IndexContext ctx) {
        tracers.peek().addRing(new Tracer.Ring(Tracer.RefType.ARRAY));
        args.push(new ArrayList<>());
    }

    @Override
    public void exitIndex(JythonParser.IndexContext ctx) {
        args.pop();
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
        if (!ctx.expression().isEmpty()) {
            if (!(ctx.parent instanceof JythonParser.ExpressionContext))
                expressions.push(new Expression(ctx));
            else {
                expressions.peek().addExp(new Expression(expressions.peek(), ctx));
                expressions.push(expressions.pop().digIn());
            }
        } else {
            if (!(ctx.parent instanceof JythonParser.ExpressionContext))
                expressions.push(new Expression());
            else {
                expressions.peek().addExp(new Expression(expressions.peek()));
                expressions.push(expressions.pop().digIn());
            }
        }
    }

    @Override
    public void exitExpression(JythonParser.ExpressionContext ctx) {
        if (ctx.expression().isEmpty()) {
            if (ctx.rightExp().BOOL() != null)
                expressions.peek().setType("bool");
            else if (ctx.rightExp().INTEGER() != null)
                expressions.peek().setType("int");
            else if (ctx.rightExp().STRING() != null)
                expressions.peek().setType("string");
            else if (ctx.rightExp().FLOAT() != null)
                expressions.peek().setType("float");
            else
                expressions.peek().setType(lastType);
        }
        expressions.push(expressions.pop().parent);

        if (!(ctx.parent instanceof JythonParser.ExpressionContext)) {
            String exp = expressions.pop().process();
            if (!args.isEmpty())
                args.peek().add(exp);
        }
    }

    @Override
    public void enterRightExp(JythonParser.RightExpContext ctx) {

    }

    @Override
    public void exitRightExp(JythonParser.RightExpContext ctx) {

    }

    @Override
    public void enterLeftExp(JythonParser.LeftExpContext ctx) {
        tracers.push(new Tracer());
        if (ctx.start.getText().equals("self"))
            tracers.peek().addRing(new Tracer.Ring(Tracer.RefType.VARIABLE, "self"));
    }

    @Override
    public void exitLeftExp(JythonParser.LeftExpContext ctx) {
        chainErrorCheck(ctx.start.getLine());
    }

    @Override
    public void enterLeftFun(JythonParser.LeftFunContext ctx) {

    }

    @Override
    public void exitLeftFun(JythonParser.LeftFunContext ctx) {

    }

    @Override
    public void enterArgs(JythonParser.ArgsContext ctx) {
        args.push(new ArrayList<>());
    }

    @Override
    public void exitArgs(JythonParser.ArgsContext ctx) {
        lastArgs = args.pop();

//        StringBuilder p = new StringBuilder();
//        for (String s : lastArgs)
//            p.append(s).append(" ");
//        System.out.println(p.toString());
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