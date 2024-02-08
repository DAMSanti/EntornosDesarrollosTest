package unidad05.ud05hoja04ej01;

import java.time.LocalDate;
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
    
    public static Disco discoMasLargo(Publicacion[] lista) {
        Disco max = new Disco("","",1,1,0,0), aux = new Disco("","",1,1,0,0);
        System.out.println("\nEl disco más largo es: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Disco) {
                aux = (Disco) lista[i];
                if (aux.duracion > max.duracion) {
                    max = aux ;
                }
            }
        }
        return max;
    }
    
    public static String cortaNombre(Disco disco) {
        return String.format(disco.titulo.substring(0,3).concat(String.format(" - %s", disco.autor)));    
    }
    
    public static void ultimosDosAnos(Publicacion[] lista) {
        Disco aux = new Disco("","",1,1,0,0);
        System.out.println("\nLos discos editados en los dos ultimos años son:");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Disco) {
                if (aux.fecha.getYear()> (LocalDate.now().getYear()-2) && aux.fecha.getYear()< (LocalDate.now().getYear())) {
                    System.out.println(aux.toString());
                }
            }
        }
    }
}
