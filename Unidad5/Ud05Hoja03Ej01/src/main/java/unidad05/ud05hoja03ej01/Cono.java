package unidad05.ud05hoja03ej01;

/**
 *
 * @author DAM104
 */
public class Cono extends Figura {
    
    public Cono(float radio, float altura) {
        super(radio, altura);
    }
    
    public float area() {
        return (float) (Math.PI*radio*(Math.sqrt((Math.pow(radio, 2)+Math.pow(altura, 2))+ Math.PI*Math.pow(radio, 2))));
    }
    
    public float volumen() {
        return (float) (((Math.PI*Math.pow(radio, 2))*altura)/3);
    }
}

/*

b) Clase Cono que desciende de la clase Figura y que está compuesta por un
constructor al que se le pasan los valores de radio y altura por parámetro, el método área que
calcula el área de un cono y el método volumen que calcula el volumen del cono.

*/
