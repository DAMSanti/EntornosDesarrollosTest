package ejemplos06.ejemplo05;

/**
 *
 * @author cic
 */
//Al trabajar con alumnos tendré que implementar Comparable
//para que me los ordene
public class Alumno implements Comparable<Alumno> {

    private int numExpediente;
    private String nomAlumno;

    public Alumno(int numExpediente, String nomAlumno) {
        this.numExpediente = numExpediente;
        this.nomAlumno = nomAlumno;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numExpediente;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.numExpediente == other.numExpediente;
    }

    @Override
    //Voy a sobreescribir usando como atributo de comparación solo el 
    //numero de expediente. Este se supone único para cada alumno
    public int compareTo(Alumno o) {
        return numExpediente - o.numExpediente;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numExpediente=" + numExpediente + ", nomAlumno=" + nomAlumno + '}';
    }
}
