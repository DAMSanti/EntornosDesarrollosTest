package unidad6.ud08hoja01ej01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author DAM104
 */
public class ConectaUsuario {
    private Connection connection = null;
    private static final String BD = "bd_prog_01";
    private static final String USUARIO = "root";
    private static final String CLAVE = "mysql";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD;    
    
    private ConectaUsuario() {
        try {
            Properties properties = new Properties();
            properties.setProperty("user", USUARIO);
            properties.setProperty("password", CLAVE);
            properties.setProperty("useSSL", "false");
            properties.setProperty("autoReconnect", "true");
            connection = (Connection) DriverManager.getConnection(URL, properties);
            if (connection == null) {
                System.out.println("Error de conexion");
            } else {
                System.out.println("Conexion correcta a " + URL);
            }
        } catch(SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
    
    public static ConectaUsuario getInstance() {
        return AccesoUsuariosHolder.INSTANCE;
    }
    
    private static class AccesoUsuariosHolder {
        private static final ConectaUsuario INSTANCE = new ConectaUsuario();
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public boolean cerrar() {
        boolean siCerrada = false ;
        try {
            connection.close();
            if (connection.isClosed()) {
                siCerrada = true;
            }
        } catch (SQLException sqe) {
            System.out.println("Se produjo un error en el cierre");
        }
        return siCerrada;
    }
}
