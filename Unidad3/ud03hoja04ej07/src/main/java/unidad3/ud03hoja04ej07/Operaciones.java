package unidad3.ud03hoja04ej07;

/**
 *
 * @author Santi
 */
public class Operaciones {
    private final int n;
    
    public Operaciones (int n) {
        this.n = n;
    }
    
    public int cifras() {
        return (int)(Math. log10(this.n)+1);
    }
    
    public void divisor() {
        int cont = 0;
        System.out.print("Los 10 primeros divisores de " + this.n + " son: ");
        for (int i=(this.n-1); i>=1; i--) {
            if ((this.n%i==0) && (cont<10)) {
                System.out.print(i + " ");
                cont++;
            }
        }
        System.out.println("\n");
    }
    
    public boolean perfecto() {
        int suma = 0;
        for (int i=(this.n-1); i>=1; i--) {
            if (this.n%i==0) {
                suma += i ;
            }
        }
        if (suma==this.n) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getN() {
        return n;
    }
    
}
