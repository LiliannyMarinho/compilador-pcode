package br.com.infortecnicos;

import br.com.infortecnicos.interpreter.InterpreterTest;
import br.com.infortecnicos.parse.ParserFacadeTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        InterpreterTest.class,
        ParserFacadeTest.class
})
public class AppTest {
    // Classe vazia - apenas para rodar todos os testes
}
