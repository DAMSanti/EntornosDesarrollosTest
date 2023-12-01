package unidad1.ejercicio9;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////                Ejercicios de los apuntes                                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Ejercicio9 {
        public static void main(String[] args) {
            
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            int n ;
            
            // Entrada de datos 
            System.out.print("Introduce un numero ");
            n=teclado.nextInt();

            n = n < 0 ? -n : n ;
            
            System.out.print("\nEl valor absoluto es " + n );
            
    }
}
