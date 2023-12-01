package unidad3.ud03hoja02ej02;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ud03hoja02ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 31: ");
        int numero = teclado.nextInt();
        if ((numero<1) || (numero > 31)){
            System.out.println("El numero debe estar entre 1 y 31");
        }
        else{
            switch (numero%7) {
                case 1 -> System.out.println("El dia es LUNES");
                case 2 -> System.out.println("El dia es MARTES");
                case 3 -> System.out.println("El dia es MIERCOLES");
                case 4 -> System.out.println("El dia es JUEVES");
                case 5 -> System.out.println("El dia es VIERNES");
                case 6 -> System.out.println("El dia es SABADO");
                case 0 -> System.out.println("El dia es DOMINGO");
            }
        }
    }
}
