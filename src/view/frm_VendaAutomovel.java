
package view;

import classeJava.Cls_Calculo;

/**
 *
 * @author geoguitar
 */
public class frm_VendaAutomovel extends javax.swing.JFrame {

    public frm_VendaAutomovel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        labelAnoFabricacao = new javax.swing.JLabel();
        txtAnoFabricacao = new javax.swing.JTextField();
        txtValorBaseAutomovel = new javax.swing.JTextField();
        labelValorBase = new javax.swing.JLabel();
        labelValorFinal = new javax.swing.JLabel();
        txtValorFinalAutomovel = new javax.swing.JTextField();
        labelMarcaAutomovel = new javax.swing.JLabel();
        cmbMarcaAutomovel = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        txtMensagem = new javax.swing.JTextField();
        labelMensagem = new javax.swing.JLabel();
        labelVendaAutomovel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNomeCliente.setText("Nome do Cliente");

        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        labelAnoFabricacao.setText("Ano de Fabricação");

        txtAnoFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoFabricacaoActionPerformed(evt);
            }
        });

        txtValorBaseAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorBaseAutomovelActionPerformed(evt);
            }
        });

        labelValorBase.setText("Valor Base");

        labelValorFinal.setText("Valor Final");

        txtValorFinalAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorFinalAutomovelActionPerformed(evt);
            }
        });

        labelMarcaAutomovel.setText("Marca do Automóvel");

        cmbMarcaAutomovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIAT", "VW", "FORD", " " }));
        cmbMarcaAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaAutomovelActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtMensagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMensagem.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensagemActionPerformed(evt);
            }
        });

        labelMensagem.setText("Mensagem:");

        labelVendaAutomovel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        labelVendaAutomovel.setText("Venda de Automóvel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(labelVendaAutomovel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMensagem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValorBase)
                            .addComponent(labelValorFinal)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMarcaAutomovel)
                                    .addComponent(labelNomeCliente)
                                    .addComponent(labelAnoFabricacao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeCliente)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbMarcaAutomovel, 0, 169, Short.MAX_VALUE)
                                        .addGap(96, 96, 96))
                                    .addComponent(txtValorBaseAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorFinalAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVendaAutomovel)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarcaAutomovel)
                    .addComponent(cmbMarcaAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAnoFabricacao)
                    .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorBase)
                    .addComponent(txtValorBaseAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorFinal)
                    .addComponent(txtValorFinalAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(labelMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void txtAnoFabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoFabricacaoActionPerformed
       
    }//GEN-LAST:event_txtAnoFabricacaoActionPerformed

    private void txtValorBaseAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorBaseAutomovelActionPerformed
       
    }//GEN-LAST:event_txtValorBaseAutomovelActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed


        // inicializando variaveis
        float valorBase;
        String marcaAutomovel;
        String anoFabricacao;
        
        //Capturando as variaveis da tela
        valorBase = Float.parseFloat(txtValorBaseAutomovel.getText()); 
        marcaAutomovel = cmbMarcaAutomovel.getSelectedItem().toString();
        anoFabricacao = txtAnoFabricacao.getText();
       
        //Instanciar classe       
        Cls_Calculo obj_Calculo = new Cls_Calculo();
     
        //utilizar objeto      
      float CalculoValorFinalAutomovel = obj_Calculo.calculo(marcaAutomovel, anoFabricacao, valorBase);
         
        //Exibir os dados      
        txtValorFinalAutomovel.setText(String.valueOf(CalculoValorFinalAutomovel));
        
        txtMensagem.setText(
                "Prezado "
                +txtNomeCliente.getText()
                +" o valor do seu automóvel será de R$"
                +String.valueOf(CalculoValorFinalAutomovel)
        );
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cmbMarcaAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaAutomovelActionPerformed
       
    }//GEN-LAST:event_cmbMarcaAutomovelActionPerformed

    private void txtValorFinalAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorFinalAutomovelActionPerformed
    }//GEN-LAST:event_txtValorFinalAutomovelActionPerformed

    private void txtMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensagemActionPerformed
    }//GEN-LAST:event_txtMensagemActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_VendaAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_VendaAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_VendaAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_VendaAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_VendaAutomovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbMarcaAutomovel;
    private javax.swing.JLabel labelAnoFabricacao;
    private javax.swing.JLabel labelMarcaAutomovel;
    private javax.swing.JLabel labelMensagem;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelValorBase;
    private javax.swing.JLabel labelValorFinal;
    private javax.swing.JLabel labelVendaAutomovel;
    private javax.swing.JTextField txtAnoFabricacao;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtValorBaseAutomovel;
    private javax.swing.JTextField txtValorFinalAutomovel;
    // End of variables declaration//GEN-END:variables
}
