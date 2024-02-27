package unidad05.ud05hoja09ej05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Utils {
    public static int introduceNumero(int min, int max) {
        boolean valido = false;
        int num = -1;
        
        while (!valido) {
            try {
                System.out.printf("Introduce una nota del %d al %d: ", min, max);
                num = new Scanner(System.in).nextInt();
                if (num < min || num > max) {
                    throw new ExcepcionLimite();
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero válido. Inténtalo de nuevo.");
            } catch (ExcepcionLimite e) {
                System.out.println("El valor no esta entre los valores requeridos.");
            }
        }
        return num;
    }   
}
