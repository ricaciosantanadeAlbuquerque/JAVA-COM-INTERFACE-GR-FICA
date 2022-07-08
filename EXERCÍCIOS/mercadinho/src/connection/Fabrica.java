

package connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
public class Fabrica {
    //private static final String DRIVER = "com.mysql.jdbc.Driver"; 
    private static final String URL = "jdbc:mysql://localhost:3306/mercadinho";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static Connection conexao1;
    
    public static Connection abrirConexao(){
        try {
             conexao1 = DriverManager.getConnection(URL, USUARIO,SENHA);
        } catch (SQLException ex) {
            Logger.getLogger(Fabrica.class.getName()).log(Level.SEVERE, null, ex);
        }
       return conexao1;
    }
    public static void fecharConexao(Connection conexao){
        if(conexao != null){
            try {
                conexao.close();
            } catch (SQLException ex) {
               throw new RuntimeException("Erro! a conexao ainda está aberta",ex);
            }
        }
    }
    public static void fecharConexao(Connection conexao,PreparedStatement stm){
        fecharConexao(conexao);
        try {
           if(stm != null){
               stm.close();
           }
        } catch (SQLException ex) {
           throw new RuntimeException("Erro! a conexao ainda está aberta ",ex);
        }
    }
    public static void fecharConexao(Connection conexao,PreparedStatement stm,ResultSet resultado){
        fecharConexao(conexao,stm);
        try {
            if(resultado != null){
                resultado.close();
            }
        } catch (SQLException ex) {
           throw new RuntimeException("Erro! a conexao ainda está aberta ",ex);
        }
    }
}
