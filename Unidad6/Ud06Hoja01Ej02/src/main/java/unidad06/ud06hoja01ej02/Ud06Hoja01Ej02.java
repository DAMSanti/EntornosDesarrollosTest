package unidad06.ud06hoja01ej02;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud06Hoja01Ej02 {

    public static void main(String[] args) {
        Integer[] array = new Integer[0];
        
        Contenedor<Integer> contenedor = new Contenedor<>(array);
        Integer num = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce numeros al array: ");
            num = teclado.nextInt();
            if (num>=0) {
                contenedor.insertarAlPrincipio(num);
            }
        } while(num>=0);
        System.out.println(contenedor.toString());
        contenedor.vacia();
    }
}



/*

2.- Definir la interfaz Pila con parámetros genéricos. A continuación, implementar la interfaz
genérica en la clase Contenedor anterior solo con los métodos que requieras para que se
comporte como una pila. Por último, escribir un programa donde se utilice un objeto
contenedor como pila. En ella apilamos números enteros positivos leídos del teclado hasta que
se introduzca un -1. Después, mediante un bucle, se desapilan todos los números hasta que la
pila esté vacía y los mostramos por consola.

*/