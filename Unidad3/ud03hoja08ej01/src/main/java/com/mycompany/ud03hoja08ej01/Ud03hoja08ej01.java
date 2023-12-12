package com.mycompany.ud03hoja08ej01;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud03hoja08ej01 {

    public static void main(String[] args) {
        int negro = 0, blanco = 0 ;
        boolean salir = false ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccion de calcetines del Dr Black&White");
        while(!salir) {
            System.out.println("Introduce color calcetin, . para salir");
            String c = teclado.nextLine();
            switch (c) {
                case "B" -> negro++;
                case "W" -> blanco++;
                case "." -> {
                    if ((negro%2==0) && (blanco%2==0) && (negro>0) && (blanco>0)) {
                        System.out.println("EMPAREJADOS");
                    } else if ((negro>blanco) && (negro%2!=0)) {
                        System.out.println("NEGRO SOLITARIO");
                    } else if ((negro<blanco) && (blanco%2!=0)) {
                        System.out.println("BLANCO SOLITARIO");
                    } else if (negro>0 & blanco>0) {
                        System.out.println("PAREJA MIXTA");
                    } else {
                        System.out.println("No has introducido calcetines.");
                    }
                    salir = true ;
                }
            }
        }
    }
}