/* Desarrolla un programa en Java que solicite al usuario ingresar un tamaño y utilice bucles for anidados para dibujar una figura compuesta por asteriscos.
En este enunciado, se plantea dibujar un triangulo rectangulo. El programa debe pedir al usuario ingresar un numero que representará el tamaño del triangulo a dibujar*/

package examen03.examen03ej03;

import java.util.Scanner;

/**
 *
 * Santiago Manuel Tamayo Arozamena
 */

public class Examen03Ej03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Plotter de triangulos rectangulos");
        System.out.print("Ingrese el tamaño del triángulo: ");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-(n-i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
