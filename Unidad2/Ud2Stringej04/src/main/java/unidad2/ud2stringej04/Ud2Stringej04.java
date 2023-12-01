/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unidad2.ud2stringej04;

/**
 *
 * @author dam1
 */
public class Ud2Stringej04 {

    public static void main(String[] args) {
        String frase = "Hola, me llamo Pepito";
        System.out.println(cortaCadena(frase));
    }
    
    public static String cortaCadena(String frase) {
        return frase.substring(0, frase.length()/2); 
    }
}
