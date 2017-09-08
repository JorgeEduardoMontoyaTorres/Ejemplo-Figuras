/**
 * Subclase de la clase Figura, Esta clase representa un circulo con un radio.
 * 
 * @author Jorge Eduardo Montoya Torres
 * @version 08 septiembre 2017
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
    {
        radio = unRadio;
    }
    
    @Override //Me dice si hay una sobreescritura mal.
    public void calcularArea()
    {
        area = 3.14f * radio * radio;
    }
}