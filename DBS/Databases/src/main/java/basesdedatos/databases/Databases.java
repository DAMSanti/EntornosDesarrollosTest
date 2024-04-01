package basesdedatos.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rathm
 */

public class Databases {
    public static void retrieveDataFromMySQL() {
        String url = "jdbc:mysql://192.168.1.40:3306/municipios";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM localidades")) {

            while (resultSet.next()) {
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    System.out.println("Column Name: " + columnName);
                }

                while (resultSet.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        Object value = resultSet.getObject(i);
                        System.out.println(metaData.getColumnName(i) + ": " + value);
                    }
                    System.out.println("--------------------");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        retrieveDataFromMySQL();
    }
}
