package unidad05.ud05hoja04ej01;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public abstract class Publicacion {
    protected String titulo, autor;
    protected LocalDate fecha;
    
    public Publicacion(String titulo, String autor , int dia, int mes, int ano) {
        this.titulo = titulo ;
        this.autor = autor ;
        this.fecha = LocalDate.of(ano, mes, dia);
    }
    
    public abstract String toString();
    
    public static Publicacion creaPublicacion(int n) {
        Publicacion publi = null;
        Scanner teclado;
        System.out.println("Introduce el titulo de la publicacion: ");
        teclado = new Scanner(System.in);
        String titulo = teclado.nextLine();
        System.out.println("Introduce el autor de la publicacion: ");
        teclado = new Scanner(System.in);
        String autor = teclado.nextLine();
        System.out.println("Introduce el dia de publicacion: ");
        teclado = new Scanner(System.in);
        int dia = teclado.nextInt();
        System.out.println("Introduce el mes de publicacion: ");
        teclado = new Scanner(System.in);
        int mes = teclado.nextInt();
        System.out.println("Introduce el año de publicacion: ");
        teclado = new Scanner(System.in);
        int ano = teclado.nextInt();
        if (n==1) {
            System.out.println("Introduce la duracion del disco: ");
            teclado = new Scanner(System.in);
            int duracion = teclado.nextInt();
            publi = new Disco(titulo, autor, dia, mes, ano, duracion);
        } else if (n == 2) {
            System.out.println("Introduce las paginas del libro: ");
            teclado = new Scanner(System.in);
            int paginas = teclado.nextInt();
            publi = new Disco(titulo, autor, dia, mes, ano, paginas);
        }
        return publi;
    }
}
