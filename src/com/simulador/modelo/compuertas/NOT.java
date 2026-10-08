package com.simulador.modelo.compuertas;

import com.simulador.modelo.EntradaLogica;

public class NOT extends Compuerta{
    private EntradaLogica A;
    
    public NOT(EntradaLogica A) {
        super("NOT");
        this.A = A;
    }
    
    public boolean evaluar() {
        return !A.getValor();
    }
}