package unidad6.ud08hoja01ej01;

import java.util.List;

/**
 *
 * @author DAM104
 */
public interface Repository<T> {
    public List<T> listar();
    public boolean guardar(T t);
    public boolean modificar(T t, int n);
    public T porId( int id);
    public boolean eliminar( int id);
}
