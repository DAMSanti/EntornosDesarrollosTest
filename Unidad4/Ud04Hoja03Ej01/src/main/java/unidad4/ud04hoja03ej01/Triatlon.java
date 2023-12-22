package unidad4.ud04hoja03ej01;

import java.util.Scanner;

/**
 *
 * @author Santi
 */

public class Triatlon {
    private final int dorsal;
    private final String nombre;
    private final int[] resultados;
    Scanner teclado = new Scanner(System.in);

    public Triatlon(int dorsal, String nombre, int pruebas) {
        this.dorsal=dorsal;
        this.nombre=nombre;
        this.resultados = new int[pruebas];
        for (int i = 0; i < resultados.length; i++) {
            System.out.print("[" + this.nombre + "][" + (i+1) + "/" + resultados.length + "] Introduce la puntuación de la prueba: ");
            resultados[i]=teclado.nextInt();
        }
        System.out.println("");
    }
    
    public Triatlon() {
        System.out.print("Introduce el nombre del atleta:");
        this.nombre=teclado.nextLine();
        System.out.print("Introduce su dorsal:");
        this.dorsal=teclado.nextInt();
        System.out.print("Introduce en cuantas pruebas ha participado:");
        this.resultados = new int[teclado.nextInt()];
        System.out.println("Puntuacion de las pruebas:");
        for (int i = 0; i < resultados.length; i++) {
            System.out.print("[" + this.nombre + "][" + (i+1) + "/" + resultados.length + "] Introduce la puntuación de la prueba: ");
            resultados[i]=teclado.nextInt();
        }        
        System.out.println("");
    }
    
    public double pMedia() {
        double media = 0;
        for (int i = 0; i < resultados.length; i++) {
            media += resultados[i];
        }
        return media /= resultados.length;
    }
    
    public boolean esSeleccionado() {
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] > 10) {
                return true;
            }
        }
        return false;
    }
    
    public String mostrar() {
        double media = 0;
        String notas = "";
        for (int i = 0; i < resultados.length; i++) {
            media += resultados[i];
            notas = notas.concat(String.valueOf(resultados[i])).concat(",");
        }
        notas = notas.substring(0, notas.length()-1);
        media /= resultados.length;
        return String.format("Dorsal=%d Nombre=%s Puntos=%s Media=%,.2f", dorsal, nombre, notas, media);
    }

    public int getDorsal() {
        return dorsal;
    }
    
    
}



/*

1.- Diseñar una clase llamada Triatlon, con los atributos: dorsal, nombre y un array con las
puntuaciones enteras de las diferentes pruebas Y los métodos:


• Un constructor que recibe como argumentos el dorsal, el nombre del atleta y el número
de pruebas, inicializa los datos con los valores pasados como argumentos, dimensiona
el array y pide las puntuaciones por teclado.


• Otro constructor sin argumentos que pide todos los datos por teclado


• Un método llamado pMedia que devuelve la puntuación media de todas las pruebas


• Un método llamado esSelecionado que devuelve verdadero si al menos en alguna
prueba ha alcanzado una puntuación superior a 10 y falso en caso contrario.


• Un método llamado mostrar que devuelve una cadena de texto con los datos del atleta
seguido de sus puntos y su puntuación media. Ejemplo: Dorsal=13 Nombre=Juan
Puntos= 2, 12, 6, 7, 10 Media=7.4


Desde el método principal crear un objeto de tipo Triatlon y probar todos los métodos de la
clase.

*/