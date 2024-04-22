package unidad8.ud08hoja02ej01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
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
    
    public ArrayList<Visita> mostrarVisitas(LocalDate fecha) {
        ArrayList<Visita> visitas = null;
        LocalDate aux = LocalDate.of(fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth());
        String sql = "SELECT fecha FROM visitas WHERE fecha BETWEEN ? AND ?, INTERVAL 1 DAY;";    
        try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
            java.sql.Date fechasql = java.sql.Date.valueOf(aux);
            statement.setDate(1, fechasql);
            statement.setDate(2, fechasql);
            ResultSet rs = statement.executeQuery();                
            while (rs.next()) {
                if (aux.isAfter(LocalDate.now())) {
                    System.out.println("La fecha seleccionada es posterior al dia de hoy");
                } else {
                    System.out.println("La fecha seleccionada es anterior al dia de hoy");
                }
                Visita vis = creaVisita(rs);
                if (!visitas.add(vis)) {
                    System.out.println("Ha habido un error introduciendo la visita");
                    throw new Exception("Ha habido un error durante la ejecución, se abortara el proceso.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        return visitas;
    }
    
    public LinkedList<Visita> mostrarVisitasPaciente(String dni) {
        LinkedList<Visita> pacientes = null;
        String sql = "SELECT dni, fecha, tratamiento, observaciones FROM visitas WHERE dni = ? ORDER BY fecha DESC;";    
        try ( PreparedStatement statement = getConnection().prepareStatement(sql);) {
            statement.setString(1, dni);
            ResultSet rs = statement.executeQuery();                
            while (rs.next()) {
                Visita vis = creaVisita(rs);
                if (!pacientes.add(vis)) {
                    System.out.println("Ha habido un error introduciendo la visita");
                    throw new Exception("Ha habido un error durante la ejecución, se abortara el proceso.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return pacientes;
    }

    private Visita creaVisita(final ResultSet rs) throws SQLException {
        return new Visita(rs.getString("dni"),LocalDateTime.parse(rs.getString("fecha")),Tratamiento.valueOf(rs.getString("tratamiento")), rs.getString("observaciones"));
    }     
}
