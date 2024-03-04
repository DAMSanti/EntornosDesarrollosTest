package unidad05.ud05hoja10ej01;

import java.util.Objects;

/**
 *
 * @author DAM104
 */
public abstract class Guerrero implements Comparable<Guerrero> {
    private String nombre;
    private int edad, fuerza;
    private boolean herido, muerto;
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int n) {
        this.edad = n;
    }
    
    protected static boolean comprobarEdad(int e) {
        return e>= 15 && e<=60;
    }
    
    protected static boolean comprobarFuerza(int f) {
        return f>=1 && f<=10;
    }
    
    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;
        if (comprobarEdad(edad)) {
            this.edad = edad;
        } else {
            this.edad = 25;
        }
        if (comprobarFuerza(fuerza)) {
            this.fuerza = fuerza;
        } else {
            this.fuerza = 5;
        }
        this.muerto = false;
        this.herido = false;
    }
    
    public Guerrero() {
        this("GuerreroX", 15, 1);
    }
    
    public Guerrero(Guerrero g1, String nombre) {
        this.nombre = nombre;
        this.edad = g1.edad;
        this.fuerza = g1.fuerza;
        this.muerto = false;
        this.herido = false;
    }
    
    public abstract boolean retirarse();
    
    public boolean getHerido() {
        return herido;
    }
    
    public boolean getMuerto() {
        return muerto;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public int compareTo(Guerrero guerrero) {
        int aux;
        if (this.fuerza == guerrero.fuerza) {
            aux = 0;
        } else if (this.fuerza < guerrero.fuerza) {
            aux = -1;
        } else {
            aux = 1;
        }
        return aux;
    }
}