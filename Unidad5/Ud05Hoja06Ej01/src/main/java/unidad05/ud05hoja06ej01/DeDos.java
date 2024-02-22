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
        this.anterior = this.valor;
        this.valor = this.valor + 2;
    }

    @Override
    public void reiniciar() {
        this.valor = inicio;
        this.anterior = this.valor - 2;
    }

    @Override
    public void setComenzar(int x) {
        this.valor = x;
        this.anterior = this.valor - 2;
    }
    
    public int getValor() {
        return this.valor;
    }
    
}
