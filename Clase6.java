/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase6;
//para usar con usuarios o strings es necesario Scanner y nextline
/**
 *
 * @author SALA
 */
import java.util.*;
public class Clase6 {

    public static void main(String[] args) {
        //instanciar
        Carro mazda = new Carro();
        Carro chevrolet = new Carro();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Scanner teclado = new Scanner(System.in);
        
        
        
        System.out.println("El color es: " + mazda.GetColor());
        System.out.println("El color es: " + chevrolet.GetColor());
        chevrolet.SetColor("negro");
        System.out.println("El color es: " + chevrolet.GetColor());
        System.out.println("El numero de llantas es: " + mazda.GetNrollantas());
        chevrolet.SetNrollantas(8);
        System.out.println("El numero de llantas: " + chevrolet.GetNrollantas());
        System.out.println("El combustible es: " + chevrolet.Getcombustible());
        chevrolet.Setcombustible("fosil");
        System.out.println("El combustible es: " + chevrolet.Getcombustible());
       
        mazda.Avanzar();
        System.out.println("Por favor dijite su nombre: ");
        String nombre = teclado.nextLine();
        cliente1.setnombre(nombre);
        System.out.println("*************");
        System.out.println("el nombre del cliente es: " + cliente1.Getnombre());
        System.out.println("el nombre del cliente es: " + cliente2.Getnombre());
        
    }
}

