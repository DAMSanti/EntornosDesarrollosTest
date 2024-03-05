package unidad05.ud05hoja11ej06;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja11Ej06 {

    public static void main(String[] args) {
    }
    
    public static char caracterEn(String palabra, int n) throws Exception {
        char aux = 0;
        if (n>0 && n<=palabra.length()) {
            aux = palabra.charAt(n);
        } else {
            throw new Exception("Fuera de limites");
        }
        return aux;
    }
}
