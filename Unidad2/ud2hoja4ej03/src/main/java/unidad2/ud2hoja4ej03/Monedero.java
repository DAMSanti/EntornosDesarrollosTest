package unidad2.ud2hoja4ej03;

/**
 *
 * @author dam1
 */
public class Monedero {

    private float money;
    
    public Monedero() {
        
    }
    
    public Monedero(float money) {
        this.money=money;
    }
    
    public void ingresar(float money) {
        this.money+=money;
    }
    
    public boolean retirar(float money) {
        boolean saldo;
        saldo=(this.money-money)>0;
        this.money= saldo==true ? this.money-money : this.money ;
        return saldo;
    }
    
    public float getSaldo() {
        return money;
    }
}
