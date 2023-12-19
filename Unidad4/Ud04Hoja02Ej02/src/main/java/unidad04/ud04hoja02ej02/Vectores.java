package unidad04.ud04hoja02ej02;

/**
 *
 * @author DAM104
 */
public class Vectores {
    private int[] numeros = new int[5];
    
    public Vectores(int n1, int n2, int n3, int n4, int n5) {
        numeros[0]=n1;
        numeros[1]=n2;
        numeros[2]=n3;
        numeros[3]=n4;
        numeros[4]=n5;        
    }
    
    public int menor() {
        int menor = 99999;
        for (int i = 0; i < numeros.length; i++) {
            menor = numeros[i] < menor ? numeros[i] : menor ;
        }
        return menor;
    }
    
    public int mayor() {
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            mayor = numeros[i] > mayor ? numeros[i] : mayor ;
        }
        return mayor;
    }
    
    public double media() {
        int media = 0;
        for (int i = 0; i < numeros.length; i++) {
            media += numeros[i];
        }
        return media /=numeros.length;
    }
}

/*

2.- Realizar una clase denominada Vectores que se componga:
• Un array de cinco elementos de tipo entero.
• Constructor que solicite al usuario los valores correspondientes a cada elemento.
• Método que devuelva el valor menor del array.
• Método que devuelva el valor mayor del array.
• Método que devuelva la media de todos los valores del array.
Haz un programa principal que pruebe todos los métodos probados.

*/