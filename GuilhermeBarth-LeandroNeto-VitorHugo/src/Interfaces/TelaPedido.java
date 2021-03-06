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
import Classes.Produto;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vhelmbrecht
 */
public class TelaPedido extends javax.swing.JFrame {

    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    private ArrayList<ProdutoBebida> bebidas = new ArrayList<>();
    private ArrayList<ProdutoPizza> pizzas = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Produto> produtosSelecionados = new ArrayList<>();
    private Pedido pedido = new Pedido(pedidos.size() + 1);
    private Produto ProdutoSelecionado = null;
    String nomeProdutoSelecionado = "";
    DefaultTableModel modeloTabela = new DefaultTableModel();

    public TelaPedido() {
        initComponents();
        setTitle("Cadastro de pedidos");
    }

    TelaPedido(ArrayList<Pedido> pedidos, ArrayList<Ingrediente> ingredientes, ArrayList<ProdutoBebida> bebidas, ArrayList<ProdutoPizza> pizzas, ArrayList<Cliente> clientes, ArrayList<Produto> produtos) {
        this.pedidos = pedidos;
        this.ingredientes = ingredientes;
        this.bebidas = bebidas;
        this.pizzas = pizzas;
        this.clientes = clientes;
        this.produtos = produtos;
        initComponents();
        AdicionaProdutosNoComboBox();
        setTitle("Cadastro de pedidos");

        modeloTabela.addColumn("Nome");
        modeloTabela.addColumn("Unitário");
        modeloTabela.addColumn("Quantidade");
        modeloTabela.addColumn("Total");
    }

    private void AdicionaProdutosNoComboBox() {
        int length = 0;
        for (Produto i : this.produtos) {
            length++;
        }
        String[] vetorProdutos = new String[length + 1];
        vetorProdutos[0] = "Selecione...";
        String[] vetorTipos;
        int index = 1;
        for (Produto i : this.produtos) {
            vetorProdutos[index] = i.getNome();
            index++;
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(vetorProdutos);
        combo_Produtos.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_Telefone = new javax.swing.JTextField();
        tf_NomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_Endereco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_ValorTotal = new javax.swing.JTextField();
        btn_Confirmar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        combo_Produtos = new javax.swing.JComboBox<>();
        btn_AdicionaProduto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_Geral = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CbInfo = new javax.swing.JComboBox<>();
        LInfo = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome do cliente");

        jLabel2.setText("Telefone");

        jLabel3.setText(" ");

        tf_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_TelefoneActionPerformed(evt);
            }
        });

        tf_NomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço");

        tf_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EnderecoActionPerformed(evt);
            }
        });

        jLabel13.setText("Valor total:");

        tf_ValorTotal.setEditable(false);
        tf_ValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ValorTotalActionPerformed(evt);
            }
        });

        btn_Confirmar.setText("Confirmar pedido");
        btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        jLabel14.setText("Produto");

        combo_Produtos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_ProdutosItemStateChanged(evt);
            }
        });
        combo_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_ProdutosActionPerformed(evt);
            }
        });

        btn_AdicionaProduto.setText("Adicionar");
        btn_AdicionaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionaProdutoActionPerformed(evt);
            }
        });

        tabela_Geral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Unitário", "Quantidade", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
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
        jScrollPane3.setViewportView(tabela_Geral);
        if (tabela_Geral.getColumnModel().getColumnCount() > 0) {
            tabela_Geral.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Sobre o cliente ----------------------------------------------------------------------------------------------------");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pedido -------------------------------------------------------------------------------------------------------------");

        LInfo.setText("Info.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel1))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_NomeCliente)
                                    .addComponent(tf_Endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                    .addComponent(tf_Telefone)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(LInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_AdicionaProduto)))
                        .addGap(121, 121, 121))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(tf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(combo_Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AdicionaProduto)
                    .addComponent(CbInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Confirmar)
                    .addComponent(btn_Cancelar)
                    .addComponent(jLabel13)
                    .addComponent(tf_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_TelefoneActionPerformed

    private void tf_NomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomeClienteActionPerformed

    private void tf_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EnderecoActionPerformed

    private void tf_ValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ValorTotalActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed

        InterfacePrincipal principal = new InterfacePrincipal(pedidos, ingredientes, bebidas, pizzas, clientes);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed
        boolean mostrarErro = true;
        try {
            if (tf_NomeCliente.getText().equals("") || tf_Telefone.getText().equals("") || tf_Endereco.getText().equals("")) {
                mostrarErro = false;
                JOptionPane.showMessageDialog(this, "Um ou mais campos do cliente estão em branco, favor preencher", "Erro", JOptionPane.WARNING_MESSAGE);
                throw new Exception();
            }
            Cliente cliente = new Cliente(tf_NomeCliente.getText(), tf_Telefone.getText(), tf_Endereco.getText());
            pedido.setCliente(cliente);
            pedidos.add(pedido);
            JOptionPane.showMessageDialog(this, "Pedido cadastrado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            InterfacePrincipal principal = new InterfacePrincipal();
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            dispose();
        } catch (Exception erro) {
            if (mostrarErro) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao adicionar o produto ao pedido", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_ConfirmarActionPerformed

    private void combo_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ProdutosActionPerformed

    }//GEN-LAST:event_combo_ProdutosActionPerformed

    private void btn_AdicionaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionaProdutoActionPerformed
        try {
            String InfoSelecionada = CbInfo.getSelectedItem().toString();

            if (ProdutoSelecionado == null) {
                throw new Exception("O produto selecionado não está registrado!");
            }

            boolean produtoNovo = true;

            for (Produto p : produtosSelecionados) {
                if (p.getID() == ProdutoSelecionado.getID()) {
                    produtoNovo = false;
                    ProdutoSelecionado.setQuantidade(ProdutoSelecionado.getQuantidade() + 1);
                }
            }

            if (produtoNovo) {
                if (ProdutoSelecionado.getTipoProduto().equals("Bebida")) {
                    ProdutoSelecionado.setQuantidade(1);
                    pedido.Bebidas.add((ProdutoBebida) ProdutoSelecionado);
                } else {
                    ProdutoSelecionado.setQuantidade(1);
                    pedido.Pizzas.add((ProdutoPizza) ProdutoSelecionado);
                }
            }

            if (produtoNovo) {
                produtosSelecionados.add(ProdutoSelecionado);
                modeloTabela.addRow(ProdutoSelecionado.RetornaFormatoTabela(CbInfo.getSelectedItem().toString()));
            } else {
                int linha = 0;
                for (Produto p : produtosSelecionados) {
                    if (p.getNome().equals(ProdutoSelecionado.getNome())) {
                        modeloTabela.setValueAt(p.getQuantidade(), linha, 2);
                        modeloTabela.setValueAt(p.GetValorVenda(CbInfo.getSelectedItem().toString()), linha, 3);
                    }
                    linha++;
                }
            }
            tf_ValorTotal.setText("R$ " + pedido.GetValorTotalPedido(ProdutoSelecionado, CbInfo.getSelectedItem().toString()));
            tabela_Geral.setModel(modeloTabela);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao adicionar o produto ao pedido", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_AdicionaProdutoActionPerformed

    private void combo_ProdutosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_ProdutosItemStateChanged
        try {
            nomeProdutoSelecionado = combo_Produtos.getSelectedItem().toString();
            if (nomeProdutoSelecionado.equals("Selecione...")) {
                LInfo.setText("");
                
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                CbInfo.setModel(modelo);
            } else {
                for (Produto p : produtos) {
                    if (p.getNome().equals(nomeProdutoSelecionado)) {
                        ProdutoSelecionado = p;
                    }
                }
                if (ProdutoSelecionado == null) {
                    throw new Exception();
                }
                String[] tipos = new String[ProdutoSelecionado.getTipos().size()];
                for (int i = 0; i < tipos.length; i++) {
                    tipos[i] = ProdutoSelecionado.getTipos().get(i);
                }

                if (ProdutoSelecionado.getTipoProduto().equals("Bebida")) {
                    LInfo.setText("Embalagem");
                } else {
                    LInfo.setText("Tamanho");
                }
                String Infos[] = new String[ProdutoSelecionado.getTipos().size()];
                for (int i = 0; i < ProdutoSelecionado.getTipos().size(); i++) {
                    Infos[i] = ProdutoSelecionado.getTipos().get(i);
                }
                DefaultComboBoxModel modelo = new DefaultComboBoxModel(Infos);
                CbInfo.setModel(modelo);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao selecionar o produto", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_combo_ProdutosItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbInfo;
    private javax.swing.JLabel LInfo;
    private javax.swing.JButton btn_AdicionaProduto;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JComboBox<String> combo_Produtos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tabela_Geral;
    private javax.swing.JTextField tf_Endereco;
    private javax.swing.JTextField tf_NomeCliente;
    private javax.swing.JTextField tf_Telefone;
    private javax.swing.JTextField tf_ValorTotal;
    // End of variables declaration//GEN-END:variables

}
