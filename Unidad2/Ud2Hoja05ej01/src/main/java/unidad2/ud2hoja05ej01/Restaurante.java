package unidad2.ud2hoja05ej01;

/**
 *
 * @author dam1
 */
public class Restaurante {
    private int huevos;
    private double chorizo;
    
    public Restaurante(int huevos, double chorizo) {
        this.huevos=huevos*12;
        this.chorizo=chorizo*1000;
    }
    
    public void addHuevos(int huevos) {
        this.huevos=huevos*12;
    }
    
    public void addChorizos(double chorizo) {
        this.chorizo=chorizo*1000;
    }
    
    public int getNumPlatos() {
        return (int)(this.chorizo/200)<this.huevos/2 ? (int)(this.chorizo/200) : this.huevos/2 ;     
    }
    
    public void sirvePlato() {
        this.huevos = getNumPlatos()>=1 ? this.huevos - 2 : this.huevos;
        this.chorizo = getNumPlatos()>=1 ? this.chorizo - 200 : this.chorizo;
        
        //this.huevos = this.huevos-2<0 || this.chorizo-200<0 ? this.huevos : this.huevos-2;
        //this.chorizo = this.chorizo-200<0 || this.huevos-2<0 ? this.chorizo : this.chorizo-200;
    }
    
    public int getHuevos() {
        return this.huevos;
    }
    
    public double getChorizo() {
        return this.chorizo/1000;
    }
}
