package unidad05.ud05hoja03ej01;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja03Ej01 {

    public static void main(String[] args) {
        Cono cono = new Cono(5,10);
        Cilindro cilindro = new Cilindro(7,15);
        
        System.out.printf("\nEl area del cono es %,.2fu2 y el volumen es %,.2fu2", cono.area(), cono.volumen());
        
        System.out.printf("\nEl area del cilindro es %,.2fu2 y el volumen es %,.2fu2", cilindro.area(), cilindro.volumen());
    }
}
