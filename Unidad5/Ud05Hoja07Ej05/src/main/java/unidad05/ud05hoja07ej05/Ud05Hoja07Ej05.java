package unidad05.ud05hoja07ej05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja07Ej05 {

    public static void main(String[] args) {
        int num1 = introduceEntero("Introduce el dividendo");
        int num2 = introduceEntero("Introduce el divisor");
        
        try {
            System.out.printf("El resultado de la división es: %,.2f", divide(num1, num2));
        } catch (ArithmeticException e ) {
            System.out.println("No se puede dividir por 0");
        }
    }

    public static int introduceEntero(String mensaje) {
        boolean valido = false;
        int num = 0;
        
        while (!valido) {
            try {
                System.out.print(mensaje + ": ");
                num = new Scanner(System.in).nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero válido. Inténtalo de nuevo.");
            }
        }
        return num;
    }

    public static double divide(int num1, int num2) throws ArithmeticException {
        return (double) num1 / num2;
    }

}
