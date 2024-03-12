package unidad05.ud06hoja01ej01;

import java.util.Arrays;

/**
 *
 * @author DAM104
 */
public class Contenedor<T> {
  private T[] array;

  public Contenedor(T[] array) {
    this.array = array;
  }

  public void insertarAlPrincipio(T nuevo) {
    array = Arrays.copyOf(array, array.length + 1);
    System.arraycopy(array, 0, array, 1, array.length - 1);
    array[0] = nuevo;
  }

  public void insertarAlFinal(T nuevo) {
    array = Arrays.copyOf(array, array.length + 1);
    array[array.length - 1] = nuevo;
  }

  public T extraerDelPrincipio() {
    if (array.length == 0) {
        return null;
    }
    T elementoUno = array[0];
    System.arraycopy(array, 1, array, 0, array.length - 1);
    array = Arrays.copyOf(array, array.length - 1);
    return elementoUno;
  }

  public void ordenar(){
    Arrays.sort(array);
  }

  public String toString() {
    return Arrays.deepToString(array);
  }
}

/*

1.- Implementar, con tipos genéricos, la clase Contenedor, donde podremos guardar tantos
objetos como deseemos. Para ello utilizaremos un array, que inicialmente tendrá tamaño cero
y se irá redimensionando según añadamos o eliminemos elementos. La clase, además del
constructor y toString(), tendrá los siguientes métodos:
• void insertarAlPrincipio(T nuevo)
• void insertarAlFinal(T nuevo)
• T extraerDelPrincipio()
• void ordenar()
Implementa también el método main para probar el programa.
PD. Utilizar los métodos de la clase Arrays y
System.arraycopy(Object tablaOrigen, int posOrigen,Object tablaDestino, int posDestino, int
longitud)
Copia en la tablaDestino, a partir del índice posDestino, los datos de la tablaOrigen,
comenzando en el índice posOrigen. El parámetro longitud especifica el número de elementos
que se copiarán entre ambos arrays. Hay que tener precaución, ya que los valores de los
elementos afectados por la copia del array destino se perderán.

*/