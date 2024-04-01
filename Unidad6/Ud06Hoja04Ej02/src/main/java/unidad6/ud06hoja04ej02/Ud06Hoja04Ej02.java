package unidad6.ud06hoja04ej02;

/**
 *
 * @author rathm
 */
public class Ud06Hoja04Ej02 {

    public static void main(String[] args) {
        Articulo a1 = new Articulo();
        Articulo a2 = new Articulo();
        Articulo a3 = new Articulo();

        Almacen almacen = new Almacen();
        almacen.insertar(a1);
        almacen.insertar(a2);
        almacen.insertar(a3);
        almacen.buscar("JAT");
        System.out.println(almacen.pedidos());
    }
}
