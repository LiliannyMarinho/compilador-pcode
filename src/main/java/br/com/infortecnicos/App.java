package br.com.infortecnicos;

import br.com.infortecnicos.parser.ParserFacade;

public class App
{
    public static void main( String[] args ) {
        String code = """        
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
        ParserFacade.parse(code);
        System.out.println("Parse executado com sucesso.");
    }
}
