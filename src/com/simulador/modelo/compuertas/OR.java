package com.simulador.modelo.compuertas;

import com.simulador.modelo.EntradaLogica;

public class OR  extends  Compuerta {
    private EntradaLogica A;
    private EntradaLogica B;
    
    public OR(EntradaLogica A, EntradaLogica B) {
        super("OR");
        this.A = A;
        this.B = B;
    }
    
    public boolean evaluar() {
        return A.getValor() || B.getValor();
    }
}