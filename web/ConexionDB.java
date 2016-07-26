package develop.curso.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javax.sql.DataSource;

public class ConexionBD {

    DataSource ds;
    ResultSet rst;
    Connection conn;
    String consultaSQL = "";
    PreparedStatement pstmt;

    public static final ResourceBundle texto = ResourceBundle.getBundle("sis.pro.rutas");
    static String host = texto.getString("host");
    static String port = texto.getString("port");
    static String table = texto.getString("table");
    static String user = texto.getString("user");
    static String password = texto.getString("password");

    public ConexionBD() {
    }

    public void tomarUnaConexion() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            if (host.startsWith("$")) {
                host = System.getenv(host.replaceFirst("$", ""));
            }
            if (port.startsWith("$")) {
                port = System.getenv(port.replaceFirst("$", ""));
            }
            String url = String.format("jdbc:mysql://%s:%s/%s?user=%s&password=%s", host, port, table, user, password);

            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cerrarUnaConexion() {
        try {
            if (rst != null) {
                rst.close();
            }
            if (conn != null) {
                conn.close();
            }
            rst = null;
            conn = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
