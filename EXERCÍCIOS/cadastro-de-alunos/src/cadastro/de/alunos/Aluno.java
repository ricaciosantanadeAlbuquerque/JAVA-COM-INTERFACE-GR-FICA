
package cadastro.de.alunos;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    
 public Aluno(String nome1, String matricula1,String curso1){
    this.nome = nome1;
    this.matricula = matricula1;
    this.curso = curso1;
 }    
 public String getNome(){
   return this.nome;   
 }
 public void setNome(String nome1){
     this.nome = nome1;
 }
 public String getMatricula(){
     return this.matricula;
 }
 public void setMatricula(String matricula1){
     this.matricula= matricula1;
 }
 public String getCurso(){
    return this.curso;
 }

    @Override
    public String toString() {
        return  "nome: " + nome + "\n matricula: " + matricula + "\n curso: " + curso;
    }
 
}
