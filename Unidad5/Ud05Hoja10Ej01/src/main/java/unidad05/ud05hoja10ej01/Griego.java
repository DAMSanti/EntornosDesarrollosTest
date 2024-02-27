package unidad05.ud05hoja10ej01;

/**
 *
 * @author DAM104
 */
public class Griego extends Guerrero {
    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }
    
    @Override
    public boolean retirarse() {
        boolean retirar = false;
        if (super.getMuerto() == false && super.getHerido() == true ) {
            retirar = true;
        }
        return retirar;
    }
    
}