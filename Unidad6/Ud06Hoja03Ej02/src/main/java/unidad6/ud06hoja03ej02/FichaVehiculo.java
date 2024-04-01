package unidad6.ud06hoja03ej02;

import java.time.LocalDateTime;

/**
 *
 * @author Santi
 */
public class FichaVehiculo {
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaReparacion;
    private LocalDateTime fechaSalida;
    private String modelo;
    private String matricula;

    public FichaVehiculo(String matricula, String modelo) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDateTime fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "FichaVehiculo{" +
                "fechaEntrada=" + fechaEntrada +
                ", fechaReparacion=" + fechaReparacion +
                ", fechaSalida=" + fechaSalida +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
