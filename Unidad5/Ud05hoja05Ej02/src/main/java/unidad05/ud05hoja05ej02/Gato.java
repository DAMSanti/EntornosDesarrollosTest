package unidad05.ud05hoja05ej02;

/**
 *
 * @author DAM104
 */
public class Gato extends Mamifero implements Felino, Domestico {
    String nombre;
    
    public Gato(String raza, int npatas, String alimento, String nombre) {
        super(raza, npatas, alimento);
        this.nombre = nombre;
    }
    
    @Override
    public String arañar() {
        return "Te araña";
    }

    @Override
    public String obedecer() {
        return "Te obedece";
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + '}' + super.toString();
    }
    
}
