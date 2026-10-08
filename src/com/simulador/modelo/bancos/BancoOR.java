package com.simulador.modelo.bancos;

import com.simulador.modelo.OR;

public class BancoOR {

    private OR[] compuertas;
    private int cantidad;

    public BancoOR(int capacidad) {
        compuertas = new OR[capacidad];
        cantidad = 0;
    }

    public boolean agregar(OR compuerta) {
        if (cantidad < compuertas.length) {
            compuertas[cantidad] = compuerta;
            cantidad++;
            return true;
        }
        return false;
    }

    public void evaluarTodas() {

        for (int i = 0; i < cantidad; i++) {

            System.out.println("OR" + i + " = " + compuertas[i].evaluar());
        }

    }
}
