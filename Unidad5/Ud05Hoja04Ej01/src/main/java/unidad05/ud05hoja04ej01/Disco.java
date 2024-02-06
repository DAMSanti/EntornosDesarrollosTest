package unidad05.ud05hoja04ej01;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAM104
 */
public class Disco extends Publicacion{
    private int duracion;
    
    public Disco(String titulo, String autor, int dia, int mes, int ano, int duracion) {
        super(titulo, autor, dia, mes, ano);
        this.duracion = duracion;
    }
    
    public String toString() {
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        return String.format("El disco %s de %s fue publicado el %s y tiene una duracion de %d minutos", super.titulo, super.autor, super.fecha.format(formato), duracion);
    }
}
