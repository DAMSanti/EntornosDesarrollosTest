package code.ejercicio1;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////                Ejercicios de los apuntes                                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Ejercicio1 {
        public static void main(String[] args) {
            
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            byte edad;
            
            // Entrada de datos            
            System.out.print("¿Cual es tu edad? ");
            edad=teclado.nextByte();
            
            ++edad;
            
            System.out.println("El año que viene tu edad será de " + edad );
                    
    }
}
