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
            System.out.println(compuertas[i].getNombre() + " = " + compuertas[i].evaluar());
        }

    }

    public int getCantidad() {
        return cantidad;
    }

    public void eliminar(String nombre){
        for(int i = 0; i < cantidad; i++){
            if(compuertas[i].getNombre().equals(nombre) ){
                for (int j = i; j < cantidad - 1; j++){
                    compuertas[j] = compuertas[j + 1];
                }
                compuertas[cantidad] = null;
                cantidad--;
            }
        }
    }

    public int buscar(String nombre){
        for (int i = 0; i < cantidad; i++){
            if (nombre.equals(compuertas[i].getNombre())) {
                return i;
            }
        }
        return -1;
    }
}
