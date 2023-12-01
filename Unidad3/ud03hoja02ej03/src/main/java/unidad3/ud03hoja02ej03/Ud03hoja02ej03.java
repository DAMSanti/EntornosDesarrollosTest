package unidad3.ud03hoja02ej03;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ud03hoja02ej03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();
        System.out.printf("\n¿QUE QUIERES HACER CON ESTE NUMERO?\n\t1.- Cuadrado\n\t2.- Doble\n\t3.- Raiz cuadrada\n");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1 -> System.out.println(numero + " al cuadrado es " + numero*numero);
            case 2 -> System.out.println(numero + " por 2 es " + numero*2);
            case 3 -> System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
        }
    }
}
