
package conexao;
import javax.swing.*;
import java.sql.*;
public class Conecxao {
    public Connection connection = null;
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DBNAME = "cadastrocliente";
    private final String URL = "jdbc:mysql://localhost:3306/"+DBNAME;
    private final String user = "root";
    private final String senha = "";
    
    public boolean getConnection(){
        try {
            Class.forName(DRIVER);
            this.connection = DriverManager.getConnection(URL, user, senha);
            return true;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Driver não encontrado "+ex.toString());
            return false;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"falha na conecxão com o banco de dados "+erro.toString());
            return false;
        }
    }
    public void getClose(){
        try {
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha! conecxãondo banco está aberta ainda "+ex.toString());
        }
    }
}
