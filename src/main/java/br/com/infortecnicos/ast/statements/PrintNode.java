package br.com.infortecnicos.ast.statements;

import br.com.infortecnicos.ast.ExpressionNode;

public class PrintNode extends StatementNode {

    public final ExpressionNode expression;
    public final String text;

    public PrintNode(ExpressionNode expression) {
        this.expression = expression;
        this.text = null;
    }

    public PrintNode(String text) {
        this.text = text;
        this.expression = null;
    }
}