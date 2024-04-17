package unidad8.ud08hoja02ej01;

import java.time.LocalDateTime;

/**
 *
 * @author rathm
 */
public class Visita {
    private int id;
    private String dni;
    private LocalDateTime fecha;
    private Tratamiento tratamiento;
    private String observaciones;
    
    public Visita(String dni, LocalDateTime fecha, Tratamiento tratamiento, String observaciones ) {
        this.dni = dni;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    public String getDni() {
        return dni;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    
}
