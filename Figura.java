/**
 * Esta clase es una superclase para representar las caracteristicas comunes de muchas figuras.
 * 
 * @author Jorge Eduardo Montoya Torres
 * @version 08 septiembre 2017
 */
public class Figura
{
    protected float area; //Area de cada figura.
    protected float perimetro; //Perimetro de cada figura.
    
    /**
     * Constructor de la clase Figura.
     */
    public Figura()
    {
        area = 0;
        perimetro = 0;
    }
    
    /**
     * Calcular el area de las figuras.
     */
    public void calcularArea()
    {
        System.out.println("No sé como calcular el area, porque no se que figura es.");
    }
    
    /**
     * Imprime el perimetro de las figuras.
     */
    public void imprimirArea()
    {
        System.out.println("El área de la figura es " +area);
    }
    
    /**
     * Calcular el area de las figuras.
     */
    public void calcularPerimetro()
    {
        System.out.println("No sé como calcular el perimetro, porque no se que figura es.");
    }
    
    /**
     * Imprime el perimetro de las figuras.
     */
    public void imprimirPerimetro()
    {
        System.out.println("El perimetro de la figura es " +perimetro);
    }
}
