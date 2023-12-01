package unidad1.hoja3x06;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import java.util.Scanner;

    public class Hoja3x06 {
        public static void main(String[ ] args) {
            // Creamos objeto teclado
            Scanner teclado = new Scanner(System.in);
            
            // Declaramos variables a utilizar
            double milis, centis, metros; 
            
            // Entrada de datos            
            System.out.println("\n\tCONVERSION Y SUMA DE DISTANCIAS\n");
            System.out.print("Intoduce una distancia en milimetros: ");
            milis=teclado.nextDouble();
            System.out.print("Intoduce una distancia en centimetros: ");
            centis=teclado.nextDouble();
            System.out.print("Intoduce una distancia en metros: ");
            metros=teclado.nextDouble();

            //Calculo de resultados              
            centis = milis/10 + centis + metros*100 ;
                    
            //Presentacion del resultado
            System.out.printf("La distancia total es de: %,.2f centimetros", centis);

        }
    }