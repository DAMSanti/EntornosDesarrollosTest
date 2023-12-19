package examen03.examen03ej01;

/**
 *
 * Santiago Manuel Tamayo Arozamena
 */

public class Contrato {
    private double costoLlamada, costoMensaje, saldo;
    
    public Contrato(double costoLlamada, double costoMensaje, double saldo) {
        this.costoLlamada = costoLlamada;
        this.costoMensaje = costoMensaje;
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double getcostoLlamada() {
        return this.costoLlamada;
    }
    
    public double getcostoMensaje() {
        return this.costoMensaje;
    }
    
    public void restarSaldo(double cantidad) {
        this.saldo = this.saldo >= cantidad ? this.saldo-cantidad : this.saldo;
    }
}
