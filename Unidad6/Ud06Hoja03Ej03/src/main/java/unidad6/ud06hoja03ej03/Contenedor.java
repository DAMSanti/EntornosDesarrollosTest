package unidad6.ud06hoja03ej03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Santi
 */
class Contenedor {

    private String codigo;
    private String origen;
    private LocalDateTime fechaHoraAlmacenamiento;

    public Contenedor(String codigo, String origen, LocalDateTime fechaHoraAlmacenamiento) {
        this.codigo = codigo;
        this.origen = origen;
        this.fechaHoraAlmacenamiento = fechaHoraAlmacenamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public LocalDateTime getFechaHoraAlmacenamiento() {
        return fechaHoraAlmacenamiento;
    }

    public long getTiempoEnAlmacen() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime almacenamiento = this.fechaHoraAlmacenamiento;
        Duration duration = Duration.between(almacenamiento, now);
        long tiempoEnAlmacen = duration.toDays();
        return tiempoEnAlmacen;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return "Código: " + codigo + ", Origen: " + origen + ", Fecha y hora de almacenamiento: "
                + fechaHoraAlmacenamiento.format(formatter);
    }
}
