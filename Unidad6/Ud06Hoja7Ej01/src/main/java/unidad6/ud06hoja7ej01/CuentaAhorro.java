package unidad6.ud06hoja7ej01;

import java.time.LocalDate;

/**
 *
 * @author rathm
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tipoInteres;
    public final static double MIN_TIPO_INTERES = 0.5;
    public final static double MAX_TIPO_INTERES = 8.5;
    
    public CuentaAhorro(String nombre, String apellidos, LocalDate fechaNacimiento, double saldo, String ccc, double tipoInteres) {
        super(nombre, apellidos, fechaNacimiento, saldo, ccc);
        this.tipoInteres = tipoInteres;
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
