package unidad05.ud05hoja04ej01;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAM104
 */
public class Libro extends Publicacion{
    private int numpaginas;
    
    public Libro(String titulo, String autor, int dia, int mes, int ano, int numpaginas) {
        super(titulo, autor, dia, mes, ano);
        this.numpaginas = numpaginas;
    }
    
    public String toString() {
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        return String.format("El libro %s de %s fue publicado el %s y tiene %d paginas", super.titulo, super.autor, super.fecha.format(formato), numpaginas);
    }
}
