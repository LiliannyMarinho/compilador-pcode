package br.com.infortecnicos.ast.expressions;

import br.com.infortecnicos.ast.ExpressionNode;

public class BinaryOpNode extends ExpressionNode {

    public final String op;
    public final ExpressionNode left;
    public final ExpressionNode right;

    public BinaryOpNode(String op, ExpressionNode left, ExpressionNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }
}