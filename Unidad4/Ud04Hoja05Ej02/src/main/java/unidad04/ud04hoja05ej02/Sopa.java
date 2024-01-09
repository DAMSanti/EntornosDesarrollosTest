package unidad04.ud04hoja05ej02;

/**
 *
 * @author DAM104
 */
public class Sopa {
    private char[][] sopa;
    
    public Sopa() {
        sopa = new char[10][20];
    }
    
    public Sopa(int filas, int columnas) {
        sopa = new char[filas][columnas];
    }
    
    public void inicializar() {
        char letra = 0;
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                letra = (char) Math.floor(Math.random()*26+65);
                sopa[i][j] = letra;
            }
        }
        System.out.println("--Matriz inicializada--\n");
    }
    
    public void mostrar() {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j]);
            }
            System.out.println("");
        }
    }
    
    public void setPalabra(String palabra, int x, int y, int d) {
        if (d!=1) {
            if (palabra.length()>sopa.length-x) {
                System.out.println("Ha habido un problema, la palabra introducida es mayor que el espacio disponible");
            } else {
                for (int i = 0; i < palabra.length(); i++) {
                    sopa[i+x-1][y-1] = palabra.charAt(i);
                }
            }
        } else {
            if (palabra.length()>sopa[x].length-y) {
                System.out.println("Ha habido un problema, la palabra introducida es mayor que el espacio disponible");
            } else {
                for (int i = 0; i < palabra.length(); i++) {
                    sopa[x-1][i+y-1] = palabra.charAt(i);
                }
            }            
        }
    }
}


/*

2.- Diseñar la clase Sopa que almacenará un array de char, cuyas dimensiones se definirán en
el constructor.
Tendrá los siguientes constructores:
• public Sopa() // constructor por defecto, creará una sopa de 10x20
• public Sopa(int filas, int columnas)//crea una sopa de filas*columnas
Y los siguientes métodos:
• public void mostrar()// que muestra la sopa de letras.
• public void setPalabra(String palabra, int x, int y, int D); que añadirá a partir de la
casilla (x,y) la palabra especificada en la dirección horizontal si D es 1 o posición
vertical si D es -1
Por ejemplo: s.setPalabra("GUADIANA",1,17,-1); dejará la matriz con el siguiente aspecto:

*/