package unidad3.ud03hoja03ej01;

/**
 *
 * @author Santi
 */
public class Fondo {
    private final double C, I;
    private final int N;
    
    public Fondo(double C, double I, int N) {
        this.C = C ;
        this.I = I ;
        this.N = N ;
    }
    
    public void evolucion() { 
        int i = 1 ;
        double c = C;
        while (i<=N) {
            System.out.printf("Año %d:\n\tCapital invertido: %,.2f€\n\tIntereses anuales: %,.2f€\n\tCapital acumulado: %,.2f€\n\n",
                    i,
                    c,
                    c*I/100,
                    (c+(c*I/100*i)) );
            c=(c+(c*I/100*i));
            i++;
        }
    }
}
