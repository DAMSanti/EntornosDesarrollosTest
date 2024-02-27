package unidad05.ud05hoja08ej01;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Alumno {
    private String nombre;
    private int[] notas;

    public Alumno(int n) {
        notas = new int[n];
        System.out.print("Introduce el nombre del alumno: ");
        this.nombre = new Scanner(System.in).nextLine();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Utils.introduceNota(0, 10);
        }
    }
    
    public void mostrar() {
        System.out.println("ALUMNO: " + this.nombre);
        System.out.println("NOTAS: ");
        for (int i = 0; i < notas.length; i++) {
            if (i == notas.length -1) {
                System.out.println(notas[i]);
            } else {
                System.out.print(notas[i] + " - ");
            }
        }
    }

}
