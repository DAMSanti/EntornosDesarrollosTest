package examen05.bombillas;

/**
 *
 * @author DAM104
 */
public class LaDelMain {
    public static void main(String[] args) {
        Bombillas b1 = new Bombillas();
        b1.Luce();
        b1.Interruptor();
        b1.Luce();
        Bombillas.InterruptorMaster();
        b1.Luce();
    }
}
