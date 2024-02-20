package unidad05.ud05hoja05ej03;

import java.time.LocalDate;

/**
 *
 * @author DAM104
 */
public class Ud05Hoja05Ej03 {

    public static void main(String[] args) {
        Contacto c1 = new Contacto( "Santi", "Tamayo", "666666666", "santi@santi.com", LocalDate.of(1986, 8, 30));
        Contacto c2 = new Contacto( "Paco", "Salas", "777777777", "paco@santi.com", LocalDate.of(1966, 9, 11));
        Contacto c3 = new Contacto( "Lolo", "Tomas", "888888888", "lolo@santi.com", LocalDate.of(1996, 3, 13));
        Contacto c4 = new Contacto( "Fran", "Cisco", "999999999", "fran@santi.com", LocalDate.of(1926, 6, 21));
        
        Agenda a1 = new Agenda(10);
        
        a1.insertar(c1);
        a1.insertar(c2);
        System.out.println(a1.toString());
        a1.insertar(c3);
        a1.insertar(c4);
        
        a1.buscar("Santi");
        
        a1.eliminar("Paco");
        
        System.out.println(a1.toString());
        
        a1.ordenar();
        
        System.out.println(a1.toString());
    }
}
