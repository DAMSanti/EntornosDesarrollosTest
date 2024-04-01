package unidad6.ud06hoja04ej01;

import java.util.HashSet;
import java.util.Set;

public class Mundo {
    private Set<String> paises;

    public Mundo() {
        paises = new HashSet<>();
    }

    public void agregarElemento(String pais) {
        paises.add(pais);
    }

    public void eliminarPais(String pais) {
        paises.removeIf(p -> p.equalsIgnoreCase(pais));
    }

    /*
     * public void eliminarPais(String pais) {
     * for (String p : paises) {
     * if (p.equalsIgnoreCase(pais)) {
     * paises.remove(p);
     * }
     * }
     * }
     */

    public void mostrarPaises() {
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
