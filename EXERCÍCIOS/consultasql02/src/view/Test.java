
package view;

import Conexao.Fabrica;

public class Test {


 public static void main(String[] args){
      Fabrica db = new Fabrica();
      if(db.getConnection() == true){
          System.out.println("Sim");
      }else{
          System.out.println(" não");
      }
 }
}
