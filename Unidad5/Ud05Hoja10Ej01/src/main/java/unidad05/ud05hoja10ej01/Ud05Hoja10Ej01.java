package unidad05.ud05hoja10ej01;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja10Ej01 {

    public static void main(String[] args) {
        Troyano t1 = new Troyano("Helena", 22, 9);
        Griego g1 = new Griego("Maris", 28, 7);
        Caballo c1 = new Caballo(t1, 9);
        if (c1.montar(g1)>0) {
            System.out.println("Guerrero montado al caballo satisfactoriamente");
        } else {
            System.out.println("No se ha podido introducir el guerrero al caballo");
        }
    }
}
