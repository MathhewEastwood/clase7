/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author mateo
 */
import java.util.Scanner;
import Modelo.Medico;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class MenuMedico1 {
    public Medico displayMenu()
    {
        Scanner entrada = new Scanner (System.in);
        System.out.println("MEDICO");
        System.out.println(" Digite el nombre: ");
        System.out.println("  >> ");
        String nombre = entrada.next();
        
        System.out.println(" Digite la especialidad: ");
        String especialidad = entrada.next();
        System.out.println("  >> ");
        
        System.out.println(" Digite el id: ");
        int numeroid = entrada.nextInt();
        System.out.println("  >> ");
        
        System.out.println("Ingrese la hora de inicio (hh:mm:ss):");
        String horaInput = entrada.nextLine();
        LocalTime inicio = LocalTime.parse(horaInput, DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println("Ingrese la hora de finalización (hh:mm:ss):");
        String horaInput1 = entrada.nextLine();
        LocalTime finalizacion = LocalTime.parse(horaInput1, DateTimeFormatter.ofPattern("HH:mm:ss"));
    
        
        Medico medico = new Medico(nombre, especialidad,numeroid,inicio,finalizacion);
        return medico;
    }
}
