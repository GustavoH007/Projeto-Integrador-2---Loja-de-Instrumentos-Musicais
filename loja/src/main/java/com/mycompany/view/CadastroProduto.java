/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.dao.ProdutoDAO;
import com.mycompany.model.Produto;
import com.mycompany.utils.Validador;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author gusta
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroProduto() {
        initComponents();

        this.btnAlterarProduto.setVisible(false);
        this.lbltxtIdProduto.setVisible(false);
        this.lblIdProduto.setVisible(false);
    }

    public CadastroProduto(Produto objProduto) {
        initComponents();

        TitledBorder Titulo = BorderFactory.createTitledBorder("Alterar");
        this.pnlCadastroPoduto.setBorder(Titulo);
        this.btnCadastrarProduto.setVisible(false);
        this.btnAlterarProduto.setVisible(true);
        this.lbltxtIdProduto.setVisible(true);
        this.lblIdProduto.setVisible(true);

        this.lblIdProduto.setText(String.valueOf(objProduto.getId()));
        this.txtNomeProduto.setText(objProduto.getNome());
        this.cbCategoriaProduto.setSelectedItem(objProduto.getCategoria());
        this.txtaDescricaoProduto.setText(objProduto.getDescricao());
        this.cbCor.setSelectedItem(objProduto.getCor());
        this.ftxtValorCusto.setText(String.valueOf(objProduto.getValorCusto()));
        this.ftxtValorVenda.setText(String.valueOf(objProduto.getValorVenda()));
        this.ftxtQuantidadeProduto.setText(String.valueOf(objProduto.getQuantidade()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastroPoduto = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        btnCadastrarProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbCategoriaProduto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescricaoProduto = new javax.swing.JTextArea();
        ftxtValorCusto = new javax.swing.JFormattedTextField();
        ftxtValorVenda = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ftxtQuantidadeProduto = new javax.swing.JFormattedTextField();
        cbCor = new javax.swing.JComboBox<>();
        lbltxtIdProduto = new javax.swing.JLabel();
        lblIdProduto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");
        setLocationByPlatform(true);
        setType(java.awt.Window.Type.POPUP);

        pnlCadastroPoduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        jLabel67.setText("*Nome:");

        jLabel69.setText("Descrição:");

        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("*Categoria:");

        cbCategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Violão", "Guitarra", "Contra-Baixo", "Percursão", "Metal", "Teclado", "Piano-Eletrônico" }));

        jLabel3.setText("*Valor de Custo:");

        jLabel4.setText("*Valor de Venda:");

        txtaDescricaoProduto.setColumns(10);
        txtaDescricaoProduto.setRows(1);
        jScrollPane1.setViewportView(txtaDescricaoProduto);

        ftxtValorCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        ftxtValorCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtValorCustoActionPerformed(evt);
            }
        });
        ftxtValorCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftxtValorCustoKeyTyped(evt);
            }
        });

        ftxtValorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        ftxtValorVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftxtValorVendaKeyTyped(evt);
            }
        });

        jLabel5.setText("Cor:");

        jLabel6.setText("*Quantidade:");

        ftxtQuantidadeProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftxtQuantidadeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftxtQuantidadeProdutoKeyTyped(evt);
            }
        });

        cbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Bege", "Azul", "Azul e Branco", "Azul e Preto", "Vermelho", "Vermelho e Branco", "Vermelho e Preto", "Amarelo", "Amarelo e Branco", "Amarelo e Preto", "Verde", "Verde e Branco", "Verde e Preto" }));

        lbltxtIdProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltxtIdProduto.setText("ID:");

        lblIdProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlCadastroPodutoLayout = new javax.swing.GroupLayout(pnlCadastroPoduto);
        pnlCadastroPoduto.setLayout(pnlCadastroPodutoLayout);
        pnlCadastroPodutoLayout.setHorizontalGroup(
            pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroPodutoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbltxtIdProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroPodutoLayout.createSequentialGroup()
                        .addComponent(lblIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroPodutoLayout.createSequentialGroup()
                        .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlCadastroPodutoLayout.createSequentialGroup()
                                .addComponent(txtNomeProduto)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroPodutoLayout.createSequentialGroup()
                                .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ftxtValorVenda)
                                    .addComponent(ftxtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroPodutoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroPodutoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlCadastroPodutoLayout.setVerticalGroup(
            pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroPodutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroPodutoLayout.createSequentialGroup()
                        .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlCadastroPodutoLayout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addGap(88, 88, 88)
                                .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(ftxtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))
                        .addGap(31, 31, 31)
                        .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCadastroPodutoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltxtIdProduto)))))
                    .addGroup(pnlCadastroPodutoLayout.createSequentialGroup()
                        .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ftxtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlCadastroPodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ftxtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroPoduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroPoduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed

        int Id = Integer.parseInt(lblIdProduto.getText());

        String Nome = String.valueOf(txtNomeProduto.getText());
        String Categoria = String.valueOf(cbCategoriaProduto.getSelectedItem());
        String Descricao = String.valueOf(txtaDescricaoProduto.getText());
        String Cor = String.valueOf(cbCor.getSelectedItem());

        Validador validarProduto = new Validador();

        if (!validarProduto.isCampoString(Nome) || !validarProduto.isCampoComboBox(cbCategoriaProduto.getSelectedIndex()) || ftxtValorCusto.getValue() == null || ftxtValorVenda.getValue() == null || ftxtQuantidadeProduto.getValue() == null) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!");

            String preencherCampos = "Preencha corretamente os campos:\n";

            if (!validarProduto.isCampoString(Nome)) {
                preencherCampos += "\n- Nome";
            }
            if (!validarProduto.isCampoComboBox(cbCategoriaProduto.getSelectedIndex())) {
                preencherCampos += "\n- Categoria";
            }
            if (ftxtValorCusto.getValue() == null) {
                preencherCampos += "\n- Valor de Custo";
            }
            if (ftxtValorVenda.getValue() == null) {
                preencherCampos += "\n- Valor de Venda";
            }
            if (ftxtQuantidadeProduto.getValue() == null) {
                preencherCampos += "\n- Quantidade";
            }

            JOptionPane.showMessageDialog(this, preencherCampos);
        } else {

            double ValorCusto = Double.parseDouble(ftxtValorCusto.getValue().toString());
            double ValorVenda = Double.parseDouble(ftxtValorVenda.getValue().toString());
            int Quantidade = Integer.parseInt(ftxtQuantidadeProduto.getValue().toString());

            Produto objProduto = new Produto(Id, Nome, Categoria, Descricao, Cor, ValorCusto, ValorVenda, Quantidade);
            boolean retorno = ProdutoDAO.alterarProduto(objProduto);

            if (retorno) {
                JOptionPane.showMessageDialog(this, "Alterado com sucesso!");
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao alterar!");
            }
        }
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed

        String Nome = String.valueOf(txtNomeProduto.getText());
        String Categoria = String.valueOf(cbCategoriaProduto.getSelectedItem());
        String Descricao = String.valueOf(txtaDescricaoProduto.getText());
        String Cor = String.valueOf(cbCor.getSelectedItem());

        Validador validarProduto = new Validador();

        if (!validarProduto.isCampoString(Nome) || !validarProduto.isCampoComboBox(cbCategoriaProduto.getSelectedIndex()) || ftxtValorCusto.getValue() == null || ftxtValorVenda.getValue() == null || ftxtQuantidadeProduto.getValue() == null) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!");

            String preencherCampos = "Preencha corretamente os campos:\n";

            if (!validarProduto.isCampoString(Nome)) {
                preencherCampos += "\n- Nome";
            }
            if (!validarProduto.isCampoComboBox(cbCategoriaProduto.getSelectedIndex())) {
                preencherCampos += "\n- Categoria";
            }
            if (ftxtValorCusto.getValue() == null) {
                preencherCampos += "\n- Valor de Custo";
            }
            if (ftxtValorVenda.getValue() == null) {
                preencherCampos += "\n- Valor de Venda";
            }
            if (ftxtQuantidadeProduto.getValue() == null) {
                preencherCampos += "\n- Quantidade";
            }

            JOptionPane.showMessageDialog(this, preencherCampos);
        } else {

            double ValorCusto = Double.parseDouble(ftxtValorCusto.getValue().toString());
            double ValorVenda = Double.parseDouble(ftxtValorVenda.getValue().toString());
            int Quantidade = Integer.parseInt(ftxtQuantidadeProduto.getValue().toString());

            Produto objProduto = new Produto(Nome, Categoria, Descricao, Cor, ValorCusto, ValorVenda, Quantidade);
            boolean retorno = ProdutoDAO.cadastrarProduto(objProduto);

            if (retorno) {
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
                txtNomeProduto.setText("");
                cbCategoriaProduto.setSelectedIndex(0);
                txtaDescricaoProduto.setText("");
                cbCor.setSelectedIndex(0);
                ftxtValorCusto.setText("");
                ftxtValorVenda.setText("");
                ftxtQuantidadeProduto.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao cadastrar!");
            }
        }
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void ftxtValorCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtValorCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtValorCustoActionPerformed

    private void ftxtValorCustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxtValorCustoKeyTyped
        char key = evt.getKeyChar();

        if ((key < '0' || key > '9') && (key != '.') && (key != ',') && key != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_ftxtValorCustoKeyTyped

    private void ftxtValorVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxtValorVendaKeyTyped
        char key = evt.getKeyChar();

        if ((key < '0' || key > '9') && (key != '.') && (key != ',') && key != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_ftxtValorVendaKeyTyped

    private void ftxtQuantidadeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxtQuantidadeProdutoKeyTyped
        char key = evt.getKeyChar();

        if ((key < '0' || key > '9') && key != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_ftxtQuantidadeProdutoKeyTyped

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JComboBox<String> cbCategoriaProduto;
    private javax.swing.JComboBox<String> cbCor;
    private javax.swing.JFormattedTextField ftxtQuantidadeProduto;
    private javax.swing.JFormattedTextField ftxtValorCusto;
    private javax.swing.JFormattedTextField ftxtValorVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdProduto;
    private javax.swing.JLabel lbltxtIdProduto;
    private javax.swing.JPanel pnlCadastroPoduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextArea txtaDescricaoProduto;
    // End of variables declaration//GEN-END:variables
}
