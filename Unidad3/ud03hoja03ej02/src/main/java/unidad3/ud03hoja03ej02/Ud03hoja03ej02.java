package unidad3.ud03hoja03ej02;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud03hoja03ej02 {

    public static void main(String[] args) {
        int n;
        boolean quit = false;
        Scanner teclado = new Scanner(System.in);
        while (!quit) {
            System.out.println("\n\n\t\tFUNCIONES JAVA");
            System.out.println("1.- Cuenta atrás de 10 a 0\n2.- Contador de numeros positivos, negativos, nulos.\n3.- Calculadora de factorial\n4.- Extractor de primera frase\n5.- Calculadora de medias\n6.- Salir\n");
            n = teclado.nextInt();
            switch (n) {
                case 1 -> Calculo.countDown();
                case 2 -> Calculo.signo();
                case 3 -> Calculo.factorial();
                case 4 -> Calculo.hastaPunto();
                case 5 -> Calculo.media();
                case 6 -> quit = true ;
                default -> System.out.println("Opcion introducida no válida");
            }
        }
    }
}
