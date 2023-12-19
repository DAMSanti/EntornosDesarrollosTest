/* La empresa Dulcemelos ha decidido emprender una estrategia innovadora de proteccion del medio ambiente a la par que alegra a los niños. Para ello, el dia del caramelo
ha decidido regalar caramelos a aquellos niños que lleven envoltorios de caramelos ya consumidos, de esta forma los niños no tiran los envoltorios al suelo. Por cada 5 envoltorios
regalan un caramelo. Eso significa que si un niño compro 10 caramelos, podra disfrutar de 12 caramelos. Para que sea rentable, a la empresa le interesa que a los niños no les queden
envoltorios no canjeables. Es decir el numero de envoltorios que se quedan sin devolver a la empresa sea 0. Para comprobar si esa cifra es rentable se tienen en cuenta tambien los
envoltorios de los caramelos regalados.*/

package examen03.examen03ej04;

import java.util.Scanner;

/**
 *
 * Santiago Manuel Tamayo Arozamena
 */

public class Examen03Ej04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int caramelos = 0, regalados, envoltorios;
        while (!salir) {
            System.out.println("Introduce caramelos vendidos, 0 para acabar: ");
            int n = teclado.nextInt();
            if (n!=0) {
                caramelos += n;
            } else {
                salir = true ;
            }
        }
        System.out.println("Caramelos vendidos: " + caramelos);
        regalados = (int) Math.floor(caramelos / 5) ;
        System.out.println("Caramelos regalados: " + regalados);
        envoltorios = caramelos%5;
        System.out.println("Envoltorios: " + envoltorios);
        if ((regalados+envoltorios)%5==0) {
            System.out.println("Es rentable");
        } else {
            System.out.println("No es rentable");
        }
    }
}
