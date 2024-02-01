package unidad05.ud05hoja02ej02;

import java.time.LocalDate;

/**
 *
 * @author DAM104
 */
public class Perecedero extends Articulo{
    private int ano, mes;
    
    public Perecedero(String nombre, String descripcion, double precio, int ano, int mes) {
        super(nombre, descripcion, precio);
        this.ano = ano;
        this.mes = mes;
    }
    
    @Override
    public String toString() {
        return super.toString().concat(String.format("Fecha De Caducidad: %d-%d", mes, ano));
    }
    
    public void caducado() {
        if (LocalDate.now().getYear() > ano || (LocalDate.now().getYear() == ano && LocalDate.now().getMonthValue() > mes)) {
            System.out.printf("CODIGO: %s\nDescripcion: %s\n-----------------\n", super.codigo, super.descripcion );
        }
    }
}
