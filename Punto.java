/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodiagrama;

/**
 *
 * @author SALA
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y)
    {
        this.x=x;
        this.y=y;
                
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    private void Setx(int x)
    {
        this.x=x;
    }
    private void Sety(int y)
    {
        this.y=y;
    }
}
