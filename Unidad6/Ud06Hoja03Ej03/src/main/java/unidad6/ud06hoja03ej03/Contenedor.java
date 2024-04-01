package unidad6.ud06hoja03ej03;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Santi
 */
class Contenedor {

    private String codigo;
    private String origen;
    private String fechaHoraAlmacenamiento;

    public Contenedor(String codigo, String origen, String fechaHoraAlmacenamiento) {
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

    public String getFechaHoraAlmacenamiento() {
        return fechaHoraAlmacenamiento;
    }

    public long getTiempoEnAlmacen() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime almacenamiento = LocalDateTime.parse(fechaHoraAlmacenamiento);
        Duration duration = Duration.between(almacenamiento, now);
        long tiempoEnAlmacen = duration.toDays();
        return tiempoEnAlmacen;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Origen: " + origen + ", Fecha y hora de almacenamiento: "
                + fechaHoraAlmacenamiento;
    }
}
