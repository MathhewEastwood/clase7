/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodiagrama;

/**
 *
 * @author SALA
 */
public class Circulo {
    
    private int radio;
    private Punto punto;
    
public Circulo(int x,int y,int radio)
{
    punto = new Punto(x,y);
    this.radio=radio;
}
public int getradio()
{
    return radio;
}
private void Setradio(int radio)
{
    this.radio=radio;
}
public void  Imprimir()
{
    System.out.println("La informacion del circulo es: ");
    System.out.println("Coordenadas del centro: ");
    System.out.println("(X,Y)= " + punto.getx() + "," + punto.gety());
    System.out.println("radio: " + radio);
}
}
