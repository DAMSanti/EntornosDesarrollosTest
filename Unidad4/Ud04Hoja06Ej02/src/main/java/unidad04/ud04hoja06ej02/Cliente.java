package unidad04.ud04hoja06ej02;

/**
 *
 * @author Santi
 */
public class Cliente {
    private int codigo;
    private String nombre, apellidos, telefono;
    private double saldo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSaldo() {
        return saldo;
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