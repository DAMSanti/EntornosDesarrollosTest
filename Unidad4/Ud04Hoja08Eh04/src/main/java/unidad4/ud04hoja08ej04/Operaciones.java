package unidad4.ud04hoja08ej04;

import static java.lang.Integer.parseInt;

/**
 *
 * @author DAM104
 */

public class Operaciones {

    public static void main(String[] args) {
        if (args.length==2) {
            int num1 = parseInt(args[0], 10);
            int num2 = parseInt(args[1], 10);
            System.out.printf("La suma de %d y %d es igual a %d\n", num1, num2, suma(num1, num2));
            System.out.printf("La resta de %d y %d es igual a %d\n", num1, num2, resta(num1, num2));
            System.out.printf("La multiplicacion de %d y %d es igual a %d\n", num1, num2, multiplicacion(num1, num2));
            System.out.printf("La division de %d y %d es igual a %d\n", num1, num2, division(num1, num2));
            
        } else {
            System.out.println("No se han introducido los datos correctos.");
        }
    }
    
    public static int suma(int a, int b) {
        return a+b;
    }
    
    public static int resta(int a, int b) {
        return a-b;
    }
        
    public static int multiplicacion(int a, int b) {
        return a*b;
    }
            
    public static int division(int a, int b) {
        return a/b;
    }
    
}


/*

4.- Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular su suma,
resta, multiplicación y división, cada una en un método, imprimir dichos resultados. La clase
debe contener el Main. Los valores enteros se reciben en la línea de comandos.

*/