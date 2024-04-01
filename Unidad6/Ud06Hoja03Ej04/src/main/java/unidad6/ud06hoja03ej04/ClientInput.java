package unidad6.ud06hoja03ej04;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santi
 */

public class ClientInput {
    private List<Cliente> clientes;

    public ClientInput() {
        clientes = new ArrayList<>();
    }

    public void addClient(Cliente cliente) {
        clientes.add(cliente);
    }

    public void atenderCliente(Cliente cliente) {
        cliente.setfechaAtendido(LocalDateTime.now());
    }

    public double tiempoEsperaMedioNoAtendidos() {
        long tiempoEsperaTotal = 0;
        int clientesNoAtendidos = 0;
        for (Cliente cliente : clientes) {
            if (cliente.tiempoEspera() == -1) {
                tiempoEsperaTotal += ChronoUnit.SECONDS.between(cliente.getFechaEntrada(), LocalDateTime.now());
                clientesNoAtendidos++;
            }
        }
        return clientesNoAtendidos == 0 ? -1 : (double) tiempoEsperaTotal / clientesNoAtendidos;
    }

    public long tiempoEsperaMedio() {
        long tiempoEsperaTotal = 0;
        int clientesAtendidos = 0;
        for (Cliente cliente : clientes) {
            if (cliente.tiempoEspera() != -1) {
                tiempoEsperaTotal += cliente.tiempoEspera();
                clientesAtendidos++;
            }
        }
        return clientesAtendidos == 0 ? -1 : tiempoEsperaTotal / clientesAtendidos;
    }

}
