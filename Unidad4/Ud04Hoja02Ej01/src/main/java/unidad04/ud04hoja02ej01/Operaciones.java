package unidad04.ud04hoja02ej01;

/**
 *
 * @author DAM104
 */
public class Operaciones {
    private int[] numeros = new int[5];
    
    public Operaciones(int n1, int n2, int n3, int n4, int n5) {
        numeros[0]=n1;
        numeros[1]=n2;
        numeros[2]=n3;
        numeros[3]=n4;
        numeros[4]=n5;
    }
    
    public void porDos() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]*=2;
        }
    }
    
    public void mostrar() {
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length-1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + "-");
            }
        }
        System.out.println("");
    }
    
    public void sumaPares() {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i%2==0) {
                suma += numeros[i]; 
            }
        }
        System.out.println(suma);
    }
}

/*

1.- Realizar una clase Operaciones que se componga de:
• Un array como atributo de cinco elementos de tipo entero
• Constructor por defecto que solicite los valores correspondientes a cada elemento.
Y al menos los siguientes métodos:
• Método que multiplique cada elemento por dos.
• Método que muestre el contenido del array por pantalla
• Método que devuelva la suma de todos los elementos del array que se encuentran en
posiciones pares.
En el programa principal, prueba todos los métodos desarrollados.

*/