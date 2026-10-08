package com.simulador.modelo;

public class NAND {
    private boolean entradaA, entradaB;
    
    public NAND() {
        entradaA = false;
        entradaB = false;
    }
    
    public void setEntradaA(boolean valor) {
        entradaA = valor;
    }
    
    public void setEntradaB(boolean valor) {
        entradaB = valor;
    }
    
    public boolean getEntradaA() {
        return entradaA;
    }
    
    public boolean getEntradaB() {
        return entradaB;
    }
    
    public boolean evaluar() {
        return !(entradaA && entradaB);
    }
}