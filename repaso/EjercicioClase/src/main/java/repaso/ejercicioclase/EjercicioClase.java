package repaso.ejercicioclase;

/**
 *
 * @author DAM104
 */
public class EjercicioClase {

    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Santiago", "Tamayo");
        Usuario usu2 = new Usuario("Santiago", "Tamayo");
        if (usu1.equals(usu2)) {
            System.out.println("Son iguales!!!");
        } else {
            System.out.println("No son iguales!!!");
        }
        System.out.println("Aunque si les comparas mal... ¬¬");
        if (usu1==usu2) {
            System.out.println("Son iguales!!");
        } else {
            System.out.println("No son iguales!!!");
        }
        System.out.println("Nunca son iguales!!");
        
        LibroElectrónico l1 = new LibroElectrónico();
    }
}
