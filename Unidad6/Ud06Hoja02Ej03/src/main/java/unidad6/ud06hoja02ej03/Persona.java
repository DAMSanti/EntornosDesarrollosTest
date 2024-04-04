package unidad6.ud06hoja02ej03;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Persona {
    private String nombre;
    private String dni;

    public Persona() {
        Scanner teclado = new Scanner(System.in);
        boolean formatoNombreCorrecto = false;
        do {
            System.out.print("Ingrese el nombre: ");
            String nombreInput = teclado.nextLine();
            if (validarNombre(nombreInput)) {
                this.nombre = nombreInput;
                formatoNombreCorrecto = true;
            } else {
                System.out.println("Nombre introducido no válido, tiene que tener al menos 3 caracteres");
            }            
        } while (!formatoNombreCorrecto);
        boolean formatoDniCorrecto = false;
        do {
            System.out.print("Ingrese el DNI: ");
            String dniInput = teclado.nextLine();
            if (validarDNI(dniInput)) {
                this.dni = dniInput;
                formatoDniCorrecto = true;
            } else {
                System.out.println("El DNI introducido no es valido, compruebelo.");
            }
        } while (!formatoDniCorrecto);
    }

    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-ZÁ-ÿ]{3,}");
    }

    public static boolean validarDNI(String dni) {
        if (dni.length() != 9) {
            return false;
        }

        String numeros = dni.substring(0, 8);
        String letra = dni.substring(8);

        if (!numeros.matches("[0-9]{8}")) {
            return false;
        }

        int numeroDNI = Integer.parseInt(numeros);
        int resto = numeroDNI % 23;
        char letraCalculada = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(resto);

        return letra.equalsIgnoreCase(String.valueOf(letraCalculada));
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return String.format("Persona{ nombre='%s', dni='%s'}", nombre, dni);
    }
}