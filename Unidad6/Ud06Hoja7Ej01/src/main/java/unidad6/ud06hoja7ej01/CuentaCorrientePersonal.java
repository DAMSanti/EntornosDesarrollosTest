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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void retirar(double cantidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
