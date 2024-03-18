package repaso.ejercicioclase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Teclado {
    public static String introduceDatos(String msg) {
        Scanner teclado;
        boolean test = true;
        String cadena = "";
        while (test){
            try {
                teclado = new Scanner(System.in);
                System.out.print(msg);
                cadena = teclado.nextLine();
                if (cadena.length() == 0) {
                    throw new CadenaVacia("No has introducido el dato en formato correcto.");
                } else {
                    test = false;
                }
            } catch (CadenaVacia e) {
                System.out.println("No has introducido el dato en formato correcto.");
                test = true;
            }
        }
        return cadena;
    }
            
    public static float introduceFloat(String msg) {
        Scanner teclado;
        boolean test = true;
        float numero = 0;
        while (test){
            try {
                teclado = new Scanner(System.in);
                System.out.print(msg);
                numero = teclado.nextFloat();
                if (numero < 0) {
                    throw new CadenaVacia("El tamaño no puede ser negativo");
                } else {
                    test = false;
                }
            } catch (InputMismatchException e) {
                e.getMessage();
                System.out.println("No has introducido un numero en formato correcto.");
                test = true;
            } catch (CadenaVacia e) {
                e.getMessage();
                System.out.println("El tamaño no puede ser negativo");
                test = true;
            }         
        }
        return numero;
    }
    
}

