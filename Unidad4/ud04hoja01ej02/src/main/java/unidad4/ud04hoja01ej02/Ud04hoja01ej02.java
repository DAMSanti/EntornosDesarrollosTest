package unidad4.ud04hoja01ej02;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud04hoja01ej02 {

    public static void main(String[] args) {
        float[] temperaturas = new float[10];
        float media = 0 ;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i<temperaturas.length; i++) {
            System.out.print("[" + (i+1) + "]Introduce la temperatura de la ciudad: ");
            temperaturas[i] = teclado.nextFloat();
            media += temperaturas[i];
        }
        System.out.println("La temperatura media es de " + media/temperaturas.length + "ºC");
    }
}
