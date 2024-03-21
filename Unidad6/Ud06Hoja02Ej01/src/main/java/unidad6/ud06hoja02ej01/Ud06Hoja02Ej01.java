package unidad6.ud06hoja02ej01;

import java.util.ArrayList;

/**
 *
 * @author DAM104
 */
public class Ud06Hoja02Ej01 {

    public static void main(String[] args) {
        ArrayList<Integer> valores = Teclado2.leeValores();
        int suma = Teclado2.calcularSuma(valores);
        double media = suma / (double) valores.size();
        Teclado2.mostrarResultados(valores, suma, media);
    }
}