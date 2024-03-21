package unidad6.ud06hoja02ej03;

/**
 *
 * @author DAM104
 */
public class Ud06Hoja02Ej03 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        
        agenda.insertar(persona1);
        agenda.insertar(persona2);
        agenda.insertar(persona3);

        agenda.mostrarDatosPorDni();
        agenda.mostrarDatosPorNombre();
        agenda.buscar("72145545L");
        agenda.modificar("72145545L", persona4);
        agenda.mostrarDatosPorDni();
        agenda.mostrarDatosPorNombre();        
    }
}
