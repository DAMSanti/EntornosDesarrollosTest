package unidad05.examen05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Santiago M Tamayo Arozamena
 * @DAM1
 */

public class Prestamo {
    private Libro libroprestado;
    private Usuario recipiente;
    private LocalDate fechaPrestamo, fechaDevolucion;
    
    public Prestamo(Libro libro, Usuario user, LocalDate fecha) {
        this.libroprestado = libro;
        this.recipiente = user;
        this.fechaPrestamo = fecha;
    }

    public Libro getLibroprestado() {
        return libroprestado;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Usuario getRecipiente() {
        return recipiente;
    }
    
    public String toString() {
        return String.format("LIBRO PRESTADO: %s\nRECEPTOR DEL LIBRO: %s\n\tFECHA DE PRESTAMO: %s", libroprestado.imprime(), recipiente.toString(), fechaPrestamo.format(DateTimeFormatter.ofPattern("dd MMM uuuu")));
    }
}
