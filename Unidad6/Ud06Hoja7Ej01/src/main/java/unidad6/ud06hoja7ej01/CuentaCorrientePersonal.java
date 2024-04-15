package unidad6.ud06hoja7ej01;

import java.time.LocalDate;

/**
 *
 * @author rathm
 */
public class CuentaCorrientePersonal extends CuentaCorriente {
    private double comisionMantenimiento;
    public final static double MIN_COMISION_MANTENIMIENTO = 0;
    public final static double MAX_COMISION_MANTENIMIENTO = 30;
    
    public CuentaCorrientePersonal(String nombre, String apellidos, LocalDate fechaNacimiento, double saldo, String ccc, double comisionMantenimiento) {
        super(nombre, apellidos, fechaNacimiento, saldo, ccc);
        this.comisionMantenimiento = comisionMantenimiento;        
    }

    @Override
    public void ingresar(double cantidad) throws Exception {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new Exception("Cantidad negativa.");
        }
    }

    @Override
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("Cantidad negativa");
        }
        if (saldo >= cantidad ) {
            saldo -=cantidad;
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }

}
