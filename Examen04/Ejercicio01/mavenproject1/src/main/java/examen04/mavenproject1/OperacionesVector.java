package examen04.mavenproject1;

//////////////////////////////////////////////////////////////////////////////////
///////// Santiago Manuel Tamayo Arozamena                               /////////
///////// DAM 1                                                          /////////
///////// Programación                                                   /////////
///////// Examen de Programacion                                         /////////
/////////////////////////////////////////////////////////////////////////////////

public class OperacionesVector {
    private int[] vector;
    
    public OperacionesVector(int[] v) {
        vector = new int[v.length];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = v[i];
        }
    }
    
    public void mostrar() {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            if (i!=vector.length-1) {
                System.out.print(vector[i] + " - ");
            } else {
                System.out.print(vector[i]);
            }
        }
        System.out.print(" ]\n");
    }
    
    public void encontrarPrimo() {
        boolean salir = false ;
        for (int i = 0; i < vector.length && !salir; i++) {
            int prim = 0;
            for (int j = vector[i]-1; j > 1; j--) {
                if (vector[i]%j==0) {
                    prim += 1;
                }
            }
            if ( prim == 0 ) {
                System.out.println(vector[i] + " es el primer numero primo encontrado.");
                salir = true ;
            }
        }
        if (salir == false ) {
            System.out.println("No hay ningun numero primo en el vector");
        }
    }
    
    public void invertirVector() {
        for (int i = 0; i < vector.length/2; i++) {
            int j = vector.length-i-1;
            int aux = vector[i];
            vector[i] = vector[j];
            vector[j] = aux; 
        }
    }
    
    public void divisores(int num) {
        int cont = 0;
        for (int i = num; i > 0; i--) {
            if (num%i==0) {
                vector[cont] = i;
                cont++;
            }
        }
        if (cont<vector.length) {
            for (int i = cont; i < vector.length; i++) {
                vector[i] = 0 ;
            }
        }

    }
}
