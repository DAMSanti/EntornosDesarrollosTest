package unidad05.ud05hoja09ej04;

/**
 *
 * @author DAM104
 */
public class MiExcepcion extends Exception {
    
    public MiExcepcion(String args) {
        super(args);
    }
    
    @Override
    public String getMessage() {
        return "ERROR CHULO: " + super.getMessage();
    }
}