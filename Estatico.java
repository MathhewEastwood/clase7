/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estatico;

/**
 *
 * @author SALA
 */
public class Estatico {

    public static void main(String[] args) {
        double Operador1 = 34.7;
        double Operador2 = 56.9;
        System.out.println("Resultado: " + Operaciones.add(Operador1, Operador2));
        
        
        
        Persona persona1 = new Persona("Fulano","estudiante");
        
        Persona persona2 = new Persona("Sutano","profesor");
        
        Persona persona3 = new Persona("Megano","consultor");
        
        Persona persona4 = new Persona("Josefina");
        
        Persona persona5 = new Persona();
        
        
        persona1.MuestraInfo();
        persona2.MuestraInfo();
        persona3.MuestraInfo();
        persona4.MuestraInfo();
        persona5.MuestraInfo();
        
        
       
    }
}
