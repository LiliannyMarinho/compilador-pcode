package br.com.infortecnicos.interpreter;

import br.com.infortecnicos.parser.ParserFacade;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import static org.junit.jupiter.api.Assertions.*;

public class InterpreterTest {

    @Rule
    public TestName testName = new TestName();

    @Before
    public void setUp() {
        System.out.println("\n🔵 Executando teste: " + testName.getMethodName());
        System.out.println("========================================");
    }

    // TESTES DE DECLARAÇÃO
    @Test
    public void testVariableDeclaration() {
        String code = "var x = 10;";
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Declaração simples OK");
    }

    @Test
    public void testVariableDeclarationWithoutInitialization() {
        String code = "var x;";
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Declaração sem inicialização OK");
    }

    @Test
    public void testMultipleVariableDeclarations() {
        String code = """
        var x = 10;
        var y = 20;
        var z = 30;
        var w;
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Múltiplas declarações OK");
    }

    @Test
    public void testVariableDeclarationWithDecimal() {
        String code = "var x = 10.5; var y = 20.75;";
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Declaração com números decimais OK");
    }

    // TESTES DE ATRIBUIÇÃO
    @Test
    public void testValueAssignment() {
        String code = "var x; x = 10;";
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Atribuição simples OK");
    }

    @Test
    public void testMultipleAssignments() {
        String code = """
        var x = 5;
        var y;
        var z;
        x = 10;
        y = 20;
        z = 30;
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Múltiplas atribuições OK");
    }

    @Test
    public void testReassignment() {
        String code = """
        var x = 10;
        x = 20;
        x = 30;
        x = 40;
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Reatribuição OK");
    }

    // TESTES DE EXPRESSÕES ARITMÉTICAS
    @Test
    public void testArithmeticAssignment() {
        String code = """
        var x = 10;
        var y = 20;
        x = x + y;
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Expressão aritmética simples OK");
    }

    @Test
    public void testComplexArithmeticExpression() {
        String code = """
        var x = 10;
        var y = 20;
        var z = 30;
        var resultado;
        resultado = x + y * z - 15 / 3;
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Expressão aritmética complexa OK");
    }

    @Test
    public void testArithmeticWithParentheses() {
        String code = """
        var x = 10;
        var y = 20;
        var resultado;
        resultado = (x + y) * 2;
        resultado = (x * (y + 5)) / 3;
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Expressões com parênteses OK");
    }

    @Test
    public void testPowerOperator() {
        String code = """
        var x = 2;
        var y = 3;
        var resultado;
        resultado = x ^ y;
        resultado = 2 ^ 3 ^ 2;
        resultado = (x + 1) ^ (y - 1);
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Operador de potenciação (^) OK");
    }

    @Test
    public void testAllArithmeticOperators() {
        String code = """
        var a = 10;
        var b = 20;
        var c = 30;
        var r1 = a + b;
        var r2 = a - b;
        var r3 = a * b;
        var r4 = a / b;
        var r5 = a ^ b;
        var r6 = (a + b) * (c - a) / 2 ^ 3;
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Todos operadores aritméticos OK");
    }

    // TESTES DE ESTRUTURAS CONDICIONAIS
    @Test
    public void testSimpleIfElse() {
        String code = """
        var x = 10;
        var y = 15;
        if (x < y) {
            print(x);
        } else {
            print(y);
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ IF-ELSE simples OK");
    }

    @Test
    public void testIfElseWithMultipleStatements() {
        String code = """
        var x = 10;
        var y = 15;
        if (x < y) {
            print(x);
            print("X é menor que Y");
            x = x + 5;
        } else {
            print(y);
            print("Y é menor ou igual a X");
            y = y + 5;
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ IF-ELSE com múltiplos comandos OK");
    }

    @Test
    public void testIfElseWithComplexCondition() {
        String code = """
        var x = 10;
        var y = 20;
        var z = 30;
        if (x < y and y < z or x == 5) {
            print("Verdadeiro");
        } else {
            print("Falso");
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ IF-ELSE com condição complexa OK");
    }

    @Test
    public void testIfElseWithAllComparisons() {
        String code = """
        var x = 10;
        if (x < 20) { print("menor"); } else { print("não menor"); }
        if (x <= 10) { print("menor ou igual"); } else { print("não <= "); }
        if (x > 5) { print("maior"); } else { print("não maior"); }
        if (x >= 10) { print("maior ou igual"); } else { print("não >= "); }
        if (x == 10) { print("igual"); } else { print("não igual"); }
        if (x != 20) { print("diferente"); } else { print("igual"); }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ IF-ELSE com todos operadores OK");
    }

    @Test
    public void testNestedIfElse() {
        String code = """
        var x = 10;
        var y = 20;
        if (x < y) {
            if (x == 10) {
                print("x é 10");
            } else {
                print("x não é 10");
            }
        } else {
            if (y == 20) {
                print("y é 20");
            } else {
                print("y não é 20");
            }
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ IF-ELSE aninhado OK");
    }

    // TESTES DE ESTRUTURAS DE REPETIÇÃO
    @Test
    public void testSimpleWhile() {
        String code = """
        var x = 0;
        while (x < 5) {
            x = x + 1;
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ WHILE simples OK");
    }

    @Test
    public void testWhileWithMultipleStatements() {
        String code = """
        var x = 0;
        var soma = 0;
        while (x < 5) {
            soma = soma + x;
            print(soma);
            x = x + 1;
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ WHILE com múltiplos comandos OK");
    }

    @Test
    public void testWhileWithComplexCondition() {
        String code = """
        var x = 0;
        var y = 10;
        while (x < 5 and y > 5) {
            x = x + 1;
            y = y - 1;
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ WHILE com condição complexa OK");
    }

    @Test
    public void testNestedWhile() {
        String code = """
        var i = 0;
        var j = 0;
        while (i < 3) {
            j = 0;
            while (j < 3) {
                print(i * j);
                j = j + 1;
            }
            i = i + 1;
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ WHILE aninhado OK");
    }

    @Test
    public void testSimpleFor() {
        String code = """
        var x = 0;
        for (x = 0; x < 5; x = x + 1) {
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ FOR simples OK");
    }

    @Test
    public void testForWithMultipleStatements() {
        String code = """
        var i = 0;
        var soma = 0;
        for (i = 0; i < 5; i = i + 1) {
            soma = soma + i;
            print(soma);
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ FOR com múltiplos comandos OK");
    }

    @Test
    public void testForWithComplexCondition() {
        String code = """
        var i = 0;
        var j = 10;
        for (i = 0; i < 5 and j > 5; i = i + 1) {
            j = j - 1;
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ FOR com condição complexa OK");
    }

    @Test
    public void testNestedFor() {
        String code = """
        var i = 0;
        var j = 0;
        for (i = 0; i < 3; i = i + 1) {
            for (j = 0; j < 3; j = j + 1) {
                print(i * j);
            }
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ FOR aninhado OK");
    }

    // TESTES DE ENTRADA/SAÍDA
    @Test
    public void testPrintString() {
        String code = "print(\"Hello World\");";
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ PRINT string OK");
    }

    @Test
    public void testPrintVariable() {
        String code = """
        var x = 10;
        print(x);
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ PRINT variável OK");
    }

    @Test
    public void testPrintExpression() {
        String code = """
        var x = 10;
        var y = 20;
        print(x + y);
        print(x * y - 5);
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ PRINT expressão OK");
    }

    @Test
    public void testMultiplePrints() {
        String code = """
        print("Início");
        var x = 10;
        print("Valor de x:");
        print(x);
        print("Fim");
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Múltiplos PRINTs OK");
    }

    @Test
    public void testInput() {
        String code = """
        var x;
        input(x);
        print(x);
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ INPUT simples OK");
    }

    @Test
    public void testMultipleInputs() {
        String code = """
        var a;
        var b;
        var c;
        input(a);
        input(b);
        input(c);
        print(a + b + c);
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Múltiplos INPUTs OK");
    }

    // TESTES DE COMBINAÇÕES COMPLEXAS
    @Test
    public void testFatorialProgram() {
        String code = """
        // Calcula fatorial de um número
        var n;
        var resultado = 1;
        var i = 1;
        
        print("Digite um número:");
        input(n);
        
        while (i <= n) {
            resultado = resultado * i;
            i = i + 1;
        }
        
        print("O fatorial é:");
        print(resultado);
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Programa fatorial OK");
    }

    @Test
    public void testFibonacciProgram() {
        String code = """
        // Calcula Fibonacci até um limite
        var limite;
        var a = 0;
        var b = 1;
        var temp;
        
        print("Digite o limite:");
        input(limite);
        
        print("Sequência de Fibonacci:");
        print(a);
        print(b);
        
        while (a + b <= limite) {
            temp = a + b;
            print(temp);
            a = b;
            b = temp;
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Programa Fibonacci OK");
    }

    @Test
    public void testTemperatureConverter() {
        String code = """
        // Conversor Celsius-Fahrenheit
        var celsius;
        var fahrenheit;
        var opcao;
        
        print("Conversor de temperatura");
        print("1 - Celsius para Fahrenheit");
        print("2 - Fahrenheit para Celsius");
        input(opcao);
        
        if (opcao == 1) {
            print("Digite a temperatura em Celsius:");
            input(celsius);
            fahrenheit = celsius * 9 / 5 + 32;
            print("Temperatura em Fahrenheit:");
            print(fahrenheit);
        }
        
        if (opcao == 2) {
            print("Digite a temperatura em Fahrenheit:");
            input(fahrenheit);
            celsius = (fahrenheit - 32) * 5 / 9;
            print("Temperatura em Celsius:");
            print(celsius);
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Conversor de temperatura OK");
    }

    @Test
    public void testNumberGuessingGame() {
        String code = """
        // Jogo de adivinhação
        var segredo = 42;
        var palpite;
        var tentativas = 0;
        
        print("Tente adivinhar o número secreto (entre 1 e 100)");
        
        input(palpite);
        tentativas = tentativas + 1;
        
        while (palpite != segredo) {
            if (palpite < segredo) {
                print("Muito baixo! Tente novamente:");
            } else {
                print("Muito alto! Tente novamente:");
            }
            input(palpite);
            tentativas = tentativas + 1;
        }
        
        print("Parabéns! Você acertou em:");
        print(tentativas);
        print("tentativas!");
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Jogo de adivinhação OK");
    }

    // TESTES DE COMENTÁRIOS

    @Test
    public void testSingleLineComments() {
        String code = """
        // Este é um comentário de linha única
        var x = 10; // Comentário após código
        // Outro comentário
        print(x); // Comentário no final
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Comentários de linha única OK");
    }

    @Test
    public void testCommentsEverywhere() {
        String code = """
        // Programa com comentários
        var x = 10; // Declara x
        var y = 20; // Declara y
        
        // Calcula a soma
        var soma = x + y; // Comentário inline
        
        // Imprime resultado
        print(soma); // Comentário no print
        
        // Fim do programa
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Comentários em todo lugar OK");
    }

    // TESTES DE CASOS LIMITE
    @Test
    public void testEmptyProgram() {
        String code = "";
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Programa vazio OK");
    }

    @Test
    public void testVeryLargeNumbers() {
        String code = """
        var x = 999999999;
        var y = 0.000000001;
        var z = 123456.789;
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Números grandes e pequenos OK");
    }

    @Test
    public void testLongVariableNames() {
        String code = """
        var variavel_com_nome_muito_longo_1 = 10;
        var _variavelComecandoComUnderline = 20;
        var variavel123ComNumerosNoMeio456 = 30;
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Nomes de variáveis longos OK");
    }

    @Test
    public void testEmptyBlocks() {
        String code = """
        var x = 10;
        if (x < 20) {
            // Bloco vazio
        }
        while (x < 15) {
            // Bloco vazio
            x = x + 1;
        }
        """;
        assertDoesNotThrow(() -> ParserFacade.parse(code));
        System.out.println("✅ Blocos vazios OK");
    }
}