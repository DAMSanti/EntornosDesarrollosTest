package unidad05.ud05hoja09ej04;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja09Ej04 {

    public static void main(String[] args) {
        try {
            throw new MiExcepcion("Toma ERROR chulo");
        } catch (MiExcepcion e) {
            System.out.println(e.toString());
        }
    }
}
