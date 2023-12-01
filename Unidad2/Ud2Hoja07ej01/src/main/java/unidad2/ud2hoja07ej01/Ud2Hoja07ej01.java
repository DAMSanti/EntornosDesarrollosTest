package unidad2.ud2hoja07ej01;

/**
 *
 * @author dam1
 */
public class Ud2Hoja07ej01 {

    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        Rectangulo rect2 = new Rectangulo(8,4);
        System.out.println("El 2º rectangulo tiene " + rect2.getLargo()+ " de largo por " + rect2.getAncho() + " de ancho.");
        rect.setAncho(2);
        rect.setLargo(3);
        System.out.println("El 1º rectangulo tiene " + rect.getLargo()+ " de largo por " + rect.getAncho() + " de ancho.");
        System.out.println("El area del primer rectangulo es " + rect.area() + " unidades cuadradas.");
        System.out.println("La longitud de la diagonal del segundo rectangulo es " + rect2.diagonal() + " unidades.");
    }
}
