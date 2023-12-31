package com.mycompany.ud03hoja05ej01;

import java.util.Scanner;

/**
 *
 * @author Santiago Tamayo
 */

public class Ud03hoja05ej01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿De que altura quieres que sea el triangulo? ");
        int n = teclado.nextInt();
        for (int i=1; i<=n; i++) {                  // Un for que representa las filas 
            int asteriscos = 1+(i-1)*2;             // Expresión que indica el numero de asteriscos en cada fila
            for (int j=1; j<=n-i; j++) {            // Un for que representa las columnas ocupadas por espacios
                System.out.print(" ");
            }
            for (int j=1; j<=asteriscos; j++) {     // Un for que representa las columnas ocupadas por asteriscos.
                System.out.print("*");
            }
            System.out.println("");               // Un println para saltar de linea.
        }
    }
}