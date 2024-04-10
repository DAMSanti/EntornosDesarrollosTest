package unidad6.ud06hoja05ej02;

/**
 *
 * @author rathm
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}
