package unidad3.ud03hoja04ej01;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud03hoja04ej01 {

    public static void main(String[] args) {
        int n;
        boolean quit = false;
        Scanner teclado = new Scanner(System.in);
        while (!quit) {
            System.out.println("\n\n\t\tFUNCIONES JAVA");
            System.out.println("1.- Calcular divisores\n2.- Contador de numeros impares.\n3.- Calcular tablas de multiplicar\n4.- Calcular division y resto\n5.- Salir\n");
            n = teclado.nextInt();
            switch (n) {
                case 1 -> Utils.divisor();
                case 2 -> Utils.impares();
                case 3 -> Utils.tabla();
                case 4 -> Utils.resta();
                case 5 -> quit = true ;
                default -> System.out.println("Opcion introducida no válida");
            }
        }
    }
}
