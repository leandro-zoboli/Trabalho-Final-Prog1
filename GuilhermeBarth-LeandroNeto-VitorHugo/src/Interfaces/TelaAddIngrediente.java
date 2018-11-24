/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Cliente;
import Classes.Ingrediente;
import Classes.Pedido;
import Classes.ProdutoBebida;
import Classes.ProdutoPizza;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vhelmbrecht
 */
public class TelaAddIngrediente extends javax.swing.JFrame {

    public TelaAddIngrediente() {
        initComponents();
    }

    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    private static ArrayList<ProdutoBebida> bebidas = new ArrayList<>();
    private static ArrayList<ProdutoPizza> pizzas = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    
    TelaAddIngrediente(ArrayList<Pedido> pedidos, ArrayList<Ingrediente> ingredientes, ArrayList<ProdutoBebida> bebidas, ArrayList<ProdutoPizza> pizzas, ArrayList<Cliente> clientes) {
        this.pedidos = pedidos;
        this.ingredientes = ingredientes;
        this.bebidas = bebidas;
        this.pizzas = pizzas;
        this.clientes = clientes;
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

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        tf_Valor = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_Cadastrar = new javax.swing.JButton();

        jButton2.setText("Cadastrar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Valor Unitário");

        tf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Cadastrar.setText("Cadastrar");
        btn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(btn_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(btn_Cancelar)
                .addGap(50, 50, 50))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(219, Short.MAX_VALUE)
                    .addComponent(btn_Cadastrar)
                    .addGap(49, 49, 49)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed
        
    }//GEN-LAST:event_tf_NomeActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        InterfacePrincipal principal = new InterfacePrincipal(pedidos, ingredientes, bebidas, pizzas, clientes);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarActionPerformed
         try {
            if (tf_Valor.getText().equals("") || tf_Nome.getText().equals("")) {
                throw new Exception();
            }
            Ingrediente igrediente = new Ingrediente();
            igrediente.setNome(tf_Nome.getText());
            igrediente.setCustoUnitario(Float.parseFloat(tf_Valor.getText()));
            ingredientes.add(igrediente);
            JOptionPane.showMessageDialog(this, "Igrediente cadastrado com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            InterfacePrincipal principal = new InterfacePrincipal(pedidos, ingredientes, bebidas, pizzas, clientes);
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Um ou mais campos não foram preenchidos corretamente", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_CadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddIngrediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_Valor;
    // End of variables declaration//GEN-END:variables
}
