package unidad05.ud06hoja01ej01;

/**
 *
 * @author DAM104
 */
public class Ud06Hoja01Ej01 {

    public static void main(String[] args) {
        Integer[] array = new Integer[0];
        
        
        // Test the program
        Contenedor<Integer> contenedor;
        contenedor = new Contenedor<>(array);
        
        contenedor.insertarAlPrincipio(1);
        contenedor.insertarAlFinal(2);
        contenedor.insertarAlPrincipio(3);
        System.out.println(contenedor.toString());
        contenedor.ordenar();
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