package ejemplos06.ejemplo06;

/**
 *
 * @author cic
 */
public class Jugador {

    private int dorsal;
    private String nombre;
    private String demarcacion;

    public Jugador() {
    }

    public Jugador(int dorsal, String nombre, String demarcación) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcacion = demarcación;
    }

    @Override
    public String toString() {
        return "Jugador{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", demarcacion=" + demarcacion + '}';
    }
}
