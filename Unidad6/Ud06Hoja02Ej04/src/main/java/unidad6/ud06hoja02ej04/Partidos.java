package unidad6.ud06hoja02ej04;

/**
 *
 * @author DAM104
 */
public class Partidos {
    private String[] equipos;
    private int[] goles;
    
    public Partidos(String local, String visitante, int golloc, int golvis) {
        this.equipos = new String[2];
        this.equipos[0] = local;
        this.equipos[1] = visitante;
        this.goles = new int[2];
        this.goles[0] = golloc;
        this.goles[1] = golvis;
    }

    public int[] getGoles() {
        return goles;
    }

    @Override
    public String toString() {
        return "Partidos{" + "equipo local=" + equipos[0] + ", equipo visitante=" + equipos[1] + ", goles local=" + goles[0] + ", goles visitante=" + goles[1] + '}';
    }
    
}
