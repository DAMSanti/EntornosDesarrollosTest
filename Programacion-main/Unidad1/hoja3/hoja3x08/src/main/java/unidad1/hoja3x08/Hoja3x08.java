package unidad1.hoja3x08;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de input de información y utilización de datos                      //////////
////////////////////////////////////////////////////////////////////////////////////////////////// 

import javax.swing.JOptionPane;

    public class Hoja3x08 {
        public static void main(String[ ] args) {

            // Declaramos variables a utilizar
            String input;
            int entradainf, entradaadu;
            double precio;
            
            // Entrada de datos   
            input = JOptionPane.showInputDialog("Introduzca el numero de entradas infantiles");
            entradainf = Integer.parseInt(input);
            input = JOptionPane.showInputDialog("Introduzca el numero de entradas para adultos");
            entradaadu = Integer.parseInt(input);
            
            //Calculamos los resultados
            precio = entradainf*15.5+entradaadu*20;
            
            //Comprobamos si es superior a 100€
            
            precio = precio >= 100 ? precio * 0.95 : precio ;
            
            //if (precio >= 100) {
                //Aplicamos descuento
            //    precio = precio * 0.95 ;                
            //}
            
            //Presentacion del resultado
            System.out.println("\n\n\t   FACTURA\n");
            System.out.printf("Base Imponible:\t\t%,.2f €\n" , precio);
        }
    }