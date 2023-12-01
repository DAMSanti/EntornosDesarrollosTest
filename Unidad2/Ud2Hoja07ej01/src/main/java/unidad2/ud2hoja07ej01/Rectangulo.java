package unidad2.ud2hoja07ej01;

/**
 *
 * @author dam1
 */
public class Rectangulo {
    private int largo, ancho;
    
    public Rectangulo() {
        
    }
    
    public Rectangulo(int largo, int ancho) {
        this.largo=largo;
        this.ancho=ancho;
    }
    
    public int getLargo() {
        return this.largo;
    }
    
    public int getAncho() { 
        return this.ancho;
    }
    
    public void setLargo(int largo) {
        this.largo=largo;
    }
    
    public void setAncho(int ancho) {
        this.ancho=ancho;
    }
    
    public int area() {
        return this.largo*this.ancho;
    }
    
    public double diagonal() {
        return Math.sqrt(largo*largo+ancho*ancho);
    }
}
