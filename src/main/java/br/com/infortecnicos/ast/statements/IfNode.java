package br.com.infortecnicos.ast.statements;

import br.com.infortecnicos.ast.ExpressionNode;
import br.com.infortecnicos.ast.BlockNode;

public class IfNode extends StatementNode {

    public final ExpressionNode condition;
    public final BlockNode thenBlock;
    public final BlockNode elseBlock;

    public IfNode(ExpressionNode condition, BlockNode thenBlock, BlockNode elseBlock) {
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }
}