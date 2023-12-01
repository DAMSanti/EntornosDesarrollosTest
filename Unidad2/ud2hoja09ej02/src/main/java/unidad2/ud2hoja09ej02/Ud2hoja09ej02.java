package unidad2.ud2hoja09ej02;

/**
 *
 * @author dam1
 */
public class Ud2hoja09ej02 {

    public static void main(String[] args) {
        Alimento a1 = new Alimento("patatas", 13, 25, false);
        System.out.println(a1.showDatos());
        System.out.println("¿Es el alimento dietetico? " + a1.esDietetico());
        System.out.println("Calorias en 10 gramos: " + a1.calorias(10) + " calorias");
    }
}
