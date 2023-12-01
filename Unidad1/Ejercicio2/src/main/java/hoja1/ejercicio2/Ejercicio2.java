package hoja1.ejercicio2;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de definición de variables y asignación de valores                  //////////
//////////////////////////////////////////////////////////////////////////////////////////////////

public class Ejercicio2 {

    public static void main(String[] args) {
        
        // Creamos objeto teclado
        Scanner teclado = new Scanner(System.in);
        int edad;

        // Entrada de datos
        System.out.print("¿Cuantos años tienes? ");
        edad=teclado.nextInt();
        edad=++edad;
        System.out.print("El año que viene tu edad será de " + edad + " años.");      

    }
}
