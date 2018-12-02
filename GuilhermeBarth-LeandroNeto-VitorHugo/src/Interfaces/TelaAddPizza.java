/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Cliente;
import Classes.Ingrediente;
import Classes.Pedido;
import Classes.Produto;
import Classes.ProdutoBebida;
import Classes.ProdutoPizza;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vhelmbrecht
 */
public class TelaAddPizza extends javax.swing.JFrame {

    public TelaAddPizza() {
        initComponents();
    }

    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    private static ArrayList<ProdutoBebida> bebidas = new ArrayList<>();
    private static ArrayList<ProdutoPizza> pizzas = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ProdutoPizza pizza = new ProdutoPizza();

    TelaAddPizza(ArrayList<Pedido> pedidos, ArrayList<Ingrediente> ingredientes, ArrayList<ProdutoBebida> bebidas, ArrayList<ProdutoPizza> pizzas, ArrayList<Cliente> clientes) {
        this.pedidos = pedidos;
        this.ingredientes = ingredientes;
        this.bebidas = bebidas;
        this.pizzas = pizzas;
        this.clientes = clientes;
        initComponents();
        AdicionaIngredientesNoComboBox();
    }

    private void AdicionaIngredientesNoComboBox() {
        int length = 0;
        for (Ingrediente i : this.ingredientes) {
            length++;
        }
        String[] vetorIngredientes = new String[length];
        int index = 0;
        for (Ingrediente i : this.ingredientes) {
            vetorIngredientes[index] = i.getNome();
            index++;
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(vetorIngredientes);
        combo_ingredientes.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel1 = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combo_ingredientes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tf_Qtd = new javax.swing.JTextField();
        btn_AddIgrediente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tf_ValorTotal = new javax.swing.JTextField();
        btn_Cancelar = new javax.swing.JButton();
        btn_Cadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Geral = new javax.swing.JTable();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Igrediente");

        combo_ingredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_ingredientesActionPerformed(evt);
            }
        });

        jLabel3.setText("Qtd (Kg)");

        tf_Qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_QtdActionPerformed(evt);
            }
        });

        btn_AddIgrediente.setText("Adicionar Igrediente");
        btn_AddIgrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddIgredienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor Total da pizza");

        tf_ValorTotal.setEditable(false);

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Cadastrar.setText("Cadastrar (ver ficha)");
        btn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarActionPerformed(evt);
            }
        });

        tabela_Geral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente", "Quantidade", "Custo unitário", "Custo item"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_Geral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_Nome)))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_ValorTotal)
                    .addComponent(btn_AddIgrediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cadastrar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancelar)
                    .addComponent(btn_AddIgrediente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_QtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_QtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_QtdActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        pizza.ingredientes.clear();
        InterfacePrincipal principal = new InterfacePrincipal(pedidos, ingredientes, bebidas, pizzas, clientes);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarActionPerformed
        try {
            if (tf_Nome.getText().equals("")) {
                throw new Exception();
            }
            ProdutoPizza pizza = new ProdutoPizza();
            pizza.setNome(tf_Nome.getText());
            pizzas.add(pizza);

            JOptionPane.showMessageDialog(this, "Pizza cadastrada com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            InterfacePrincipal principal = new InterfacePrincipal(pedidos, ingredientes, bebidas, pizzas, clientes);
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Um ou mais campos não foram preenchidos corretamente", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_CadastrarActionPerformed

    private void combo_ingredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ingredientesActionPerformed

    }//GEN-LAST:event_combo_ingredientesActionPerformed

    private void btn_AddIgredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddIgredienteActionPerformed
        try {
            if(tf_Qtd.getText().equals("")){
                tf_Qtd.setText("0.00");
            }
            String nomeEscolhido = (String) combo_ingredientes.getSelectedItem();
            double quantidadeDigitada = Double.parseDouble(tf_Qtd.getText());
            
            Ingrediente escolhido = null;
            for (Ingrediente i : ingredientes){
                if (i.getNome().equals(nomeEscolhido)){
                    escolhido = i;
                }
            }
            if(escolhido == null){
                throw new Exception();
            }
            escolhido.setQuantidade(quantidadeDigitada);
            boolean ingredienteNovo = true;
            for (Ingrediente i : pizza.getIngredientes()){
                if(i.getNome().equals(escolhido.getNome())){
                    ingredienteNovo = false;
                    i.setQuantidade(i.getQuantidade() + quantidadeDigitada);
                }
            }
            
            if (ingredienteNovo){
                pizza.ingredientes.add(escolhido);
            }
            DefaultTableModel modeloTabela = new DefaultTableModel();
            modeloTabela.addColumn("Ingrediente");
            modeloTabela.addColumn("Quantidade");
            modeloTabela.addColumn("Custo unitário");
            modeloTabela.addColumn("Custo item");
            for (int i = 0; i < pizza.ingredientes.size(); i++) {
                Ingrediente temp = pizza.ingredientes.get(i);
                modeloTabela.addRow(temp.RetornaModeloTabela());
            }
            tf_Qtd.setText("");
            tf_ValorTotal.setText("R$ " + pizza.getValorTotal());
            tabela_Geral.setModel(modeloTabela);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao adicionar o ingrediente na pizza", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_AddIgredienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaAddPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddIgrediente;
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JComboBox<String> combo_ingredientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTable tabela_Geral;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_Qtd;
    private javax.swing.JTextField tf_ValorTotal;
    // End of variables declaration//GEN-END:variables
}
