package hoja1.ejercicio5;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de definición de variables y asignación de valores                  //////////
//////////////////////////////////////////////////////////////////////////////////////////////////

public class Ejercicio5 {

    public static void main(String[] args) {
        
        //Creamos un objeto teclado
        Scanner teclado = new Scanner(System.in);
        
        double nota1, nota2, media;
        
        System.out.print("Introduce la primera nota: ");
        nota1=teclado.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        nota2=teclado.nextDouble();
        
        media = (nota1 + nota2)/2 ;
        
        System.out.printf("La media es de %,.2f", media);
        
    }
}
