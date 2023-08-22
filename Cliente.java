/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase6;

/**
 *
 * @author SALA
 */
public class Cliente {
    private String nombre;
    private String identificacion;
    private int edad;
    
    String Getnombre()
    {
        if (nombre==null)
        {
            return "Nombre no asignado";
        }
        return nombre;
    }
    void setnombre(String nombre)
    {
        this.nombre = nombre;
    }
    
}
