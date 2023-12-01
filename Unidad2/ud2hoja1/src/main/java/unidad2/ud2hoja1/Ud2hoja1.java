package unidad2.ud2hoja1;

//////////////////////////////////////////////////////////////////////////////////
/////////               Santiago Manuel Tamayo Arozamena                 /////////
/////////                            DAM 1                               /////////
/////////                        Programación                            /////////
/////////                       Clases de Java                           /////////
//////////////////////////////////////////////////////////////////////////////////

public class Ud2hoja1 {

    public static void main(String[] args) {
        
        CajaAhorro cuenta1 = new CajaAhorro();
        cuenta1.depositar(1200);
        System.out.println("El saldo de su cuenta es de " + cuenta1.obtenerSaldo() + "€");
        cuenta1.girar(375);
        System.out.println("El saldo de su cuenta es de " + cuenta1.obtenerSaldo() + "€");
        System.out.println("Has realizado un total de " + cuenta1.obtenerTransacciones() + " transacciones");
      
        CajaAhorro cuenta2 = new CajaAhorro(200);
        System.out.println("El saldo de su cuenta es de " + cuenta2.obtenerSaldo() + "€ y ha realizado " + cuenta2.obtenerTransacciones() + " transacciones.");

    }
}
