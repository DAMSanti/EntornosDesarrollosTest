package repaso.ejercicioclase;

import java.time.LocalDate;

/**
 *
 * @author DAM104
 */
public class EjercicioClase {

    public static void main(String[] args) {
        /*
        Usuario usu1 = new Usuario("Santiago", "Tamayo");
        Usuario usu2 = new Usuario("Santiago", "Tamayo");
        if (usu1.equals(usu2)) {
            System.out.println("Son iguales!!!");
        } else {
            System.out.println("No son iguales!!!");
        }
        System.out.println("Aunque si les comparas mal... ¬¬");
        if (usu1==usu2) {
            System.out.println("Son iguales!!");
        } else {
            System.out.println("No son iguales!!!");
        }
        System.out.println("Nunca son iguales!!");
        
        LibroElectrónico l1 = new LibroElectrónico();
*/
        Biblioteca biblio = new Biblioteca("BibliotecaDAM01", 5);
        
        LibroElectrónico l1 = new LibroElectrónico();
        Usuario u1 = new Usuario("Santi", "Tamayo");
        
        LibroElectrónico l2 = new LibroElectrónico("El dia de mañana", "Ignacio Martinez de Pison", 0.5f);
        LibroElectrónico l3 = new LibroElectrónico("El vagon de mujeres", "Anita Nair", 12.0f);
        Usuario u2 = new Usuario("María", "Gonzalez");
        Usuario u3 = new Usuario("Ignacio", "Alvarez");
        
        biblio.agregaLibro(l1);
        biblio.agregaLibro(l2);
        biblio.agregaLibro(l3);
        biblio.agregaUsuario(u1);
        biblio.agregaUsuario(u2);
        biblio.agregaUsuario(u3);
        
        LibroElectrónico lno = new LibroElectrónico("Donde fuimos invencibles", "Maria Oruña", 2.2f);
        Usuario uno = new Usuario("Alfredo", "Gomez");
        biblio.prestar(l1, u1);
          
        System.out.println("No tengo ni el libro ni el usuario");
        biblio.prestar(lno, uno);
        System.out.println("No tengo el usuario pero si el libro");
        biblio.prestar(l1, uno);
        System.out.println("Presto un libro ya prestado");
        biblio.prestar(l1, u2);

        System.out.println(biblio.imprime());
        
        biblio.devolver(l1, u1);
        biblio.devolver(l2, u3);
        

       /* 
        biblio.eliminarLibro(l3);
        biblio.eliminarLibro(lno);

        biblio.mostrarTamano(0.4f);
*/
    }
}
