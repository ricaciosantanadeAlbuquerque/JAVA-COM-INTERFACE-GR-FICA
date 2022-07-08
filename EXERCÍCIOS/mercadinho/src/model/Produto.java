
package model;

public class Produto {
    
    private int id;
    private String descricao;
    private int qtd;
    private double preco;
    
    public Produto(int id1,String descricao1,int qtd1,int preco1){
        this.id = id1;
        this.descricao = descricao1;
        this.qtd = qtd1;
        this.preco = preco1;
        
    }
    public Produto(){ // polimorfismo de sobrecarga
        
    }
    // get e set
    public int getId(){
        return this.id;
    }
    public void setId(int id1){
        this.id = id1;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao1){
        this.descricao = descricao1;
    }
    public int getQtd(){
        return this.qtd;
    }
    public void setQtd(int qtd1){
        this.qtd = qtd1;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco1){
        this.preco = preco1;
    }
    @Override
    public String toString(){ // polimorfismo de sobreposição
        return this.id+"\n"+this.descricao+"\n"+this.qtd+"\n"+this.preco;
    }
}
