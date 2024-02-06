package unidad05.ud05hoja03ej02;

/**
 *
 * @author DAM104
 */
public class Alumno extends Persona{
    private int[] notas;
    
    public Alumno(int calificaciones) {
        super();
        notas = new int[calificaciones];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random()*11);
        }
    }
    
    public String mostrar() {
        float media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;
        return String.format("--------------------------\nDNI: %s\nNOMBRE: %s\nDIRECCION: %s\nNOTA MEDIA: %,.2f\n----------------------", super.getDni(), super.getNombre(), super.getDireccion(), media);
    }
}
