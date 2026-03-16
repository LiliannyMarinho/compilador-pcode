package br.com.infortecnicos.ast.expressions;

import br.com.infortecnicos.ast.ExpressionNode;

public class VariableNode extends ExpressionNode {

    public final String name;

    public VariableNode(String name){
        this.name = name;
    }
}
