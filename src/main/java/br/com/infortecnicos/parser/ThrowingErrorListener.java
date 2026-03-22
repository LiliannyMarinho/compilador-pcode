package br.com.infortecnicos.parser;

import org.antlr.v4.runtime.*;

public class ThrowingErrorListener extends BaseErrorListener {

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    private ThrowingErrorListener() {}

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e
    ) {
        throw new RuntimeException(
                String.format("Erro sintático na linha %d:%d - %s",
                        line, charPositionInLine, msg)
        );
    }
}