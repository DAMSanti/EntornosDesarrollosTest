package unidad05.ud05hoja04ej01;

import java.time.LocalDate;

/**
 *
 * @author DAM104
 */
public abstract class Publicacion {
    protected String titulo, autor;
    protected LocalDate fecha;
    
    public Publicacion(String titulo, String autor , int dia, int mes, int ano) {
        this.titulo = titulo ;
        this.autor = autor ;
        this.fecha = LocalDate.of(ano, mes, dia);
    }
    
    public abstract String toString();
}
