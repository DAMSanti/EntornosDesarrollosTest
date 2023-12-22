package unidad04.ud04hoja05ej01;

/**
 *
 * @author DAM104
 */
public class Figura {
    private char[][] matriz;
    private char letra;
    
    public Figura(char letra, int n) {
        matriz = new char[n][n];
        this.letra = letra ;
    }
    
    public String cuadrado() {
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                cadena = cadena.concat(letra+" ");
            }
            cadena = cadena.concat("\n");
        }
        return cadena;
    }
    
    public String cuadradoVacio() {
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j==0 || j==matriz[i].length-1) {
                    cadena = cadena.concat(letra+" ");
                }else if (i==0 || i==matriz.length-1) {
                    cadena = cadena.concat(letra+" ");
                } else {
                    cadena = cadena.concat("  ");
                }
            }
            cadena = cadena.concat("\n");
        }
        return cadena;
    }
    
    public String aspa() {
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j) {
                    cadena = cadena.concat(letra+" ");
                } else if (i+j==matriz.length-1) {
                    cadena = cadena.concat(letra+" ");
                } else {
                    cadena = cadena.concat("  ");
                }
            }
            cadena = cadena.concat("\n");
        }
        return cadena;
    }
}




/*

1.- Diseñar una clase llamada Figura que tiene como atributos:

• un array bidimensional de tipo char llamado matriz

• un carácter llamado letra

Y los siguientes métodos:
• Un constructor que recibe como argumento un carácter y un número entero n
inicializa y dimensiona el array con los valores n X n.

• Un método llamado cuadrado que devuelve una cadena de texto que dibuja un
cuadrado relleno de n X n con el carácter especificado en letra y rellena matriz.

• Un método llamado cuadradoVacio que dibuja un cuadrado vacío (solo los laterales)

• Un método llamado aspa que dibuja un aspa ( X )

*/
