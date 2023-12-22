package unidad04.ud04hoja02ej01;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Operaciones {
    private int[] numeros = new int[5];
    
    public Operaciones() {
        numeros = new int[5];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + (i+1) + "/" + numeros.length + "] Introduce un valor: ");
            numeros[i]=teclado.nextInt();
        }
        System.out.println("Todos las valores han sido introducidos.\n");       
    }
    
    public void porDos() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]*=2;
        }
    }
    
    public void mostrar() {
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length-1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + "-");
            }
        }
        System.out.println("");
    }
    
    public int sumaPares() {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i%2==0 && i!=0) {
                suma += numeros[i]; 
            }
        }
        return suma;
    }
}

/*

1.- Realizar una clase Operaciones que se componga de:
• Un array como atributo de cinco elementos de tipo entero
• Constructor por defecto que solicite los valores correspondientes a cada elemento.
Y al menos los siguientes métodos:
• Método que multiplique cada elemento por dos.
• Método que muestre el contenido del array por pantalla
• Método que devuelva la suma de todos los elementos del array que se encuentran en
posiciones pares.
En el programa principal, prueba todos los métodos desarrollados.

*/