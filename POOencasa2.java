/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooencasa2;

/**
 *
 * @author SUPERUSER
 */
import java.util.*;
public class POOencasa2 {

    public static void main(String[] args) {
        
    // Se piden los dos numeros
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite un numero: ");
        int num1 = input.nextInt();
        
        System.out.println("Digite otro numero: ");
        int num2 = input.nextInt();
        
     // Se agregan las clase 
     
     // Suma
        Operaciones Suma1 = new Operaciones();
        Suma1.setTipodeoperacion("suma");
        Suma1.setnumero1(num1);
        Suma1.setnumero2(num2);
        
        System.out.println("La suma  es: " + Suma1.Calcular());
        
    //  Resta
        Operaciones Resta1 = new Operaciones();
        Resta1.setTipodeoperacion("resta");
        Resta1.setnumero1(num1);
        Resta1.setnumero2(num2);
        
        System.out.println("La resta es: " + Resta1.Calcular());
    
    // Multiplicacion
        Operaciones Multiplicacion1 = new Operaciones();
        Multiplicacion1.setTipodeoperacion("multiplicacion");
        Multiplicacion1.setnumero1(num1);
        Multiplicacion1.setnumero2(num2);
        
        System.out.println("La multiplicacion es: " + Multiplicacion1.Calcular());
    
    // Division
        Operaciones Division1 = new Operaciones();
        Division1.setTipodeoperacion("division");
        Division1.setnumero1(num1);
        Division1.setnumero2(num2);
        
        System.out.println("La division es: " + Division1.Calcular());
    
    
        
    
        
        
        
        
        


    }
}
