/**
 * Subclase de la clase Figura, Esta clase representa un circulo con un radio.
 * 
 * @author Jorge Eduardo Montoya Torres
 * @version 2.0 (10 septiembre 2017)
 */
public class Cuadrado extends Figura
{
    private float lado;
    
    /**
     * Constructor de la clase Cuadrado.
     */
    public Cuadrado(float unLado)
    {
        lado = unLado;
    }
    
    /**
     * Calcula el area del Cuadrado.
     */
    @Override //Me dice si hay una sobreescritura mal.
    public void calcularArea()
    {
        area = lado * lado;
    }
    
    /**
     * Calcula el perimetro del cuadrado.
     */
    @Override //Me dice si hay una sobreescritura mal.
    public void calcularPerimetro()
    {
        perimetro = lado * 4;
    }
}