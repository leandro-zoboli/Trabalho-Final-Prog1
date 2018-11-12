package Interfaces;

import Interfaces.*;

public class InterfacePrincipal extends javax.swing.JFrame {

    public InterfacePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtPedido = new javax.swing.JButton();
        BtProduto = new javax.swing.JButton();
        BtIngrediente = new javax.swing.JButton();
        BtCliente = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtPedido.setText("Cadastrar pedido");
        BtPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPedidoActionPerformed(evt);
            }
        });

        BtProduto.setText("Cadastrar produto");
        BtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtProdutoActionPerformed(evt);
            }
        });

        BtIngrediente.setText("Cadastrar Ingrediente");
        BtIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIngredienteActionPerformed(evt);
            }
        });

        BtCliente.setText("Cadastrar Cliente");
        BtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClienteActionPerformed(evt);
            }
        });

        BtSair.setText("Sair / Terminar Expediente");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtSair)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtPedido)
                    .addComponent(BtProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtIngrediente)
                    .addComponent(BtCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(BtSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        Relatorio relatorio = new Relatorio();
        relatorio.setVisible(true);
        relatorio.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtSairActionPerformed

    private void BtPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPedidoActionPerformed
        Pedido pedido = new Pedido();
        pedido.setVisible(true);
        pedido.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtPedidoActionPerformed

    private void BtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtProdutoActionPerformed
        Produto produto = new Produto();
        produto.setVisible(true);
        produto.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtProdutoActionPerformed

    private void BtIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIngredienteActionPerformed
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setVisible(true);
        ingrediente.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtIngredienteActionPerformed

    private void BtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClienteActionPerformed
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtClienteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCliente;
    private javax.swing.JButton BtIngrediente;
    private javax.swing.JButton BtPedido;
    private javax.swing.JButton BtProduto;
    private javax.swing.JButton BtSair;
    // End of variables declaration//GEN-END:variables
}
