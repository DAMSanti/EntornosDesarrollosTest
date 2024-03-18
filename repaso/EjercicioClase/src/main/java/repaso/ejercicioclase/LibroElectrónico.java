package repaso.ejercicioclase;

/**
 *
 * @author DAM104
 */
public class LibroElectrónico extends Libro {
    float tamano;
    
    public LibroElectrónico() {
        super();
        Teclado.introduceFloat("Introduce el tamaño del libro: ");
    }
    
    public LibroElectrónico(String titulo, String autor, float tamano) {
        super(titulo, autor);
        this.tamano = tamano;
    }
    
    @Override
    public String imprime() {
        return super.imprime() + String.format("\n\tFILE SIZE: %,.2fMb", tamano);
    }    
}
