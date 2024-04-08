package unidad6.ud06hoja04ej01;

import java.util.HashSet;
import java.util.Set;

public class Mundo {

    private Set<String> paises;

    public Mundo() {
        paises = new HashSet<>();
    }

    public void agregarElemento(String pais) {
        if (paises.add(pais)) {
            System.out.println("Elemento insertado de forma correcta");
        } else {
            System.out.println("No se ha podido insertar el pais");
        }
    }

    /*
    public void eliminarPais(String pais) {
        paises.removeIf(p -> p.equalsIgnoreCase(pais));
    }
     */
    public void eliminarPais(String pais) {
        for (String p : paises) {
            if (p.equalsIgnoreCase(pais)) {
                if (paises.remove(p)) {
                    System.out.println("Elemento borrado de forma correcta");
                } else {
                    System.out.println("No se ha podido borrar el pais.");
                }

            }
        }
    }

    public void mostrarPaises() {
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
