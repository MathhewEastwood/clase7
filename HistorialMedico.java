/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mateo
 */
public class HistorialMedico {
    protected Paciente paciente;
    protected String diagnostico;
    protected String tratamientos;
    protected String alergias;
    
    public HistorialMedico(Paciente paciente, String diagnostico, String tratamientos, String alergias)
    {
        this.paciente = paciente;
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.alergias = alergias;
    }
    public HistorialMedico(String diagnostico, String tratamientos, String alergias)
    {
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.alergias = alergias;
    }            

    
    
    
}
