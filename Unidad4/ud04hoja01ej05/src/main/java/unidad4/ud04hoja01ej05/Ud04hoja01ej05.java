package unidad4.ud04hoja01ej05;

/**
 *
 * @author Santi
 */
public class Ud04hoja01ej05 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i=0; i<=numeros.length-1; i++) {
            numeros[i] = (int) Math.floor(Math.random()*10);
        }
        for (int i=0; i<=numeros.length-1; i++) {
            System.out.print(numeros[i]);
        }
        System.out.println();
        for (int i = 0; i < numeros.length/2; i++) {
                    int j = numeros.length-i-1;
                    int a = numeros[i];
                    int b = numeros[j];
                    numeros[i] = b;
                    numeros[j] = a;
        }
        for (int i=0; i<=numeros.length-1; i++) {
            System.out.print(numeros[i]);
        }               
    }
}
