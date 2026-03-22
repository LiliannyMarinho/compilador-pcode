package br.com.infortecnicos.ast.statements;

import br.com.infortecnicos.ast.ExpressionNode;
import br.com.infortecnicos.ast.BlockNode;

public class WhileNode extends StatementNode {

    public final ExpressionNode condition;
    public final BlockNode block;

    public WhileNode(ExpressionNode condition, BlockNode block) {
        this.condition = condition;
        this.block = block;
    }
}