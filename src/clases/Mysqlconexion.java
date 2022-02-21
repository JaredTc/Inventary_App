
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Mysqlconexion {
    public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;

    public static Connection conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/inventary", "root", "");
            sentencia = conectar.createStatement();
        } catch (Exception e) {
        }

        return conectar;
    }
}
