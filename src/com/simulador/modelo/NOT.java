package com.simulador.modelo;

public class NOT {
    private boolean entrada;
    
    public NOT() {
        entrada = false;
    }
    
    public void setEntrada(boolean valor) {
        entrada = valor;
    }
    
    public boolean getEntrada() {
        return entrada;
    }
    
    public boolean evaluar() {
        return !entrada;
    }
}