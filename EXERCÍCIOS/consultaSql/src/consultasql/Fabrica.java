
package consultasql;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Fabrica {
    public Connection connecion;
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DBNOME = "banco";
    private final String URL = "jdbc:mysql://localhost:3306/"+DBNOME;
    private final String USER = "root";
    private final String PASSWORD = "";
    
    public boolean  getConnection(){
        
        try {
            Class.forName(DRIVER);
            this.connecion = DriverManager.getConnection(URL, USER, PASSWORD);
            return true;
        } catch (ClassNotFoundException erro) {
          JOptionPane.showMessageDialog(null,"Falha no Driver "+erro.toString());
           return false;
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Falha na conexão com o banco"+ex.toString());
            return false;
        }
        
    }
    public void getClose(){
        try {
            this.connecion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha conexão a berta! "+ex.toString());
        }
    }
}
