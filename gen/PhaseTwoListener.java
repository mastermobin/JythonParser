// Generated from C:/Users/Mobin/IdeaProjects/Antlr\Jython.g4 by ANTLR 4.7.2

import Models.*;
import Models.Error;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PhaseTwoListener extends JythonBaseListener {
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
    public void exitReturn_statment(JythonParser.Return_statmentContext ctx) {
        String returnType = node.getCurMethod().getReturnType();
        if (!lastType.equals(returnType)) {
            if (returnType.equals("void"))
                errors.add(Error.error231(ctx.start.getLine(), fileName));
            else
                errors.add(Error.error230(ctx.start.getLine(), fileName, node.getCurMethod().getReturnType()));
        }
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
    public void enterMethodDec(JythonParser.MethodDecContext ctx) {
        node = node.move();
    }

    @Override
    public void exitMethodDec(JythonParser.MethodDecContext ctx) {
        node = node.move();
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
    public void enterFunc(JythonParser.FuncContext ctx) {
        tracers.peek().addRing(new Tracer.Ring(Tracer.RefType.METHOD, ctx.funcName.getText()));
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
    public void enterExpression(JythonParser.ExpressionContext ctx) {
        if (!ctx.expression().isEmpty()) {
            if (!(ctx.parent instanceof JythonParser.ExpressionContext))
                expressions.push(new Expression(ctx).setStrings(ctx.expression(0).getText(), ctx.expression(1).getText()).setAll(ctx.getText()));
            else {
                expressions.peek().addExp(new Expression(expressions.peek(), ctx).setStrings(ctx.expression(0).getText(), ctx.expression(1).getText()).setAll(ctx.getText()));
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
            Expression.ExpResult result = expressions.pop().process(ctx.start.getLine(), fileName);
            lastType = result.result;
            if (!result.success)
                errors.add(result.error);
            if (ctx.parent instanceof JythonParser.ExplistContext)
                args.peek().add(lastType);
        }
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

}