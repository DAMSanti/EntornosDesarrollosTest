package unidad05.ud05hoja09ej04;

/**
 *
 * @author DAM104
 */
public class MiExcepcion extends Exception {
    private String msg;
    
    public MiExcepcion(String args) {
        this.msg = args;
    }
    
    @Override
    public String toString() {
    return msg;
    }
    
    @Override
    public String getMessage() {
    return "Fuera de los limites "+super.getMessage();
    }
}