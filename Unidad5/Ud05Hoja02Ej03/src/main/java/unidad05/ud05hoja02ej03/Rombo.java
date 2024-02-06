package unidad05.ud05hoja02ej03;

/**
 *
 * @author DAM104
 */
public class Rombo extends Forma {
    int lados;  
    String id = "Rombo";
    
    public Rombo() {
        lados = 4;
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