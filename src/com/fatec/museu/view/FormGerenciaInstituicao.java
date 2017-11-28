/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.museu.view;
    
import com.fatec.museu.controllers.ControleGerenciarInstituicao;
import com.fatec.museu.model.Instituicao;

/**
 *
 * @author Panda
 */
public class FormGerenciaInstituicao extends javax.swing.JInternalFrame {
    static private FormGerenciaInstituicao instanciaInstituicao; 

    /**
     * Creates new form FormGerenciaInstituicao
     */
    public FormGerenciaInstituicao() {
        initComponents();
    }
    
     public static FormGerenciaInstituicao getInstance() {
        if(instanciaInstituicao == null) {
            instanciaInstituicao = new FormGerenciaInstituicao();
        }
        return instanciaInstituicao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientButton5 = new com.fatec.museu.util.GradientButton();
        gradientButton3 = new com.fatec.museu.util.GradientButton();
        gradientButton4 = new com.fatec.museu.util.GradientButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        gradientButton6 = new com.fatec.museu.util.GradientButton();
        gradientButton7 = new com.fatec.museu.util.GradientButton();
        gradientButton8 = new com.fatec.museu.util.GradientButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientButton5.setText("Alterar");
        gradientButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 110, 40));

        gradientButton3.setText("Cadastrar");
        gradientButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 110, 40));

        gradientButton4.setText("Voltar");
        gradientButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 110, 40));

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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 740, 270));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 30));

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 200, 30));

        jLabel8.setText("Endereco");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, 30));

        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 70, 30));

        jLabel3.setText("Nome da Instituição");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Gerenciar Institução");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 350, 80));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 129, 220, 30));

        gradientButton6.setText("Remover");
        gradientButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 110, 40));

        gradientButton7.setText("Remover");
        gradientButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 110, 40));

        gradientButton8.setText("Remover");
        gradientButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradientButton5ActionPerformed

    private void gradientButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton3ActionPerformed
        Instituicao inst = new Instituicao();
     
        inst.setEndereco(txtEndereco.getText());
        inst.setNome(txtNome.getText());
        inst.setTelefone(txtTelefone.getText());
      
        ControleGerenciarInstituicao controle = new ControleGerenciarInstituicao();
        controle.registrarInstituicao(inst);                 
    }//GEN-LAST:event_gradientButton3ActionPerformed

    private void gradientButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradientButton4ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void gradientButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradientButton6ActionPerformed

    private void gradientButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradientButton7ActionPerformed

    private void gradientButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradientButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.fatec.museu.util.GradientButton gradientButton3;
    private com.fatec.museu.util.GradientButton gradientButton4;
    private com.fatec.museu.util.GradientButton gradientButton5;
    private com.fatec.museu.util.GradientButton gradientButton6;
    private com.fatec.museu.util.GradientButton gradientButton7;
    private com.fatec.museu.util.GradientButton gradientButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
