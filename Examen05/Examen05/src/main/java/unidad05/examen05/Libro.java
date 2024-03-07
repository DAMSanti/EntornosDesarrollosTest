package unidad05.examen05;

import java.util.Objects;

/**
 * @Santiago M Tamayo Arozamena
 * @DAM1
 */

public abstract class Libro implements Identificable, Comparable<Libro> {
    protected String titulo;
    protected String autor;
    
    public Libro() {
        this.titulo = Teclado.introduceTexto("Introduce el titulo del libro: ");
        this.autor = Teclado.introduceTexto("Introduce el nombre del autor: ");
    }
    
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    @Override
    public String imprime() {
        return String.format("LIBRO\n\tTITULO: %s\n\tAUTOR: %s", titulo, autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public int compareTo(Libro libro) {
        return this.titulo.compareToIgnoreCase(libro.titulo);
    }
    
}
