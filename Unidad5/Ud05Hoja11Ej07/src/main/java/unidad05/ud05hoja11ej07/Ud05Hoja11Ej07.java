package unidad05.ud05hoja11ej07;

import java.util.Scanner;
import static unidad05.ud05hoja11ej06.Ud05Hoja11Ej06.caracterEn;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja11Ej07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe una cadena de caracteres: ");
        String lect_teclado = teclado.nextLine();
        try {
            System.out.println(caracterEn(lect_teclado, 7));
        } catch (Exception e) {
            System.out.println("Ha habido un error: " + e.getMessage());
        }  
    }
}
