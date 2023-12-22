package unidad4.ud04hoja03ej03;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Comunidad {
    private final String nombre;
    private final String[] provincias;
    
    public Comunidad(String nombre, int dimension) {
        this.nombre = nombre; 
        this.provincias = new String[dimension];
        Scanner teclado;
        for (int i = 0; i < provincias.length; i++) {
            teclado = new Scanner (System.in);
            System.out.printf("[%d/%d] Introduce las provincias de %s: ", 
                    (i+1), provincias.length, this.nombre);
            provincias[i] = teclado.nextLine();
        }
        System.out.println("");
    }
    
    public String mostrar() {
        String provi = "";
        for (int i = provincias.length-1; i >= 0; i--) {
            provi = provi.concat(String.format("\n\t%s", this.provincias[i].length()>=4 ? 
                    this.provincias[i].substring(0, 4) : this.provincias[i].length()));
        }
        return String.format("%s:%s", this.nombre.toUpperCase(), provi);
    }
    
    public String sorteo() {
        return provincias[(int) Math.floor(Math.random()*provincias.length)];
    }
    
    public int buscar(String provincia) {
        int n = -1;
        for (int i = 0; i < provincias.length && n==-1; i++) {
            if (provincias[i].toUpperCase().contains(provincia.toUpperCase())) {
                n = i;
            }
        }
        return n;
    }
}



/*

3.- Crea una clase llamada Comunidad que tiene como atributos: el nombre de la Comunidad y
un array con el nombre las provincias de esa comunidad
Y los métodos:


• Un constructor que recibe como argumentos el nombre de la Comunidad y el número
de provincias que tiene. Inicializa el nombre de la comunidad, dimensiona el array y pide
por teclado el nombre de las provincias.


• Un método llamado mostrar que devuelve una cadena de texto que muestre el nombre
de la comunidad en mayúsculas y las 4 primeras letras de todas las provincias escritos
en orden inverso a como se introdujeron. En caso, que no sea posible obtener 4 letras
mostrar su longitud.


• Un método llamado sorteo que devuelve el nombre de la provincia elegido al azar de
entre todas las provincias.


• Un método llamado buscar que recibe como argumento el nombre de una provincia y
devuelve la posición en que se encuentra la provincia en el array o -1 si no lo encuentra.


Desde el método principal declarar un objeto de tipo Comunidad y probar todos los métodos de
la clase.

*/
