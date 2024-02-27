package unidad05.ud05hoja08ej01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Utils {
    public static int introduceNota(int min, int max) {
        boolean valido = false;
        int num = -1;
        
        while (!valido) {
            try {
                System.out.print("Introduce una nota del 0 al 10: ");
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
    
    public static void buscaLista(int pos, Alumno[] lista) throws ArrayIndexOutOfBoundsException {
        lista[pos].mostrar();
    }   
}
