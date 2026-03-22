package br.com.infortecnicos.ast.statements;

import br.com.infortecnicos.ast.ExpressionNode;
import br.com.infortecnicos.ast.BlockNode;

public class ForNode extends StatementNode {

    public final AssignNode init;
    public final ExpressionNode condition;
    public final AssignNode update;
    public final BlockNode block;

    public ForNode(AssignNode init, ExpressionNode condition, AssignNode update, BlockNode block) {
        this.init = init;
        this.condition = condition;
        this.update = update;
        this.block = block;
    }
}