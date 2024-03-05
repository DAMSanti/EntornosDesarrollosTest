package unidad05.ud05hoja11ej08;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja11Ej08 {

    public static void main(String[] args) {
        Scanner teclado;
        boolean salir = false;
        while(!salir) {
            try {
                teclado = new Scanner(System.in);
                System.out.print("Introduce un numero entero positivo: ");
                int n = teclado.nextInt();
                if (n<0) {
                    throw new NumeroNegativoExcepcion();
                }                
            } catch (NumeroNegativoExcepcion e) {
                System.out.print(e.toString());
                salir = true;
            }
        }
    }
}
