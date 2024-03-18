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
}
