package unidad4.ud04hoja01ej01;

/**
 *
 * @author Santi
 */
public class Ud04hoja01ej01 {

    public static void main(String[] args) {
        int[] numeros = {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2};
        for (int i=0; i<=numeros.length-1; i++) {
            System.out.println(numeros[i]);
        }        
        for (int i=0; i<=numeros.length-1; i++) {
            numeros[i] = -1;
        }
        for (int i=0; i<=numeros.length-1; i++) {
            System.out.println(numeros[i]);
        }   
        for (int i=0; i<=numeros.length-1; i++) {
            numeros[i] = (int) Math.floor(Math.random()*10);
        }
        for (int i=0; i<=numeros.length-1; i++) {
            System.out.println(numeros[i]);
        }   
    }
}
