package com.simulador.modelo.bancos;

import com.simulador.modelo.NOR;

public class BancoNOR {

    private NOR[] compuertas;
    private int cantidad;

    public BancoNOR(int capacidad) {
        compuertas = new NOR[capacidad];
        cantidad = 0;
    }

    public boolean agregar(NOR compuerta) {
        if (cantidad < compuertas.length) {
            compuertas[cantidad] = compuerta;
            cantidad++;
            return true;
        }
        return false;
    }

    public void evaluarTodas() {

        for (int i = 0; i < cantidad; i++) {

            System.out.println("NOR" + i + " = " + compuertas[i].evaluar());
        }

    }
}
