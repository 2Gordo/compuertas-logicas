/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.simulador.modelo.bancos;

import com.simulador.modelo.AND;

/**
 *
 * @author ESTUDIANTE
 */
public class PruebaBancos {
    
    public static void main(String[] args) {
        
        BancoAND ands = new BancoAND(10);
        
        AND a1 = new AND();
        a1.setEntradaA(true);
        a1.setEntradaB(false);
        
        AND a2 = new AND();
        a2.setEntradaA(true);
        a2.setEntradaB(true);
          
        ands.agregar(a1);
        ands.agregar(a2);
        
        ands.evaluarTodas();
        
    }
    
}
