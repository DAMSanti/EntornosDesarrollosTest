package unidad05.ud05hoja07ej05;

/**
 *
 * @author DAM104
 */
public class ExcepcionLimite extends Exception {

    @Override
    public String toString() {
    return "Fuera de los limites "+super.toString();
    }
    
    @Override
    public String getMessage() {
    return "Fuera de los limites "+super.getMessage();
    }
}
