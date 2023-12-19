/* Desarrolla un programa en Java que simule el juego de la ruleta en un casino. En este juego, cada vez que un jugador apuesta en un numero, se lanza una bola virtual 
y dependiendo del resultado, se determina si el jugador gana o pierde. */

package examen03.examen03ej02;

import java.util.Scanner;

/**
 *
 * Santiago Manuel Tamayo Arozamena
 */

public class Examen03Ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String s = "";
        float saldo = 100;
        do {
            System.out.println("Bienvenido al Juego de la Ruleta. Tu saldo es de " + saldo + "€");
            System.out.print("¿Cuanto quieres apostar en esta ronda? ");
            float n = teclado.nextFloat();
            System.out.print("Ingrese el numero en el que desea apostar (0-36): ");
            int m = teclado.nextInt();
            if (n<=saldo && m>=0 && m<=36) {
                int premio = (int) Math.floor(Math.random()*37);
                if (m==premio) {
                    System.out.println("Felicidades has ganado! Toma tus " + n*35 + " fichas.");
                    saldo += m*35;
                    System.out.println("Resultado de la ruleta: " + premio);
                    System.out.printf("Saldo actual: %,.2f\n", saldo);
                } else {
                    System.out.println("Lo siento, no has acertado. Perdiste " + n);
                    saldo -= n;
                    System.out.println("Resultado de la ruleta: " + premio);
                    System.out.printf("Saldo actual: %,.2f\n", saldo);
                }
            } else {
                if (n>saldo) {
                    System.out.println("Cantidad no valida. Intentalo de nuevo.");
                } 
                if (m<0 || m>36) {
                    System.out.println("El numero introducido no esta entre los valores admitidos.");
                }                
            }
            System.out.print("¿Quieres continuar? (S/N): ");
            s = teclado.next().toUpperCase();
        } while (!s.equals("N"));
    }
}
