package unidad6.ud06hoja06ej01;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author rathm
 */
public class Entrada {
    ///////////////////////////////////////////////////////////////////
    ////////////// INTRODUCCION DE CADENAS DE CARACTERES //////////////
    ///////////////////////////////////////////////////////////////////

    public static String leerString() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public static String leerString(String mensaje) {
        System.out.println(mensaje);
        String input = leerString();
        return input;
    }

    public static String leerString(String mensaje, int longitudMinima, int longitudMaxima) {
        String input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerString();
            if (input.length() < longitudMinima || input.length() > longitudMaxima) {
                System.out.println("La longitud de la cadena debe ser entre " + longitudMinima + " y " + longitudMaxima);
            } else {
                valido = true;
            }
        } while (!valido);
        return input;
    }

    public static String leerString(String mensaje, String expresionRegular) {
        String input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerString();
            try {
                if (!input.matches(expresionRegular)) {
                    System.out.println("La cadena no cumple con la expresión regular");
                } else {
                    valido = true;
                }
            } catch (PatternSyntaxException e) {
                System.out.println("Error: Expresión regular inválida.Introduce una expresión regular correcta.");
            }
        } while (!valido);
        return input;
    }

    public static String leerString(String mensaje, int longitudMinima, int longitudMaxima, String expresionRegular) {
        String input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerString();
            try {
                if (input.length() < longitudMinima || input.length() > longitudMaxima) {
                    System.out.println("La longitud de la cadena debe ser entre " + longitudMinima + " y " + longitudMaxima
                    );
                } else if (!input.matches(expresionRegular)) {
                    System.out.println("La cadena no cumple con la expresión regular");
                } else {
                    valido = true;
                }
            } catch (PatternSyntaxException e) {
                System.out.println(
                        "Error: Expresión regular inválida.Introduce una expresión regular correcta.");
            }
        } while (!valido);
        return input;
    }

    ///////////////////////////////////////////////////////////////////
    ///////////////// INTRODUCCION DE BOOLEANOS ///////////////////////
    ///////////////////////////////////////////////////////////////////
    public static boolean leerBoolean() {
        Scanner teclado = new Scanner(System.in);
        try {
            return teclado.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Introduce un valor booleano (true/false).");
            return leerBoolean();
        }
    }

    public static boolean leerBoolean(String mensaje) {
        System.out.println(mensaje);
        return leerBoolean();
    }

    ///////////////////////////////////////////////////////////////////
    ///////////////// INTRODUCCION DE NUMEROS ENTEROS /////////////////
    ///////////////////////////////////////////////////////////////////
    public static int leerInt() {
        Scanner teclado = new Scanner(System.in);
        try {
            return teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero");
            teclado.nextLine();
            return leerInt();
        }
    }

    public static int leerInt(String mensaje) {
        System.out.println(mensaje);
        return leerInt();
    }

    public static int leerInt(String mensaje, int valorMinimo, int valorMaximo) {
        int input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerInt();
            if (input < valorMinimo || input > valorMaximo) {
                System.out.println("El número debe estar entre " + valorMinimo + " y " + valorMaximo);
            } else {
                valido = true;
            }
        } while (!valido);
        return input;
    }

    public static int leerInt(String mensaje, boolean soloNumerosPositivos) {
        int input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerInt();
            if (soloNumerosPositivos && input <= 0) {
                System.out.println("El número debe ser positivo");
            } else {
                valido = true;
            }
        } while (!valido);
        return input;
    }

    public static int leerInt(String mensaje, int valorMinimo, int valorMaximo, boolean soloNumerosPositivos) {
        int input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerInt();
            if (input < valorMinimo || input > valorMaximo) {
                System.out.println("El número debe estar entre " + valorMinimo + " y " + valorMaximo);
            } else if (soloNumerosPositivos && input <= 0) {
                System.out.println("El número debe ser positivo");
            } else {
                valido = true;
            }
        } while (!valido);
        return input;
    }



}
