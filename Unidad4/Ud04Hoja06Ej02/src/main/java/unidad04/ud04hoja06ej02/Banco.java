package unidad04.ud04hoja06ej02;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class Banco {
    private Cliente[] clientes;
    private int contcliente = 0;
    
    public Banco(int n) {
        this.clientes = new Cliente[n];
    }
    
    public void ingresar() {
        this.clientes[contcliente].setCodigo(contcliente);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del cliente: ");
        this.clientes[contcliente].setNombre(teclado.nextLine());
        teclado = new Scanner(System.in);
        System.out.println("Introduce los apellidos del cliente: ");
        this.clientes[contcliente].setApellidos(teclado.nextLine());
        System.out.println("Introduce el telefono del cliente: ");
        this.clientes[contcliente].setTelefono(teclado.nextLine());
        System.out.println("Introduce el saldo del cliente: ");
        this.clientes[contcliente].setSaldo(teclado.nextDouble());
                contcliente++;
    }
    
    public String buscar(int n) {
        String cadena = "";
        if (n>this.contcliente) {
            cadena = "No hay ningun cliente con este codigo.";
        } else {
            cadena = String.format("CODIGO: %d\nNOMBRE: %s\nAPELLIDOS: %s\nTELEFONO: %s\nSALDO: %,.2f", clientes[n].getCodigo(), clientes[n].getNombre(), clientes[n].getApellidos(), clientes[n].getTelefono(), clientes[n].getSaldo());
        }
        return cadena;
    }
    
    public void eliminar(int n) {
        if (n>this.contcliente) {
            System.out.println("No se puede eliminar un cliente que no existe.");
        } else {
            for (int i = n; i < this.contcliente-1; i++) {
                this.clientes[n] = this.clientes[n+1];
            }
            this.contcliente--;
        }
    }
    
    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < this.contcliente; i++) {
            
        }
    }
}


/*

2.- Diseñar una clase llamada Cliente formada por los atributos: código, nombre, apellidos,
teléfono y saldo junto con los métodos necesarios para su manipulación.
Otra clase, denominada Banco estará formada por un array de usuarios del banco y un contador
de usuarios de banco. Un constructor que introduce por parámetro el número máximo de
clientes de un banco inicializando a ese número los usuarios del banco. Métodos que permitan
ingresar un usuario (tendremos en cuenta que el código de usuario corresponde con el número
del usuario del banco) y el resto de los datos se piden por teclado, buscar un usuario devuelve
una cadena de texto con la información del usuario, eliminar un usuario y mostrar que nos
muestra la relación de los usuarios del banco. En los dos últimos métodos tendrán como
parámetro de entrada él código de usuario. Siempre controlando que no podemos sobrepasar
el número de usuarios del banco.
Crea en la clase principal un menú repetitivo con las siguientes opciones 1. Ingresar un cliente,
2. Mostrar los usuarios del banco, 3. Buscar un cliente – pediremos por teclado el código del
cliente a buscar, 4. Eliminar un cliente- pediremos por teclado el código del cliente a eliminar, 5.
Salir.

*/