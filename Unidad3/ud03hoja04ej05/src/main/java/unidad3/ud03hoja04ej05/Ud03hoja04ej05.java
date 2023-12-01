package unidad3.ud03hoja04ej05;

/**
 *
 * @author Santi
 */
public class Ud03hoja04ej05 {

    public static void main(String[] args) {
        int cont = 0;
        int mayor = 0, menor = 100, n;
        while (cont<10) {
            n = (int) Math.floor((Math.random()*100)+1);
            System.out.printf("[%d] Numero %d\n", (cont+1), n );
            if (n>mayor) {
                mayor = n ;
            }
            else if (n<menor) {
                menor = n ;
            }
            cont++;
        }
        System.out.println("El mayor numero introducido ha sido el " + mayor + " años y la menor edad introducida ha sido de " + menor + " años.");
    }
}
