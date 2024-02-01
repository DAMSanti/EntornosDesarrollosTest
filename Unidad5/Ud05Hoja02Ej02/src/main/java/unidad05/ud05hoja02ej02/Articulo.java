package unidad05.ud05hoja02ej02;

import java.util.Arrays;

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
        return String.format("-----------------\nARTICULO: %s\nDescripcion: %s\nPrecio: %,.2f€\n", codigo, descripcion, precio);
    }
    
    public static Articulo[] BuscaTipo(Articulo[] lista, int n) {
        Articulo[] busqueda = new Articulo[0];
        int cont = 0;
        if (n == 1) {
            System.out.println("\n--- ARTICULOS EN PROMOCION ---");
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] instanceof EnPromocion) {
                    busqueda=Arrays.copyOf(busqueda, cont+1);
                    busqueda[cont] = lista[i];
                    cont++;              
                }
            }            
        } else if (n == 2) {
            System.out.println("\n--- ARTICULOS PERECEDEROS ---");
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] instanceof Perecedero) {
                    busqueda=Arrays.copyOf(busqueda, cont+1);
                    busqueda[cont] = lista[i];
                    cont++;              
                }
            }            
        }
        return busqueda;
    }
}
