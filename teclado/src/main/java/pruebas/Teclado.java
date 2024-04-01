package pruebas;

import java.util.Scanner;
import java.util.Arrays;


/**
 * CLASE TECLADO CON GESTION DE EXCEPCIONES
 *
 */


public class Teclado {
    private static Scanner teclado = new Scanner(System.in);

    /*
     * Metodo para introducir datos de diferentes tipos por teclado, Ejemplos de uso:
     *  String frase = Teclado.leerDato(String.class, "Introduce un nombre", false);
     *  int numero = Teclado.leerDato(Integer.class, "Introduce un numero entero positivo", true);
     *  float decimal = Teclado.leerDato(Float.class, "Introduce un numero real", false);
     *  boolean condicion = Teclado.leerDato(Boolean.class, "true/false", true);
     * 
     *  TODO: Añadir soporte para otros tipos de datos, Añadir limitaciones para maximo y minimo valor(sobrecarga), 
     *  Añadir limitaciones para introduccion de texto.
     */

    public static  <T> T leerDato(Class<T> tipoDato, String mensaje, boolean soloPositivos) {
        System.out.print(mensaje + ": ");
        String dato = teclado.nextLine();
        T resultado = null;
        try {
            if (tipoDato == String.class) {
                if (dato.length() == 0) {
                    throw new IllegalArgumentException("La cadena no puede estar vacía.");
                }
                resultado = tipoDato.cast(dato);
            } else if (tipoDato == Integer.class) {
                int numero = Integer.parseInt(dato);
                if (soloPositivos && numero < 0) {
                    throw new IllegalArgumentException("Solo se permiten números positivos.");
                }
                resultado = tipoDato.cast(numero);
            } else if (tipoDato == Float.class) {
                float numero = Float.parseFloat(dato);
                if (soloPositivos && numero < 0) {
                    throw new IllegalArgumentException("Solo se permiten números positivos.");
                }
                resultado = tipoDato.cast(numero);
            } else if (tipoDato == Boolean.class) {
                boolean valorBooleano = Boolean.parseBoolean(dato);
                if (!dato.equalsIgnoreCase("true") && !dato.equalsIgnoreCase("false")) {
                    throw new IllegalArgumentException("El valor ingresado no es un booleano válido.");
                }
                resultado = tipoDato.cast(valorBooleano);
            } else {
                throw new IllegalArgumentException("Tipo de dato no soportado.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un valor válido para el tipo de dato " + tipoDato.getSimpleName());
            resultado = leerDato(tipoDato, mensaje, soloPositivos);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            resultado = leerDato(tipoDato, mensaje, soloPositivos);
        }
        return resultado;
    }

    /*
     * Metodo para la gestion de arrays, Ejemplos de uso:
     *  Teclado.imprimirArray(array);
     *  TIPO maximo = Teclado.encontrarMaximo(array);
     *  TIPO minimo = Teclado.encontrarMinimo(array);
     *  TIPO[] arrayInvertido = Teclado.invertirArray(array);
     *  TIPO[] arrayOrdenado = Teclado.ordenarArray(array);
     *  TIPO[] nuevoArray = Teclado.agregarAlPrincipio(array, elemento);
     *  TIPO[] nuevoArray = Teclado.agregarAlFinal(array, elemento);
     *  TIPO[] nuevoArray = Teclado.quitarDelPrincipio(array);
     *  TIPO[] nuevoArray = Teclado.quitarDelFinal(array);
     *  TODO: Añadir soporte para encontrar mas de 1 en el maximo y el minimo.. ejemplo encuentra los 3 mayores. 
     */

    public static void imprimirArray(T[] array) <T> {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (NullPointerException e) {
            System.out.println("Error: El array es nulo.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static T encontrarMaximo(T[] array) T extends Comparable<T> {
        try {
            T maximo = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(maximo) > 0) {
                    maximo = array[i];
                }
            }
            return maximo;
        } catch (NullPointerException e) {
            System.out.println("Error: El array es nulo.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static T encontrarMinimo(T[] array) T extends Comparable<T> {
        try {
            T minimo = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(minimo) < 0) {
                    minimo = array[i];
                }
            }
            return minimo;
        } catch (NullPointerException e) {
            System.out.println("Error: El array es nulo.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static T[] invertirArray(T[] array) <T> {
        try {
            T[] arrayInvertido = Arrays.copyOf(array, array.length);
            for (int i = 0; i < array.length / 2; i++) {
                T temp = arrayInvertido[i];
                arrayInvertido[i] = arrayInvertido[array.length - 1 - i];
                arrayInvertido[array.length - 1 - i] = temp;
            }
            return arrayInvertido;
        } catch (NullPointerException e) {
            System.out.println("Error: El array es nulo.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static T[] ordenarArray(T[] array) <T> {
        try {
            T[] arrayOrdenado = Arrays.copyOf(array, array.length);
            Arrays.sort(arrayOrdenado);
            return arrayOrdenado;
        } catch (NullPointerException e) {
            System.out.println("Error: El array es nulo.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del array.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public static T[] agregarAlPrincipio(T[] array, T elemento) {
        try {
            T[] nuevoArray = Arrays.copyOf(array, array.length + 1);
            System.arraycopy(array, 0, nuevoArray, 1, array.length);
            nuevoArray[0] = elemento;
            return nuevoArray;
        } /*catch (NullPointerException e) {
            System.out.println("Error: El array es nulo.");
        }*/
    }

    public static T[] agregarAlFinal(T[] array, T elemento) {
        try {
            T[] nuevoArray = Arrays.copyOf(array, array.length + 1);
            nuevoArray[array.length] = elemento;
            return nuevoArray;
        }/* catch (NullPointerException e) {
            System.out.println("Error: El array es nulo.");
        }*/
    }

    public static T[] quitarDelPrincipio(T[] array) {
        try {
            T[] nuevoArray = Arrays.copyOfRange(array, 1, array.length);
            return nuevoArray;
        }/* catch (NullPointerException e) {
            System.out.println("Error: El array es nulo.");
        }*/
    }

    public static T[] quitarDelFinal(T[] array) {
        try {
            T[] nuevoArray = Arrays.copyOf(array, array.length - 1);
            return nuevoArray;
        }/* catch (NullPointerException e) {
            System.out.println("Error: El array es nulo.");
        }*/
    }
}