package unidad04.ud04hoja02ej03;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Invierno {
    private double[] temperaturas;
    
    public Invierno(int dimension) {
        temperaturas = new double[dimension];
        Scanner teclado;
        for (int i = 0; i < temperaturas.length; i++) {
            teclado = new Scanner(System.in);
            System.out.print("[" + (i+1) + "/" + temperaturas.length + "] Introduce una temperatura: ");
            temperaturas[i]=teclado.nextDouble();
        }
        System.out.println("\nTodas las temperaturas han sido introducidas.");
    }
    
    public double tempMedia() {
        double media = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            media += temperaturas[i]; 
        }
        return media /= temperaturas.length;
    }
    
    public double[] fahrenheit() {
        double[] fahrenheit = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            fahrenheit[i] = temperaturas[i]*1.8+32;
        }
        return fahrenheit;
    }
    
    public String mostrar(double[] temperaturas) {
        String texto = "[";
        for (int i = 0; i < temperaturas.length; i++) {
            if (i == temperaturas.length-1) {
                texto += String.format("%,.2fº", temperaturas[i]);
            } else {
                texto += String.format("%,.2fº", temperaturas[i]).concat("-");
            }
        }
        texto += ("]");
        //System.out.println("");
        return texto;
    }
}


/*

3.- Se pretende diseñar una clase llamada Invierno que tiene como atributo privado un array de
temperaturas (double) en grados centígrados y como métodos públicos:
• Un constructor que recibe como argumento un numero n, dimensiona el array con n
elementos y pide las n temperaturas por teclado
• Un método llamado tempMedia que nos devuelve la temperatura media.
• Un método llamado fahrenheit que devuelve un nuevo array con todas las temperaturas
en grados Fahrenheit. Para pasar temperaturas de grados Centígrados a Fahrenheit
utilizar la fórmula: F=C*1.8+32;
• Un método llamado mostrar que devuelve una cadena que contiene los valores de un
array. Como parámetro de entrada al método es el array.
Desde una función principal declarar objetos de la clase Invierno y probar los métodos de la
clase. Por ejemplo, si declaramos un objeto Invierno y le pasamos como argumento 5, el
constructor dimensiona el array con 5 elementos y nos pide las 5 temperaturas.

*/