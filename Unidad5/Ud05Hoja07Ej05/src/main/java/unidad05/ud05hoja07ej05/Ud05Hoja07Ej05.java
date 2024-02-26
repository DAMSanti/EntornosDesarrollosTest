package unidad05.ud05hoja07ej05;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja07Ej05 {

    public static void main(String[] args) {
        int num1 = Teclado.introduceEntero("Introduce el dividendo");
        int num2 = Teclado.introduceEntero("Introduce el divisor");
        
        try {
            Teclado.divide(num1, num2);
        } catch (ArithmeticException e ) {
            System.out.println("No se puede dividir por 0");
        }
    }
}
