package repaso.ejercicioclase;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Teclado {
    public static String introduceDatos(String msg) {
        Scanner teclado;
        boolean test = true;
        String cadena = "";
        while (test){
            try {
                teclado = new Scanner(System.in);
                System.out.print(msg);
                cadena = teclado.nextLine();
                if (cadena.length() == 0) {
                    throw new CadenaVacia("No has introducido el dato en formato correcto.");
                } else {
                    test = false;
                }
            } catch (CadenaVacia e) {
                System.out.println("No has introducido el dato en formato correcto.");
                test = true;
            }
        }
        return cadena;
    }

        public static int introduceDatos(String mensaje, int min, int max) {
        Scanner teclado;
        boolean test = true;
        int numero = 0;
        while (test){
            try {
                teclado = new Scanner(System.in);
                System.out.print(mensaje);
                numero = teclado.nextInt();
                if (numero < min) {
                    System.out.println("El numero no puede ser menor que " + min);
                    test = true;
                } else if (numero > max) {
                    System.out.println("El numero no puede ser mayor que " + max);
                    test = true;
                } else {
                    test = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("No has introducido un numero en formato correcto.");
                test = true;
            }
                        
        }
        return numero;
    }
        
    public static float introduceFloat(String msg) {
        Scanner teclado;
        boolean test = true;
        float numero = 0;
        while (test){
            try {
                teclado = new Scanner(System.in);
                System.out.print(msg);
                numero = teclado.nextFloat();
                if (numero < 0) {
                    throw new CadenaVacia("El tamaño no puede ser negativo");
                } else {
                    test = false;
                }
            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("No has introducido un numero en formato correcto.");
                test = true;
            } catch (CadenaVacia e) {
                e.getMessage();
                System.out.println("El tamaño no puede ser negativo");
                test = true;
            }         
        }
        return numero;
    }
    
        public static LocalDate introduceFecha(String msg, LocalDate fechaPrestamo) {
        Scanner teclado;
        System.out.println(msg);
        int ano, mes, dia;
        LocalDate fecha = null;
        try {
            ano = introduceDatos("Dame el año de devolucion: ", 1900, 2024);
            mes = introduceDatos("Dame el mes de devolucion: ", 1, 12);
            dia = introduceDatos("Dame el dia de devolucion: ", 1, 31);    
            if (LocalDate.of(ano, mes, dia).isAfter(fechaPrestamo)) {
                fecha = LocalDate.of(ano, mes, dia);
            } else if (LocalDate.of(ano, mes, dia).isAfter(LocalDate.now())){
                throw new CadenaVacia(String.format("La fecha %s no es anterior el dia actual", LocalDate.of(ano, mes, dia).format(DateTimeFormatter.ofPattern("dd MMM uuuu"))));
            } else {
                throw new CadenaVacia(String.format("La fecha no es posterior a %s", fechaPrestamo.format(DateTimeFormatter.ofPattern("dd MMM uuuu"))));
            }
        } catch (DateTimeException | CadenaVacia e) {
            System.out.println("Error: " + e.getMessage());
            fecha = introduceFecha(msg, fechaPrestamo);
        }    
        return fecha;
    }
}

