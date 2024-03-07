package unidad05.examen05;

/**
 * @Santiago M Tamayo Arozamena
 * @DAM1
 */

public class Usuario {
    private String nombre, apellidos;
    
    public Usuario() {
        this.nombre = Teclado.introduceTexto("Introduce el nombre de un usuario: ");
        this.apellidos = Teclado.introduceTexto("Introduce el apellido del usuario: ");
    }
    
    public Usuario(String nombre, String apellidos) {
        this.nombre = nombre ;
        this.apellidos = apellidos ;
    }

    @Override
    public String toString() {
        return String.format("USUARIO:\n\tNOMBRE: %s\n\tAPELLIDOS: %s", nombre, apellidos);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

}
