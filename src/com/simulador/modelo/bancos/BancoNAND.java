package com.simulador.modelo.bancos;

import com.simulador.modelo.NAND;

public class BancoNAND {

    private NAND[] compuertas;
    private int cantidad;

    public BancoNAND(int capacidad) {
        compuertas = new NAND[capacidad];
        cantidad = 0;
    }

    public boolean agregar(NAND compuerta) {
        if (cantidad < compuertas.length) {
            compuertas[cantidad] = compuerta;
            cantidad++;
            return true;
        }
        return false;
    }

    public void evaluarTodas() {

        for (int i = 0; i < cantidad; i++) {

            System.out.println("NAND" + i + " = " + compuertas[i].evaluar());
        }

    }
}
