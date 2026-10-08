package com.simulador.modelo.bancos;
import com.simulador.modelo.XOR;

public class BancoXOR {

    private XOR[] compuertas;
    private int cantidad;

    public BancoXOR(int capacidad) {
        compuertas = new XOR[capacidad];
        cantidad = 0;
    }

    public boolean agregar(XOR compuerta) {
        if (cantidad < compuertas.length) {
            compuertas[cantidad] = compuerta;
            cantidad++;
            return true;
        }
        return false;
    }
    
    public void evaluarTodas() {

        for (int i = 0; i < cantidad; i++) {

            System.out.println("XOR" + i + " = " + compuertas[i].evaluar());
        }

    }
}

