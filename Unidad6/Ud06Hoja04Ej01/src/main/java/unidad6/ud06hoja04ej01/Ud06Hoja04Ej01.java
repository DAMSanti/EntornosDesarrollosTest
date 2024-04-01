package unidad6.ud06hoja04ej01;

/**
 *
 * @author rathm
 */
public class Ud06Hoja04Ej01 {

    public static void main(String[] args) {
        Mundo mundo = new Mundo();
        mundo.agregarElemento("España");
        mundo.agregarElemento("Francia");
        mundo.agregarElemento("Portugal");

        mundo.mostrarPaises();
        mundo.eliminarPais("francia");
        mundo.mostrarPaises();
    }
}
