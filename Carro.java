/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase6;

/**
 *
 * @author SALA
 */
public class Carro {
   private String color;
   int modelo;
   private int Nrollantas;
   String NoChasis;
   private String combustible;
   boolean automatico;
   Carro()
   {
       color="Blanco";
       modelo=2017;
       Nrollantas=4;
       NoChasis="ABC789";
       combustible="Gasolina";
       automatico=true;
   }
   void Avanzar()
   {
       System.out.println("Estoy avanzando");
   }
   void Frenar()
   {
       System.out.println("Estoy frenando");
   }
   void Retroceder()
   {
       System.out.println("Estoy retrocediendo");
   }
   String GetColor()
   {
       return color;
   }
   void SetColor(String color)
   {
       this.color = color;
   }
    int GetNrollantas()
   {
       return Nrollantas;
   }
   void SetNrollantas(int Nrollantas)
   {
       this.Nrollantas = Nrollantas;
   }
    String Getcombustible()
   {
       return combustible;
   }
   void Setcombustible(String combustible)
   {
       this.combustible = combustible;
   }
}
