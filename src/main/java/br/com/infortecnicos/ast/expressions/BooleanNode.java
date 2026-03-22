package br.com.infortecnicos.ast.expressions;

import br.com.infortecnicos.ast.ExpressionNode;

public class BooleanNode extends ExpressionNode {

    public final boolean value;

    public BooleanNode(boolean value) {
        this.value = value;
    }
}