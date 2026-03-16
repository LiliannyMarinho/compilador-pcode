package br.com.infortecnicos.ast.expressions;

import br.com.infortecnicos.ast.ExpressionNode;

public class NumberNode extends ExpressionNode {
    public final double value;

    public NumberNode(double value){
        this.value = value;
    }
}
