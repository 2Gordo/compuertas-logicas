package com.simulador.modelo.compuertas;

import com.simulador.modelo.EntradaLogica;

public class NAND extends Compuerta {
    private EntradaLogica A;
    private EntradaLogica B;
    
    public NAND(EntradaLogica A, EntradaLogica B ) {
        super("NAND");
        this.A = A;
        this.B = B;
    }
    
    public boolean evaluar() {
        return !(A.getValor() && B.getValor());
    }
}