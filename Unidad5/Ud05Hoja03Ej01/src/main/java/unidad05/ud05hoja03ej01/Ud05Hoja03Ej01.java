package unidad05.ud05hoja03ej01;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja03Ej01 {

    public static void main(String[] args) {
        Cono cono = new Cono(10,5);
        Cilindro cilindro = new Cilindro(10,5);
        
        System.out.printf("\nEl area del cono es %,.2f y el volumen es %,.2f", cono.area(), cono.volumen());
        
        System.out.printf("\nEl area del cilindro es %,.2f y el volumen es %,.2f", cilindro.area(), cilindro.volumen());
    }
}
