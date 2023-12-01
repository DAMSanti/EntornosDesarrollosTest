package com.mycompany.ud03hoja05ej02;

import java.util.Scanner;

/**
 *
 * @author Santiago Tamayo
 */
public class Ud03hoja05ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantas lineas quieres rellenar con numeros?");
        int n = teclado.nextInt(), cont = 0;
        while (cont<=n) {
            if (cont%2==0) {
                for (int i=9; i>=1; i--) {
                    System.out.print(i);
                }
                System.out.println("");
            }
            else {
                for (int i=1; i<=9; i++) {
                    System.out.print(i);
                }
                System.out.println("");
            }
            cont++;
        }
    }
}
