package unidad05.ud05hoja07ej01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja07Ej01 {

    public static void main(String[] args) {
        int n;
        Scanner teclado;
        boolean repetir;
        double m;
        do {
            repetir = false;
            try {
                System.out.print("Introduce un numero entero: ");
                n = new Scanner(System.in).nextInt();
            } catch (InputMismatchException excepcion) {
                System.out.println("Valor no válido, " + excepcion.toString());
                repetir = true ;
            }             
        } while (repetir);
        do {
            repetir = false;
            try {
                System.out.print("Introduce un numero decimal: ");
                teclado = new Scanner(System.in);
                m = teclado.nextDouble();   
            } catch (InputMismatchException excepcion) {
                System.out.println("Valor no válido, " + excepcion.getMessage());
                repetir = true;
            }
        } while (repetir);    
    }
}