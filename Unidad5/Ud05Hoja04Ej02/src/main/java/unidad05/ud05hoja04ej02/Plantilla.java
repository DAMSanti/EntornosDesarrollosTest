package unidad05.ud05hoja04ej02;

import java.util.Arrays;

/**
 *
 * @author DAM104
 */
public class Plantilla {
    Empleado[] trabajadores;
    int contEmpleados;
    
    public Plantilla() {
        trabajadores = new Empleado[100];
        contEmpleados = 0;
    }
    
    public void insertar(Empleado empleado) {
        trabajadores[contEmpleados++] = empleado;
    }
    
    public void muestraPlantilla() {
        for (int i = 0; i < contEmpleados; i++) {
            System.out.println(trabajadores[i].toString());
        }
    }
}
