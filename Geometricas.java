/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author SALA
 */
public class Geometricas {
    private String Tipofigura;
    private int lado1;
    private int lado2;
    private int lado3;
    
   
    String GetTipofigura()
    {
        return Tipofigura;
    }
    void setTipofigura(String Tipofigura)
    {
        this.Tipofigura = Tipofigura;
    }
     int Getlado1()
    {
        return lado1;
    }
    void setlado1(int lado1)
    {
        this.lado1 = lado1;
    }
      int Getlado2()
    {
        return lado2;
    }
    void setlado2(int lado1)
    {
        this.lado2 = lado2;
    }
      int Getlado3()
    {
        return lado3;
    }
    void setlado3(int lado3)
    {
        this.lado3 = lado3;
    }
    double CalcularArea()
    {
        double area=0;
        if (Tipofigura == "Cuadrado")
        {
            area = lado1*lado1;
        }
        else if (Tipofigura == "Triangulo")
        {
            area = (lado2+lado1)/2;
        }
        else if (Tipofigura == "Rectangulo")
        {
            area=lado1*lado2;
        }
        return area;
    }
}
