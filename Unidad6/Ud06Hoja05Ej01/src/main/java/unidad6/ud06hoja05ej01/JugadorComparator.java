package unidad6.ud06hoja05ej01;

import java.util.Comparator;

/**
 *
 * @author rathm
 */
public class JugadorComparator implements Comparator<Jugador> {
    @Override
    public int compare(Jugador j1, Jugador j2) {
        if (j1.getNombre().equalsIgnoreCase(j2.getNombre())) {
            return 0;
        }
        return Double.compare(j1.getEstatura(), j2.getEstatura());
    }
}
