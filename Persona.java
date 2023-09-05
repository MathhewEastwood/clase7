/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatico;

/**
 *
 * @author SALA
 */
public class Persona {
    private String nombre;
    private String rol;
    private int id;
    private static int idsiguiente = 1;
    
    Persona(String nombre, String rol)
    {
     this.nombre = nombre;
     this.rol=rol;
     id = idsiguiente;
     idsiguiente++;
     
    }
    Persona(String nombre)
    {
     this.nombre = nombre;    
     id = idsiguiente;
     idsiguiente++;
     
    }
    Persona()
    {
    
    }
    void MuestraInfo()
    {
        System.out.println("Datos de la persona:");
        System.out.println("Nombre es: " + nombre);
        System.out.println("El rol es: " + rol);
        System.out.println("El id es: " + id);
    }
    
}
