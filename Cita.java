/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.time.*;

/**
 *
 * @author mateo
 */
public class Cita {
    protected Paciente paciente;
    protected Medico medico;
    protected LocalDate fechaCita;
    protected LocalTime horaCita;
    protected String comentario;
    
    public Cita (Paciente paciente,Medico medico,LocalDate fechaCita, LocalTime horaCita,String comentario )
    {
        this.paciente = paciente;
        this.medico = medico;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.comentario = comentario;
    }
    
    public Paciente getPaciente ()
    {
        return paciente;
    }        
    
    public Medico getMedico ()
    {
        return medico;
    }   
    
    public LocalDate getFechaCita ()
    {
        return fechaCita;
    }   
    
    public LocalTime getHoraCita ()
    {
        return horaCita;
    }      
    
    public String getComentario ()
    {
        return comentario;
    }      
}
