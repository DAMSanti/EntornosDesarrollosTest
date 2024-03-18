
package repaso.ejercicioclase;

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
}
