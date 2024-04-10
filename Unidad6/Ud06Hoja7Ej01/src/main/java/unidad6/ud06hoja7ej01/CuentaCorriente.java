package unidad6.ud06hoja7ej01;

import java.time.LocalDate;

/**
 *
 * @author rathm
 */
public abstract class CuentaCorriente extends CuentaBancaria {
    private boolean siAutoriza;
    
    public CuentaCorriente(String nombre, String apellidos, LocalDate fechaNacimiento, double saldo, String ccc) {
        super(nombre, apellidos, fechaNacimiento, saldo, ccc);
        this.siAutoriza = true;
    }
}
