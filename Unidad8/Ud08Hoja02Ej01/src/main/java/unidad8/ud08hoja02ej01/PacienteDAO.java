package unidad8.ud08hoja02ej01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rathm
 */
public class PacienteDAO implements Repositorio<Paciente> {

    private Connection getConnection() {
        return MySQL.getInstance().getConnection();
    }

    @Override
    public List<Paciente> listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean crear(Paciente paciente) {
        boolean correcto = false;
        String sql = null;
        sql = "INSERT INTO pacientes(dni,nombre,telefono) VALUES (?,?,?)";    
        try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
            statement.setString(1, paciente.getDni());
            statement.setString(2, paciente.getNombre());
            statement.setString(3, paciente.getTelefono());
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
    public Paciente buscar(String dni) {
        Paciente paciente = null;
        String sql = "SELECT dni,nombre,telefono FROM pacientes WHERE dni=?";
        try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
            statement.setString(1, dni);
            try ( ResultSet rs = statement.executeQuery();) {
                if (rs.next()) {
                    paciente = creaUsuario(rs);
                }
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return paciente;
    }

    private Paciente creaUsuario(final ResultSet rs) throws SQLException {
        return new Paciente(rs.getString("dni"),rs.getString("nombre"),rs.getString("telefono"));
    } 
    
}
