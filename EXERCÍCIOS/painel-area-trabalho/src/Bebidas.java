/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricacio
 */
public class Bebidas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Bebidas
     */
    public Bebidas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cafe = new javax.swing.JRadioButton();
        cha = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        buttonGroup1.add(cafe);
        cafe.setText("café");

        buttonGroup1.add(cha);
        cha.setText("chá");
        cha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaActionPerformed(evt);
            }
        });

        jButton1.setText("Botão");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(cha)
                    .addComponent(cafe))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(cafe)
                .addGap(18, 18, 18)
                .addComponent(cha)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cafe.isSelected()){
            jLabel1.setText("Café selecionado");
        }else if(cha.isSelected()){
            jLabel1.setText("Chá selecionado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cafe;
    private javax.swing.JRadioButton cha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
