package unidad1.ejercicio6;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////                Ejercicios de los apuntes                                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Ejercicio6 {
        public static void main(String[] args) {
            
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            byte n;
            boolean condicion;
            
            // Entrada de datos            
            System.out.print("Introduce un numero ");
            n=teclado.nextByte();
            
            condicion = n%2 == 0 ;
            //if (n%2 == 0) {
            //    condicion=true;
            //}
            //else {
            //    condicion=false;
            //}
            
            System.out.println("¿Es par? " + condicion );
                    
    }
}
