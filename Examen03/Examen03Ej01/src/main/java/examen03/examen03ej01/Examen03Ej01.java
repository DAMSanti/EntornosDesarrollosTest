/*El objetivo de este programa es simular una centralita telefonica que permite a los usuarios realizar llamadas, enviar mensajes,
consultar su saldo y salir del sistema.
*/

package examen03.examen03ej01;

import java.util.Scanner;

/**
 *
 * Santiago Manuel Tamayo Arozamena
 */

public class Examen03Ej01 {

    public static void main(String[] args) {
        Contrato contrato1 = new Contrato(0.15,0.05,25);
        Scanner teclado = new Scanner(System.in);
        int n;
        do {
            System.out.println("---- Centralita Telefónica ----");
            System.out.print("1.-Llamar\n2.-Enviar Mensaje\n3.-Ver Saldo\n4.-Salir\nSelecciona una opción (1-4): ");
            n = teclado.nextInt();
            switch(n){
                case 1->{
                    if (contrato1.getSaldo()>contrato1.getcostoLlamada()) {
                        contrato1.restarSaldo(contrato1.getcostoLlamada());
                        System.out.println("Llamando...");
                        System.out.println("Se ha restado " + contrato1.getcostoLlamada() + "€ de tu saldo");
                    }
                }
                case 2->{
                    if (contrato1.getSaldo()>contrato1.getcostoMensaje()) {
                        contrato1.restarSaldo(contrato1.getcostoMensaje());
                        System.out.println("Enviando Mensaje...");
                        System.out.println("Se ha restado " + contrato1.getcostoMensaje() + "€ de tu saldo");
                    }                    
                }
                case 3->{
                    System.out.printf("Tu saldo actual es de %,.2f\n", contrato1.getSaldo());
                }
                case 4->System.out.println("Saliendo del programa. ¡Hasta luego!");
                default ->System.out.println("La opción introducida no es correcta, intentelo otra vez.");
            }
        } while(n!=4);
    }
}
