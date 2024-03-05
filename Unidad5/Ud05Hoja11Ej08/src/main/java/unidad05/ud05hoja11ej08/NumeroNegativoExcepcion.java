package unidad05.ud05hoja11ej08;

/**
 *
 * @author DAM104
 */
public class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion() {  
        super();
    }
    
    public NumeroNegativoExcepcion(String args) {
        super(args);
    }
    
    @Override
    public String toString() {
        return "ERROR: Numero negativo";
    }
}
