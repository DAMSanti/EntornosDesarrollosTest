package utiliades.utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Santiago Tamayo
 */

public class Utilidades {

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
                System.out
                        .println("La longitud de la cadena debe ser entre " + longitudMinima + " y " + longitudMaxima);
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
                System.out.println("Error: Expresión regular inválida. Introduce una expresión regular correcta.");
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
                    System.out.println(
                            "La longitud de la cadena debe ser entre " + longitudMinima + " y " + longitudMaxima);
                } else if (!input.matches(expresionRegular)) {
                    System.out.println("La cadena no cumple con la expresión regular");
                } else {
                    valido = true;
                }
            } catch (PatternSyntaxException e) {
                System.out.println("Error: Expresión regular inválida. Introduce una expresión regular correcta.");
            }
        } while (!valido);
        return input;
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

    public static int leerInt(String mensaje, int valorMinimo, int valorMaximo, boolean soloNumerosPositivos) {
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

    ///////////////////////////////////////////////////////////////////
    ///////////////// INTRODUCCION DE NUMEROS DECIMALES ///////////////
    ///////////////////////////////////////////////////////////////////

    public static double leerDouble() {
        Scanner teclado = new Scanner(System.in);
        try {
            return teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número decimal");
            teclado.nextLine();
            return leerDouble();
        }
    }

    public static double leerDouble(String mensaje) {
        System.out.println(mensaje);
        return leerDouble();
    }

    public static double leerDouble(String mensaje, double valorMinimo, double valorMaximo) {
        double input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerDouble();
            if (input < valorMinimo || input > valorMaximo) {
                System.out.println("El número debe estar entre " + valorMinimo + " y " + valorMaximo);
            } else {
                valido = true;
            }
        } while (!valido);
        return input;
    }

    public static double leerDouble(String mensaje, boolean soloNumerosPositivos) {
        double input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerDouble();
            if (soloNumerosPositivos && input <= 0) {
                System.out.println("El número debe ser positivo");
            } else {
                valido = true;
            }
        } while (!valido);
        return input;
    }

    public static double leerDouble(String mensaje, double valorMinimo, double valorMaximo,
            boolean soloNumerosPositivos) {
        double input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerDouble();
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

    ///////////////////////////////////////////////////////////////////
    ///////////////// INTRODUCCION DE CARACTERES //////////////////////
    ///////////////////////////////////////////////////////////////////

    public static char leerChar() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next().charAt(0);
    }

    public static char leerChar(String mensaje) {
        System.out.println(mensaje);
        return leerChar();
    }

    public static char leerChar(String mensaje, char[] caracteresValidos) {
        char input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerChar();
            for (char c : caracteresValidos) {
                if (input == c && !valido) {
                    valido = true;
                }
            }
            if (!valido) {
                System.out.println("El caracter introducido no es válido");
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
    ///////////////// INTRODUCCION DE FECHAS //////////////////////////
    ///////////////////////////////////////////////////////////////////
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", new
    /////////////////////////////////////////////////////////////////// Locale("es",
    /////////////////////////////////////////////////////////////////// "ES")); //
    /////////////////////////////////////////////////////////////////// Para meses
    /////////////////////////////////////////////////////////////////// en español
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static LocalDate leerFecha() {
        Scanner teclado = new Scanner(System.in);
        String fechaStr = teclado.next();
        try {
            return LocalDate.parse(fechaStr);
        } catch (DateTimeParseException e) {
            System.out.println("Error: Formato de fecha inválido. Introduce una fecha en el formato correcto.");
            return leerFecha();
        }
    }

    public static LocalDate leerFecha(String mensaje) {
        System.out.println(mensaje);
        return leerFecha();
    }

    public static LocalDate leerFecha(String mensaje, DateTimeFormatter formatoFecha) {
        String input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerString();
            try {
                LocalDate.parse(input, formatoFecha);
                valido = true;
            } catch (DateTimeParseException e) {
                System.out.println("Error: Formato de fecha inválido. Introduce una fecha en el formato correcto.");
            }
        } while (!valido);
        return LocalDate.parse(input, formatoFecha);
    }

    public static LocalDate leerFechaAnterior() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaIngresada = leerFecha();
        while (fechaIngresada.isAfter(fechaActual)) {
            System.out.println("Error: La fecha ingresada debe ser anterior a la fecha actual. Inténtalo de nuevo.");
            fechaIngresada = leerFecha();
        }
        return fechaIngresada;
    }

    public static LocalDate leerFechaAnterior(String mensaje) {
        System.out.println(mensaje);
        return leerFechaAnterior();
    }

    public static LocalDate leerFechaAnterior(String mensaje, DateTimeFormatter formatoFecha) {
        String input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerString();
            try {
                LocalDate fechaIngresada = LocalDate.parse(input, formatoFecha);
                LocalDate fechaActual = LocalDate.now();
                if (fechaIngresada.isAfter(fechaActual)) {
                    System.out.println(
                            "Error: La fecha ingresada debe ser anterior a la fecha actual. Inténtalo de nuevo.");
                } else {
                    valido = true;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Error: Formato de fecha inválido. Introduce una fecha en el formato correcto.");
            }
        } while (!valido);
        return LocalDate.parse(input, formatoFecha);
    }

    ///////////////////////////////////////////////////////////////////
    ///////////////// INTRODUCCION DE HORAS ///////////////////////////
    ///////////////////////////////////////////////////////////////////

    public static String leerHora() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    public static String leerHora(String mensaje) {
        System.out.println(mensaje);
        return leerHora();
    }

    public static String leerHora(String mensaje, DateTimeFormatter formatoHora) {
        String input;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            input = leerString();
            try {
                formatoHora.parse(input);
                valido = true;
            } catch (DateTimeParseException e) {
                System.out.println("Error: Formato de hora inválido. Introduce una hora en el formato correcto.");
            }
        } while (!valido);
        return input;
    }

    /////////////////////////////////////////////////
    ///////////////// VALIDACIONES //////////////////
    /////////////////////////////////////////////////

    public static boolean validarDNI(String dni) {
        boolean valido = false;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (dni.length() == 9) {
            char letra = dni.charAt(8);
            int num = Integer.parseInt(dni.substring(0, 8));
            int resto = num % 23;
            if (letra == letras.charAt(resto)) {
                valido = true;
            }
        }
        return valido;
    }

    public static boolean validarMatricula(String matricula) {
        String letras = matricula.substring(5, 7);
        String letrasPermitidas = "[BCDFGHJKLMNPRSTVWXYZ]+{3}";
        if (letras.matches(letrasPermitidas)) {
            return true;
        }
        return false;
    }

    public static boolean validarCuenta(String cc) {
        String tmpentidad = cc.substring(0, 4);
        String tmpoficina = cc.substring(5, 9);
        String tmpcontrol = cc.substring(10, 12);
        String tmpcuenta = cc.substring(13, 23);
        return tmpcontrol.equals(calculaControl(tmpentidad, tmpoficina, tmpcuenta));
    }

    public static String calculaControl(String entidad, String oficina, String cuenta) {
        int[] factores = { 1, 2, 4, 8, 5, 10, 9, 7, 3, 6 };
        int dc = 0;
        for (int i = 0; i < 2; i++) {
            String parte = (i == 0) ? "00" + entidad + oficina : cuenta;
            int suma = 0;

            for (int j = 0; j < 10; j++) {
                suma += Character.getNumericValue(parte.charAt(j)) * factores[j];
            }

            int resto = 11 - (suma % 11);
            if (resto == 10) {
                resto = 1;
            }
            if (resto == 11) {
                resto = 0;
            }
            if (i == 0) {
                dc = 10 * resto;
            } else {
                dc = dc + resto;
            }
        }
        return String.valueOf(dc);
    }

    public static boolean validarCodigoPostal(String cp) {
        return Integer.parseInt(cp.substring(0, 2)) <= 52;
    }

}

/*
 * Expresiones regulares útiles:
 * 
 * Coincidir con cualquier carácter: .
 * 
 * Coincidir con cualquier número: \d
 * 
 * Coincidir con cualquier letra (mayúscula o minúscula): [a-zA-Z]
 * 
 * Coincidir con una dirección de correo electrónico:
 * ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$
 * 
 * Coincidir con una URL:
 * ^(http|https|ftp)://[a-zA-Z0-9.-]+(\.[a-zA-Z]{2,6})?(:[0-9]{2,5})?(/.*)?$
 * 
 * Coincidir con una fecha en formato YYYY-MM-DD: ^\d{4}-\d{2}-\d{2}$
 * 
 * Coincidir con un número de teléfono de 10 dígitos: ^\d{10}$
 * 
 * Coincidir con una cadena de texto que contenga solo letras y números, y que
 * tenga entre 6 y 16 caracteres de longitud: ^[a-zA-Z0-9]{6,16}$
 * 
 */