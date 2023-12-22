package unidad04.ud04hoja05ej02;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja05Ej02 {

    public static void main(String[] args) {
        Sopa s1 = new Sopa();
        
        s1.inicializar();
        s1.mostrar();
        System.out.println("");
        s1.setPalabra("CASCO", 2, 4, 1);
        System.out.println("");
        s1.mostrar();
    }
}
