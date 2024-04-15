package unidad6.ud06hoja7ej01;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rathm
 */
public abstract class CuentaBancaria implements Identificable {
    protected Persona titular;
    protected double saldo;
    private String entidad;
    private String oficina;
    private String cuenta;
    
    public CuentaBancaria(String nombre, String apellidos, LocalDate fechaNacimiento, double saldo, String ccc) {
        this.titular = new Persona(nombre, apellidos, fechaNacimiento);
        //boolean ccvalido = false;
        //String cc;
        //do {
        //    cc = Teclado.leerString("Introduce el numero de CC del cliente. (XXXX-XXXX-XX-XXXXXXXXXX)", 23, 23, "^[0-9]{4}-[0-9]{4}-[0-9]{2}-[0-9]{10}$");
        //    ccvalido = Teclado.validarCuenta(cc);
        //} while (!ccvalido);
        this.saldo = saldo;
        this.entidad = ccc.substring(0, 4);
        this.oficina = ccc.substring(5, 9);
        this.cuenta = ccc.substring(13, 23);
    }

    public abstract void ingresar(double cantidad) throws Exception;
    public abstract void retirar(double cantidad) throws Exception;

    @Override
    public Map<String, String> listaObjeto() {
        Map<String, String> cuenta = new HashMap<>();
        cuenta.put("Titular", titular.getNombre().concat(" ").concat(titular.getApellidos()));
        cuenta.put("Saldo", String.valueOf(saldo));
        cuenta.put("CCC", entidad.concat("-").concat(oficina).concat("-").concat(this.cuenta));
        return cuenta;
    }

    public String getCCC() {
        return this.entidad.concat(this.oficina).concat(Teclado.calculaControl(entidad, oficina, cuenta)).concat(cuenta);
    }
    
}
