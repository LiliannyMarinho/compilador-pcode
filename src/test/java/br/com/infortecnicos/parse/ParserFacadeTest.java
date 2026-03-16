package br.com.infortecnicos.parse;

import br.com.infortecnicos.parser.ParserFacade;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParserFacadeTest {

    @Test
    public void testParseValidProgram() {
        String code = "var x = 42; print(x);";
        ParseTree result = ParserFacade.parse(code);
        assertNotNull(result);
    }

    @Test
    public void testParseNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ParserFacade.parse(null);
        });
        assertEquals("Código fonte não pode ser null", exception.getMessage());
    }

    @Test
    public void testParseEmptyString() {
        String code = "";
        assertDoesNotThrow(() -> ParserFacade.parse(code));
    }

    @Test
    public void testParseWithComments() {
        String code = """
        // Comentário
        var x = 10;
        print(x);
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
    }
}