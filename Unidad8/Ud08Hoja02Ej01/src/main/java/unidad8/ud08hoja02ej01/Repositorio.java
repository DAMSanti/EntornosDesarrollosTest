
package unidad8.ud08hoja02ej01;

import java.util.List;

/**
 *
 * @author rathm
 */
public interface Repositorio<T> {
    public List<T> listar(Object obj);
    public boolean crear(T t);
    public T buscar(String t);
}
