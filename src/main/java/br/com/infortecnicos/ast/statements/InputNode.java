package br.com.infortecnicos.ast.statements;

public class InputNode extends StatementNode {

    public final String variable;

    public InputNode(String variable) {
        this.variable = variable;
    }
}