package unidad05.ud05hoja03ej01;

/**
 *
 * @author DAM104
 */
public class Cilindro extends Figura{
    
    public Cilindro(float radio, float altura) {
        super(radio, altura);
    }
    
    public float area() {
        return (float) (((Math.PI*radio*2) * altura) + Math.PI*Math.pow(radio, 2));
    }
    
    public float volumen() {
        return (float) ((Math.PI*Math.pow(radio, 2))*altura);
    }
}
