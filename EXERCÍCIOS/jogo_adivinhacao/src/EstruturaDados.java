import java.util.ArrayList;
import javax.swing.JOptionPane;
public class EstruturaDados implements InterfacedeMetodos {
     DadosCadastro lista;
    ArrayList<DadosCadastro> cadastro = new ArrayList();
    
    //Implementando os métodos da interface
    @Override
    public void cadastrar(DadosCadastro objeto){// POLIMORFISMO DE SOBREPOSIÇÃO
        cadastro.add(objeto); // objeto parâmentro  que contem o objeto DasdosCadastro é adicionado na primeira posição do arrayList()
    }
    @Override
    public void listarCadastros(){// POLIMORFISMO DE SOBREPOSIÇÃO
        for(DadosCadastro valor: cadastro){
            JOptionPane.showMessageDialog(null, "Cadastro: "+valor);
        }
    }
    @Override
    public void deletarCadastro(DadosCadastro deleta1){ // POLIMORFISMO DE SOBREPOSIÇÃO
        
    }
    public String quantidadeCadastro(){
        return cadastro.size()+"";
    }
    public void objetoExiste(){
        for(DadosCadastro valo1r: cadastro){
            JOptionPane.showMessageDialog(null, "Cadastro: "+valo1r.getSenha());
        }
    }
}

