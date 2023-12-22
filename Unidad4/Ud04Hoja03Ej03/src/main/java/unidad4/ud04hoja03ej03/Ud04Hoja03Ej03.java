package unidad4.ud04hoja03ej03;

/**
 *
 * @author Santi
 */
public class Ud04Hoja03Ej03 {

    public static void main(String[] args) {
        Comunidad c1 = new Comunidad("Castilla y Leon", 9 );
        
        System.out.println(c1.mostrar() + "\n");
        System.out.println("La provincia ganadora del concurso es " + c1.sorteo() + "\n");
        System.out.println("La provincia introducida se encuentra en la posicion " + c1.buscar("avila") + "\n");
        
    }
}
