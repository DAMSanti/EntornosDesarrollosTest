package unidad2.ud02hoja09ej01;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ud02hoja09ej01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Alarma a1 = new Alarma(27.8f);
        
        System.out.println("Introduce una temperatura: ");
        float temperatura=teclado.nextFloat();
        a1.setTemperatura(temperatura);
    }
}

