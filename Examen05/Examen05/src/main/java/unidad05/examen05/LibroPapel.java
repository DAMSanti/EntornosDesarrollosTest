package unidad05.examen05;

/**
 * @Santiago M Tamayo Arozamena
 * @DAM1
 */

public class LibroPapel extends Libro {
    private int numeroPaginas;
    
    public LibroPapel() {
        super();
        this.numeroPaginas = Teclado.introduceEntero("Introduce el numero de paginas que tiene el libro: ");
    }
    
    public LibroPapel(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.numeroPaginas = paginas;
    }
    
    @Override
    public String imprime() {
        return super.imprime() + String.format("\n\tNº de PAGINAS: %d", numeroPaginas);
    }
}
