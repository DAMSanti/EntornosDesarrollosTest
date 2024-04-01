
package unidad6.ud06hoja03ej04;

import java.time.LocalDateTime;

/**
 *
 * @author Santi
 */
public class Cliente {
    private String nombre;
    private String telefono;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaAtendido;

    public Cliente(String nombre, String telefono) {
        try {
            if (nombre.length() < 3) {
                throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres");
            }
            if (telefono.length() != 9 || !telefono.matches("\\d+")) {
                throw new IllegalArgumentException("El teléfono debe tener 9 dígitos");
            }
            if (this.fechaEntrada == null || !this.fechaEntrada.toString().matches("\\d{4}-\\d{2}-\\d{2}")) {
                throw new IllegalArgumentException("La fecha de entrada no tiene el formato correcto (AAAA-MM-DD)");
            }
            this.nombre = nombre;
            this.telefono = telefono;
            this.fechaEntrada = LocalDateTime.now();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void setfechaAtendido(LocalDateTime fechaAtendido) {
        this.fechaAtendido = fechaAtendido;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public long tiempoEspera() {
        long tiempoEspera = -1;
        if (fechaAtendido != null) {
            tiempoEspera = fechaAtendido.getSecond() - fechaEntrada.getSecond();
        }
        return tiempoEspera;
    }
}
