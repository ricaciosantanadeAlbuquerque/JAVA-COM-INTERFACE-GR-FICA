
package consultasql;
import javax.swing.table.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class ConsultaSql extends JFrame {
    private JLabel jlabel1;
    private JTextField jtextField1;
    private JButton jbutton;
    private JScrollPane scrollTable;
    private JTable table;
    private ResultSet resultset;
    public PreparedStatement statement;
    private Fabrica db;
    
   
   
    public static void main(String[] args) {
        JFrame frame = new ConsultaSql();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    public ConsultaSql(){
        this.inicializarComponentes();
        this.definirEventos();
    }

    private void inicializarComponentes() {
      setLayout(null);
      setTitle("Aprendendo Consulta com SQL");
      setBounds(200,200,600,500);
      setResizable(false);
      this.jlabel1 = new JLabel("Digite um comando SQL ");
      jlabel1.setBounds(50,35,500,25);
      this.jtextField1 = new JTextField(50);
      jtextField1.setBounds(50,35,500,25);
      this.jbutton = new JButton("Executar");
      jbutton.setBounds(50,70,100,25);
      this.scrollTable = new JScrollPane(); 
      scrollTable.setBounds(50,100,500,300);
      add(scrollTable);
      add(jlabel1);
      add(jtextField1);
      add(jbutton);
      db= new Fabrica();
    }
    

    private void definirEventos() {
        jbutton.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         if(jtextField1.getText().equals("")){
             return;
         }
         try{
           if(db.getConnection() == true){
               statement = db.connecion.prepareStatement(jtextField1.getText());
               resultset = statement.executeQuery();
               DefaultTableModel tableModel = new DefaultTableModel(new String[]{},0){
               // tableModel é uma tabela de String é está  vazia !!    
               };
               int qtdColuna = resultset.getMetaData().getColumnCount(); // a quantidade de colunas 
               for(int indice = 1; indice <= qtdColuna; indice++ ){
                   tableModel.addColumn(resultset.getMetaData().getColumnName(indice));// o nome da primeira coluna vai para primeira posição
               }
               table = new JTable(tableModel);
               DefaultTableModel dtm = (DefaultTableModel) table.getModel();
               while(resultset.next()){
                   String[] dados  = new String[qtdColuna];
                   for(int i = 1; i <= qtdColuna; i++){
                       dados[i-1] =  resultset.getString(i);
                   }
                   dtm.addRow(dados);
                   System.out.println();
                  
           
               
                               scrollTable.setViewportView(table);
               }

                   resultset.close();
                   statement.close();
                   db.getClose();
           }else{
               JOptionPane.showMessageDialog(null,"Falha na conexao o sistema será fechado! ");
               System.exit(0);
           }
         }catch(Exception erro){
             JOptionPane.showMessageDialog(null,"Comando sql invalido "+ erro.toString());
         }
             
             }
        });
    }
}
