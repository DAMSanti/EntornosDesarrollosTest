package unidad04.ud04hoja04ej02;

/**
 *
 * @author DAM104
 */
public class Tabla {
    private int[][] array;
    
    public Tabla() {
        array = new int[4][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.floor(Math.random()*100)+1;
            }
        }
    }
    
    public void mostrar() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("] ");
        }
    }
    
    public int mayorF(int n) {
        int mayor = array[n][0];
        for (int i = 1; i < array[n].length; i++) {
            if (mayor<array[n][i]) {
                mayor = array[n][i];
            }
        }
        return mayor;
    }
    
    public int mayorC(int n) {
        int mayor = array[0][n];
        for (int i = 1; i < array.length; i++) {
            if (mayor<array[i][n]) {
                mayor = array[i][n];
            }
        }
        return mayor;
    }
    
}


/*

2.- Diseñar una clase Tabla que tenga como elementos privados: un array bidimensional de 4
por 5 y los siguientes métodos:

• Un constructor que inicializa el array con valores aleatorios del 1 al 100.

• Un método llamado mostrar que muestra los valores del array.

• Un método llamado mayorF que recibe como argumento una fila y devuelve el mayor
de los elementos de esa fila.

• Un método llamado mayorC que recibe como argumento una columna y devuelve el
mayor elemento de esa columna.

• Un método llamado media que devuelve la media de todos los valores de la matriz.
Probar los métodos de la clase en el principal.

*/