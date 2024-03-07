package unidad05.examen05;

/**
 * @Santiago M Tamayo Arozamena
 * @DAM1
 */

public class LibroElectronico extends Libro {
    private float tamanoMB;
    
    public LibroElectronico() {
        super();
        this.tamanoMB = Teclado.introduceFloat("Introduce el peso del archivo del libro: ");
    }
    
    public LibroElectronico(String titulo, String autor, float tamano) {
        super(titulo, autor);
        this.tamanoMB = tamano;
    }

    public float getTamanoMB() {
        return tamanoMB;
    }
    
    @Override
    public String imprime() {
        return super.imprime() + String.format("\n\tFILE SIZE: %,.2fMb", tamanoMB);
    }    
}
