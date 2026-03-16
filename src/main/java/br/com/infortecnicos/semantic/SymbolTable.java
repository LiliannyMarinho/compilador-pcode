package br.com.infortecnicos.semantic;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private final Map<String, Double> vars = new HashMap<>();

    public void declare(String name){
        if(vars.containsKey(name))
            throw new RuntimeException("Variável já declarada: "+name);
        vars.put(name,0.0);
    }

    public void set(String name,double value){
        if(!vars.containsKey(name))
            throw new RuntimeException("Variável não declarada: "+name);
        vars.put(name,value);
    }

    public double get(String name){
        if(!vars.containsKey(name))
            throw new RuntimeException("Variável não declarada: "+name);
        return vars.get(name);
    }
}
