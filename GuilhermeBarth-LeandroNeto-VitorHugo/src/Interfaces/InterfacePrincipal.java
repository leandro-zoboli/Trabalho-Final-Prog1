package Interfaces;

import Classes.Ingrediente;
import Classes.Pedido;
import Classes.ProdutoBebida;
import Classes.ProdutoPizza;
import Classes.Cliente;
import Classes.Produto;
import java.util.ArrayList;

public class InterfacePrincipal extends javax.swing.JFrame {

    public InterfacePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    private static ArrayList<ProdutoBebida> bebidas = new ArrayList<>();
    private static ArrayList<ProdutoPizza> pizzas = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    
    InterfacePrincipal(ArrayList<Pedido> pedidos, ArrayList<Ingrediente> ingredientes, ArrayList<ProdutoBebida> bebidas, ArrayList<ProdutoPizza> pizzas, ArrayList<Cliente> clientes) {
        this.pedidos = pedidos;
        this.ingredientes = ingredientes;
        this.bebidas = bebidas;
        this.pizzas = pizzas;
        this.clientes = clientes;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtPedido = new javax.swing.JButton();
        BtProduto = new javax.swing.JButton();
        BtIngrediente = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();
        btn_AddBebida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtPedido.setText("Cadastrar pedido");
        BtPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPedidoActionPerformed(evt);
            }
        });

        BtProduto.setText("Cadastrar pizza");
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

        BtSair.setText("Sair / Terminar Expediente");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        btn_AddBebida.setText("Cadastrar Bebida");
        btn_AddBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddBebidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_AddBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(BtSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtPedido)
                    .addComponent(BtProduto)
                    .addComponent(BtIngrediente)
                    .addComponent(btn_AddBebida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BtSair)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        TelaRelatorio relatorio = new TelaRelatorio(pedidos, ingredientes, bebidas, pizzas, clientes);
        relatorio.setVisible(true);
        relatorio.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtSairActionPerformed

    private void BtPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPedidoActionPerformed
        ArrayList<Produto> produtos = new ArrayList<>();
        for (ProdutoBebida i : this.bebidas){
            produtos.add(i);
        }
         for (ProdutoPizza i : this.pizzas){
            produtos.add(i);
        }
        TelaPedido pedido = new TelaPedido(pedidos, ingredientes, bebidas, pizzas, clientes, produtos);
        pedido.setVisible(true);
        pedido.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtPedidoActionPerformed

    private void BtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtProdutoActionPerformed
        TelaAddPizza produto = new TelaAddPizza(pedidos, ingredientes, bebidas, pizzas, clientes);
        produto.setVisible(true);
        produto.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtProdutoActionPerformed

    private void BtIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIngredienteActionPerformed
        TelaAddIngrediente ingrediente = new TelaAddIngrediente(pedidos, ingredientes, bebidas, pizzas, clientes);
        ingrediente.setVisible(true);
        ingrediente.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtIngredienteActionPerformed

    private void btn_AddBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddBebidaActionPerformed
        TelaAddBebida bebida = new TelaAddBebida(pedidos, ingredientes, bebidas, pizzas, clientes);
        bebida.setVisible(true);
        bebida.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_AddBebidaActionPerformed

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
    private javax.swing.JButton BtIngrediente;
    private javax.swing.JButton BtPedido;
    private javax.swing.JButton BtProduto;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton btn_AddBebida;
    // End of variables declaration//GEN-END:variables
}
