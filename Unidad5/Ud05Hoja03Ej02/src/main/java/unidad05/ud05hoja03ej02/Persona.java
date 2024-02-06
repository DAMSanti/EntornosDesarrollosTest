package unidad05.ud05hoja03ej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public abstract class Persona {
    private String dni, nombre, direccion;
    
    public Persona() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre de la persona a ingresar: ");
        this.nombre = teclado.nextLine();
        System.out.print("Introduce el DNI: ");
        teclado = new Scanner(System.in);
        this.dni = teclado.nextLine();
        System.out.print("Introduce la direccion: ");
        teclado = new Scanner(System.in);
        this.direccion = teclado.nextLine();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public String mostrar() {
        return String.format("La persona con nombre %s vive en %s", nombre, direccion);
    }
}
