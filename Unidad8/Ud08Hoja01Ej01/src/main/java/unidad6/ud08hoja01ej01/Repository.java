package unidad6.ud08hoja01ej01;

import java.util.List;

/**
 *
 * @author DAM104
 */
public interface Repository<T> {
    public List<T> listar();
    public void guardar(T t);
    public void modificar(T t);
    public void eliminar( int id);
}
