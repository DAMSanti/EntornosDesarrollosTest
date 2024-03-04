package unidad05.ud05hoja09ej04;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja09Ej04 {

    public static void main(String[] args) {
        try {
            throw new MiExcepcion("Fuera de Limites");
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
        try {
            throw new MiExcepcion("Otro error diferente");
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
