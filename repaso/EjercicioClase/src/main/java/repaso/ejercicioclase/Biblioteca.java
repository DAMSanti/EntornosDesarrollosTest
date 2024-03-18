package repaso.ejercicioclase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 *
 * @author DAM104
 */
public class Biblioteca implements Identificable {
    
    private String nombre;
    private Libro[] coleccion;
    private int contLibros;
    private Usuario[] socios;
    private Prestamo[] prestamos;

    public Biblioteca(String nombre, int n) {
        this.nombre = nombre;
        this.coleccion = new Libro[n];
        this.socios = new Usuario[n];
        this.prestamos = new Prestamo[n];
        this.contLibros = 0;
    }

    public boolean agregaLibro(Libro libro) {
        boolean condicion = false;
        if (contLibros < coleccion.length) {
            coleccion[contLibros++] = libro;
            condicion = true;
        }
        return condicion;
    }
    
    public void agregaUsuario(Usuario user) {
        boolean condicion = false;
        for (int i = 0; i < socios.length && !condicion; i++) {
            if (socios[i] == null) {
                socios[i] = user;
                condicion = true;
                System.out.printf("Se ha añadido el usuario %s %s a la base de datos satisfactoriamente.\n", user.getNombre(), user.getApellido());
            }
        }
        if (!condicion) {
            System.out.println("No se ha podido añadir al usuario a la lista.");
        }
    }
    
    public void agregarPrestamo(Prestamo prestamo) {
        boolean condicion = false;
        for (int i = 0; i < prestamos.length && !condicion; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = prestamo;
                condicion = true;
                System.out.println("El prestamo ha sido registrado satisfactoriamente.");
                System.out.printf("El libro %s ha sido prestado a %s el dia %s\n", prestamo.getLibroprestado().getTitulo(), prestamo.getRecipiente().getNombre(), prestamo.getFechaPrestamo().format(DateTimeFormatter.ofPattern("dd MMM uuuu")));
            }
        }
        if (!condicion) {
            System.out.println("El prestamo no se ha podido realizar, se ha alcanzado el limite de prestamos simultaneos.");
        }
    }
      
    public boolean buscaUsuario(Usuario user) {
        boolean condicion = false;
        for (int i = 0; i < socios.length && !condicion; i++) {
            if (socios[i]!=null && socios[i].equals(user)) {
                condicion = true;
            }
        }
        return condicion;
    }

    public boolean buscaLibro(Libro libro) {
        boolean condicion = false;
        for (int i = 0; i < contLibros && !condicion; i++) {
            if (coleccion[i].equals(libro)) {
                condicion = true;
            }
        }
        return condicion;
    }

    public void prestar(Libro libro, Usuario user) {
        if (buscaUsuario(user)) {
            if (buscaLibro(libro)) {
                boolean prestado = false;
                for (int i = 0; i < prestamos.length && !prestado; i++) {
                    if (prestamos[i]!=null && prestamos[i].getLibroprestado().equals(libro) && prestamos[i].getFechaDevolucion()==null) {
                        prestado = true;
                    }
                }
                if (prestado) {
                    System.out.println("El libro ya ha sido prestado.");
                } else {
                    Prestamo p1 = new Prestamo(libro, user, LocalDate.now());
                    agregarPrestamo(p1);
                }
            } else {
                System.out.println("El libro no se encuentra en la biblioteca.");
            }
        } else {
            System.out.println("El usuario no es cliente de la biblioteca.");
        }
    }
    
    public void ordenar() {
        Arrays.sort(coleccion, 0, contLibros);
    }
        
    @Override
    public String imprime() {
        String info = "";
        ordenar();
        for (int i = 0; i < contLibros; i++) {
            info += coleccion[i].imprime();
        }
        for (int i = 0; i < socios.length; i++) {
            info += socios[i].toString();
        }
        for (int i = 0; i < prestamos.length; i++) {
            info += prestamos[i].toString();
        }
        return info;
    }
}
