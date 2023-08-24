/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooencasa2;

/**
 *
 * @author SUPERUSER
 */
public class Operaciones {
//Atributos
    private String Tipodeoperacion;
    private int numero1;
    private int numero2;
   // private int suma;
   // private int resta;
   // private int multiplicacion;
   // private int division;
    private int Operacion;
    
    //Al usuario le pedimos dos numeros
    String GetTipodeoperacion()
    {
        return Tipodeoperacion;
    }
    void setTipodeoperacion(String Tipodeoperacion)
    {
        this.Tipodeoperacion = Tipodeoperacion;
    }     
    int Getnumero1()
    {
        return numero1;
    }
    void setnumero1(int numero1)
    {
        this.numero1 = numero1;
    }
      int Getnumero2()
    {
        return numero2;
    }
    void setnumero2(int numero2)
    {
        this.numero2 = numero2;
    }
    double Calcular()
    {
        
        if (Tipodeoperacion == "suma")
        {
            Operacion= numero1+numero2;
        }
        
        else if (Tipodeoperacion== "resta")
        {
            Operacion = numero1-numero2;
        }
        else if (Tipodeoperacion == "multiplicacion")
        {
            Operacion = numero1*numero2;
        }
        else if (Tipodeoperacion == "division")
        {
            Operacion= numero1/numero2;
        }
        return Operacion;
        
    }
    
}
