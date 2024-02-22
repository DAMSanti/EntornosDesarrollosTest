package unidad05.ud05hoja06ej01;

/**
 *
 * @author DAM104
 */
public class DeTres implements Series {
    private int valor;
    
    public DeTres() {
        this.valor = inicio;
    }
    
    @Override
    public void getSiguiente() {
        this.valor += 3;
    }

    @Override
    public void reiniciar() {
        this.valor = inicio;
    }

    @Override
    public void setComenzar(int x) {
        this.valor = x;
    }
    
}
