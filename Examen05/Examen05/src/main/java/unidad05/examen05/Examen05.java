package unidad05.examen05;

import java.time.LocalDate;

/**
 * @Santiago M Tamayo Arozamena
 * @DAM1
 */

public class Examen05 {

    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("BibliotecaDAM01", 5);
        
        LibroElectronico l1 = new LibroElectronico();
        Usuario u1 = new Usuario();
        
        LibroElectronico l2 = new LibroElectronico("El dia de mañana", "Ignacio Martinez de Pison", 0.5f);
        LibroPapel l3 = new LibroPapel("El vagon de mujeres", "Anita Nair", 120);
        Usuario u2 = new Usuario("María", "Gonzalez");
        Usuario u3 = new Usuario("Ignacio", "Alvarez");
        
        biblio.agregaLibro(l1);
        biblio.agregaLibro(l2);
        biblio.agregaLibro(l3);
        biblio.agregaUsuario(u1);
        biblio.agregaUsuario(u2);
        biblio.agregaUsuario(u3);
        
        LibroElectronico lno = new LibroElectronico("Donde fuimos invencibles", "Maria Oruña", 2.2f);
        Usuario uno = new Usuario("Alfredo", "Gomez");
        biblio.prestar(l1, u1);
          
        System.out.println("No tengo ni el libro ni el usuario");
        biblio.prestar(lno, uno);
        System.out.println("No tengo el usuario pero si el libro");
        biblio.prestar(l1, uno);
        System.out.println("Presto un libro ya prestado");
        biblio.prestar(l1, u2);
        
        biblio.devolver(l1, u1);
        biblio.devolver(l2, u3);
        
        biblio.eliminarLibro(l3);
        biblio.eliminarLibro(lno);

        biblio.mostrarTamano(0.4f);
    }
}
