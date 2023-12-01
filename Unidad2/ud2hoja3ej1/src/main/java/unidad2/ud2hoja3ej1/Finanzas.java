package unidad2.ud2hoja3ej1;

/**
 *
 * @author dam1
 */
public class Finanzas {
    private double cambio;
    
    public Finanzas() {
        cambio=0.95;
    }
    
    public Finanzas(double cambio) {
        this.cambio=cambio;
    }
    
    public double dolaresToEuros(double cantidad) {
        cantidad=cantidad/cambio;
        return cantidad;
    }
    
    public double eurosToDolares(double cantidad) {
        cantidad=cantidad*cambio;
        return cantidad;
    }
    
}
