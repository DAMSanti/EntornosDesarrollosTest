package unidad05.ud05hoja03ej02;

/**
 *
 * @author DAM104
 */
public class Profesor extends Persona{
    private String[] asignaturas;
    
    public Profesor(int clases) {
        super();
        asignaturas = new String[clases];
        for (int i = 0; i < this.asignaturas.length; i++) {
            asignaturas[i] = String.format("CLASE%d", i);
        }
    }
    
    public String mostrar() {
        String salida = String.format("DNI: %s\nNOMBRE: %s\nDIRECCION: %s\nCLASES IMPARTIDAS:", super.getDni(), super.getNombre(), super.getDireccion());
        for (int i = 0; i < asignaturas.length; i++) {
            salida += String.format("\n\t%s", asignaturas[i]);
        }
        return salida;
    }    
}
