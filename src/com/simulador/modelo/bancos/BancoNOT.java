package com.simulador.modelo.bancos;

import com.simulador.modelo.NOT;

public class BancoNOT {

    private NOT[] compuertas;
    private int cantidad;

    public BancoNOT(int capacidad) {
        compuertas = new NOT[capacidad];
        cantidad = 0;
    }

    public boolean agregar(NOT compuerta) {
        if (cantidad < compuertas.length) {
            compuertas[cantidad] = compuerta;
            cantidad++;
            return true;
        }
        return false;
    }

    public void evaluarTodas() {

        for (int i = 0; i < cantidad; i++) {

            System.out.println("NOT" + i + " = " + compuertas[i].evaluar());
        }

    }
}
