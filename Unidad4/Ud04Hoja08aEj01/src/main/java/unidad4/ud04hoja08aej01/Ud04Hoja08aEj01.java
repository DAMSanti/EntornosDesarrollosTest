package unidad4.ud04hoja08aej01;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja08aEj01 {

    public static void main(String[] args) {
        Array vector = new Array();
        vector.introducir();
        vector.mostrar();
        vector.modificar(4, 2);
        System.out.println("MEDIA " + vector.media());
        System.out.println("ROTAR DERECHA");
        vector.rotarDerecha();
        vector.mostrar();
        System.out.println("ROTAR IZQUIERDA");
        vector.rotarIzquierda();
        vector.mostrar();
        System.out.println("PARES");
        vector.sumaPares();
        Array vector2 = new Array();
        vector2.introducir();
        vector.comparar(vector2);
        vector.multiplos(3);
        vector.mostrar();
    }
}
