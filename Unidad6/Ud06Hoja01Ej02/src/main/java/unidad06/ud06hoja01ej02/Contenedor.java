package unidad06.ud06hoja01ej02;

import java.util.Arrays;

/**
 *
 * @author DAM104
 */
public class Contenedor<T> implements Pila {

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

    public void ordenar() {
        Arrays.sort(array);
    }

    public String toString() {
        return Arrays.deepToString(array);
    }
    
    public void vacia() {
        while (array.length>0) {
            System.out.println(extraerDelPrincipio());
        }
    }

    @Override
    public void guardar(Object nuevo) {
        insertarAlPrincipio((T) nuevo);
    }

    @Override
    public Object extraer() {
        return extraerDelPrincipio();
    }
}
