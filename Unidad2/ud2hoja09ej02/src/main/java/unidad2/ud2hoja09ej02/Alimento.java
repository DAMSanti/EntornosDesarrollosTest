package unidad2.ud2hoja09ej02;

/**
 *
 * @author dam1
 */
public class Alimento {

    String nombre;
    int grasas, hidratos;
    boolean origenAnimal;

    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getGrasas() {
        return this.grasas;
    }

    public int gethidratos() {
        return this.hidratos;
    }

    public boolean getOrigenAnimal() {
        return this.origenAnimal;
    }

    public String showDatos() {
        return String.format("Nombre: %s \nGrasas: %d gr.\nHidratos: %d gr.\nOrigen Animal: %b", this.nombre, this.grasas, this.hidratos, this.origenAnimal);
    }

    public boolean esDietetico() {
        return this.grasas < 12 && !this.origenAnimal;
    }

    public float calorias(float gramos) {
        return (float) (gramos * (this.grasas * 5.3 + hidratos * 2.1));
    }
}
