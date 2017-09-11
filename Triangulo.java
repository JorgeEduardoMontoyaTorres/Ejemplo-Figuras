/**
 * Subclase de la clase Figura, Esta clase representa un circulo con un radio.
 * 
 * @author Jorge Eduardo Montoya Torres
 * @version 2.0 (10 septiembre 2017)
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    /**
     * Constructor de la clase Triangulo.
     */
    public Triangulo(float unaBase, float unaAltura)
    {
        base = unaBase;
        altura = unaAltura;
    }
    
    /**
     * Calcula el area del Triangulo.
     */
    @Override //Me dice si hay una sobreescritura mal.
    public void calcularArea()
    {
       area = (base * altura) / 2;
    }
    
    /**
     * Calcula el perimetro del Triangulo.
     */
    @Override //Me dice si hay una sobreescritura mal.
    public void calcularPerimetro()
    {
       perimetro = base * 3;
    }
}