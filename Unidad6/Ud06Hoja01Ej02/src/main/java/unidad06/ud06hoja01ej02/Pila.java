package unidad06.ud06hoja01ej02;

/**
 *
 * @author DAM104
 */
public interface Pila <T> {
    
    public void guardar (T nuevo);

    public T extraer();    
    
}   

/*

2.- Definir la interfaz Pila con parámetros genéricos. A continuación, implementar la interfaz
genérica en la clase Contenedor anterior solo con los métodos que requieras para que se
comporte como una pila. Por último, escribir un programa donde se utilice un objeto
contenedor como pila. En ella apilamos números enteros positivos leídos del teclado hasta que
se introduzca un -1. Después, mediante un bucle, se desapilan todos los números hasta que la
pila esté vacía y los mostramos por consola.


*/