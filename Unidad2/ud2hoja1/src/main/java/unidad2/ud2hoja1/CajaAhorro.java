package unidad2.ud2hoja1;

//////////////////////////////////////////////////////////////////////////////////
/////////               Santiago Manuel Tamayo Arozamena                 /////////
/////////                            DAM 1                               /////////
/////////                        Programación                            /////////
/////////                       Clases de Java                           /////////
//////////////////////////////////////////////////////////////////////////////////

public class CajaAhorro {
    //Propiedades de la clase
    private int saldo;
    private int transacciones;

    //Constructores de la clase
    public CajaAhorro() {
        transacciones=0;
        saldo=0;
    }
    
    public CajaAhorro(int saldo) {
        this.saldo=saldo;
        transacciones = 1;
    }
    
    //Métodos de la clase
    public void depositar(int cantidad) {
        this.saldo+=cantidad;
        transacciones++;
    }
    
    public void girar(int cantidad) {
        this.saldo-=cantidad;
        transacciones++;
    }
    
    public int obtenerSaldo() {
        return saldo;
    }
    
    public int obtenerTransacciones() {
        return transacciones;
    }
}
