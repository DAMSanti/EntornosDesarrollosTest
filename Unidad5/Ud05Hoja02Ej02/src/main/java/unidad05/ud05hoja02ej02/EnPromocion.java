package unidad05.ud05hoja02ej02;

/**
 *
 * @author DAM104
 */
public class EnPromocion extends Articulo{
    private double descuento;
    
    public EnPromocion(String nombre, String descripcion, double precio, double descuento) {
        super(nombre, descripcion, precio);
        this.descuento = descuento;
    }
    
    @Override
    public String toString() {
        return super.toString().concat(String.format("Descuento: %,.2f%%\nPrecio Final: %,.2f€\n-----------------", descuento, super.precio-super.precio*descuento/100));
    }

    public static EnPromocion mayorDescuento(Articulo[] lista) {
        EnPromocion aux, max = new EnPromocion("","",0,0);
        for (int i = 0; i < lista.length; i++) {
            aux = (EnPromocion) lista[i];
            if (aux.descuento>max.descuento) {
                max = aux ;
            }
        }
        return max;
    }
        
}
