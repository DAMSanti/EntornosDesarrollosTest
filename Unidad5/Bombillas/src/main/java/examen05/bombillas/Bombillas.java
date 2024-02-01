package examen05.bombillas;

/**
 *
 * @author DAM104
 */
    public class Bombillas {
    private Luces interruptor;
    private static Luces master = Luces.OFF;
    
    public Bombillas() {
        this.interruptor = Luces.OFF ;
    }
    
    public void Interruptor() {
        if (this.interruptor == Luces.OFF ) {
            this.interruptor = Luces.ON;
        } else {
            this.interruptor = Luces.OFF;
        }
    }
    
    public static void InterruptorMaster() {
        //master = master == Luces.OFF ? Luces.ON : Luces.OFF;
        if (master == Luces.OFF ) {
            master = Luces.ON;
        } else {
            master = Luces.OFF;
        }
    }
    
    public void Luce() {
        if (master == Luces.ON && this.interruptor == Luces.ON) {
            System.out.println("La bombilla esta encendida!!");
        } else {
            System.out.println("La bombilla esta apagada");
        }
    }
}
