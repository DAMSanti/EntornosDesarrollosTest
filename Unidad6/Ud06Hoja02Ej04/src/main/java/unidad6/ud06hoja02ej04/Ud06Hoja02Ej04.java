package unidad6.ud06hoja02ej04;

/**
 *
 * @author DAM104
 */
public class Ud06Hoja02Ej04 {

    public static void main(String[] args) {
        Partidos p1 = new Partidos("Racing", "Sevilla", 9, 3);
        Partidos p2 = new Partidos("Barca", "Racing", 5, 7);
        Partidos p3 = new Partidos("Racing", "Madrid", 3, 1);
        Partidos p4 = new Partidos("Racing", "Racing", 3, 3);

        Temporada temporada1 = new Temporada();
        temporada1.insertar(p1);
        temporada1.insertar(p2);
        temporada1.insertar(p3);
        temporada1.insertar(p4);
        System.out.println(temporada1.numPartidos());
        temporada1.infoTemporada();
        temporada1.dejaEmpates();
        temporada1.infoTemporada();
    }
}
