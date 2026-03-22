package br.com.infortecnicos.parser;

import br.com.infortecnicos.LanguageLexer;
import br.com.infortecnicos.LanguageParser;
import br.com.infortecnicos.ast.ASTNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParserFacade {

    // PARSE (ParseTree)
    public static ParseTree parse(String code) {
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("Código fonte inválido");
        }

        LanguageParser parser = buildParser(code);
        return parser.prog();
    }

    public static ParseTree parseWithEmptySupport(String code) {
        if (code == null || code.trim().isEmpty()) {
            return null;
        }

        LanguageParser parser = buildParser(code);
        return parser.prog();
    }

    // AST
    public static ASTNode parseToAST(String code) {
        ParseTree tree = parse(code);
        ASTBuilder builder = new ASTBuilder();
        return builder.visit(tree);
    }

    public static ASTNode parseToASTSafe(String code) {
        if (code == null || code.trim().isEmpty()) {
            return null;
        }

        ParseTree tree = parse(code);
        ASTBuilder builder = new ASTBuilder();
        return builder.visit(tree);
    }

    // INTERNAL
    private static LanguageParser buildParser(String code) {
        CharStream input = CharStreams.fromString(code);

        LanguageLexer lexer = new LanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LanguageParser parser = new LanguageParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        return parser;
    }
}