package unidad6.ud08hoja01ej01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAM104
 */
public class UsuarioDAO implements Repository<Usuario> {
    
    private Connection getConnection() {
        return ConectaUsuario.getInstance().getConnection();
    }
    
    @Override
    public List listar() {
        List<Usuario> usuarios = new ArrayList<>();
        try ( Statement stmt = getConnection().createStatement(); 
              ResultSet rs = stmt.executeQuery("SELECT id,username,password,email FROM usuarios");) {
            while (rs.next()) {
                Usuario usuario = creaUsuario(rs);
                if (!usuarios.add(usuario)) {
                    throw new Exception("error no se ha insertado el objeto en la colección");
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return usuarios;
    }   
    
    @Override
    public void guardar(Usuario usuario) {
        String sql = null;
        if (usuario.getId() > 0) {
            System.out.println("Ya existe este usuario");
        } else {
            sql = "INSERT INTO usuarios(username,password,email) VALUES (?,?,?)";    
            try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
                statement.setString(1, usuario.getUsername());
                statement.setString(2, usuario.getPassword());
                statement.setString(3, usuario.getEmail());
                int salida = statement.executeUpdate();
                if (salida != 1) {
                    throw new Exception(" No se ha insertado/modificado un solo registro");
                }     
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void modificar(Usuario usuario, int id) {
        String sql = null;
        if (usuario.getId() > 0) {
            sql = "UPDATE usuarios SET username=?,password=?, email=? WHERE id=?";
            try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
                statement.setInt(4, usuario.getId());
                statement.setString(1, usuario.getUsername());
                statement.setString(2, usuario.getPassword());
                statement.setString(3, usuario.getEmail());
                int salida = statement.executeUpdate();
                if (salida != 1) {
                    throw new Exception(" No se ha insertado/modificado un solo registro");
                }
            } catch (SQLException ex) {
                // errores
                System.out.println("SQLException: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("No se ha encontrado ese usuario");
        }
    }

    @Override
    public void eliminar(int id) {
        String sql="DELETE FROM usuarios WHERE id=?";
        try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
                statement.setInt(1, id);
            int salida = statement.executeUpdate();
            if (salida != 1) {
                throw new Exception("No se ha borrado un solo registro");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private Usuario creaUsuario(final ResultSet rs) throws SQLException {
        return new Usuario(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getString("email"));
    } 
}

