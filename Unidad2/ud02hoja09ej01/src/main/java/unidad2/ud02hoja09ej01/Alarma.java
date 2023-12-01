package unidad2.ud02hoja09ej01;

/**
 *
 * @author dam1
 */
public class Alarma {
    float temperatura;
    boolean timbre;
    
    public Alarma(float temperatura) {
        this.temperatura = temperatura ;
        this.timbre = false ;
    }
    
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        this.comprueba();
    }
    
    public void comprueba() {
        this.timbre = (this.temperatura > 35 || this.temperatura < 10);
        this.normaliza();            
    }
    
    public void normaliza() {
        this.temperatura = this.timbre == true ? 25 : this.temperatura ;
        System.out.println(this.timbre == true ? "ALARMA DESACTIVADA TEMPERATURA CONTROLADA" : " ");
        this.timbre = this.timbre == true ? false : this.timbre;
    }
}
