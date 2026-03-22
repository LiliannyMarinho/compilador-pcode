package br.com.infortecnicos.ast;

import br.com.infortecnicos.ast.statements.StatementNode;
import java.util.List;

public class ProgramNode extends ASTNode {

    public final List<StatementNode> statements;

    public ProgramNode(List<StatementNode> statements) {
        this.statements = statements;
    }
}