package unidad04.ud04hoja04ej01;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja04Ej01 {

    public static void main(String[] args) {
        int matriz1[][]={{101,102,103,104,105},{201,202,203,204,205},{301,302,303,304,305},{401,402,403,404,405},{501,502,503,504,505}};
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Selecciona una fila: ");
        int n = teclado.nextInt()-1;
        if (n<matriz1.length) {
            System.out.print("[ ");
            for (int i = 0; i < matriz1.length; i++) {
                System.out.print(matriz1[n][i] + " ");
            }           
            System.out.println("]");
        } else {
            System.out.println("El numero introducido supera el limite del array.");
        }

        
        System.out.print("Selecciona una columna: ");
        n = teclado.nextInt()-1;
        if (n<matriz1.length) {
            System.out.print("[ ");
            for (int i = 0; i < matriz1.length; i++) {
                System.out.print(matriz1[i][n] + " ");
            }
            System.out.println("]");
        } else {
            System.out.println("El numero introducido supera el limite del array.");
        }
        
        
        System.out.print("[ ");
        for (int i = 0; i < matriz1.length; i++) {
            System.out.print(matriz1[i][i] + " ");
        }
        System.out.println("]");
        
        
        System.out.print("[ ");
        for (int i = matriz1.length-1; i >= 0; i--) {
            System.out.print(matriz1[i][i] + " ");
        }
        System.out.println("]");
        
        
        for (int i = matriz1.length-1; i >= 0; i--) {
            System.out.print("[");
            for (int j = 0; j < matriz1.length; j++) {
                if (i+j==matriz1.length-1 ){
                    System.out.print(matriz1[i][j] + " ");
                }
            }
            System.out.println("] ");
        }        
        
        for (int i = 0; i < matriz1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz1.length; j++) {
                if (j<=i) {
                    System.out.print(matriz1[i][j] + " ");
                }
            }
            System.out.println("] ");
        }
    }
}


/* 

1.- Crear en la clase que contiene el método main el array multidimensional:
int matriz1[][]={{101,102,103,104,105},{201,202,203,204,205},{301,302,303,304,305},{401,
402,403,404,405},{501,502,503,504,505}};


Realiza un menú repetitivo con las siguientes seis acciones:


1.-Elegir fila. Pide el número de fila por teclado y muestra elementos de esa fila.
Comprueba que el número de fila sea válido.


2.- Elegir columna. Pide el número de columna por teclado y muestra los elementos de
esa columna. Comprueba que el número de columna sea válido.


3.- Mostrar los elementos de la diagonal


4.- Mostrar los elementos de la diagonal inversa


5.- Mostrar los elementos de la diagonal hacia arriba


6.- Salir

*/