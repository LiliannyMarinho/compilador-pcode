package br.com.infortecnicos.ast.expressions;

import br.com.infortecnicos.ast.ExpressionNode;

public class UnaryOpNode extends ExpressionNode {

    public final String op;
    public final ExpressionNode expr;

    public UnaryOpNode(String op, ExpressionNode expr) {
        this.op = op;
        this.expr = expr;
    }
}