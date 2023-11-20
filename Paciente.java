/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mateo
 */
public class Paciente {
    private String nombre;
    private int edad;
    private String genero;
    protected HistorialMedico historialMedico;
    private int id;
    
    public Paciente (String nombre,int edad, String genero,HistorialMedico historialMedico, int id)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.historialMedico = historialMedico;
        this.id = id;
    }
    
    public String getNombre ()
    {
        return nombre;
    } 
    
    public int getEdad ()
    {
        return edad;
    } 
    
    public String getGenero ()
    {
        return genero;
    } 
    
    public HistorialMedico getHistorialMedico ()
    {
        return historialMedico;
    } 
    
    public int getId ()
    {
        return id;
    } 
}
