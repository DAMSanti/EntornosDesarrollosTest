package com.mycompany.uf03hoja08ej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Uf03hoja08ej02 {

    public static void main(String[] args) {
        boolean salir = false;
        String colorbola = "";
        float descuento = 0;
        int n = 0;
        Scanner teclado = new Scanner(System.in);
        while (n != -1) {
            System.out.println("Introduce total a pagar, -1 para salir:");
            n = teclado.nextInt();
            int bola = (int) Math.floor(Math.random() * 4);
            switch (bola) {
                case 0 -> {
                    colorbola = "blanca";
                    descuento = 0;
                }
                case 1 -> {
                    colorbola = "amarilla";
                    descuento = 0.05f;
                }
                case 2 -> {
                    colorbola = "azul";
                    descuento = 0.07f;
                }
                case 3 -> {
                    colorbola = "roja";
                    descuento = 0.1f;
                }
            }
            System.out.printf("Ha salido la bola %s, %d%% de descuento: %,.2f\nImporte con el descuento: %,.2f\n", colorbola, (int) (descuento * 100), (n * descuento), (n - n * descuento));
        }
    }
}
