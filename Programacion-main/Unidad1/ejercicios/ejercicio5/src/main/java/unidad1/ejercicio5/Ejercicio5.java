package unidad1.ejercicio5;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////                Ejercicios de los apuntes                                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Ejercicio5 {
        public static void main(String[] args) {
            
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            byte edad;
            boolean condicion;
            
            // Entrada de datos            
            System.out.print("¿Cual es tu edad? ");
            edad=teclado.nextByte();
            
            condicion = edad>=18;
            //if (edad >= 18) {
            //    condicion=true;
            //}
            //else {
            //    condicion=false;
            //}
            
            System.out.println("MAYOR DE EDAD: " + condicion );
                    
    }
}
