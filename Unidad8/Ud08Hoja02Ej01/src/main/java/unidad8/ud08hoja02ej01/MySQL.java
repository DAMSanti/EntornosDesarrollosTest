package unidad8.ud08hoja02ej01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author rathm
 */
public class MySQL {
    private Connection connection = null;
    private static final String BD = "java_02_clinica";
    private static final String USUARIO = "root";
    private static final String CLAVE = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD;    
    
    private MySQL() {
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
    
    public static MySQL getInstance() {
        return AccesoHolder.INSTANCE;
    }
    
    private static class AccesoHolder {
        private static final MySQL INSTANCE = new MySQL();
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
