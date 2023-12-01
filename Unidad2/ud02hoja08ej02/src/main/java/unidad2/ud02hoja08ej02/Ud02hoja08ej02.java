package unidad2.ud02hoja08ej02;

/**
 *
 * @author dam1
 */
public class Ud02hoja08ej02 {

    public static void main(String[] args) {
        Libro l1 = new Libro("1698451255234", "Breve Historia del Tiempo", "Stephen Hawkins");
        
        System.out.println(l1.esEspanol());
        System.out.println(l1.getDatos());
    }
}
