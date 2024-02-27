package unidad05.ud05hoja09ej05;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja09Ej05 {

    public static void main(String[] args) {
        System.out.println("VAMOS A JUGAR A UN JUEGO");
        int n = (int) Math.floor(Math.random()*500+1);
        int cont = 0;
        boolean acertado = false;
        while (!acertado) {
            int res = Integer.compare(n, Utils.introduceNumero(1, 500));
            if (res > 0) {
                System.out.println("El numero introducido es menor que el que queremos encontrar");
                cont++;
            } else if (res < 0 ) {
                System.out.println("El numero introducido es mayor que el que queremos encontrar");
                cont++;
            } else {
                System.out.println("HAS ADIVINADO EL NUMERO");
                acertado = true ;
                cont++;
                System.out.println("Lo has adivinado en " + cont + " intentos.");
            }              
        }

    }
}
