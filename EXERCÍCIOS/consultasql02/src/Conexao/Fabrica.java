
package Conexao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class Fabrica {
    public Connection connection;
    private final String URL = "jdbc:mysql://localhost:3306/visoes";
    private final String USER = "root";
    private final String PASSWORD = "";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public boolean getConnection(){
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null,"Conexão feita com sucesso! ");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha na conexao");
            return false;
        }
    }
    public void getClose(){
        try {
            this.connection.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Falha conexão fechada com sucesso "+ex.toString());
    }
}
}