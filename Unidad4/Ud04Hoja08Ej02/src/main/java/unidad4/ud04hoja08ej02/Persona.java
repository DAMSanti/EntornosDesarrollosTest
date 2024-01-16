package unidad4.ud04hoja08ej02;

import static java.lang.Integer.parseInt;

/**
 *
 * @author DAM104
 */

public class Persona {
    private String nombre;
    private int edad;
    
    public static void main(String[] args) {
        if (args.length>1) {
            int edad = parseInt(args[1], 10);
            imprimir(args[0], edad);
            if (esMayorEdad(edad)) {
                System.out.println("Es mayor de edad.");
            }
        } else {
            System.out.println("No se han introducido los datos correctos.");
        }
    }
    
    public static void imprimir(String nombre, int edad) {
        System.out.printf("NOMBRE: %s\nEDAD: %d\n", nombre, edad);
    }
    
    public static boolean esMayorEdad(int edad) {
        boolean mayor = false ;
        if (edad>=18) {
            mayor = true ;
        }
        return mayor;
    }
    
}
