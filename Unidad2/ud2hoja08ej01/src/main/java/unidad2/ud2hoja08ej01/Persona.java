package unidad2.ud2hoja08ej01;

/**
 *
 * @author dam1
 */

public class Persona {
    private String nombre, apellido1, apellido2, dni;
    
    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre ;
        this.apellido1 = apellido1 ;
        this.apellido2 = apellido2 ;
        this.dni = dni ;
    }
    
    public String getPassword() {
        return nombre.substring(0, 1)
                .concat(apellido1.substring(0, 3))
                .concat(apellido2.substring(apellido2.length()-1)) ;
    }
    
    public boolean dniValido() {  
        String comprobacion = "TRWAGMYFPDXBNJZSQVHLCKE" ;
        int operacion = Integer.parseInt(dni.substring(0, 8)) % 23 ;
        //return dni.length() == 9 && 
        //        dni.charAt(dni.length()-1) == 
        //        comprobacion.charAt(operacion);
        return dni.length() == 9 &&
                dni.substring(dni.length()-1).equals(
                        comprobacion.substring(operacion ,operacion + 1 )
                );
    }
}



