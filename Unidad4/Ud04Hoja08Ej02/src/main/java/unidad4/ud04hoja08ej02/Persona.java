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
        if (args.length==2) {
            int edad = parseInt(args[1], 10);
            Persona p1 = new Persona(args[0], edad);
            imprimir(p1);
            if (esMayorEdad(p1)) {
                System.out.println("Es mayor de edad.");
            }
        } else {
            System.out.println("No se han introducido los datos correctos.");
        }
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public static void imprimir(Persona p1) {
        System.out.printf("NOMBRE: %s\nEDAD: %d\n", p1.nombre, p1.edad);
    }
    
    public static boolean esMayorEdad(Persona p1) {
        boolean mayor = false ;
        if (p1.edad>=18) {
            mayor = true ;
        }
        return mayor;
    }
    
}
