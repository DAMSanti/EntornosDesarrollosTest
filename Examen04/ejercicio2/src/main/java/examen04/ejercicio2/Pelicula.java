package examen04.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//////////////////////////////////////////////////////////////////////////////////
///////// Santiago Manuel Tamayo Arozamena                               /////////
///////// DAM 1                                                          /////////
///////// Programación                                                   /////////
///////// Examen de Programacion                                         /////////
/////////////////////////////////////////////////////////////////////////////////

public class Pelicula {
    private String titulo, director;
    private LocalDate lanzamiento;
    
    public Pelicula(String titulo, String director, LocalDate lanzamiento) {
        this.titulo = titulo ;
        this.director = director ;
        this.lanzamiento = lanzamiento ;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        return String.format("Titulo: %s , Director: %s , Fecha de Estreno: %s", titulo, director, lanzamiento.format(f));
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

}
