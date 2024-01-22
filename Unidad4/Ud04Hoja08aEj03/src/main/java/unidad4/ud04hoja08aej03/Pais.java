package unidad4.ud04hoja08aej03;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Pais {
    private String nombre;
    private static int ciudades;
    private Ciudad[] cities;
    
    public Pais(String nombre) {
        this.nombre = nombre ;
        this.cities = new Ciudad[25];
        this.ciudades = 0 ;
    }
    
    public void insertar() {
        Scanner teclado;
        if (cities.length<=ciudades) {
            System.out.printf("No podemos añadir mas ciudades a %s", this.nombre);
        } else {
            System.out.print("Introduce el nombre de la ciudad: ");
            teclado = new Scanner(System.in);
            String nombre = teclado.next();
            System.out.print("Introduce la latitud: ");
            teclado = new Scanner(System.in);
            float lat = teclado.nextFloat();
            System.out.print("Introduce la longitud: ");
            teclado = new Scanner(System.in);
            float lon = teclado.nextFloat();
            System.out.print("Introduce el numero de habitantes: ");
            teclado = new Scanner(System.in);
            int hab = teclado.nextInt();
            cities[ciudades] = new Ciudad(nombre, lat, lon, hab);
            ciudades++;
        }
    }
    
    public Ciudad topHabitantes() {
        Ciudad top = new Ciudad("0",0,0,0);
        for (int i = 0; i < ciudades; i++) {
            if (cities[i].getHabitantes()>top.getHabitantes()) {
                top = cities[i];
            }
        }
        return top;
    }
    
    public boolean existe(String nombre) {
        boolean existe = false ;
        for (int i = 0; i < ciudades && !existe; i++) {
            if (cities[i].getNombre().equalsIgnoreCase(nombre)) {
                existe = true ;
            }
        }
        return existe;
    }
    
    public int poblacionMedia() {
        int suma = 0 ;
        for (int i = 0; i < ciudades; i++) {
            suma += cities[i].getHabitantes();
        }
        return suma /= ciudades;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("PAIS: %s\nNº de ciudades: %d\nCIUDADES: ", this.nombre, ciudades);
        for (int i = 0; i < ciudades; i++) {
            cadena += cities[i].toString();
        }
        return cadena ;
    }

    public String getNombre() {
        return nombre;
    }
}

/*

3.- Queremos hacer un programa para registrar los datos de distintas ciudades. Para esto
debemos implementar las siguientes clases:
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