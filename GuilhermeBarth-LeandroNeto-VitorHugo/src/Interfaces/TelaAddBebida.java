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
import java.awt.PopupMenu;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class TelaAddBebida extends javax.swing.JFrame {

    /**
     * Creates new form TelaAddBebida
     */
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    private static ArrayList<ProdutoBebida> bebidas = new ArrayList<>();
    private static ArrayList<ProdutoPizza> pizzas = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public TelaAddBebida(ArrayList<Pedido> pedidos, ArrayList<Ingrediente> ingredientes, ArrayList<ProdutoBebida> bebidas, ArrayList<ProdutoPizza> pizzas, ArrayList<Cliente> clientes) {
        this.bebidas = bebidas;
        this.pedidos = pedidos;
        this.ingredientes = ingredientes;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        combo_Embalagens = new javax.swing.JComboBox<>();
        tf_Custo = new javax.swing.JTextField();
        tf_Volume = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_Cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Embalagem");

        jLabel3.setText("Custo");

        jLabel4.setText("Volume (litros)");

        tf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeActionPerformed(evt);
            }
        });

        combo_Embalagens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caixa", "Garrafa de Vidro", "Garrafa", "Garrafa Plastica", "Lata", "Outros" }));
        combo_Embalagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_EmbalagensActionPerformed(evt);
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
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_Nome)
                                .addComponent(combo_Embalagens, 0, 242, Short.MAX_VALUE)
                                .addComponent(tf_Custo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_Embalagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancelar)
                    .addComponent(btn_Cadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomeActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        InterfacePrincipal principal = new InterfacePrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarActionPerformed
        boolean necessitaMostrarMensagem = true;
        try {
            for (ProdutoBebida b : bebidas) {
                if (b.getNome().equals(tf_Nome.getText())) {
                    JOptionPane.showMessageDialog(this, "Já existe uma bebida com este nome", "Erro", JOptionPane.WARNING_MESSAGE);
                    necessitaMostrarMensagem = false;
                    throw new Exception();
                }
            }
            if (tf_Volume.getText().equals("") || tf_Custo.getText().equals("") || tf_Nome.getText().equals("")) {
                throw new Exception();
            }
            String embalagem = String.valueOf(combo_Embalagens.getSelectedItem());

            ProdutoBebida bebida = new ProdutoBebida();
            bebida.setNome(tf_Nome.getText());
            bebida.setEmbalagem(embalagem);
            bebida.setVolume(Float.parseFloat(tf_Volume.getText()));
            bebida.setValorBase(Double.parseDouble(tf_Custo.getText()));
            bebidas.add(bebida);

            JOptionPane.showMessageDialog(this, "Bebida cadastrada com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            InterfacePrincipal principal = new InterfacePrincipal(pedidos, ingredientes, bebidas, pizzas, clientes);
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            dispose();

        } catch (Exception e) {
            if (necessitaMostrarMensagem) {
                JOptionPane.showMessageDialog(this, "Um ou mais campos não foram preenchidos corretamente", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_CadastrarActionPerformed

    private void combo_EmbalagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_EmbalagensActionPerformed

    }//GEN-LAST:event_combo_EmbalagensActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddBebida(pedidos, ingredientes, bebidas, pizzas, clientes).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JComboBox<String> combo_Embalagens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tf_Custo;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_Volume;
    // End of variables declaration//GEN-END:variables
}
