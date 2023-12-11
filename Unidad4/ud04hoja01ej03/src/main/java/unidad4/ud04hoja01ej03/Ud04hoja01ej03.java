
package unidad4.ud04hoja01ej03;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud04hoja01ej03 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i=0; i<=numeros.length-1; i++) {
            numeros[i] = (int) Math.floor(Math.random()*10);
        }
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero para buscar en el array: ");
        int n = teclado.nextInt();
        for (int i=0; i<=numeros.length-1; i++) {
            if (n==numeros[i]) {
                System.out.println("El numero " + n + " se encuentra en la " + (i+1) + "º posicion" );
            } else {
                System.out.println("Numero no encontrado");
            }
        }
    }
}
