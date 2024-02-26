package unidad05.ud05hoja07ej02;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author DAM104
 */
public class Ud05Hoja07Ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Por favor, introduzca el primer número entero:");
                num1 = teclado.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero válido. Inténtalo de nuevo.");
                teclado.next();
            }
        }

        valido = false;

        while (!valido) {
            try {
                System.out.print("Por favor, introduzca el segundo número entero:");
                num2 = teclado.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero válido. Inténtalo de nuevo.");
                teclado.next();
            }
        }

        try {
            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
