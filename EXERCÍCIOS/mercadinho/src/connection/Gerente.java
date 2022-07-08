
package connection;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Produto;
public class Gerente {
    
    public void salvar(Produto p){
        Connection abrir = Fabrica.abrirConexao(); // avariável abrir tem a conexao aberta;
        PreparedStatement stm = null;
        try {
            stm = abrir.prepareStatement("insert into produto (descricao,qtd,preco)values(?,?,?)");
            stm.setString(1,p.getDescricao());
            stm.setInt(2,p.getQtd());
            stm.setDouble(3,p.getPreco());
            
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Erro! ao salvar "+ex);
        }finally{
            Fabrica.fecharConexao(abrir, stm); // conexao fechada
        }
    }
    public List<Produto> listar(){
        List<Produto> produtos = new ArrayList<>();
        Connection abrir = Fabrica.abrirConexao();
        PreparedStatement stm = null;
        ResultSet res = null;
        try {
            stm = abrir.prepareStatement("Select * from produto");
            res = stm.executeQuery();
            while(res.next()){
                Produto produto = new Produto();
                produto.setId(res.getInt("id"));
                produto.setDescricao(res.getString("descricao"));
                produto.setQtd(res.getInt("qtd"));
                produto.setPreco(res.getDouble("preco"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Fabrica.fecharConexao(abrir, stm, res);
        }
        return produtos;
    }
    public void atualizar(Produto p){
        Connection abrir = Fabrica.abrirConexao();
        PreparedStatement stm = null;
        
        try {
            stm = abrir.prepareStatement("update produto set descricao = ?,qtd = ?,preco = ? where id = ? ");
            stm.setString(1,p.getDescricao());
            stm.setInt(2,p.getQtd());
            stm.setDouble(3,p.getPreco());
            stm.setInt(4,p.getId());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso !");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Atualizado com Sucesso !");  
        }finally{
            Fabrica.fecharConexao(abrir, stm); // fechou a conexão;
        }
    }
    
    public void deletar(Produto p){
        Connection abrir = Fabrica.abrirConexao();
        PreparedStatement stm = null;
        
        try {
            stm = abrir.prepareStatement("delete from produto where id = ?");
            stm.setInt(1,p.getId());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso. ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro! o valor não foi excluido com sucesso"+ex);
        }finally{
            Fabrica.fecharConexao(abrir, stm);
        }
    }
}
