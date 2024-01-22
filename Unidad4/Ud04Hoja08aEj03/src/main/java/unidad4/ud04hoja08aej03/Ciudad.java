package unidad4.ud04hoja08aej03;

/**
 *
 * @author DAM104
 */
public class Ciudad {
    private String nombre;
    private float latitud, longitud;
    private int habitantes;
    
    public Ciudad(String nombre, float lat, float lon, int habitantes) {
        this.nombre = nombre ;
        this.latitud = lat ;
        this.longitud = lon ;
        this.habitantes = habitantes ;
    }
    
    @Override
    public String toString() {
        return String.format("%s tiene %d habitantes.", this.nombre, this.habitantes);
    }

    public int getHabitantes() {
        return habitantes;
    }

    public String getNombre() {
        return nombre;
    }
}


/*

3.- Queremos hacer un programa para registrar los datos de distintas ciudades. Para esto
debemos implementar las siguientes clases:
• Clase Ciudad: Que tienen los siguientes atributos y métodos:
o Nombre de la ciudad
o Latitud
o Longitud
o No de habitantes
o constructor: recibe por parámetros los datos que inicializan dichos atributos.
o Los correspondientes getters
o El método toString para que devuelva el nombre de la ciudad y el no de
habitantes.

• Clase País: que tiene los siguientes atributos y métodos:
o Nombre del país
o Array de ciudades.
o Numero de ciudades
o Constructor que recibe como parámetro el nombre del país inicializa el array a
25 ciudades e inicializa el número de ciudades a 0.
o Un método para añadir una ciudad al array. Comprueba que hay un sitio en el
array para añadir una ciudad y, si hay hueco, crea una ciudad pidiendo los datos
por teclado.
o Un método que devuelva la ciudad con más habitantes.
o Un método que nos diga si una ciudad existe o no. Pasamos como argumento
el nombre de la ciudad. La comprobación no tiene en cuenta minúsculas o
mayúsculas.
o Un método que nos devuelva la población media de todas las ciudades.
o Un método toString que devuelva todos los datos del país.

En el programa principal creamos un objeto de tipo país y se muestra un menú de opciones con
todas las operaciones programadas.

*/