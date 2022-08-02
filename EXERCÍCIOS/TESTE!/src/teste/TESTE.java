
package teste;

import java.util.Random;


public class TESTE {

    
    public static void main(String[] args) {
           Random aleatorio = new Random(); // criando um objeto aleatório
        String ale1,ale2,ale3;
        String senha1,senha2,senha3;
        senha1 = "";
        senha2 = "";
        senha3 = "";
        ale1 ="";
        ale2 ="";
        ale3 ="";
    
        for(int i =0; i <3;i++){
            ale1 = String.valueOf(aleatorio.nextInt(8)+1);
            ale2 = String.valueOf(aleatorio.nextInt(8)+1);
            ale3= String.valueOf(aleatorio.nextInt(8)+1);
             if(i == 0){
                 senha1 = ale1+ale2+ale3;
             }else if(i ==1){
                 senha2 = ale1+ale2+ale3;
             }else{
                 senha3 = ale1+ale2+ale3;
             }
        }
          
        System.out.println(senha1);
         System.out.println(senha2);
          System.out.println(senha3);
    }
    
}
