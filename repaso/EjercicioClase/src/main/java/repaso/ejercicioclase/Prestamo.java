package repaso.ejercicioclase;

import java.time.LocalDate;

/**
 *
 * @author DAM104
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

    public Usuario getRecipiente() {
        return recipiente;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
