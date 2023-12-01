package unidad3.ud03hoja04ej06;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud03hoja04ej06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean quit = false;
        int chance;
        while (!quit) {
            System.out.println("\n\t\tDOBLE O NADA");
            System.out.println("Cuanto dinero quieres apostar?");
            int n = teclado.nextInt();
            boolean repite = true;
            chance = (int) Math.floor((Math.random()*2)+1);
            System.out.println(chance);
            if (chance == 1) {
                n *=2;
                System.out.println("Has ganado! Aqui están tus " + n + " euros");
            }
            else {
                System.out.println("Has pedido todo tu dinero");
            }
            while (repite) {
                System.out.println("Quieres volver a probar suerte? [1- si, 2- no]");
                n = teclado.nextInt();
                switch(n) {
                    case 2 -> {
                        quit = true ;
                        repite = false ;
                    }
                    default -> { 
                        System.out.println("Opcion no reconocida, inténtalo de nuevo");
                        repite = false ;
                    }
                }
            }
        }
    }
}
