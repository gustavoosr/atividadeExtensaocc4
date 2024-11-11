/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    private static String Driver = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql//127.0.0.1:3306/agenda_cliente";
    private static String usuario ="root";
    private static String senha = "sucodeuva12";
    public static Connection getConnection(){
        try {
            Class.forName(Driver);
                return DriverManager.getConnection(URL, usuario,senha);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na conexão", e);
        }
    }
    public static void closeConnection(Connection con, PreparedStatement pst, ResultSet rs){
        closeConnection (con, pst);
        try {
            if (rs!=null) {
                rs.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public static void closeConnection(Connection con, PreparedStatement pst){
        throw new UnsupportedOperationException("Not supported yet");
    }
}
