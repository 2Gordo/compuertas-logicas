package com.simulador.modelo.compuertas;

import com.simulador.modelo.EntradaLogica;

public class XOR extends Compuerta {
    private EntradaLogica A;
    private EntradaLogica B;
    
    public XOR(EntradaLogica A, EntradaLogica B, String ID) {
        super(ID);
        this.A = A;
        this.B = B;
    }
    
    public boolean evaluar() {
        return A.getValor() != B.getValor();
    }
}