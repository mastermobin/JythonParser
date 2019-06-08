public class Expression {

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

        if(ctx.mult_mod_div() != null){
            String op = ctx.mult_mod_div().getText();
            operator = op.equals("/") ? Operator.DIV : op.equals("%") ? Operator.MOD : Operator.MUL;
        }else if(ctx.add_sub() != null){
            String op = ctx.add_sub().getText();
            operator = op.equals("+") ? Operator.ADD : Operator.SUB;
        }else if(ctx.eq_neq() != null){
            String op = ctx.eq_neq().getText();
            operator = op.equals("==") ? Operator.EQ : Operator.NEQ;
        }else if(ctx.relation_operators() != null){
            String op = ctx.relation_operators().getText();
            operator = op.equals(">") ? Operator.GT : op.equals("<") ? Operator.LT : op.equals(">=") ? Operator.GTE : Operator.LTE;
        }
    }

    Expression(Expression parent, JythonParser.ExpressionContext ctx) {
        this.parent = parent;

        if(ctx.mult_mod_div() != null){
            String op = ctx.mult_mod_div().getText();
            operator = op.equals("/") ? Operator.DIV : op.equals("%") ? Operator.MOD : Operator.MUL;
        }else if(ctx.add_sub() != null){
            String op = ctx.add_sub().getText();
            operator = op.equals("+") ? Operator.ADD : Operator.SUB;
        }else if(ctx.eq_neq() != null){
            String op = ctx.eq_neq().getText();
            operator = op.equals("==") ? Operator.EQ : Operator.NEQ;
        }else if(ctx.relation_operators() != null){
            String op = ctx.relation_operators().getText();
            operator = op.equals(">") ? Operator.GT : op.equals("<") ? Operator.LT : op.equals(">=") ? Operator.GTE : Operator.LTE;
        }
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

    String process(){
        if(right == null && left == null)
            return type;
        else if(right == null)
            return left.process();

        String typeLeft = left.process();
        String typeRight = right.process();

        if(operator == Operator.EQ || operator == Operator.NEQ || operator == Operator.LTE || operator == Operator.LT || operator == Operator.GTE || operator == Operator.GT)
            return "bool";
        else if(operator == Operator.ADD){
            if(typeLeft.equals("string") || typeRight.equals("string"))
                return "string";
            else if(typeLeft.equals("int") && typeRight.equals("int"))
                return "int";
            else if(typeLeft.equals("float") || typeRight.equals("float"))
                return "float";
        }else if(operator == Operator.MUL || operator == Operator.DIV || operator == Operator.SUB){
            if(typeLeft.equals("int") && typeRight.equals("int"))
                return "int";
            else if(typeLeft.equals("float") || typeRight.equals("right"))
                return "float";
        }else if(operator == Operator.MOD){
            if(typeLeft.equals("int") && typeRight.equals("int"))
                return "int";
        }

        return "unknown";
    }
}
