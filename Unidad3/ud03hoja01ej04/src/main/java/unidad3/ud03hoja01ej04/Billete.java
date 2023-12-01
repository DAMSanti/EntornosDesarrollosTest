package unidad3.ud03hoja01ej04;

/**
 *
 * @author dam1
 */
public class Billete {
    private double distancia;
    private int estancia;
    
    public Billete(double distancia, int estancia) {
        this.distancia = distancia ;
        this.estancia = estancia ;
    }
    
    public double importe() {
        if ((estancia > 7) && (distancia > 800)) {
            return (distancia*0.6)*0.7;
        }
        else {
            return (distancia*0.6);
        }
    }
}
