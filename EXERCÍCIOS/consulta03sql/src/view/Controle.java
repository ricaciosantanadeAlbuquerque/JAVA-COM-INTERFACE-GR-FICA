
package view;
import java.sql.*;
import conexao.Conexao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controle extends javax.swing.JFrame {
     private PreparedStatement statement;
     private   ResultSet resultado;
     private  Conexao novoConexao;
    public Controle() {
        initComponents();
        setResizable(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta SQL");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite o comando SQL a Baixo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 250, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 420, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 420, 320));

        jButton1.setText("Executar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/4e48e8a57dfff88a07385f5d044abb2f.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(jTextField1.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Preencha os campos ");
       }else{
         novoConexao = new Conexao();
        if(!novoConexao.getConnection() == true){
             JOptionPane.showMessageDialog(null,"Falha  na conexão com o banco, o sistema será fechado ");
             System.exit(0);
        }else{
            String sql = jTextField1.getText(); // recebe o código sql através do jTextField1
            try {
                this.statement = novoConexao.connection.prepareStatement(sql);
                this.resultado = statement.executeQuery();
                DefaultTableModel tabela1 = new DefaultTableModel(new Object[]{},0);// Object[] x = new Obejct[10];
                
                int qtdColuna = resultado.getMetaData().getColumnCount();
               for(int indice = 1; indice <= qtdColuna;indice++){
                   tabela1.addColumn(resultado.getMetaData().getColumnName(indice));
               }
               jTable1 = new JTable(tabela1);
                 DefaultTableModel tabelaFinal = (DefaultTableModel) jTable1.getModel();
                 while(resultado.next()){ // varrendo a tabela sql contida em resultado
                     Object[] dados = new Object[qtdColuna];
                     for(int i = 1;i <= qtdColuna;i++ ){
                         dados[i-1] = resultado.getObject(i); // i - 1 é para que ele não estoure o array dados[]
                     }
                     tabelaFinal.addRow(dados);
                     System.out.println();
                     jScrollPane1.setViewportView(jTable1);
                 }
                   resultado.close();
                   statement.close();
                   novoConexao.getClose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Falha ao conectar com o banco de dados"+ex.toString());
            }
          
            
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(() -> {
            new Controle().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
