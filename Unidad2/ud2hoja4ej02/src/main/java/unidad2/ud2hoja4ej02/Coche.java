package unidad2.ud2hoja4ej02;

/**
 *
 * @author dam1
 */

public class Coche {
    private String matricula;
    private int velocidad;

    public Coche(String matricula, int velocidad) {
        this.matricula=matricula;
        this.velocidad=velocidad;
    }
    
    public Coche(String matricula) {
        this.matricula=matricula;
    }
    
    public void acelera(int velocidad) {
        this.velocidad=(this.velocidad+velocidad)>120 ? 120 : this.velocidad+velocidad ;
    }
     
    public void frena(int velocidad) {
        this.velocidad=(this.velocidad-velocidad)<0 ? 0 : this.velocidad-velocidad ;
    }
    
    public String matricula() {
       return matricula.substring(4);
    }
    
    public void datos() {
        System.out.printf("Coche [matricula=%s, velocidad=%d]\n", matricula, velocidad);
    }
    
}
