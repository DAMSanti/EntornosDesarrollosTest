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
        if (saldo + maximoDescubierto >= cantidad ) {
            saldo -=cantidad;
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }
}
