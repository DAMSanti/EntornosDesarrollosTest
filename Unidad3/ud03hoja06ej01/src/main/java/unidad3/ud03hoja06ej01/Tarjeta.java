package unidad3.ud03hoja06ej01;

/**
 *
 * @author Santi
 */
public class Tarjeta {
    private final String NOMBRE;
    private final long CUENTA;
    private int pin;
    private boolean estado;
    private float saldo;
    
    public Tarjeta(String NOMBRE, long CUENTA, float saldo) {
        this.NOMBRE=NOMBRE;
        this.CUENTA=CUENTA;
        this.saldo=saldo;
        this.pin=(int)Math.random()*10000;
        this.estado=false;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public long getCUENTA() {
        return CUENTA;
    }

    public int getPin() {
        return pin;
    }

    public boolean isEstado() {
        return estado;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void desbloquea(int pin) {
        if ((pin==this.pin) && (!this.estado)) {
            this.estado = true ;
            System.out.println("Tarjeta activada");
        } else if (this.estado){
            System.out.println("La tarjeta ya esta activada");
        } else {
            System.out.println("El PIN introducido no es correcto");
        }        
    }
    
    public void pagar(float importe, int pin, String descripcion, boolean propina) {
        if ((this.estado)) {
            if (this.pin==pin) {
                if ((propina) && (this.saldo>=importe*1.05)) {
                    this.saldo-=importe*1.05;
                } else if (this.saldo>=importe) {
                    this.saldo-=importe;
                }
                imprimirTicket(importe, descripcion, propina);
            } else {
                System.out.println("El PIN introducido no es correcto.");
            }
        } else {
            System.out.println("La tarjeta no esta activada, activa la tarjeta primero");
        }
    }
    
    private void imprimirTicket(float importe, String descripcion, boolean propina) {
        System.out.println("\n====================================================================");
        System.out.println("Operacion realizada por:\t" + this.NOMBRE);
        System.out.println("Nº de Cuenta:\t\t\t" + (int) Math.floor(this.CUENTA/Math.pow(10,((int)(Math. log10(this.CUENTA)+1)-4))) + " **** **** ****");
        System.out.println("\nDescripción de la compra: \t" + descripcion.substring(0, 8));
        System.out.printf("Valor de la compra:\t\t%,.2f€\n", importe);
        double extra = propina ? importe*0.05 : 0;
        System.out.printf("Propina\t\t\t\t%,.2f€\n", extra );
        System.out.printf("TOTAL:\t\t\t\t%,.2f€\n", (importe+extra));
        System.out.println("====================================================================");
    }
}

