package unidad8.ud08hoja02ej01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author rathm
 */
public class VisitasDAO implements Repositorio<Visita> {

    private Connection getConnection() {
        return MySQL.getInstance().getConnection();
    }
        
    @Override
    public List listar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean crear(Visita visita) {
        boolean correcto = false;
        String sql = null;
        sql = "INSERT INTO visitas(dni,fecha,tratamiento,observaciones) VALUES (?,?,?,?)";    
        try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
            statement.setString(1, visita.getDni());
            statement.setObject(2, visita.getFecha());
            statement.setObject(3, String.valueOf(visita.getTratamiento()));
            statement.setString(4, visita.getObservaciones());
            int salida = statement.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado/modificado un solo registro");
            } else {
                correcto = true;
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return correcto;
    }

    @Override
    public Visita buscar(String t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Visita creaVisita(final ResultSet rs) throws SQLException {
        return new Visita(rs.getString("dni"),LocalDateTime.parse(rs.getString("fecha")),Tratamiento.valueOf(rs.getString("tratamiento")), rs.getString("observaciones"));
    }     
}
