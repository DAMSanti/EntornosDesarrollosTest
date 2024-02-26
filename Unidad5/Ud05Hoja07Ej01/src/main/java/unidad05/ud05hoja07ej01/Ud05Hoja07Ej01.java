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
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true ;
            }             
        } while (repetir);
        do {
            repetir = false;
            try {
                System.out.print("Introduce un numero decimal: ");
                teclado = new Scanner(System.in);
                m = teclado.nextDouble();   
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;
            }
        } while (repetir);    
    }
}


/*

1.- Realiza un programa que controle mediante excepciones la introducción de datos correctos
para una variable de tipo entero y para otra de tipo Double, y que se repita mientras que no se
introduzca un dato correcto.

*/