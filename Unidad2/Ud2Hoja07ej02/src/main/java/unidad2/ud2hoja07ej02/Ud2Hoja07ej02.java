package unidad2.ud2hoja07ej02;

/**
 *
 * @author dam1
 */
public class Ud2Hoja07ej02 {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo ( 4.5f, 4.5f, 6);
        System.out.println("Comprobacion de triangulo isosceles: " + t1.esIsosceles() );
        System.out.println("Comprobacion de triangulo equilatero: " + t1.esEquilatero() );
        System.out.println("El perimetro del triangulo es: " + t1.perimetro() );
    }
}
