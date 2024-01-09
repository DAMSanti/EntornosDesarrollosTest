package fechas.fechas01;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Letra {
    private int numLetra;
    private String titular;
    private double importe;
    private LocalDate fechaVencimiento;
    
    public Letra() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el nº de la letra a introducir: ");
        this.numLetra = teclado.nextInt();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca el nombre del titular de la letra: ");
        this.titular = teclado.nextLine();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca el importe de la letra: ");
        this.importe = teclado.nextDouble();
        teclado = new Scanner(System.in);
        System.out.print("Introduzca la fecha de vencimiento de la letra (En formato AAAA-MM-DD): ");
        String fecha = teclado.nextLine();
        fechaVencimiento = LocalDate.parse(fecha);
    }
    
    public boolean vencida() {
        return LocalDate.of(fechaVencimiento.getYear(), fechaVencimiento.getMonthValue(), fechaVencimiento.getDayOfMonth()).isBefore(LocalDate.now());
    }
    
    public void demora(int periodo) {
        fechaVencimiento = fechaVencimiento.plusDays(periodo);
    }
    
    public long diasFaltan() {
        return ChronoUnit.DAYS.between(LocalDate.now(), fechaVencimiento);
    }
    
    public void mostrar() {
        System.out.printf("Letra nº: %d\nTitular: %s\nImporte: %,.2f\nFecha de Vencimiento: %s\n", this.numLetra, this.titular, this.importe, this.fechaVencimiento);
    }
    
    public int devuelveMes() {
        return fechaVencimiento.getMonthValue();
    }
    
    public String getTitular() {
        return this.titular;
    }
}


/*

1.- Implementar una clase llamada Letra con los atributos: numLetra, titular, importe y
fechaVencimiento (de tipo LocalDate) y los siguientes métodos:
• Un constructor que pide los datos por teclado
• Un método llamado vencida que devuelve verdadero si la letra ha vencido y falso en
caso contrario
• Un método llamado demora que alarga en x días la fecha de una letra
• Un método llamado diasFaltan que devuelve el no de días que faltan para que una
letra venza
• Un método llamado mostrar que visualice los datos de una letra.
• Un método que devuelveMes que devuelve el mes de la letra.
• El método getTitular.
Realiza la prueba del programa creando un array de n-objetos de la clase Letra y:
• Mostrar los datos de todas las letras vencidas
• Demorar en 15 días el vencimiento de todas las letras que estén vencidas en enero.
Suponemos que todas las letras son del mismo año.
• Visualizar el titular y el no de días que faltan para que venzan las letras no vencidas.

*/