/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.simulador.modelo.bancos;

import com.simulador.modelo.EntradaLogica;
import com.simulador.modelo.compuertas.AND;
import com.simulador.modelo.compuertas.NAND;
import com.simulador.modelo.compuertas.NOT;

/**
 *
 * @author ESTUDIANTE
 */
public class PruebaBancos {
    
    public static void main(String[] args) {
        
        Banco banco = new Banco(10);
        EntradaLogica A = new EntradaLogica("A", false);
        EntradaLogica B = new EntradaLogica("B", true);

        AND  and  = new AND(A, B);
        AND  and2 = new AND(B, B);
        NAND nand = new NAND(A, B);
        NOT  not  = new NOT(A);



        banco.agregar(and);
        banco.agregar(and2);
        banco.agregar(nand);
        banco.agregar(not);

        banco.evaluarTodas();

    }
    
}
