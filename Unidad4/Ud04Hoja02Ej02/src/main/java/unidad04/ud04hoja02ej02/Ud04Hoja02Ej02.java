package unidad04.ud04hoja02ej02;

/**
 *
 * @author DAM104
 */
public class Ud04Hoja02Ej02 {

    public static void main(String[] args) {
        Vectores vector = new Vectores();
        
        System.out.println("El numero mayor en el array es " + vector.menor());
        System.out.println("El numero menor en el array es " + vector.mayor());
        System.out.printf("La media de los valores del arrat es %,.2f", vector.media());
    }
}
