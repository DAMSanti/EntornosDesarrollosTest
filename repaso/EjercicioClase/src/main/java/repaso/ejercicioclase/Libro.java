
package repaso.ejercicioclase;

import java.util.Objects;

/**
 *
 * @author DAM104
 */
public abstract class Libro implements Identificable{
    String titulo;
    String autor;
    
    public Libro() {
        this.titulo = Teclado.introduceDatos("Introduce el nombre del libro: ");
        this.autor = Teclado.introduceDatos("Introduce el autor del libro: ");
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

    public String getAutor() {
        return autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.titulo);
        hash = 71 * hash + Objects.hashCode(this.autor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
    
    
}
