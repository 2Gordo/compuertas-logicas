package com.simulador.modelo.compuertas;

import com.simulador.modelo.EntradaLogica;

public class AND extends Compuerta {
    private EntradaLogica A;
    private EntradaLogica B;
    
    
    public AND (EntradaLogica A, EntradaLogica B) {
        super("AND");
        this.A = A;
        this.B = B;
    }
    
    @Override 
    public boolean evaluar() {
        return A.getValor() && B.getValor();
    }
}