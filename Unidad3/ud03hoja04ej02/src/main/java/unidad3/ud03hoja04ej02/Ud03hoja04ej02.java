package unidad3.ud03hoja04ej02;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud03hoja04ej02 {

    public static void main(String[] args) {
        float donaciones = 0;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        while (donaciones<=600) {
            System.out.print("\nIntroduce la cantidad que quieres donar: ");
            int n = teclado.nextInt();
            if (n>0) {
                donaciones += n ;
                cont++;
            } else {
                System.out.println("Introduce una donación valida.");
            }
        }
        System.out.println("Han sido necesarias " + cont + " donaciones para alcanzar los " + donaciones + "€");
    }
}
