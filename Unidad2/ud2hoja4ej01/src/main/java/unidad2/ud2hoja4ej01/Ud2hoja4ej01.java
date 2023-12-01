package unidad2.ud2hoja4ej01;

/**
 *
 * @author dam1
 */
public class Ud2hoja4ej01 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRadio(6.3f);
        System.out.println("El radio del circulo c1 es: " + c1.getRadio() );
        Circulo c2 = new Circulo(10);
        System.out.println("El radio del circulo c2 es: " + c2.getRadio() );
    }
}
