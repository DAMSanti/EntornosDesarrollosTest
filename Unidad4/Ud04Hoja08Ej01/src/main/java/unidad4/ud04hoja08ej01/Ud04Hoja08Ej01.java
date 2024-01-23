package unidad4.ud04hoja08ej01;

import static java.lang.Integer.parseInt;

/**
 *
 * @author DAM104
 */

public class Ud04Hoja08Ej01 {

    public static void main(String[] args) {
        if (args.length>0 && args.length<4) {
            int digitos = args[0].length();
            int numero = parseInt(args[0], 10);
            int resultado = 0;
            for (int i = 0; i < digitos; i++) {
                resultado += (int) Math.pow(parseInt(args[0].substring(i, i+1), 10), digitos);
            }
            if (resultado == numero) {
                System.out.printf("El numero %s es un numero Armstrong", numero);
            } else {
                System.out.println("No es un numero Armstrong");
            }
        } else {
            System.out.println("No se ha introducido ningun dato o el dato introducido es mayor de 3 digitos.");
        }
    }
}




/*

1.- Realiza un programa que, dado un número de tres cifras, averigüe si es un número
Armstrong. Un número es Armstrong cuando la suma de cada uno de los números que lo
componen elevado al número de dígitos de dicho número da como resultado el propio número.
Ejemplo: 153 = 1^3+5^3+3^3. El número se recibe como argumento del programa desde la línea
de comandos.

*/