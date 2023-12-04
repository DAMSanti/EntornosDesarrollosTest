package com.mycompany.ud03hoja07ej01;

/**
 *
 * @author DAM104
 */
public class Factorial {
    
    public static long calculaFactorial(int n) {
        return n>1 ? n * calculaFactorial(n-1) : 1;
    }
    
    public static int sumatorio(int n) {
        if (n>0) {
            return n>1 ? n + sumatorio(n-1) : 1 ;
        }
        else {
            return -1;
        }
    }
    
    public static void imprimeNumeros(int n) {
        //for (int i = 1; i<=n ; i++) {
         //   System.out.print(i);
        //}
        if (n>0) {
            imprimeNumeros(n-1);
            System.out.print(n); // atencion a esto
        }
    }
    
    public static int numeroDigitos(int n) {
        return (int)(Math. log10(n)+1);
    }
    
    public static int potencia(int b, int e) {
        return e>=1 ? b * (potencia(b, e-1)) : 1;
    }    
    
}
