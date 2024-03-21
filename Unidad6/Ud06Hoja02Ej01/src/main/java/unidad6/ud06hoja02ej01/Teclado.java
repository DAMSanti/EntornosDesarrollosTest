package unidad6.ud06hoja02ej01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Teclado {
    private static Scanner teclado = new Scanner(System.in);

    public static <T> T leerDato(Class<T> tipoDato, String mensaje, boolean soloPositivos) {
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

     public static ArrayList<Integer> leeValores() {
        ArrayList<Integer> valores = new ArrayList<>();
        int valor;
        do {
            valor = Teclado.leerDato(Integer.class, "Introduce un numero entero positivo, introduce -99 para finalizar", false);
            if (valor != -99 && valor>=0) {
                valores.add(valor);
            } else if (valor<0 && valor != -99) {
                System.out.println("Los numeros deben ser positivos, introduce -99 para finalizar");
            }
        } while (valor != -99);
        return valores;
    }   

    public static int calcularSuma(ArrayList<Integer> valores) {
        int suma = 0;
        Iterator<Integer> iterator = valores.iterator();
        while (iterator.hasNext()) {
            suma += iterator.next();
        }
        return suma;
    }
 
    public static void mostrarResultados(ArrayList<Integer> valores, int suma, double media) {
        System.out.println("Número de valores leídos: " + valores.size());
        valores.forEach(System.out::println);
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Media aritmética: " + media);
        int count = 0;
        for (int valor : valores) {
            if (valor > media) {
                count++;
            }
        }
        System.out.println("Número de valores mayores que la media: " + count);
    }    
}
