package unidad6.ud06hoja02ej03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DAM104
 */
public class Agenda {
    private List<Persona> personas;

    public Agenda() {
        this.personas = new ArrayList<>();
    }    
    
    public boolean insertar(Persona persona) {
        try {
            personas.add(persona);
            personas.sort(Comparator.comparing(Persona::getDni));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean borrar(String dni) {
        boolean borrado = false;
        for (Persona persona : personas) {
            if (persona.getDni().equals(dni)) {
                personas.remove(persona);
                borrado = true;
            }
        }
        return borrado;
    }    
    
    public void mostrarDatosPorDni() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }

    public void mostrarDatosPorNombre() {
        List<Persona> personasOrdenadasPorNombre = new ArrayList<>(personas);
        Collections.sort(personasOrdenadasPorNombre, Comparator.comparing(Persona::getNombre));
        for (Persona persona : personasOrdenadasPorNombre) {
            System.out.println(persona.toString());
        }
    }

    public void buscar(String dni) {
        boolean encontrada = false;
        for (Persona persona : personas) {
            if (persona.getDni().equals(dni)) {
                System.out.println(persona.toString());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("Persona no encontrada");
        }
    }
    
    public void modificar(String dni, Persona persona) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                personas.set(i, persona);
            }
        }
    }    
}
