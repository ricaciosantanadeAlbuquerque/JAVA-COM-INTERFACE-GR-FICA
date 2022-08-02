
package modelo;

public class Aluno {
   private int matricula;
   private String nome;
   private String sexo;
   private double media;
  
   public Aluno(int matricula1,String nome1,String sexo1,double media1){
       this.matricula=matricula1;
       this.nome = nome1;
       this.sexo = sexo1;
       this.media = media1;
   }
   public Aluno(String nome1,String sexo1,double media1){ // polimorfismo de sobre carga
       this.nome = nome1;
       this.sexo = sexo1;
       this.media = media1;
   }
   
   public int getMatricula(){
       return this.matricula; 
   }
   public void setMatricula(int matricula1){
       this.matricula = matricula1;
   }
   public String getNome(){
       return this.nome;
   }
   public void setNome(String nome1){
       this.nome = nome1;
   }
   public String getSexo(){
       return this.sexo;
   }
   public void setSexo(String sexo1){
       this.sexo = sexo1;
   }
    public double getMedia(){
        return media;
    }
    public void setMedia(double media1){
        this.media = media1;
    }

    @Override // polimorfismo de sobreposição
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", media=" + media + '}';
    }
   
   
}
