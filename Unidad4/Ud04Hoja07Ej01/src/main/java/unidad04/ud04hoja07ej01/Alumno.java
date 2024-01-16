package unidad04.ud04hoja07ej01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Alumno {
    private String nombreAlumno;
    private int[] notas;
    
    public Alumno(String nombre) {
        this.notas = new int[5];
        this.nombreAlumno = nombre;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            teclado = new Scanner(System.in);
            System.out.print("[" + (i+1) + "/" + notas.length + "] Introduzca una nota: ");
            notas[i] = teclado.nextInt();
        }
    }
    
    public int mayor() {
        Arrays.sort(notas);
        return notas[notas.length-1];
    }
    
    public int menor() {
        Arrays.sort(notas);
        return notas[0];
    }
    
    public void ponerACero() {
        Arrays.fill(notas, 0);
    }
    
    public int buscar(int n) {
        Arrays.sort(notas);
        return Arrays.binarySearch(notas, n);
    }
    
    public int[] tresMejores() {
        int[] tres = new int[3];
        Arrays.sort(notas);
        for (int i = 0; i < 3; i++) {
            tres[i] = notas[notas.length-i-1];
        }
        return tres;
    }
}



/*

1.- Diseñar una clase llamada Alumno con los atributos privados: nombre alumno, y un array
con las 5 notas enteras de ese alumno y los siguientes métodos públicos:
• Un constructor que dimensiona el array e inicialice las notas con los valores
introducidos por teclado y el nombre del alumno por parámetro.
• Un método llamado mayor que devuelve la mejor nota (utiliza para ello algún método
de la clase Arrays)
• Un llamado menor que devuelve la menor de las notas (utiliza para ello algún método
de la clase Arrays)
• Un método llamado ponerACero que cambie el array de notas y las ponga todas a 0
(utiliza para ello algún método de la clase Arrays)
• Método buscar que ordene las notas de menor a mayor y devuelva la posición de una
nota pasada como parámetro (utiliza para ello algún método de la clase Arrays)
• Método tresMejores que me devuelve un array de 3 elementos con las 3 mejores
notas del alumno (utiliza para ello algún método de la clase Arrays)
Desde la clase principal declarar un objeto de tipo alumno y probar los métodos de la clase

*/