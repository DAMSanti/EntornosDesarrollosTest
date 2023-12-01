package unidad1.ejercicio2;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////                Ejercicios de los apuntes                                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Ejercicio2 {
        public static void main(String[] args) {
            
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            int anonacimiento;
            int anoactual = 2023 ;
            
            // Entrada de datos            
            System.out.print("¿Cual es tu año de nacimiento? ");
            anonacimiento=teclado.nextInt();
            
            
            System.out.println("Tienes " + (anoactual-anonacimiento) );
                    
    }
}
