/**
 * Subclase de la clase Figura, Esta clase representa un circulo con un radio.
 * 
 * @author Jorge Eduardo Montoya Torres
 * @version 08 septiembre 2017
 */

public class Circulo extends Figura
{
    private float radio;
    
    /**
     * Constructor de la clase Cuadrado.
     */
    public Circulo(float unRadio)
    {
        radio = unRadio;
    }
    
    /**
     * Calcula el area del Circulo.
     */
    @Override //Me dice si hay una sobreescritura mal.
    public void calcularArea()
    {
        area = 3.14f * radio * radio;
    }
    
    /**
     * Calcula el perimetro del Circulo.
     */
    @Override //Me dice si hay una sobreescritura mal.
    public void calcularPerimetro()
    {
        perimetro = (2 * 3.14f) * radio;
    }
}