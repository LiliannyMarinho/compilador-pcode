package br.com.infortecnicos.ast.statements;

import br.com.infortecnicos.ast.ExpressionNode;
import br.com.infortecnicos.ast.StatementNode;

public class AssignNode extends StatementNode {

    public final String name;
    public final ExpressionNode expr;

    public AssignNode(String name, ExpressionNode expr){
        this.name = name;
        this.expr = expr;
    }
}
