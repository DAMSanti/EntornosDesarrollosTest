package unidad04.ud04hoja02ej03;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja02Ej03 {

    public static void main(String[] args) {
        Invierno winter = new Invierno(5);
        System.out.println(winter.tempMedia());
        winter.mostrar(winter.fahrenheit());
    }
}
