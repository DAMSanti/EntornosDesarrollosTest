package unidad6.ud06hoja7ej01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author rathm
 */
public class Teclado {
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
                System.out.println("La longitud de la cadena debe ser entre " + longitudMinima + " y " + longitudMaxima);
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

    public static String leerString(String mensaje, int longitudMinima, int longitudMaxima, String expresionRegular) {
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
    ///////////////// INTRODUCCION DE FECHAS //////////////////////////
    ///////////////////////////////////////////////////////////////////
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", new Locale("es", "ES")); // Para meses en español 
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
                    System.out.println("Error: La fecha ingresada debe ser anterior a la fecha actual. Inténtalo de nuevo.");
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

    public static boolean validarCuenta(String cc) {
        String tmpentidad = cc.substring(0, 4);
        String tmpoficina = cc.substring(5, 9);
        String tmpcontrol = cc.substring(10, 12);
        String tmpcuenta = cc.substring(13, 23);
        return tmpcontrol.equals(calculaControl(tmpentidad, tmpoficina, tmpcuenta));
    }

    public static String calculaControl(String entidad, String oficina, String cuenta) {
        int[] factores = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
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

}
