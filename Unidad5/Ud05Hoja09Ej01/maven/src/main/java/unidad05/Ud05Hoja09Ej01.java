package unidad05;

public class Ud05Hoja09Ej01 {
    public static void main(String[] args) {
        try {
            throw new Exception("Excepcion generada manualmente");
        } catch (Exception e) {
            System.out.println("\033[31m" + "ERROR: " + "\033[0m" + e.getMessage());
        } finally {
            System.out.println("Pasó por finally");
        }
    }
}

/*
 * 
  1.- Cree una clase con un método main() que genere un objeto de la clase Exception dentro de
un bloque try. Proporcione al constructor de Exception un argumento String. Capture la
excepción dentro de una cláusula catch e imprima el argumento String. Añada una cláusula
finally e imprima un mensaje para demostrar que pasó por allí.
 * 
 */