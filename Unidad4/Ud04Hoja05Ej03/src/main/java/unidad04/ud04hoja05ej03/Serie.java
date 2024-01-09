package unidad04.ud04hoja05ej03;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Serie {
    private double[] lista;
    private char signo;
    
    public Serie() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cuantos numeros quieres introducir? ");
        int n = teclado.nextInt();
        lista = new double[n];
        for (int i = 0; i < n; i++) {
            teclado = new Scanner(System.in);
            System.out.print("[" + (i+1) + "/" + n + "]Introduce un numero: ");
            lista[i] = teclado.nextInt();
        }
        teclado = new Scanner(System.in);
        System.out.print("Introduce ahora la operacion que quieres realizar: ");
        signo=teclado.nextLine().charAt(0);
    }
    
    public int resultado() {
        int resultado = 1;
        if (this.signo=='+') {
            for (int i = 0; i < lista.length; i++) {
                resultado += lista[i];
            }
            resultado -= 1;
        } else if (this.signo=='*') {
            for (int i = 0; i < lista.length; i++) {
                resultado *= lista[i];
            }            
        }
        return resultado;
    }
}

/*

3.- Escribe una clase llamada Serie que contenga como atributos un array de números de tipo
double y una variable de tipo char.
• Cree un constructor que inicializa el array con los valores pedidos por teclado y la
variable char con el signo (+ ó *) pasado como argumento.
• Escribe un método resultado que devuelva la suma de todos los números si el valor de
la variable de tipo char es '+' y que devuelva el producto de todos los números de la
matriz si el valor de la variable char es '*'.

*/
