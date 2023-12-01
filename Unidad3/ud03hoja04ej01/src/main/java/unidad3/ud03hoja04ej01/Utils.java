package unidad3.ud03hoja04ej01;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Utils {
    
    public static void divisor() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero del que quieras saber los divisores: ");
        int n = teclado.nextInt();
        System.out.print("Los divisores de " + n + " son: ");
        for (int i=(n-1); i>1; i--) {
            if (n%i==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
    
    public static void impares() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce el primer numero: ");
        int n = teclado.nextInt();
        System.out.print("\nIntrouce el segundo numero: ");
        int m = teclado.nextInt(), min, max;
        if (n>m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        System.out.print("\nLos numeros impares entre " + max + " y " + min + " son: ");
        for (int i=min; i<max; i++) {
            if (i%2!=0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void tabla() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero del que quieras saber la tabla: ");
        int n = teclado.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }
    
    public static void resta() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce el primer numero: ");
        int n = teclado.nextInt();
        System.out.print("\nIntrouce el segundo numero: ");
        int m = teclado.nextInt(), min, max;
        int cont = 0 ;
        if (n>m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        System.out.print("La division de " + max + " entre " + min);
        while (max >= min ) {
            max -= min;
            cont++;
        }
        System.out.println(" es igual a " + cont + " y " + max + " de resto");    
    }
}
