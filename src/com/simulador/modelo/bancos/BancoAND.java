package com.simulador.modelo.bancos;

import com.simulador.modelo.AND;

public class BancoAND {

    private AND[] compuertas;
    private int cantidad;

    public BancoAND(int capacidad) {
        compuertas = new AND[capacidad];
        cantidad = 0;
    }

    public boolean agregar(AND compuerta) {
        if (cantidad < compuertas.length) {
            compuertas[cantidad] = compuerta;
            cantidad++;
            return true;
        }
        return false;
    }

    public void evaluarTodas() {

        for (int i = 0; i < cantidad; i++) {

            System.out.println("AND" + i + " = " + compuertas[i].evaluar());
        }

    }
}
