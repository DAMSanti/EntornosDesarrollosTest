package unidad4.ud04hoja08aej01;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Array {
    private int[] vectores;
    
    public Array() {
        vectores = new int[10];
    }
    
    public void mostrar() {
        for (int i = 0; i < vectores.length; i++) {
            System.out.printf("Valor: %d\n", vectores[i]);
        }
    }
    
    public void introducir() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vectores.length; i++) {
            System.out.printf("[%d/%d]Introduce un numero entero: ", (i+1), vectores.length);
            vectores[i] = teclado.nextInt();
        }
        System.out.println("Vector rellenado");
    }
    
    public int media() {
        int media = 0 ;
        for (int i = 0; i < vectores.length; i++) {
            media += vectores[i];
        }
        return media /= vectores.length;
    }
    
    public void modificar(int num, int pos) {
        int ex = vectores[pos-1];
        vectores[pos-1] = num;
        System.out.printf("\nValor %d localizado en la posicion %d ha sido modificado por el valor %d\n", ex, pos, num);
    }
    
    public void rotarIzquierda() {
        int aux = vectores[0];
        for (int i = 0; i < vectores.length-1; i++) {
            vectores[i] = vectores [i+1];
        }
        vectores[vectores.length-1] = aux;
    }
    
    public void rotarDerecha() {
        int aux = vectores[vectores.length-1];
        for (int i = vectores.length-1; i > 0; i--) {
            vectores[i] = vectores [i-1];
        }
        vectores[0] = aux;
    }
    
    public void comparar(Array a) {
        int aciertos = 0;
        int exact = 0;
        for (int i = 0; i < vectores.length; i++) {
            for (int j = 0; j < a.vectores.length; j++) {
                if (vectores[i]==a.vectores[j]) {
                    if (i==j) {
                        exact++;
                    } else {
                        aciertos++;
                    }
                }
            }
        }
        System.out.printf("El numero de coincidencias es de %d, de las cuales %d estan en la misma posicion del array", (exact+aciertos), exact);
    }
    
    public void sumaPares() {
        int suma = 0;
        for (int i = 0; i < vectores.length; i++) {
            if (vectores[i]%2==0 && vectores[i]!=0) {
                suma += vectores[i];
            }            
        }
        System.out.printf("La suma de los numeros pares es igual a %d", suma);
    }
    
    public void multiplos(int num) {
        for (int i = 0; i < vectores.length; i++) {
            vectores[i] = num*(i+1);
        }
    }
}


/*

1.- Crea una clase Array que tenga como atributo un vector de enteros de tamaño 10.
Inicializa el vector en el constructor. Además, esta clase tendrá los siguientes métodos:
a. Método public void mostrar(): Donde muestra por pantalla el contenido del vector.
b. Método public void introducir(): Donde pide por teclado valores por teclado para
rellenar todo el vector.
c. Método public int media(): Donde devuelve la media de los valores del vector.
d. Método public void modificar(int num,int pos): Método que modifica el valor del
elemento pos-1 del vector por el entero num que recibe como argumento.
e. Método public void rotarIzquierda(): Método que coge el primer elemento del
vector y lo coloca en última posición, haciendo que el resto de los valores se muevan
una posición a la izquierda.
f. Método public void rotarDerecha(): Método que coge el último elemento del
vector y lo coloca en la primera posición, haciendo que el resto de los valores se
muevan una posición a la derecha.
g. Método public void comparar(Array a): Método que muestra por pantalla los
elementos en común que existen en el vector del objeto a y el vector del objeto que
realiza la llamada.
h. Método public void sumaPares(): Método que muestra la suma de los números
pares del vector.
i. Método public void multiplos(int num): Método que rellena el array con el valor
introducido por argumento del método y sus sucesivos múltiplos. Por ejemplo, si
introducimos el valor 3, rellenará el vector con los valores 3, 6, 9, 12, 15....

PD. No se puede utilizar la clase Arrays para realizar el ejercicio.
En el programa principal, se crea un objeto de la clase Array. Posteriormente, se muestra un
menú de opciones para poder hacer llamadas a todos los métodos desarrollados en la clase
anterior. Para la opción g, es necesario crear un nuevo objeto Array para poder comparar el
contenido de ambos vectores.

*/