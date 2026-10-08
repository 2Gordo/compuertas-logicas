package com.simulador.modelo.bancos;

import com.simulador.modelo.compuertas.Compuerta;

public class Banco {
    private Compuerta[] compuertas;
    private int cantidad;

    public Banco( int capacidad ){
        this.compuertas = new Compuerta[capacidad];
        cantidad = 0;
    }

    public boolean agregar(Compuerta compuerta){
        if (cantidad < compuertas.length){
            compuertas[cantidad] = compuerta;
            cantidad ++;
            return true;
        }
        return false;
    }

     public void evaluarTodas() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(compuertas[i].getNombre() + i + " = " + compuertas[i].evaluar());
        }

    }
}
