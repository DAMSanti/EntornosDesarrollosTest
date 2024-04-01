package unidad6.ud06hoja04ej01;

/**
 *
 * @author rathm
 */
public class Pais {
    private String pais;

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public boolean equals(Object o) {
        boolean igual = false;
        if (this == o) {
            igual = true;
        }
        if (o == null || getClass() != o.getClass()) {
            igual = false;
        }
        Pais aux = (Pais) o;
        igual = pais.equalsIgnoreCase(aux.pais);
        return igual;
    }

    @Override
    public int hashCode() {
        return pais.toLowerCase().hashCode();
    }    
}
