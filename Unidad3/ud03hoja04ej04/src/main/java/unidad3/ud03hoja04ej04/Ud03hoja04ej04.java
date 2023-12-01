package unidad3.ud03hoja04ej04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud03hoja04ej04 {

    public static void main(String[] args) {
        int cont = 1;
        //, pw = (int) Math.floor(Math.random()*10000);
        Random pw = new Random();
        int pass = pw.nextInt(10000);
        boolean acierto = false ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\t\tCAJA FUERTE " + pass);
        while ((cont <=4) && (!acierto)){
            System.out.print("Introduzca su codigo de seguridad: ");
            int n = teclado.nextInt();
            if ( n == pass ) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                acierto = true ;
            }
            else {
                System.out.println("Contraseña no valida, le quedan " + (4-cont) + " intentos");
            }
            cont++;
        }
    }
}
