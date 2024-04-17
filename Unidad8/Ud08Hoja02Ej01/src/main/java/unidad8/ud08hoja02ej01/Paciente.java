package unidad8.ud08hoja02ej01;

/**
 *
 * @author rathm
 */
public class Paciente {
    private String dni;
    private String nombre;
    private String telefono;

    public Paciente(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
}
