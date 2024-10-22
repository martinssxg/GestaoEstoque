/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.estoqueC.view;

import com.estoqueC.controle.EstoqueControle;
import com.estoqueC.controle.PrateleiraControle;
import com.estoqueC.modelo.Produto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.estoqueC.service.PrateleiraService;
import static java.lang.Integer.parseInt;
        
/**
 *
 * @author kayqu
 */
public class PrateleiraInserirView extends javax.swing.JFrame {

    /**
     * Creates new form PrateleiraInserirView
     */
    public PrateleiraInserirView() {
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

        txtNome = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        txtQuantidadePrateleira = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        jLabel2.setText("Digite o Nome:");

        jLabel3.setText("Descrição do Produto");

        jLabel4.setText("Quantidade");

        jLabel5.setText("Preço");

        btnInserir.setText("ADICIONAR");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantidade a ser Inserida:");

        jButton2.setText("Voltar ao Caixa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("ADICIONAR PRODUTO NA PRATELEIRA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(txtDescricao)
                                    .addComponent(txtNome)
                                    .addComponent(txtQuantidade)
                                    .addComponent(txtQuantidadePrateleira)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(50, 50, 50)))
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadePrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
            if (evt.getKeyCode() == evt.VK_ENTER) {  
        EstoqueControle estoqueControle = new EstoqueControle();
            Produto produto = new Produto();
            
            produto.setNome(txtNome.getText());
            
        try {
            produto = estoqueControle.consultarNome(produto);
        } catch (SQLException ex) {
            
            Logger.getLogger(PrateleiraInserirView.class.getName()).log(Level.SEVERE, null, ex);
        }
         if (produto.getQuantidade() == 0) {
        JOptionPane.showMessageDialog(null, "Produto não disponível no Estoque", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
         if (produto.getNome() == null) {
             JOptionPane.showMessageDialog(null, "Produto não existe!", "Erro", JOptionPane.ERROR_MESSAGE);
         return;
         }
            txtDescricao.setText(produto.getDescricao());
            txtQuantidade.setText(String.valueOf(produto.getQuantidade()));
            txtPreco.setText(String.valueOf(produto.getPreco()));
            }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        PrateleiraControle prateleiraControle = new PrateleiraControle();
        PrateleiraService prateleiraService = new PrateleiraService();
        Produto produto = new Produto();
      

        EstoqueControle estoqueControle = new EstoqueControle();
        String Nome = txtNome.getText();
        String Descricao = txtDescricao.getText();
        String Quantidade = txtQuantidade.getText();
        String QuantidadePrateleira = txtQuantidadePrateleira.getText();
        String Preco = txtPreco.getText();
       

        produto.setNome(Nome);
        produto.setDescricao(Descricao);
        produto.setQuantidade(Integer.parseInt(Quantidade));
        produto.setQuantidadePrateleira(Integer.parseInt(QuantidadePrateleira));
        produto.setPreco(Double.parseDouble(Preco));

      
        try {
            if(prateleiraControle.inserir(produto) == true){
                JOptionPane.showMessageDialog(null,"Produto adicionado à Prateleira com Sucesso","ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
                txtNome.setText("");
                txtDescricao.setText("");
                txtQuantidadePrateleira.setText("");
                txtPreco.setText("");
                
            }else{
                JOptionPane.showMessageDialog(null,"ERRO; Produto não foi adicionado à Prateleira","ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrateleiraInserirView.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        int novaQuantidade = produto.getQuantidade() - produto.getQuantidadePrateleira();
        produto.setQuantidade(novaQuantidade);
       
        
        try{
            estoqueControle.atualizar(produto);
        } catch (SQLException ex) {
            Logger.getLogger(PrateleiraInserirView.class.getName()).log(Level.SEVERE, null, ex);
            
   }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PrateleiraInserirView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrateleiraInserirView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrateleiraInserirView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrateleiraInserirView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrateleiraInserirView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtQuantidadePrateleira;
    // End of variables declaration//GEN-END:variables
}
