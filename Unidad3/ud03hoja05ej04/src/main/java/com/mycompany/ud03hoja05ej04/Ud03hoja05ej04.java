package com.mycompany.ud03hoja05ej04;

/**
 *
 * @author Santiago Tamayo
 */
public class Ud03hoja05ej04 {

    public static void main(String[] args) {
        for (int j=1; j<=10; j++) {
            System.out.println("Ciclo Nº " + (((j-1)*10)+1) );
            for (int i=1; i<=10; i++) {
                int numero = (j-1)*10 + i; 
                System.out.println(numero);
            }
        }
    }
}
