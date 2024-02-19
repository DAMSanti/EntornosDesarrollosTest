
package unidad05.ud05hoja02ej03;

/**
 *
 * @author DAM104
 */
public class Triangulo extends Forma{
    int lados;  
    
    public Triangulo() {
        lados = 3;
        id = "Triangulo";
    }
    
    @Override
    public String toString() {
        return String.format("Este objeto es un %s y tiene %d lados", this.identidad(), lados);
    }
    
    @Override
    public String identidad() {
        return id;
    }
}