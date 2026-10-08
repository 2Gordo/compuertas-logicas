package com.simulador.modelo;

public class Prueba {

    public static void main(String[] args) {

        System.out.println("AND");
        AND a = new AND();

        a.setEntradaA(true);
        a.setEntradaB(false);

        System.out.println(a.evaluar());
        System.out.println(" ");

        System.out.println("NAND");
        NAND b = new NAND();

        b.setEntradaA(true);
        b.setEntradaB(false);

        System.out.println(b.evaluar());
        System.out.println(" ");

        System.out.println("NOR");
        NOR c = new NOR();

        c.setEntradaA(true);
        c.setEntradaB(false);

        System.out.println(c.evaluar());
        System.out.println(" ");

        System.out.println("NOT");
        NOT d = new NOT();

        d.setEntrada(true);

        System.out.println(d.evaluar());
        System.out.println(" ");

        System.out.println("OR");
        OR e = new OR();

        e.setEntradaA(true);
        e.setEntradaB(false);

        System.out.println(e.evaluar());
        System.out.println(" ");

        System.out.println("XNOR");
        XNOR f = new XNOR();

        f.setEntradaA(true);
        f.setEntradaB(false);

        System.out.println(f.evaluar());
        System.out.println(" ");

        System.out.println("XOR");
        XOR g = new XOR();

        g.setEntradaA(true);
        g.setEntradaB(false);

        System.out.println(g.evaluar());
        System.out.println(" ");

    }

}
