package unidad4.ud04hoja08aej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja08aEj02 {

    public static void main(String[] args) {
        Matriz matrix = new Matriz();    
        matrix.show();
        System.out.println("\n\n\n");
        matrix.multiplica();
        matrix.show();
        int[] aspa = matrix.valoresAspa();
        System.out.println("\n\n");
        for (int i = 0; i < aspa.length; i++) {
            System.out.print(aspa[i] + " ");
        }
        System.out.println("\n\n");
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("De que numero quieres saber la tabla de multiplicar? ");
        int n= teclado.nextInt();
        if (n>9 && n<0) {
            System.out.println("El valor introducido no esta entre 1 y 9");
        } else {
            int[] tabla = matrix.tablaMultiplicar(n);
            for (int i = 0; i < tabla.length; i++) {
                System.out.print(tabla[i] + " ");
            }
        }
    }
}
