package unidad2.ud2hoja3ej1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ud2hoja3ej1 {

    public static void main(String[] args) {
        Finanzas f1 = new Finanzas();
        Scanner teclado = new Scanner(System.in);
        double dolares, euros;
        
        System.out.println("Cuantos dolares tienes? ");
        dolares=teclado.nextDouble();
        System.out.println("Equivale a " + f1.dolaresToEuros(dolares) + " euros.");
        
        System.out.println("Cuantos euros tienes? ");
        euros=teclado.nextDouble();
        System.out.println("Equivale a " + f1.eurosToDolares(euros) + " dolares.");
        
        Finanzas f2 = new Finanzas(1.10);
        
        System.out.println("Equivale a " + f2.dolaresToEuros(dolares) + " euros.");
        
    }
}
