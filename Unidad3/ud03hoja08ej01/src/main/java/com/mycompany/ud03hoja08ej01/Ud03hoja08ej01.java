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
        while(!salir) {
            System.out.println("Seleccion de calcetines del Dr Black&White");
            System.out.println("Introduce color calcetin, . para salir");
            String c = teclado.nextLine();
            switch (c) {
                case "B" -> negro += 1;
                case "W" -> blanco += 1;
                case "." -> {
                    if ((negro-blanco==0) && (negro%2==0) && (blanco%2==0) && (negro>0)) {
                        System.out.println("EMPAREJADOS");
                    } else if (negro>blanco) {
                        System.out.println("BLANCO SOLITARIO");
                    } else if (negro<blanco) {
                        System.out.println("NEGRO SOLITARIO");
                    } else {
                        System.out.println("PAREJA MIXTA");
                    } 
                    salir = true ;
                }
            }
        }
    }
}