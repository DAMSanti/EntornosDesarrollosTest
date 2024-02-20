package unidad05.ud05hoja06ej01;

/**
 *
 * @author DAM104
 */
public interface Series {
    public int inicio = 0;
    
    public abstract void getSiguiente();
    
    public abstract void reiniciar();
    
    public abstract void setComenzar(int x);
    
    public default void mostrarInicio() {
        System.out.println("El valor de inicio es " + inicio);
    }
    
    public static void nombreInterfaz() {
        System.out.println("El nombre de la interfaz es Series");
    }
}
