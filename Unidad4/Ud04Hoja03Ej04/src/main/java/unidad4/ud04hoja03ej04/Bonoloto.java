package unidad4.ud04hoja03ej04;

import java.util.Arrays;

/**
 *
 * @author Santi
 */
public class Bonoloto {
    private final int[] boleto = new int[6];
    
    public Bonoloto() {
        for (int i = 0; i < boleto.length; i++) {
            boleto[i] = (int) Math.floor(Math.random()*49+1);
            for (int j = i; j >= 0; j--) {
                if (boleto[j]==boleto[i] && i!=j) {
                    i--;
                }
            }
        }
        Arrays.sort(boleto);
    }
    
    public String mostrar() {
        String nums = "";
        for (int i = 0; i < boleto.length; i++) {
            nums = nums.concat(String.valueOf(boleto[i])).concat(" ");
        }
        return nums;
    }
}






/*


4.- Diseñar una clase llamada Bonoloto que tiene como atributo privado un array numérico
entero de 6 elementos y los siguientes métodos


• un constructor que inicializa el array con 6 números aleatorios distintos comprendidos
entre 1 y 49.


• un método llamado mostrar que devuelva una cadena de texto que muestre el
contenido del array.
Nota: No se pueden repetir los números.


*/