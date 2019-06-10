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


public class PhaseOneListener extends JythonBaseListener {
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
    public void enterClassDec(JythonParser.ClassDecContext ctx) {
        node = new Node(node, "Class " + ctx.className.getText());
        Class cls = new Class(ctx.className.getText(), ctx.className.getLine(), fileName, node);
        if (ctx.parentClass != null) {
            cls.setParent(ctx.parent.getText());
        }
        classTable.addClass(cls);
        currentClass = cls;
        node.setCurClass(cls);
    }

    @Override
    public void exitClassDec(JythonParser.ClassDecContext ctx) {
        node = node.parent;
        currentClass = null;
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
        node.setCurClass(currentClass);
        node.setCurMethod(currentMethod);

    }

    @Override
    public void exitMethodDec(JythonParser.MethodDecContext ctx) {
        node = node.parent;
        currentMethod = null;
    }

    @Override
    public void enterWhile_statment(JythonParser.While_statmentContext ctx) {
        node = new Node(node, "While");
        node.setCurClass(currentClass);
        node.setCurMethod(currentMethod);
    }

    @Override
    public void exitWhile_statment(JythonParser.While_statmentContext ctx) {
        node = node.parent;
    }

    @Override
    public void enterIfexp(JythonParser.IfexpContext ctx) {
        node = new Node(node, "If");
        node.setCurClass(currentClass);
        node.setCurMethod(currentMethod);
    }

    @Override
    public void exitIfexp(JythonParser.IfexpContext ctx) {
        node = node.parent;
    }

    @Override
    public void enterElifexp(JythonParser.ElifexpContext ctx) {
        node = new Node(node, "Else If");
        node.setCurClass(currentClass);
        node.setCurMethod(currentMethod);
    }

    @Override
    public void exitElifexp(JythonParser.ElifexpContext ctx) {
        node = node.parent;
    }

    @Override
    public void enterElseexp(JythonParser.ElseexpContext ctx) {
        node = new Node(node, "Else");
        node.setCurClass(currentClass);
        node.setCurMethod(currentMethod);
    }

    @Override
    public void exitElseexp(JythonParser.ElseexpContext ctx) {
        node = node.parent;
    }

    @Override
    public void enterFor_statment(JythonParser.For_statmentContext ctx) {
        node = new Node(node, "For");
        node.setCurClass(currentClass);
        node.setCurMethod(currentMethod);
        Variable variable = new Variable("int", ctx.it.getText(), ctx.it.getLine(), fileName);
        node.addVariable(variable);
    }

    @Override
    public void exitFor_statment(JythonParser.For_statmentContext ctx) {
        node = node.parent;
    }
}