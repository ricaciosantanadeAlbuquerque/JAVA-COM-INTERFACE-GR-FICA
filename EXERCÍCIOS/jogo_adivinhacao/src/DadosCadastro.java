
public class DadosCadastro {
    // variáveis globais
    private String nome;
    private String email;
    private String Telefone;
    private String nomeUsuario;
    private String senha;
    private String ConfirmaSenha;
    
    public DadosCadastro(){
        
    }
   public DadosCadastro(String nome1,String email1,String telefone1,String nomeUsuario1 ,String senha1,String ConfirmaSenha1){
       this.nome = nome1;
       this.email = email1;
       this.Telefone =telefone1;
       this.nomeUsuario =  nomeUsuario1;
       this.senha = senha1;
       this.ConfirmaSenha = ConfirmaSenha1;
   }
   public String getNome(){
       return this.nome;
   }
   public void setNome(String nome1){
       this.nome = nome1;
   }
   public String getEmail(){
       return this.email;
   }
   public void setEmail(String email1){
       this.email = email1;
   }
   public String getTelefone(){
       return this.Telefone;
   }
   public void setTelefone(String telefone1){
       this.Telefone = telefone1;
   }
   public String getNomeUsuario(){
       return this.nomeUsuario;
   }
   public void setNomeUsuario(String nomeUsuario1){
       this.nomeUsuario = nomeUsuario1;
   }
   public String getSenha(){
       return this.senha;
   }
   public void setSenha(String senha1){
       this.senha = senha1;
   }
   public String getConfirmaSenha(){
       return this.ConfirmaSenha;
   }
   public void setConfirmaSenha(String confirmaSenha1){
       this.ConfirmaSenha = confirmaSenha1;
   }

    @Override
    public String toString() {
        return   "\nnome: " + nome + 
                "\n email: " + email +
                "\n Telefone: " + Telefone + "\n nomeUsuario: "
                + nomeUsuario + "\n senha: " + senha +
                " \nConfirmaSenha: " + ConfirmaSenha + '}';
    }
   
}
