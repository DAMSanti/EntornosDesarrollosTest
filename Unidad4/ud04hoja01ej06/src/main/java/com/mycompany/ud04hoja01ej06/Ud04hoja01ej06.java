package com.mycompany.ud04hoja01ej06;

import java.util.Arrays;

/**
 *
 * @author DAM104
 */
public class Ud04hoja01ej06 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i=0; i<=numeros.length-1; i++) {
            numeros[i] = (int) Math.floor(Math.random()*10);
        }
        Arrays.sort(numeros);
        System.out.println("El mayor numero en el array es: " + numeros[numeros.length-1]);
    }
}
