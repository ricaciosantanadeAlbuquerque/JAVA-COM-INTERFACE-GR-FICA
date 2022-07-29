
package modelo;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String celular;
    private String sexo;
    private String senha;

    public Cliente(int id, String nome, String cpf, String celular, String sexo, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.sexo = sexo;
        this.senha = senha;
    }
    
    
    
    public Cliente(String nome1,String cpf1,String celular1,String sexo1,String senha1 ){
        this.nome = nome1;
        this.cpf = cpf1;
        this.celular = celular1;
        this.sexo = sexo1;
        this.senha = senha1;
    }
    public Cliente(){ // polimorfismo de sobrecarga
        
    }
    public Cliente(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome1){
        this.nome = nome1;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf1){
        this.cpf = cpf1;
    }
    public String getCelular(){
        return this.celular; 
    }
    public void setCelular(String celular1){
        this.celular = celular1;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo1){
        this.sexo = sexo1;
}
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha1){
        this.senha = senha1;
    }
    public int getId(){
        return id;
    }
    public void setId(int id1){
        this.id = id1;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", celular=" 
                + celular + ", sexo=" + sexo + ", senha=" + senha + '}';
    }
   
    
}
