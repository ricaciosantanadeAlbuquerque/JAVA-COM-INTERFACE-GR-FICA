
package vista;
import modelo.Aluno;
import persistencia.Conexao;
import persistencia.JDBCAluno;
public class Vista {
   public static void main(String[] args){
           Aluno aluno = new Aluno("Lucas","M",9);
    Conexao fabrica = new Conexao();
    JDBCAluno gerente= new JDBCAluno(fabrica.abrirConexao());
   }
}
