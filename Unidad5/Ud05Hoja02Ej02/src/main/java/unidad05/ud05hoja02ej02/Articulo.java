package unidad05.ud05hoja02ej02;

/**
 *
 * @author DAM104
 */
public class Articulo {
    protected String codigo, descripcion;
    protected double precio;
    
    public Articulo (String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return String.format("ARTICULO: %s\nDescripcion: %s\nPrecio: %,.2f€\n", codigo, descripcion, precio);
    }
}
