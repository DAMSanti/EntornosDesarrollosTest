package unidad05.ud05hoja07ej03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Teclado {

    public static int introduceEntero(String mensaje, int min, int max) {
        boolean valido = false;
        int num = 0;
        
        while (!valido) {
            try {
                System.out.print(mensaje + ": ");
                num = new Scanner(System.in).nextInt();
                if (num < min || num > max) {
                    throw new ExcepcionLimite();
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero válido. Inténtalo de nuevo.");
            } catch (ExcepcionLimite e) {
                System.out.println("El valor no esta entre los limites requeridos.");
            }
        }
        return num;
    }
}
