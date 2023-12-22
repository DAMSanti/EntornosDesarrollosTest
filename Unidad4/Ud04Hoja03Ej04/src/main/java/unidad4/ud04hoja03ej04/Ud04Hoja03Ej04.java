package unidad4.ud04hoja03ej04;

/**
 *
 * @author Santi
 */
public class Ud04Hoja03Ej04 {

    public static void main(String[] args) {
        Bonoloto[] sorteo = new Bonoloto[10];
        
        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = new Bonoloto();
        }
        
        for (int i = 0; i < sorteo.length; i++) {
            System.out.println(sorteo[i].mostrar());
        }
    }
}
