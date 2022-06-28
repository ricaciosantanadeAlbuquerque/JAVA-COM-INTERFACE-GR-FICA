import java.util.ArrayList;
import javax.swing.JOptionPane;
public class SistemaLogin extends javax.swing.JFrame implements Intercafe {
  public ArrayList<Usuario> estrutura = new ArrayList();
    Cadastro registro = new Cadastro();
    Jogo partida;
    public SistemaLogin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBcadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("JOGO DE ADIVINHAÇÃO");

        jLabel2.setText("Nome");

        jLabel3.setText("Senha");

        jLabel4.setText("status");

        jLabel5.setText("jLabel5");

        jButton1.setText("Jogar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBcadastro.setText("Cadastrar");
        jBcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jBcadastro))
                            .addComponent(jTextField1)
                            .addComponent(jTextField2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jBcadastro))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastroActionPerformed
                if(this.registro == null){ // se registro não possuir um objeto
                    registro = new Cadastro(); //  registro recebe uma nova instância e passa a possuir um objeto cadastro
                    registro.setLocationRelativeTo(null); // Centralizando o objeto registro
                    registro.setResizable(false);// desabilitando a possibilidade de redimensionamento 
                    registro.setVisible(true); // Deixando o objeto visível
                }else{
                    registro.setLocationRelativeTo(null); // Centralizando o objeto registro
                    registro.setResizable(false);// desabilitando a possibilidade de redimensionamento 
                    registro.setVisible(true); // Deixando o objeto visível
                }
                registro.indoParaCadastro(this); //TIRAR DUVIDAE THIS? COMO PARÂMETRO QUEM REFERENCIA 
    }//GEN-LAST:event_jBcadastroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nomeUsuario = jTextField1.getText(); // entrada de dados 
        String senha = jTextField2.getText(); // entrada de dados 
        int cont= 0;
        
              if(nomeUsuario.equals("") && senha.equals("")){
                      JOptionPane.showMessageDialog(this," Preencha os campos  por favor ! ");
           
            }else{
                  
             for(Usuario valor :estrutura){ // foreach para cada elemento do meu ArrayList() estrutura passe para valor
                 
                if((senha.equals(valor.getSenha()) && (nomeUsuario.equals(valor.getNome())))){ // estou comparando o valor de ["senha"] e ["Nome"] com o valor do atribulto do objeto contido no ArrayList() na posição N
                                              // Exemplo na posição 0 tem um objeto ? tem!!! então eu quero o getSenha() e getNome() dele;
                        cont++; // só conta se for verdadeiro                           
                  jLabel5.setText("Aberto");
                       if(this.partida == null){ // se não foi criado um objeto
                       partida = new Jogo();
                       partida.setLocationRelativeTo(null);
                       partida.setResizable(false);
                       partida.setVisible(true);
                        partida.indoParaJogo(this);
                   }else{// porém se já foi criado o objeto Tela jogo não é necessário criar outro, pois só ocuparia espaço na memória
                       partida.setLocationRelativeTo(null);
                       partida.setResizable(false);
                       partida.setVisible(true); 
                        partida.indoParaJogo(this);
                   }
                    break; // Quebra da estrutura
                }
              }
             if(cont <=0){
                 JOptionPane.showMessageDialog(this," Senha ou Nome Inválidos");
             }
            }
      //  partida.indoParaJogo(this); se a chamada for feita  nesta linha ocasionará um erro 
      // pois o objeto partida só pode ser visualizado dentro do escopo das condiçoes if else 
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SistemaLogin().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cadastrar(Usuario valor1) {
    estrutura.add(valor1);
    }

    @Override
    public void deletar(Usuario valor1) {
        estrutura.remove(valor1);
    }

    @Override
    public void mostrarLista() {
        
        for(Usuario mostra:estrutura){
            JOptionPane.showMessageDialog(this,mostra.toString());
        }
    }
}
