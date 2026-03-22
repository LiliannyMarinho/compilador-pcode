package br.com.infortecnicos.ast;

import br.com.infortecnicos.ast.statements.StatementNode;
import java.util.List;

public class BlockNode extends ASTNode {

    public final List<StatementNode> statements;

    public BlockNode(List<StatementNode> statements) {
        this.statements = statements;
    }
}