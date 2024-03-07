package unidad05.examen05;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Santiago M Tamayo Arozamena
 * @DAM1
 */

public class Teclado {
    public static String introduceTexto(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = teclado.nextLine();
        return texto;
    }
    
    public static int introduceEntero(String mensaje) {
        Scanner teclado;
        boolean test = true;
        int numero = 0;
        while (test){
            try {
                teclado = new Scanner(System.in);
                System.out.print(mensaje);
                numero = teclado.nextInt();
                if (numero < 0) {
                    System.out.println("El libro no puede tener un numero de paginas negativo.");
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

    public static int introduceEntero(String mensaje, int min, int max) {
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
    
    public static float introduceFloat(String mensaje) {
        Scanner teclado;
        boolean test = true;
        float numero = 0;
        while (test){
            try {
                teclado = new Scanner(System.in);
                System.out.print(mensaje);
                numero = teclado.nextFloat();
                if (numero < 0) {
                    System.out.println("El libro no puede tener un tamaño negativo.");
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
    
    public static LocalDate introduceFecha(LocalDate fechaPrestamo) {
        Scanner teclado;
        boolean test = false ;
        int ano, mes, dia;
        LocalDate fecha = null;
        while (!test) {
            ano = introduceEntero("Dame el año de devolucion: ", 1900, 2024);
            mes = introduceEntero("Dame el mes de devolucion: ", 1, 12);
            dia = introduceEntero("Dame el dia de devolucion: ", 1, 31);    
            if (LocalDate.of(ano, mes, dia).isBefore(fechaPrestamo)) {
                
                test = true ;
                fecha = LocalDate.of(ano, mes, dia);
            } else {
                System.out.println("La fecha tiene que ser anterior al dia de hoy.");
            }
        }

        return fecha;
    }
}
