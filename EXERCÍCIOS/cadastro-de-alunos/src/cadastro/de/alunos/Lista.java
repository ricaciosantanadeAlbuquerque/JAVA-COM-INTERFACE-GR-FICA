
package cadastro.de.alunos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Lista implements Interface {
    ArrayList<Aluno> num1 = new ArrayList(); // lista de objetos num1 
    // relação feita através de agregação num1 é um tipo abstrato de dados
    @Override
    public void cadastrarAluno(Aluno x){ 
        num1.add(x);
    }
    @Override
    public void listrarAlunos(){ // polimorfismo de sobreposição
        for(Aluno j: num1){
            JOptionPane.showMessageDialog(null,j.toString()+"\n");
        }
    }
    
    @Override
    public String quantidadeCadastro() { // retorna um valor numérico
      return num1.size()+""; // para que o bjeto txtTotal aceitasse o valor inteiro  concatenamos o valor de retorn com uma String
    }
    public boolean evazio(){ // true para vazio, false para cheio
        return num1.isEmpty();
    }
}
