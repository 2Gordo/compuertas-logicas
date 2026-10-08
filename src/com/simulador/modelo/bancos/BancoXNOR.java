package com.simulador.modelo.bancos;

import com.simulador.modelo.XNOR;

public class BancoXNOR {

    private XNOR[] compuertas;
    private int cantidad;

    public BancoXNOR(int capacidad) {
        compuertas = new XNOR[capacidad];
        cantidad = 0;
    }

    public boolean agregar(XNOR compuerta) {
        if (cantidad < compuertas.length) {
            compuertas[cantidad] = compuerta;
            cantidad++;
            return true;
        }
        return false;
    }

    public void evaluarTodas() {

        for (int i = 0; i < cantidad; i++) {

            System.out.println("XNOR" + i + " = " + compuertas[i].evaluar());
        }

    }
}
