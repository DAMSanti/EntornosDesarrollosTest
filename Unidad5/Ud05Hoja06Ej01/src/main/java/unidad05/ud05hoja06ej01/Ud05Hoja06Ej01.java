package unidad05.ud05hoja06ej01;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja06Ej01 {

    public static void main(String[] args) {
        DeDos a1 = new DeDos();
        System.out.println(a1.getValor());
        a1.getSiguiente();
        System.out.println(a1.getValor());
        a1.getSiguiente();
        System.out.println(a1.getValor());
        a1.getSiguiente();
        System.out.println(a1.getValor());
        a1.getSiguiente();
        System.out.println(a1.getValor());
        a1.reiniciar();
        System.out.println(a1.getValor());
    }
}
