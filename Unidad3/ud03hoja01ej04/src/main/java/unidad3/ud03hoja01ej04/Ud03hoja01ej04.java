package unidad3.ud03hoja01ej04;

/**
 *
 * @author dam1
 */
public class Ud03hoja01ej04 {

    public static void main(String[] args) {
        Billete v1 = new Billete(807.26, 11);
        System.out.printf("El precio de la estancia es: %,.2f €", v1.importe());
    }
}
