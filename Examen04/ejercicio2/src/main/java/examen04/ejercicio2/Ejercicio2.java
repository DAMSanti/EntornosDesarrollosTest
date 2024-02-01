package examen04.ejercicio2;

import java.time.LocalDate;
//////////////////////////////////////////////////////////////////////////////////
///////// Santiago Manuel Tamayo Arozamena                               /////////
///////// DAM 1                                                          /////////
///////// Programación                                                   /////////
///////// Examen de Programacion                                         /////////
/////////////////////////////////////////////////////////////////////////////////

public class Ejercicio2 {

    public static void main(String[] args) {
        Videoteca videoclub = new Videoteca(500);
        Pelicula titanic = new Pelicula("Titanic", "James Cameron", LocalDate.of(1997,12,19));
        Pelicula avatar = new Pelicula("Avatar", "James Cameron",LocalDate.of(2009,12,18));
        Pelicula inception = new Pelicula("Inception", "Christopher Nolan", LocalDate.of(2010,7,8));
        Pelicula losotros = new Pelicula("Los Otros", "Alejandro Amenábar", LocalDate.of(2001,9,7));
        videoclub.agregarPelicula(titanic);
        videoclub.agregarPelicula(avatar);
        videoclub.agregarPelicula(inception);
        videoclub.agregarPelicula(losotros);
        videoclub.consultarPelicula("Titanic");
        videoclub.consultarPelicula("Danza de dragones");
        videoclub.consultarDirector("James Cameron");
        videoclub.consultarDirector("Pedro Almodovar");
        videoclub.consultarLanzamiento(2010);
        videoclub.consultarLanzamiento(2003);
        videoclub.eliminarPelicula(avatar);
        
        
        videoclub.mostrarVideoteca();
    }
}
