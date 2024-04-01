package unidad6.ud06hoja03ej02;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Taller {
    private LinkedList<FichaVehiculo> enEspera;
    private LinkedList<FichaVehiculo> reparados;
    private LinkedList<FichaVehiculo> finalizados;

    public Taller() {
        enEspera = new LinkedList<>();
        reparados = new LinkedList<>();
        finalizados = new LinkedList<>();
    }

    public void insertarVehiculo(FichaVehiculo vehiculo) {
        vehiculo.setFechaEntrada(LocalDateTime.now());
        enEspera.add(vehiculo);
    }

    public void repararVehiculo(String matricula) {
        for (FichaVehiculo vehiculo : enEspera) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setFechaReparacion(LocalDateTime.now());
                reparados.add(vehiculo);
                enEspera.remove(vehiculo);
            } else {
                System.out.println("No se ha encontrado un coche con esa matricula");
            }
        }
    }

    public void darSalidaVehiculo(String matricula) {
        for (FichaVehiculo vehiculo : reparados) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setFechaSalida(LocalDateTime.now());
                finalizados.add(vehiculo);
                reparados.remove(vehiculo);
            } else {
                System.out.println("No se ha encontrado un coche con esa matricula");
            }
        }
    }

    public String mostrarEstado() {
        StringBuilder estado = new StringBuilder();
        estado.append("Vehículos en espera:\n");
        for (FichaVehiculo vehiculo : enEspera) {
            estado.append(vehiculo.toString()).append("\n");
        }
        estado.append("Vehículos reparados:\n");
        for (FichaVehiculo vehiculo : reparados) {
            estado.append(vehiculo.toString()).append("\n");
        }
        estado.append("Vehículos finalizados:\n");
        for (FichaVehiculo vehiculo : finalizados) {
            estado.append(vehiculo.toString()).append("\n");
        }
        return estado.toString();
    }
}
