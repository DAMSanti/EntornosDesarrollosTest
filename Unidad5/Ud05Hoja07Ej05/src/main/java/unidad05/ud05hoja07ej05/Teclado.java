package unidad05.ud05hoja07ej05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Teclado {
    
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
        double resultado = (double) num1 / num2;
        return resultado;
    }

}
