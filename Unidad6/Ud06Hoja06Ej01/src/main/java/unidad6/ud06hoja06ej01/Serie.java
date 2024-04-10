package unidad6.ud06hoja06ej01;

import java.util.HashMap;

/**
 *
 * @author rathm
 */
public class Serie {
    private String nombre;
    private Tematica tematica;
    private String nacionalidad;
    private boolean finalizada;
    private int temporadas;
    private HashMap<String, String> capitulos;

    public Serie(String nombre, Tematica tematica, String nacionalidad, boolean finalizada, int temporadas) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.temporadas = temporadas;
        this.capitulos = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nombre='" + nombre + '\'' +
                ", tematica=" + tematica +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", finalizada=" + finalizada +
                ", temporadas=" + temporadas +
                '}';
    }

    public String generaClaveCapitulo(Capitulo capitulo) {
        String clave = nombre.substring(0, 4).toUpperCase();
        clave += String.format("%02d", capitulo.getTemporada()) + "X" + String.format("%02d", capitulo.getCapitulo());
        return clave;
    }

    public static String generaClaveCapitulo(String nombre, int temporada, int capitulo) {
        String clave = nombre.substring(0, 4).toUpperCase();
        clave += String.format("%02d", temporada + "X" + String.format("%02d", capitulo));
        return clave;
    }

    public void insertaCapitulo(String clave, Capitulo capitulo) {
        if (capitulos.containsKey(clave)) {
            System.out.println("Error: El capítulo ya existe.");
        } else {
            capitulos.put(clave, capitulo.getDescripcion());
        }
    }

    public void eliminaCapitulo(String clave) {
        if (capitulos.containsKey(clave)) {
            capitulos.remove(clave);
        } else {
            System.out.println("Error: El capítulo no existe.");
        }
    }

    public void visualizaCapitulos() {
        capitulos.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public String getNombre() {
        return nombre;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
}
