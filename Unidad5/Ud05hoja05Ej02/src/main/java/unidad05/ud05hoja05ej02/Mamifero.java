package unidad05.ud05hoja05ej02;

/**
 *
 * @author DAM104
 */
public class Mamifero {
    String raza, alimento;
    int npatas;
    
    public Mamifero(String raza, int npatas, String alimento) {
        this.raza = raza;
        this.npatas = npatas;
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + ", alimento=" + alimento + ", npatas=" + npatas + '}';
    }
    
}
