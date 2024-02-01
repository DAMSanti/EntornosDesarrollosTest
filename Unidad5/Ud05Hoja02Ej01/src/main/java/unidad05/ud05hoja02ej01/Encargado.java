package unidad05.ud05hoja02ej01;

/**
 *
 * @author DAM104
 */
public class Encargado extends Empleado{
    public Encargado() {
        super();
    }
    
    @Override
    public double getSalario() {
        return super.getSalario()*1.1;
    }
}
