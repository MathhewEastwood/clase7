/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase9;
import java.time.*;

/**
 *
 * @author SALA
 */
public class Clase9 {
    //variables con fechas

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2003,Month.AUGUST,20);
        System.out.println("la fecha es: " + fecha);
        System.out.println(fecha.getDayOfWeek());
    }
}
