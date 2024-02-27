package unidad05.ud05hoja09ej03;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja09Ej03 {

    public static void main(String[] args) {
        int[] array = new int[3];
        
        try {
            array[5] = 7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se intenta acceder a una direccion de array que no existe.");
        }
    }
}
