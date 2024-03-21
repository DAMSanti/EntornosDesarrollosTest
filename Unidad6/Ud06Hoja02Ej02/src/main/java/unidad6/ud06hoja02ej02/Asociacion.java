package unidad6.ud06hoja02ej02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DAM104
 */
public class Asociacion {
    private List<Persona> personas;

    public Asociacion() {
        this.personas = new ArrayList<>();
    }

    public void insertar(Persona persona) {
        personas.add(persona);
        personas.sort(Comparator.comparing(Persona::getDni));
    }
    
    public String buscar(String dni) {
        String salida = "Persona no encontrada";
        for (Persona persona : personas) {
            if (persona.getDni().equals(dni)) {
                salida = String.format("%sm Cuota: %,.2f€", persona.toString(), calcularCuota(persona.getEdad()));
            }
        }
        return salida;
    }

    /*    
    public String buscar(String dni) {
        return personas.stream()
                .filter(persona -> persona.getDni().equals(dni))
                .findFirst()
                .map(persona -> persona.toString() + ", Cuota: " + calcularCuota(persona.getEdad()))
                .orElse("Persona no encontrada");
    }
    */
    
    public double calcularRecaudacionTotal() {
        double recaudacionTotal = 0;
        for (Persona persona : personas) {
            recaudacionTotal += calcularCuota(persona.getEdad());
        }
        return recaudacionTotal;
    }

    /*
    public double calcularRecaudacionTotal() {
        return personas.stream()
                .mapToDouble(persona -> calcularCuota(persona.getEdad()))
                .sum();
    }
    */
    
    private double calcularCuota(int edad) {
        if (edad >= 5 && edad <= 10) {
            return 1;
        } else if (edad >= 11 && edad <= 17) {
            return 2.5;
        } else {
            return 3.5;
        }
    }

    public void mostrarDatosPorDni() {
        for (Persona persona : personas) {
            System.out.println(persona.toString() + ", Cuota: " + calcularCuota(persona.getEdad()) + "€");
        }
    }

    public void mostrarDatosPorNombre() {
        List<Persona> personasOrdenadasPorNombre = new ArrayList<>(personas);
        Collections.sort(personasOrdenadasPorNombre, Comparator.comparing(Persona::getNombre));
        for (Persona persona : personasOrdenadasPorNombre) {
            System.out.println(persona.toString() + ", Cuota: " + calcularCuota(persona.getEdad()) + "€");
        }
    }
}