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
    
    public Triangulo(float unaBase, float unaAltura)
    {
        base = unaBase;
        altura = unaAltura;
    }
    
    @Override //Me dice si hay una sobreescritura mal.
    public void calcularArea()
    {
        area = (base * altura) / 2;
    }
}