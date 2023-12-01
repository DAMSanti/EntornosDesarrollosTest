package unidad3.ud03hoja03ej02;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Calculo {
    
    public static void countDown() {
        int i = 10 ;
        while (i >= 0 ) {
            System.out.println(i);
            i--;
        }
        System.out.println("DESPEGUE!");
    }
    
    public static void signo() {
        int i = 1, n;
        int positivo=0, negativo=0, nulo=0;
        Scanner teclado = new Scanner(System.in);
        while ( i <= 10) {
            System.out.print("[" + i + "]Introduceme un numero: ");
            n = teclado.nextInt();
            if (n>0) {
                positivo++;
            }
            else if (n<0) {
                negativo++;
            }
            else {
                nulo++;
            }
            i++;
        }
        System.out.println("\nHas introducido " + positivo + " numeros positivos, " + negativo + " numeros negativos y " + nulo + " veces cero");
    }
    
    public static void factorial() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("No introducir numeros superiores a 20");
        System.out.print("Introduce el numero del que quieras hallar el factorial: ");
        long n = teclado.nextLong(), facto = n;
        while (n>1) {
            facto *= n-1;
            n--;
        }
        System.out.println("El resultado del factorial es: " + facto);
    }
    
    public static void hastaPunto() {
        Scanner teclado = new Scanner(System.in);
        String texto;
        do {
            System.out.println("Introduzca una cadena de texto de la que quiera extraer la primera frase:\n");
            texto = teclado.nextLine();
        } while (!texto.contains("."));
        String textocut = texto.substring(0,(texto.indexOf("."))+1);
        System.out.printf("La primera frase de tu texto es: %s y tiene %d caracteres", textocut, textocut.length());
    }
    
    public static void media() {
        float n, media = 0;
        int i = 0;
        Scanner teclado = new Scanner(System.in) ;
        do {
            System.out.print("[" + i + "]Introduce numeros para hallar la media: ");
            n = teclado.nextFloat();
            if (n>=0) {
                media += n;
                i++;        
            }
        } while (n>=0);
        media /= i ;
        System.out.println("La media es " + media);
    }
}
