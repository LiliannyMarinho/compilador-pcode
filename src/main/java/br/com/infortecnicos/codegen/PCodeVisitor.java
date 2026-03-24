package br.com.infortecnicos.codegen;

import br.com.infortecnicos.LanguageBaseVisitor;
import br.com.infortecnicos.LanguageParser;

public class PCodeVisitor extends LanguageBaseVisitor<Void> {

    StringBuilder code = new StringBuilder();

    public String getCode() {
        return code.toString();
    }

    @Override
    public Void visitAtom(LanguageParser.AtomContext ctx) {

        if (ctx.NUMBER() != null) {
            code.append("PUSH ").append(ctx.NUMBER().getText()).append("\n");
        }

        if (ctx.IDENT() != null) {
            code.append("LOD ").append(ctx.IDENT().getText()).append("\n");
        }

        return null;
    }

    @Override
    public Void visitExpr(LanguageParser.ExprContext ctx) {

        if (ctx.getChildCount() == 3) {

            visit(ctx.expr(0));
            visit(ctx.expr(1));

            String op = ctx.getChild(1).getText();

            switch (op) {
                case "+":
                    code.append("ADD\n");
                    break;
                case "-":
                    code.append("SUB\n");
                    break;
                case "*":
                    code.append("MUL\n");
                    break;
                case "/":
                    code.append("DIV\n");
                    break;
            }

        } else {
            visit(ctx.atom());
        }

        return null;
    }

    @Override
    public Void visitAssign(LanguageParser.AssignContext ctx) {

        visit(ctx.expr());

        String varName = ctx.IDENT().getText();
        code.append("STO ").append(varName).append("\n");

        return null;
    }

    @Override
    public Void visitPrintStat(LanguageParser.PrintStatContext ctx) {

        if (ctx.expr() != null) {
            visit(ctx.expr());
        }

        code.append("OUT\n");

        return null;
    }
}