package br.com.infortecnicos.parser;

import br.com.infortecnicos.LanguageBaseVisitor;
import br.com.infortecnicos.LanguageParser;
import br.com.infortecnicos.ast.ASTNode;
import br.com.infortecnicos.ast.BlockNode;
import br.com.infortecnicos.ast.ExpressionNode;
import br.com.infortecnicos.ast.ProgramNode;
import br.com.infortecnicos.ast.expressions.*;
import br.com.infortecnicos.ast.statements.*;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends LanguageBaseVisitor<ASTNode> {

    // PROGRAMA
    @Override
    public ASTNode visitProg(LanguageParser.ProgContext ctx) {
        List<StatementNode> statements = new ArrayList<>();

        for (var stat : ctx.stat()) {
            statements.add((StatementNode) visit(stat));
        }

        return new ProgramNode(statements);
    }

    // STATEMENTS
    @Override
    public ASTNode visitVarDecl(LanguageParser.VarDeclContext ctx) {
        String name = ctx.IDENT().getText();

        ExpressionNode expr = null;
        if (ctx.expr() != null) {
            expr = (ExpressionNode) visit(ctx.expr());
        }

        return new VarDeclNode(name, expr);
    }

    @Override
    public ASTNode visitAssign(LanguageParser.AssignContext ctx) {
        String name = ctx.IDENT().getText();
        ExpressionNode expr = (ExpressionNode) visit(ctx.expr());

        return new AssignNode(name, expr);
    }

    @Override
    public ASTNode visitPrintStat(LanguageParser.PrintStatContext ctx) {
        if (ctx.expr() != null) {
            return new PrintNode((ExpressionNode) visit(ctx.expr()));
        } else {
            return new PrintNode(ctx.STRING().getText());
        }
    }

    @Override
    public ASTNode visitInputStat(LanguageParser.InputStatContext ctx) {
        return new InputNode(ctx.IDENT().getText());
    }

    @Override
    public ASTNode visitBlock(LanguageParser.BlockContext ctx) {
        List<StatementNode> statements = new ArrayList<>();

        for (var stat : ctx.stat()) {
            statements.add((StatementNode) visit(stat));
        }

        return new BlockNode(statements);
    }

    // CONTROLE
    @Override
    public ASTNode visitIfStat(LanguageParser.IfStatContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.cond());
        BlockNode thenBlock = (BlockNode) visit(ctx.block(0));

        BlockNode elseBlock = null;
        if (ctx.block().size() > 1) {
            elseBlock = (BlockNode) visit(ctx.block(1));
        }

        return new IfNode(condition, thenBlock, elseBlock);
    }

    @Override
    public ASTNode visitWhileStat(LanguageParser.WhileStatContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.cond());
        BlockNode block = (BlockNode) visit(ctx.block());

        return new WhileNode(condition, block);
    }

    @Override
    public ASTNode visitForStat(LanguageParser.ForStatContext ctx) {

        AssignNode init = (AssignNode) visit(ctx.assign(0));
        ExpressionNode cond = (ExpressionNode) visit(ctx.cond());
        AssignNode update = (AssignNode) visit(ctx.assign(1));
        BlockNode block = (BlockNode) visit(ctx.block());

        return new ForNode(init, cond, update, block);
    }

    // EXPRESSÕES
    @Override
    public ASTNode visitExp(LanguageParser.ExpContext ctx) {
        return new BinaryOpNode(
                "^",
                (ExpressionNode) visit(ctx.expr(0)),
                (ExpressionNode) visit(ctx.expr(1))
        );
    }

    @Override
    public ASTNode visitMul(LanguageParser.MulContext ctx) {
        String op = ctx.getChild(1).getText();

        return new BinaryOpNode(
                op,
                (ExpressionNode) visit(ctx.expr(0)),
                (ExpressionNode) visit(ctx.expr(1))
        );
    }

    @Override
    public ASTNode visitDiv(LanguageParser.DivContext ctx) {
        String op = ctx.getChild(1).getText();

        return new BinaryOpNode(
                op,
                (ExpressionNode) visit(ctx.expr(0)),
                (ExpressionNode) visit(ctx.expr(1))
        );
    }

    @Override
    public ASTNode visitUnit(LanguageParser.UnitContext ctx) {
        return visit(ctx.atom());
    }

    @Override
    public ASTNode visitAtom(LanguageParser.AtomContext ctx) {
        if (ctx.NUMBER() != null) {
            return new NumberNode(Double.parseDouble(ctx.NUMBER().getText()));
        }

        if (ctx.IDENT() != null) {
            return new VariableNode(ctx.IDENT().getText());
        }

        return visit(ctx.expr());
    }

    // CONDIÇÕES
    @Override
    public ASTNode visitComparison(LanguageParser.ComparisonContext ctx) {
        return new BinaryOpNode(
                ctx.RELATIONAL().getText(),
                (ExpressionNode) visit(ctx.expr(0)),
                (ExpressionNode) visit(ctx.expr(1))
        );
    }

    @Override
    public ASTNode visitNotExpr(LanguageParser.NotExprContext ctx) {
        if (ctx.NOT() != null) {
            return new UnaryOpNode(
                    "not",
                    (ExpressionNode) visit(ctx.notExpr())
            );
        }

        if (ctx.TRUE() != null) {
            return new BooleanNode(true);
        }

        if (ctx.FALSE() != null) {
            return new BooleanNode(false);
        }

        if (ctx.comparison() != null) {
            return visit(ctx.comparison());
        }

        return visit(ctx.cond());
    }

    @Override
    public ASTNode visitAndExpr(LanguageParser.AndExprContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.notExpr(0));

        for (int i = 1; i < ctx.notExpr().size(); i++) {
            left = new BinaryOpNode(
                    "and",
                    left,
                    (ExpressionNode) visit(ctx.notExpr(i))
            );
        }

        return left;
    }

    @Override
    public ASTNode visitOrExpr(LanguageParser.OrExprContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.andExpr(0));

        for (int i = 1; i < ctx.andExpr().size(); i++) {
            left = new BinaryOpNode(
                    "or",
                    left,
                    (ExpressionNode) visit(ctx.andExpr(i))
            );
        }

        return left;
    }
}