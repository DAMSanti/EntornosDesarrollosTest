package unidad05.ud05hoja05ej03;

import java.time.LocalDate;   

/**
 *
 * @author DAM104
 */
public class Contacto implements Comparable<Contacto> {
    private String nombre, apellidos, telefonoMovil, email;
    private LocalDate fechaNac;
    
    public Contacto(String nombre, String apellidos, String telefonoMovil, String email, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefonoMovil = telefonoMovil;
        this.email = email;
        this.fechaNac = fechaNac;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefonoMovil=" + telefonoMovil + ", email=" + email + ", fechaNac=" + fechaNac + "}\n";
    }

    @Override
    public int compareTo(Contacto o) {
        return this.getNombre().compareToIgnoreCase(o.getNombre());
    }
}
