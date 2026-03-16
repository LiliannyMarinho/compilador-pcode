package br.com.infortecnicos.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Interpreter {

    private final Map<String, Double> memory = new HashMap<>();

    public void set(String name,double value){
        memory.put(name,value);
    }

    public double get(String name){
        if(!memory.containsKey(name))
            throw new RuntimeException("Variável não definida: "+name);
        return memory.get(name);
    }
}
