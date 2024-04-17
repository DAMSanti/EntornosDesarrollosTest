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
    public boolean guardar(Usuario usuario) {
        boolean correcto = false;
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
                } else {
                    correcto = true;
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return correcto;
    }

    @Override
    public boolean modificar(Usuario usuario, int id) {
        boolean correcto = false;
        String sql = null;
        sql = "UPDATE usuarios SET username=?,password=?, email=? WHERE id=?";
        try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
            statement.setInt(4, id);
            statement.setString(1, usuario.getUsername());
            statement.setString(2, usuario.getPassword());
            statement.setString(3, usuario.getEmail());
            int salida = statement.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado/modificado un solo registro");
            } else{
                correcto = true;
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return correcto;
    }

    @Override
    public boolean eliminar(int id) {
        boolean correcto = false;
        String sql="DELETE FROM usuarios WHERE id=?";
        try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
                statement.setInt(1, id);
            int salida = statement.executeUpdate();
            if (salida != 1) {
                throw new Exception("No se ha borrado un solo registro");
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
    public Usuario porId(int id) {
        Usuario usuario = null;
        String sql = "SELECT id,username,password, email FROM usuarios WHERE id=?";
        try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
            statement.setInt(1, id);
            try ( ResultSet rs = statement.executeQuery();) {
                if (rs.next()) {
                    usuario = creaUsuario(rs);
                }
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return usuario;
    }  
    
    private Usuario creaUsuario(final ResultSet rs) throws SQLException {
        return new Usuario(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getString("email"));
    } 

}

