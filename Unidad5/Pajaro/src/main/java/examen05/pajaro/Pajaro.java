package examen05.pajaro;

/**
 *
 * @author DAM104
 */
public class Pajaro {
    private String color;
    private int edad;
    private static int numPajaros = 0;
    
    public Pajaro() {
        Pajaro.nuevoPajaro();
    }
    
    public Pajaro(String color, int edad) {
        this.color = color;
        this.edad = edad;
        Pajaro.nuevoPajaro();
        Pajaro.muestraPajaro();
    }
    
    private static void nuevoPajaro() {
        ++numPajaros;
    }
    
    public static void muestraPajaro() {
        System.out.println("Existen " + numPajaros + " en la base de datos.");
    }
    
    public static void main(String[] args) {
        Pajaro p1 = new Pajaro("verde", 12);
    }
}




/*

1.- Define una clase Pájaro, con tres atributos: color, edad y numPajaros. Un constructor por
defecto y otro que se le permita pasar los valores de los atributos por parámetros, un método
nuevoPajaro que incremente el número de pájaros que se tienen y un método muestrapajaro
que imprima en pantalla el número de pájaros que se han creado.

*/
