
package persistencia;
import java.sql.Connection;
import modelo.Aluno;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JDBCAluno {
   private Connection conexao;
   
   public JDBCAluno(Connection conexao1){
       this.conexao = conexao1;
      
}
   public void inserirAluno(Aluno aluno1){
       String sql = "insert into aluno (nome, sexo ,media)values(?,?,?) ";
       PreparedStatement ps;
       
       try {
          ps = this.conexao.prepareStatement(sql);
           ps.setString(1,aluno1.getNome());
           ps.setString(2,aluno1.getSexo());
           ps.setDouble(3,aluno1.getMedia());
       } catch (SQLException ex) {
           Logger.getLogger(JDBCAluno.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
}