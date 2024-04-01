package unidad6.ud06hoja04ej02;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rathm
 */

public class Almacen {
    private Set<Articulo> articulos;

    public Almacen() {
        articulos = new HashSet<>();
    }

    public void insertar(Articulo articulo) {
        articulos.add(articulo);
    }

    public Articulo buscar(String codigo) {
        Articulo encontrado = null;
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo().equals(codigo)) {
                encontrado = articulo;
            }
        }
        return encontrado;
    }

    public String pedidos() {
        StringBuilder sb = new StringBuilder();
        for (Articulo articulo : articulos) {
            if (articulo.getExistencias() < 5) {
                sb.append(articulo.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
