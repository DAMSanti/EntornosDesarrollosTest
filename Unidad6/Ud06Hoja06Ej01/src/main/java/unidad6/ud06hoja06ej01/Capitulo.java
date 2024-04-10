package unidad6.ud06hoja06ej01;

/**
 *
 * @author rathm
 */
public class Capitulo {
    private int temporada;
    private int capitulo;
    private String descripcion;

    public Capitulo(int temporada, int capitulo, String descripcion) {
        this.temporada = temporada;
        this.capitulo = capitulo;
        this.descripcion = descripcion;
    }
   
    public int getTemporada() {
        return temporada;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
   
}
