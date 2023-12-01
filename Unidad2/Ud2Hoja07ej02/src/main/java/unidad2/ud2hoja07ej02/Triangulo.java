package unidad2.ud2hoja07ej02;

/**
 *
 * @author dam1
 */
public class Triangulo {
    private float lado1, lado2, lado3;
    
    public Triangulo (float lado1, float lado2, float lado3) {
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    
    public boolean esIsosceles() {
        return lado1==lado2 || lado2==lado3 || lado3==lado1;
    }
    
    public boolean esEquilatero() {       
        return lado1==lado2 && lado2==lado3;
    }
    
    public float perimetro() {
        return lado1+lado2+lado3;
    }
}