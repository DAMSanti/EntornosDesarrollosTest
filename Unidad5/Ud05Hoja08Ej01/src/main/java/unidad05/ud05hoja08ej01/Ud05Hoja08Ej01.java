package unidad05.ud05hoja08ej01;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja08Ej01 {

    public static void main(String[] args) {
        Alumno[] lista = new Alumno[4];
        boolean excepcion = true;
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Alumno(3);
        }
        
        while (excepcion) {
            try {
                System.out.print("Seleccione la posicion que quiere encontrar: ");
                int n = new Scanner(System.in).nextInt();
                Utils.buscaLista(n, lista);
                excepcion = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("La posicion indicada se encuentra fuera del array");
            }
        }
        
    }
}
