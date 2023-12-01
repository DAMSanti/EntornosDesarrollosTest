package unidad3.ud03hoja04ej07;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Ud03hoja04ej07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean quit = false ;
        int n;
        do {
            System.out.print("Sobre que numero quieres operar?: ");
            Operaciones o1 = new Operaciones(teclado.nextInt());
            System.out.println("OPERACIONES A REALIZAR CON EL NUMERO " + o1.getN());
            System.out.println("1.- contar cuantas cifras tiene\n2.- escriba sus 10 primeros múltiplos\n3.- decir si es perfecto\n4.- salir");
            n = teclado.nextInt();
            switch (n) {
                case 1-> System.out.println("El numero " + o1.getN()+ " tiene " + o1.cifras() + " cifras.");
                case 2-> o1.divisor();
                case 3-> {
                    if (o1.perfecto()) {
                        System.out.println("El numero " + o1.getN()+ " es perfecto.");
                    }
                    else {
                        System.out.println("El numero " + o1.getN()+ " NO es perfecto.");
                    }
                }
                case 4-> quit = true;
                default -> System.out.println("La opcion introducida no es correcta, intentelo de nuevo.");
            }
        } while (!quit);
    }
}
