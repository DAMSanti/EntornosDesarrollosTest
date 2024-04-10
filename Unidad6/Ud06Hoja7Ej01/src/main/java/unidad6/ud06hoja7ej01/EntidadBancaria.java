package unidad6.ud06hoja7ej01;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author rathm
 */
public class EntidadBancaria {
    private Map<String, CuentaBancaria> cuentas;
    
    public EntidadBancaria() {
        cuentas = new HashMap();
    }
    
    public boolean introducir(CuentaBancaria cuenta) {
        boolean valido = false ;
        try {
            if (!cuentas.containsKey(cuenta.getCCC())) {
                cuentas.put(cuenta.getCCC(), cuenta);
                valido = true;
            }
        } catch (Exception e) {
            System.out.println("Ha habido un problema");
        }
        return valido;
    }
    
    public void mostrarCuentas() {
        for (HashMap.Entry<String, CuentaBancaria> entry : cuentas.entrySet()) {
            System.out.println("Clave = " + entry.getKey() + ", Valor = " + entry.getValue());
        }
    }
}
