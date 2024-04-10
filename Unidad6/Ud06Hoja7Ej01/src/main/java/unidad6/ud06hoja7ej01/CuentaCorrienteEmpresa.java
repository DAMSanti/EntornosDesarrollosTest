package unidad6.ud06hoja7ej01;

import java.time.LocalDate;

/**
 *
 * @author rathm
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    private double maximoDescubierto;
    public final static double MAX_DESCUBIERTO = 50000;
    
    public CuentaCorrienteEmpresa(String nombre, String apellidos, LocalDate fechaNacimiento, double saldo, String ccc, double maximoDescubierto) {
        super(nombre, apellidos, fechaNacimiento, saldo, ccc);
        this.maximoDescubierto = maximoDescubierto;
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
