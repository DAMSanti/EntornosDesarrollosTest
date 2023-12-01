package unidad3.ud03hoja01ej03;

/**
 *
 * @author dam1
 */
public class Llamada {
    private int duracion;
    
    public Llamada(){
    }
    
    public double aPagar(int minutos, int segundos) {
        duracion=minutos*60+segundos;
        if (duracion <= 60) {
            return 0.25;
        }
        else {
            return 0.25+Math.floor((duracion-60)/10)*0.1;
        }
    }
}