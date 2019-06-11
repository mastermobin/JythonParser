import Models.Error;

public class Expression {

    class ExpResult{
        Error error;
        String result;
        boolean success;

        public ExpResult(Error error) {
            this.error = error;
            success = false;
            result = "unknown";
        }

        public ExpResult(String result) {
            this.result = result;
            success = true;
        }
    }

    public enum Operator{
        ADD,
        SUB,
        DIV,
        MUL,
        MOD,
        GT,
        LT,
        GTE,
        LTE,
        EQ,
        NEQ
    }

    public Expression parent;
    Expression left, right;
    String leftS, rightS;
    String all;
    Operator operator;
    String type;

    Expression() {
        parent = this;
    }

    Expression(Expression parent) {
        this.parent = parent;
    }

    Expression(JythonParser.ExpressionContext ctx) {
        parent = this;

        if(ctx.multModDiv() != null){
            String op = ctx.multModDiv().getText();
            operator = op.equals("/") ? Operator.DIV : op.equals("%") ? Operator.MOD : Operator.MUL;
        }else if(ctx.addSub() != null){
            String op = ctx.addSub().getText();
            operator = op.equals("+") ? Operator.ADD : Operator.SUB;
        }else if(ctx.eqNeq() != null){
            String op = ctx.eqNeq().getText();
            operator = op.equals("==") ? Operator.EQ : Operator.NEQ;
        }else if(ctx.relationOperators() != null){
            String op = ctx.relationOperators().getText();
            operator = op.equals(">") ? Operator.GT : op.equals("<") ? Operator.LT : op.equals(">=") ? Operator.GTE : Operator.LTE;
        }
    }

    Expression(Expression parent, JythonParser.ExpressionContext ctx) {
        this.parent = parent;

        if(ctx.multModDiv() != null){
            String op = ctx.multModDiv().getText();
            operator = op.equals("/") ? Operator.DIV : op.equals("%") ? Operator.MOD : Operator.MUL;
        }else if(ctx.addSub() != null){
            String op = ctx.addSub().getText();
            operator = op.equals("+") ? Operator.ADD : Operator.SUB;
        }else if(ctx.eqNeq() != null){
            String op = ctx.eqNeq().getText();
            operator = op.equals("==") ? Operator.EQ : Operator.NEQ;
        }else if(ctx.relationOperators() != null){
            String op = ctx.relationOperators().getText();
            operator = op.equals(">") ? Operator.GT : op.equals("<") ? Operator.LT : op.equals(">=") ? Operator.GTE : Operator.LTE;
        }
    }

    Expression setStrings(String leftS, String rightS) {
        this.leftS = leftS;
        this.rightS = rightS;
        return this;
    }

    public Expression setAll(String all) {
        this.all = all;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addExp(Expression expression){
        if(left == null)
            left = expression;
        else if(right == null)
            right = expression;
    }

    public Expression digIn(){
        if(right == null)
            return left;
        return right;
    }

    ExpResult process(int line, String fileName){
        if(right == null && left == null)
            return new ExpResult(type);
        else if(right == null)
            return left.process(line, fileName);

        String typeLeft = left.process(line, fileName).result;
        String typeRight = right.process(line, fileName).result;

        if(typeLeft.equals("unknown") || typeRight.equals("unknown"))
            return new ExpResult(Error.error115(line, fileName, all));

        if(operator == Operator.EQ || operator == Operator.NEQ || operator == Operator.LTE || operator == Operator.LT || operator == Operator.GTE || operator == Operator.GT) {
            if ((typeLeft.equals("int") || typeLeft.equals("float")) && (typeRight.equals("int") || typeRight.equals("float")))
                return new ExpResult("bool");
        }else if(operator == Operator.ADD){
            if(typeLeft.equals("string") || typeRight.equals("string"))
                return new ExpResult("string");
            else if(typeLeft.equals("int") && typeRight.equals("int"))
                return new ExpResult("int");
            else if(typeLeft.equals("float") || typeRight.equals("float"))
                return new ExpResult("float");
        }else if(operator == Operator.MUL || operator == Operator.DIV || operator == Operator.SUB){
            if(typeLeft.equals("int") && typeRight.equals("int"))
                return new ExpResult("int");
            else if(typeLeft.equals("float") || typeRight.equals("float"))
                return new ExpResult("float");
        }else if(operator == Operator.MOD){
            if(typeLeft.equals("int") && typeRight.equals("int"))
                return new ExpResult("int");
        }

        return new ExpResult(Error.error280(line, operator.toString(), leftS, rightS, fileName));
    }
}
