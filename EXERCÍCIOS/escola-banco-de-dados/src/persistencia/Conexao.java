
package persistencia;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexao {
    private Connection conexao;
    
    
    public Connection abrirConexao(){
        String url = "jdbc:mysql://localhost:3306/escola?useTimezone=true&serverTimezone=UTC";

        String usuario = "root";
        String senha = "";
        try {
            conexao = DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return conexao;
    }
    
    public void fecharConexao(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
