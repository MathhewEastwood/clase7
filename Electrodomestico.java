/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8;

/**
 *
 * @author SALA
 */
public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;
    private double costos;
    Electrodomestico()
    {
        tipo = "";
        marca = "";
                
        
    }
    String Gettipo()
    {
        return tipo;
    }
    void settipo(String tipo)
    {
        this.tipo= tipo;
    }
     String Getmarca()
    {
        return marca;
    }
    void setmarca(String marca)
    {
        this.marca= marca;
    }
    double Getpotencia()
    {
        return potencia;
    }
    void setpotencia(double potencia)
    {
        this.potencia=potencia;
    }
    
     
     
     double CalcularConsumo(double horas)
     {
         double CT; 
         CT= potencia*horas;
         return CT;
     }
     double CalcularCostoConsumo(double horas,double costos)
     {
         double precio;
         precio=CalcularConsumo(horas)*costos;
         return precio;
     }
     
     void MostrarInformacion(double horas, double precio)
     {
         System.out.println("Info general del aparato");
         System.out.println("El tipo es: " + tipo);
         System.out.println("La marca es: " + marca);
         System.out.println("La potencia es:" + potencia + " Kw");
       
       
         System.out.println("El consumo es: " + CalcularConsumo(horas));
         System.out.println("El costo del consumo es: " + CalcularCostoConsumo(horas,precio) + " pesos");
     }
}
