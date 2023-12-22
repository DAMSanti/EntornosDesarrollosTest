package unidad04.ud04hoja02ej04;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Alumno {
    private String nombre;
    private int[] notas;
    
    public Alumno(String nombre) {
        Scanner teclado = new Scanner(System.in);
        this.nombre = nombre ;
        notas = new int[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("[" + (i+1) + "/" + notas.length + "] Introduce una nota: ");
            notas[i]=teclado.nextInt();
        }
        System.out.println("Todas las notas han sido introducidas.");
    }
    
    public int menor() {
        int menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            menor = notas[i] < menor ? notas[i] : menor ;
        }
        return menor;
    }
    
    public int mayor() {
        int mayor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            mayor = notas[i] > mayor ? notas[i] : mayor ;
        }
        return mayor;
    }
    
    public String mostrar() {
        int media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /=notas.length;
        return this.nombre.toUpperCase().concat(String.valueOf(media));
    }
}



/*

4.- Diseñar una clase llamada Alumno con los atributos privados: nombre alumno, y un array
con las 5 notas enteras de ese alumno y los siguientes métodos públicos:
• Un constructor que dimensiona el array e inicialice los atributos con los valores
introducidos por teclado y el nombre se pasa como argumento de entrada.
• Método llamado mayor que devuelve la mejor nota
• Método llamado menor que devuelve la menor de las notas
• Método llamado mostrar que devuelve una cadena donde se muestre el nombre del
alumno, en mayúsculas, seguido de su nota media.
Desde la clase principal declarar un objeto de tipo alumno y probar los métodos de la clase.

*/