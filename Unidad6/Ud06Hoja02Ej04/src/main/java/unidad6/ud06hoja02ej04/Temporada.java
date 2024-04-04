package unidad6.ud06hoja02ej04;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAM104
 */
public class Temporada {
    private ArrayList<Partidos> temporada;
    
    public Temporada() {
        this.temporada = new ArrayList<>();
    }    
    
    public boolean insertar(Partidos partido) {
        return temporada.add(partido);
    }
    
    public int numPartidos() {
        return temporada.size();
    }
    
    public void infoTemporada() {
        for (Partidos partidos : temporada) {
            System.out.println(partidos.toString());
        }
    }

    public void dejaEmpates() {
        Iterator<Partidos> iterator = temporada.iterator();
        while (iterator.hasNext()) {
            Partidos partido = iterator.next();
            if (partido.getGoles()[0] != partido.getGoles()[1]) {
                iterator.remove();
            }
        }
    }

}
