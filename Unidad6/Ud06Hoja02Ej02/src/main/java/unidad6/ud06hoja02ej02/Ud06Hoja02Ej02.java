package unidad6.ud06hoja02ej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud06Hoja02Ej02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de personas: ");
        int numPersonas = scanner.nextInt();
        scanner.nextLine();

        Asociacion asociacion = new Asociacion();

        for (int i = 0; i < numPersonas; i++) {
            Persona persona = new Persona();
            asociacion.insertar(persona);
        }

        System.out.print("Ingrese el DNI de la persona a buscar: ");
        String dniBuscar = scanner.nextLine();
        String datosPersona = asociacion.buscar(dniBuscar);
        System.out.println(datosPersona);

        double recaudacionTotal = asociacion.calcularRecaudacionTotal();
        System.out.println("Recaudación total de la asociación: " + recaudacionTotal + "€");

        System.out.println("Datos de la asociación ordenados por DNI:");
        asociacion.mostrarDatosPorDni();

        System.out.println("Datos de la asociación ordenados por nombre:");
        asociacion.mostrarDatosPorNombre();
    }
}
