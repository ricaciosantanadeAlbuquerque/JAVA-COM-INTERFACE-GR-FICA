
package conexao;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
public class Gerente {
    Conecxao db = new Conecxao();
            
    public void cadastrar(Cliente cliente){
       if(db.getConnection() == true){
            String sql = "insert into cliente(nome,cpf,celular,sexo,senha)values(?,?,?,?,?)";
        PreparedStatement statement = null;
        try {
            statement = db.connection.prepareStatement(sql);
            statement.setString(1,cliente.getNome());
            statement.setString(2,cliente.getCpf());
            statement.setString(3,cliente.getCelular());
            statement.setString(4,cliente.getSexo());
            statement.setString(5,cliente.getSenha());
            statement.execute();
            statement.close();
            db.getClose();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO! não foi possível connectar ao banco dedados "+ex);
        }
       }else{
           JOptionPane.showMessageDialog(null,"Falha na conecxão !");
       }
       
    }
    
    public void atualizar(Cliente dados){
        if(db.getConnection() == true){
          String sql = "update cliente set nome = ? ,cpf = ? ,celular = ? , sexo = ? , senha = ? where id = ?";
        PreparedStatement statement = null;
        try {
            statement = db.connection.prepareStatement(sql);
            statement.setString(1,dados.getNome());
            statement.setString(2,dados.getCpf());
            statement.setString(3,dados.getCelular());
            statement.setString(4,dados.getSexo());
            statement.setString(5,dados.getSenha());
            statement.setInt(6,dados.getId());
            statement.executeQuery();
            JOptionPane.showMessageDialog(null,"Dados Salvos com sucesso ! ");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO! ao conectar com o banco de dados "+ex.toString());
        }    
        }else{
         JOptionPane.showMessageDialog(null,"ERRO! falha na conecxão.");   
        }
        
    }
    
    public void excluir(Cliente dados){
        String sql = "delete from cliente where cpf = ? and id = ? ";
        PreparedStatement statement = null;
        try {
            statement = db.connection.prepareStatement(sql);
            statement.setString(1,dados.getCpf());
            statement.setInt(2,dados.getId());
            statement.executeQuery();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"ERRO! ao conectar com o banco de dados "+ex.toString());
        }

        
    }
    public ArrayList<Cliente> litarClientes(Cliente dados){
        ArrayList<Cliente> grupoCliente = new ArrayList();
        String sql  = "select nome,senha from cliente where nome = ? and senha = ? ";
        PreparedStatement statement = null;
       if(db.getConnection() == true){
            try {
            statement = db.connection.prepareStatement(sql);
            statement.setString(1,dados.getNome());
            statement.setString(2,dados.getSenha());
            ResultSet resultado = statement.executeQuery(); // a resposta será guardada dentro de resultado na forma de tabela
            while(resultado.next()){
                String nome = resultado.getString("nome");
                String senha  = resultado.getString("senha");
                Cliente novoCliente = new Cliente(nome,senha);
                grupoCliente.add(novoCliente);
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Falha na conecxão com"+ex.toString());
        }
       }else{
            JOptionPane.showMessageDialog(null,"Falha na conecxão !");
       }
       
        return grupoCliente;
    }
    public ArrayList<Cliente> listarGeral(){
        ArrayList<Cliente> vetor = new ArrayList();
        String sql = "select * from cliente";
        Statement stf = null;
        ResultSet resultado = null;
       if(db.getConnection() == true){
              try {
            stf = db.connection.createStatement();
            resultado = stf.executeQuery(sql);
            
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String  cpf = resultado.getString("cpf");
                String celular = resultado.getString("celular");
                String sexo = resultado.getString("sexo");
                String senha = resultado.getString("senha");
                Cliente novoCliente = new Cliente(id,nome,cpf,celular,sexo,senha);
                vetor.add(novoCliente);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Falha ao conectar ao banco de dados "+ex.toString());
        }
       
       }else{
           JOptionPane.showMessageDialog(null,"Falha na conecxão! ");
       }
        return vetor;
    }
}
