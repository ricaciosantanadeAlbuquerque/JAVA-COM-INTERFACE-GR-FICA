
public class Usuario {
    private String nome;
    private String senha;
    private String confirmaSenha;
    
    
    public Usuario(String nome1,String senha1,String confirma1){  //  construtor
        this.nome = nome1;
        this.senha = senha1;
        this.confirmaSenha = confirma1;
    }
    public Usuario(){ //  construtor
        
    }
    // METODOS GET E SET
    public String getNome(){
       return this.nome;
    }
    public void setNome(String nome1){
        this.nome = nome1;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha1){
        this.senha = senha1; 
    }

    @Override
    public String toString() {
        return   "nome=" + nome + "\n senha=" + senha + ",\n confirmaSenha=" + confirmaSenha + '}';
    }
    
}
