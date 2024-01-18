package unidad4.ud04hoja08aej02;

/**
 *
 * @author DAM104
 */
public class Matriz {
    private int[][] matriz;
    
    public Matriz() {
        matriz = new int[10][10];
        for (int i = 0; i < 10; i++) {
            matriz[0][i]=i;
            matriz[i][0]=i;
        }
    }
    
    public void multiplica() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i!=0 && j!=0) {
                    matriz[i][j]=matriz[0][j]*matriz[i][0];
                }
            }
        }
    }
    
    public void show() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }        
    }
    
    public int[] valoresAspa() {
        int[] aspa = new int[20];
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j || matriz.length==i+j+1) {
                    aspa[cont] = matriz[i][j];
                    cont++;
                }
            }
        }
        return aspa;
    }
    
    public int[] tablaMultiplicar(int n) {
        int[] tabla = new int[9];
        for (int i = 1; i < matriz[n].length; i++) {
            tabla[i-1] = matriz[n][i];
        }
        return tabla;
    }
}



/*

2.- Crea un array multidimensional que contenga la tabla de multiplicar del 1 al 9 (10 filas y 10
columnas). La primera fila y la columna debe contener estos números. Algo así en la figura 1:
Para realizar este proceso crearemos una clase Multiplicar que tendrá como atributo una matriz
de enteros de 10 por 10 y de los siguientes métodos:
• Constructor que inicializará la matriz e inicializará la matriz como figura en la figura 1.
• Método multiplica que rellenará la matriz como figura en la figura 2.
• Método muestra que muestra la información de la matriz por pantalla.
• Método valoresAspa, devuelve un vector con los valores que se encuentran, si trazamos
un aspa, es decir, los que se encuentran en la diagonal y en la diagonal inversa.
• Método tablaMultiplicar, tiene un argumento de entrada donde se introduce el número
de la tabla de multiplicar que se quiere obtener y devuelve el vector con los datos de la
tabla de multiplicación. Por ejemplo, si nos piden la tabla del 2, devolvemos un vector
con los valores {2,4,6,8,10,12,14,16,18}.
En la clase principal crearemos un objeto multiplicar y probaremos los métodos: multiplica,
muestra, valoresAspa y procesar el vector devuelto para mostrar la información y pedir por
pantalla el número de tabla que quiere procesar, validar que sólo sea posible los valores entre
1 y 9, llamar al método tablaMultiplicar y procesar el vector devuelto para mostrar la
información.

*/
