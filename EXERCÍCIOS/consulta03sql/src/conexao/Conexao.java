
package conexao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class Conexao {
   public Connection connection;
   private final String DRIVER = "com.mysql.cj.jdbc.Driver";
   private final String URL = "jdbc:mysql://localhost:3306/visoes";
   private final String NOME = "root";
   private final String SENHA = "";
   
   public boolean getConnection(){
       try {
           Class.forName(DRIVER);
           connection =  DriverManager.getConnection(URL,NOME,SENHA);
           JOptionPane.showMessageDialog(null,"Conexão feita com sucesso !");
       } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null,"ERRO no  driver jdbc-odbc"+ex.toString());
         return false;
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Falha na conexão"+ex.toString());
           return false;
       }
     
       return true;
   }
   public void getClose(){
       try {
           this.connection.close();
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"A conexao continua aberta! "+ex.toString());
       }
   }
}
