package unidad6.ud06hoja7ej01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rathm
 */
public class Persona implements Identificable {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    
    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        //this.nombre = Teclado.leerString("Introduce el nombre del cliente: ", 3, 15, "^[A-Z][a-z]+( [A-Z][a-z]+)*$");
        //this.apellidos = Teclado.leerString("Introduce los apellidos del cliente: ", 7, 30, "^[A-Z][a-z]+( [A-Z][a-z]+)*$");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //this.fechaNacimiento = Teclado.leerFechaAnterior("Introduce la fecha de nacimiento del cliente. (dd-mm-yyyy)", formatter);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public Map<String, String> listaObjeto() {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", nombre);
        persona.put("apellidos", apellidos);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        persona.put("Fecha de Nacimiento", formatter.format(fechaNacimiento));
        return persona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
}
