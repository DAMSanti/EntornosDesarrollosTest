package unidad3.ud03hoja02ej01;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ud03hoja02ej01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 7: ");
        int numero = teclado.nextInt();
        if ((numero<1) || (numero > 7)){
            System.out.println("El numero debe estar entre 1 y 7");
        }
        else{
            switch (numero) {
                case 1 -> System.out.println("El dia es LUNES");
                case 2 -> System.out.println("El dia es MARTES");
                case 3 -> System.out.println("El dia es MIERCOLES");
                case 4 -> System.out.println("El dia es JUEVES");
                case 5 -> System.out.println("El dia es VIERNES");
                case 6 -> System.out.println("El dia es SABADO");
                case 7 -> System.out.println("El dia es DOMINGO");
            }
        }
    }
}
