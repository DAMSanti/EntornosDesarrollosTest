package unidad05.ud05hoja10ej01;

/**
 *
 * @author DAM104
 */
public class Troyano extends Guerrero {
    public Troyano(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }

    @Override
    public boolean retirarse() {
        return false;
    }
}