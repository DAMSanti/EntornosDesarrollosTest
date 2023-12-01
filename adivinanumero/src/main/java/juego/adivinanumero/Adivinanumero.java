package juego.adivinanumero;

//////////////////////////////////////////////////////////////////////////////////
/////////               Santiago Manuel Tamayo Arozamena                 /////////
/////////                            DAM 1                               /////////
/////////                        Programación                            /////////
/////////                    Examen de Programacion                      /////////
//////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Adivinanumero {

    public static void main(String[] args) {
        int intento, trys = 0, numero = (int) Math.round(Math.random()*999);
        boolean gana = false;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ADIVINA UN NUMERO!!");
        
        while (!gana) {
           System.out.println("Introduce un numero del 1 al 1000: ");
            intento = teclado.nextInt(); 
            
            gana = intento == numero ;
            trys++;
            
            if ( intento < numero && !gana ) {
                System.out.println("El numero que buscas es MAYOR que " + intento);
            }
            else {
                System.out.println("El numero que buscas es MENOR que " + intento);
            }
        }
        
        System.out.println("\n\n\nGANASTE!! Solo te llevo " + trys + " intentos.");
    }
}
