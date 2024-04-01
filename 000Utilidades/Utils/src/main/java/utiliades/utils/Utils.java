package utiliades.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rathm
 */
public class Utils {

    public static void main(String[] args) {
        String frase;
        frase = Utilidades.leerString("Introduce un texto(sin restriccion): ");
        System.out.println(frase);
        frase = Utilidades.leerString("Introduce un texto(entre 5 y 15 caracteres): ", 5, 15);
        System.out.println(frase);
        frase = Utilidades.leerString("Introduce un texto(solo letras de 3 a 6 caracteres): ", "[a-zA-Z]{3,6}");
        System.out.println(frase);
        int numerin;
        numerin = Utilidades.leerInt("Introduce un número(sin restriccion): ");
        System.out.println(numerin);
        numerin = Utilidades.leerInt("Introduce un número(entre 5 y 15): ", 5, 15);
        System.out.println(numerin);
        numerin = Utilidades.leerInt("Introduce un número(Solo numeros positivos): ", true);
        double decimal;
        decimal = Utilidades.leerDouble("Introduce un número decimal(Sin restricciones): ");
        System.out.println(decimal);
        decimal = Utilidades.leerDouble("Introduce un número decimal(entre 5 y 15): ", 5.0, 15.0);
        System.out.println(decimal);
        decimal = Utilidades.leerDouble("Introduce un número decimal(solo positivos): ", true);
        System.out.println(decimal);
        LocalDate fecha;
        fecha = Utilidades.leerFecha("Introduce una fecha(Formato yyyy-MM-dd): ");
        System.out.println(fecha);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fecha = Utilidades.leerFecha("Introduce una fecha(Formato elegido, dd-MM-yyyy en este caso): ", formatter);
        System.out.println(fecha);
    }
}
