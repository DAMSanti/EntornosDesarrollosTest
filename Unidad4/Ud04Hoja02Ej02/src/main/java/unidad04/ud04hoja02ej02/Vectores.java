package unidad04.ud04hoja02ej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Vectores {
    private int[] numeros;
    
    public Vectores() {
        numeros = new int[5];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + (i+1) + "/" + numeros.length + "] Introduce un valor: ");
            numeros[i]=teclado.nextInt();
        }
        System.out.println("Todos las valores han sido introducidos.\n");       
    }
    
    public int menor() {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            menor = numeros[i] < menor ? numeros[i] : menor ;
        }
        return menor;
    }
    
    public int mayor() {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            mayor = numeros[i] > mayor ? numeros[i] : mayor ;
        }
        return mayor;
    }
    
    public double media() {
        int media = 0;
        for (int i = 0; i < numeros.length; i++) {
            media += numeros[i];
        }
        return media /=numeros.length;
    }
}

/*

2.- Realizar una clase denominada Vectores que se componga:
• Un array de cinco elementos de tipo entero.
• Constructor que solicite al usuario los valores correspondientes a cada elemento.
• Método que devuelva el valor menor del array.
• Método que devuelva el valor mayor del array.
• Método que devuelva la media de todos los valores del array.
Haz un programa principal que pruebe todos los métodos probados.

*/