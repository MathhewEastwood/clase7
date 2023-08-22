/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

/**
 *
 * @author SALA
 */
public class Figuras {

    public static void main(String[] args) {
        Geometricas fig1 = new Geometricas();
        fig1.setTipofigura("Cuadrado");
        fig1.setlado1(5);
        System.out.println("el area es: " + fig1.CalcularArea());
    }
}
