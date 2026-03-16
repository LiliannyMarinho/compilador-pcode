package br.com.infortecnicos.parser;

import br.com.infortecnicos.LanguageLexer;
import br.com.infortecnicos.LanguageParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserFacade {

    public static ParseTree parse(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Código fonte não pode ser null");
        }

        CharStream input = CharStreams.fromString(code);

        LanguageLexer lexer = new LanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LanguageParser parser = new LanguageParser(tokens);

        return parser.prog();
    }

    public static ParseTree parseWithEmptySupport(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Código fonte não pode ser null");
        }

        if (code.trim().isEmpty()) {
            return null;
        }

        CharStream input = CharStreams.fromString(code);
        LanguageLexer lexer = new LanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LanguageParser parser = new LanguageParser(tokens);

        return parser.prog();
    }
}