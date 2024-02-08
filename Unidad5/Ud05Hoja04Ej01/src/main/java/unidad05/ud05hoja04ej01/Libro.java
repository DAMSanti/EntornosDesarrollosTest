package unidad05.ud05hoja04ej01;

import java.time.LocalDate;
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
    
    public static void libroLargo(Publicacion[] lista) {
        Libro aux = new Libro("","",1,1,0,0);
        System.out.println("\nLos libros editados este mes de más de 1000 paginas son: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof Libro) {
                aux = (Libro) lista[i];
                if (aux.fecha.getYear() == LocalDate.now().getYear() && aux.fecha.getMonthValue() == LocalDate.now().getMonthValue()) {
                    if (aux.numpaginas > 1000) {
                        System.out.println(aux.toString());
                    }
                    
                }
            }
        }
    }
}
