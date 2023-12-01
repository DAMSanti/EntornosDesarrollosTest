package unidad2.ejerciciohuelga;

/**
 *
 * @author dam1
 */
public class SintonizadorFM {
    private double frecuencia;
    
    public SintonizadorFM() {
        frecuencia = 80;
    }
    
    /* public SintonizadorFM(double frecuencia) {
    
        if (frecuencia > 108) {
            this.frecuencia = 108;
        }
        else if (frecuencia < 80) {
            this.frecuencia = 80;
        }
        else {
            this.frecuencia = frecuencia;
        }
    } */
    
    public SintonizadorFM(double frecuencia) {
        this.frecuencia = frecuencia;
        this.frecuencia = this.frecuencia > 108 ? 108 : this.frecuencia;
        this.frecuencia = this.frecuencia < 80 ? 80 : this.frecuencia;
    }
    
    public SintonizadorFM(SintonizadorFM radio) {
        this.frecuencia = radio.frecuencia ;
    }
    
    /* public void subir() {
        if (frecuencia < 108) {
            frecuencia += 0.5;
        }
        else
            frecuencia = 80;
    } */
    
    public void subir() {
        frecuencia = frecuencia < 108 ? frecuencia + 0.5 : 80;
    } 
    
    /* public void bajar() {
        if (frecuencia > 80) {
            frecuencia -=0.5;
        }
        else
            frecuencia = 108;
    } */
    
    public void bajar() {
        frecuencia = frecuencia > 80 ? frecuencia - 0.5 : 108;
    } 
    
    public double display() {
        return frecuencia;
    }
    
}
