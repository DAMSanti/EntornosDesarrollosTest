package unidad6.ud06hoja05ej02;

import java.util.TreeMap;
import java.util.Map;

/**
 *
 * @author rathm
 */
public class Agenda {
    private static Agenda agenda;
    private Map<String, Persona> datos;

    private Agenda() {
        datos = new TreeMap();
    }

    public static Agenda creaAgenda() {
        if (agenda == null) {
            agenda = new Agenda();
        }
        return agenda;
    }

    public boolean añadirPersona(String dni, String nombre, String apellidos) {
        if (datos.containsKey(dni)) {
            return false;
        }
        datos.put(dni, new Persona(nombre, apellidos, dni));
        return true;
    }

    public boolean borrarPersona(String dni) {
        if (datos.containsKey(dni)) {
            datos.remove(dni);
            return true;
        }
        return false;
    }

    public Persona buscarPersona(String dni) {
        return datos.get(dni);
    }

    public boolean modificardni(String dni, String nuevoDni) {
        if (datos.containsKey(dni)) {
            Persona p = datos.get(dni);
            datos.remove(dni);
            datos.put(nuevoDni, p);
            return true;
        }
        return false;
    }

    public void listarPersonas() {
        for (Map.Entry<String, Persona> entry : datos.entrySet()) {
            String key = entry.getKey();
            Persona value = entry.getValue();
            System.out.println(key + " -> " + value.toString());
        }
    }
}
