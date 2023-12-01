package unidad2.ud02hoja08ej02;

/**
 *
 * @author dam1
 */

public class Libro {
    private String isbn, titulo, autor;
    
    public Libro(String isbn, String titulo, String autor) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;       
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn.length()==13 ? isbn : this.isbn ;
    }
    
    public String getIsbn() {
        return this.isbn;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return this.titulo;
    }  
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor() {
        return this.autor;
    }  
    
    public boolean esEspanol() {
        return isbn.substring(3, 5).contains("84");
    }
    
    public String getDatos() {
        return titulo.toUpperCase()
                .concat(" ")
                .concat(autor.toUpperCase().substring(0, 1)
                .concat(autor.toLowerCase().substring(1, autor.length())));
    }
}
