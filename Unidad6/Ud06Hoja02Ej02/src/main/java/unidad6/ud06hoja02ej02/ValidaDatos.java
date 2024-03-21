package unidad6.ud06hoja02ej02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author DAM104
 */
public class ValidaDatos {
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-Z]{3,}");
    }

    public static boolean validarFecha(String fecha) {
        boolean valida = false;
        try { 
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(fecha, formatter);
            valida = true;
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha incorrecto. Vuelva a intentarlo.");
        }
        return valida;
    }
    
    public static boolean validarDNI(String dni) {
        String numeros = dni.substring(0, 8);
        String letra = dni.substring(8);

        if (!numeros.matches("[0-9]{8}[a-zA-Z]{1}")) {
            return false;
        }

        int numeroDNI = Integer.parseInt(numeros);
        int resto = numeroDNI % 23;
        char letraCalculada = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(resto);

        return letra.equalsIgnoreCase(String.valueOf(letraCalculada));
    }
    
    /*
    
    public static boolean validarDNI(String dni) {
        return  dni.substring(0, 8).matches("[0-9]{8}[a-zA-Z]{1}") &&
                dni.substring(8).equalsIgnoreCase(String.valueOf("TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.parseInt(dni.substring(0, 8)) % 23)));
    }
    
    */
}
