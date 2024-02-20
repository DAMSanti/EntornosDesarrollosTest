package unidad05.ud05hoja06ej01;

/**
 *
 * @author DAM104
 */
public class DeDos implements Series {
    private int valor, anterior;
    
    public DeDos() {
        this.valor = inicio;
        this.anterior = this.valor - 2;
    }
    
    @Override
    public void getSiguiente() {
        int siguiente = this.valor + 2;
    }

    @Override
    public void reiniciar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setComenzar(int x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
