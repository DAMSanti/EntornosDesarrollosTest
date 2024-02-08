package unidad05.ud05hoja04ej02;

/**
 *
 * @author DAM104
 */
public class Empleado {
    protected String nombre, departamento;
    protected int edad;
    protected boolean casado;
    protected double salario;
    
    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public Categoria devuelveCategoria(Empleado empleado) {
        Categoria cat = null;
        if (empleado.edad <= 21) {
            cat = Categoria.principiante;
        } else if (empleado.edad > 21 && empleado.edad <= 35) {
            cat = Categoria.intermedio;
        } else {
            cat = Categoria.senior;
        }
        return cat;
    }
    
    public String toString() {
        return String.format("NOMBRE: %s\nDEPARTAMENTO: %s\nEDAD: %d\nESTADO CIVIL: %s\nSALARIO: %,.2f€", nombre, departamento, edad, this.casado ? "Casado" : "Soltero", salario);
    }
    
    public void aumentaSalario(int aumento) {
        this.salario += this.salario*aumento/100;
    }
}