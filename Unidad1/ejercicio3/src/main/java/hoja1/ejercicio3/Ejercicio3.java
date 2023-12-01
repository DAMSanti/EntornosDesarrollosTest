package hoja1.ejercicio3;
import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////           Santiago Manuel Tamayo Arozamena                                    //////////
/////////                       DAM 1 2023                                              //////////
/////////                      Programación                                             //////////
/////////     Tarea de definición de variables y asignación de valores                  //////////
//////////////////////////////////////////////////////////////////////////////////////////////////

public class Ejercicio3 {

    public static void main(String[] args) {
        
        // Creamos objeto teclado
        Scanner teclado = new Scanner(System.in);
        int anonacimiento;
        int anoactual=2023;
        int resultado;
        
        System.out.print("Introduce tu año de nacimiento:");
        anonacimiento=teclado.nextInt();
        resultado=anoactual-anonacimiento;
        System.out.print("Tu edad es de " + resultado + " años");
        
    }
}
