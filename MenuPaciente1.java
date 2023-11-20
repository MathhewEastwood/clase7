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
import Modelo.Paciente;
import Modelo.HistorialMedico;
import java.time.*;

public class MenuPaciente1 {
    public Paciente displayMenu()
    {
        Scanner entrada = new Scanner (System.in);
        System.out.println("PACIENTE");
        System.out.println(" Digite el nombre: ");
        System.out.println("  >> ");
        String nombre = entrada.next();
        
        System.out.println(" Digite la edad: ");
        int edad = entrada.nextInt();
        System.out.println("  >> ");
        
        System.out.println(" Digite su genero: ");
        String genero = entrada.next();
        System.out.println("  >> ");
        
        System.out.println(" Digite su historial medico: ");
        
        System.out.println("Ingrese el diagnóstico:");
        String diagnostico = entrada.nextLine();

        System.out.println("Ingrese los tratamientos:");
        String tratamientos = entrada.nextLine();

        System.out.println("Ingrese las alergias:");
        String alergias = entrada.nextLine();
        
        HistorialMedico historialMedico = new HistorialMedico(diagnostico, tratamientos, alergias);
        
        System.out.println(" Digite el id: ");
        int id = entrada.nextInt();
        System.out.println("  >> ");
        
        Paciente paciente = new Paciente(nombre,edad, genero,historialMedico, id);
        return paciente;
    }
}
