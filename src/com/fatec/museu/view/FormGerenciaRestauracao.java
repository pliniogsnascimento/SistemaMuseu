/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.museu.view;

import com.fatec.museu.controllers.ControleGerenciarRestauracao;
import com.fatec.museu.model.Instituicao;
import com.fatec.museu.model.Obra;
import com.fatec.museu.model.Restauracao;
import java.beans.PropertyVetoException;
import java.util.GregorianCalendar;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Panda
 */
public class FormGerenciaRestauracao extends javax.swing.JInternalFrame {
    static private FormGerenciaRestauracao instancia;
    /**
     * Creates new form FormGerenciaRestauracao
     */
    public FormGerenciaRestauracao() {
        initComponents();
    }
    
      public static FormGerenciaRestauracao getInstance() {
        if(instancia == null) {
            instancia = new FormGerenciaRestauracao();
        }
        return instancia;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRemover = new com.fatec.museu.util.GradientButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVoltar = new com.fatec.museu.util.GradientButton();
        btnCadastrar = new com.fatec.museu.util.GradientButton();
        cmbNomeInstituicao = new javax.swing.JComboBox<>();
        txtDataRetorno = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtDescricao = new javax.swing.JTextField();
        cmbObra = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtDataEnvio = new javax.swing.JFormattedTextField();
        btnAlterar = new com.fatec.museu.util.GradientButton();

        setPreferredSize(new java.awt.Dimension(1920, 1080));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerenciar Restauração");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 870, 45));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 870, 190));

        btnRemover.setBorder(null);
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 119, 31));

        jLabel2.setText("Obra");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 30, 15));

        jLabel3.setText("Nome da Instituição");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 15));

        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 70, -1));

        jLabel6.setText("Data Prevista Para o Retorno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 180, 15));

        jLabel7.setText("Descricao");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnVoltar.setBorder(null);
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 104, 31));

        btnCadastrar.setBorder(null);
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 105, 31));

        cmbNomeInstituicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbNomeInstituicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 30));

        try {
            txtDataRetorno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDataRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 250, 30));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 250, 30));
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 30));

        cmbObra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 280, 30));

        jLabel5.setText("Data de Envio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 100, -1));

        try {
            txtDataEnvio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDataEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 250, 30));

        btnAlterar.setBorder(null);
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 105, 31));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Restauracao rest = new Restauracao();
        
        rest.setDescricao(txtDescricao.getText());
        rest.setInstituicao((Instituicao)cmbNomeInstituicao.getSelectedItem());
        rest.setObra((Obra)cmbObra.getSelectedItem());
        rest.setStatus("Solicitado");
        
        String xgh = txtDataEnvio.getText();
        String[] parts = xgh.split("/");
        String part1 = parts[0]; 
        String part2 = parts[1]; 
        String part3 = parts[2];
        
        int day = Integer.parseInt(part1);
        int month = Integer.parseInt(part2) - 1;
        int year = Integer.parseInt(part3);
        
        
        rest.setDataDeEnvio(new GregorianCalendar(year,month,day));

       
        String xgh2 = txtDataRetorno.getText();
        String[] partes = xgh2.split("/");
        String parte1 = partes[0]; 
        String parte2 = partes[1]; 
        String parte3 = partes[2];
        
        int days = Integer.parseInt(parte1);
        int months = Integer.parseInt(parte2) - 1;
        int years = Integer.parseInt(parte3);
        
        
        rest.setDataDeRetorno(new GregorianCalendar(years,months,days));

        ControleGerenciarRestauracao controle = new ControleGerenciarRestauracao();
        controle.registrarInstituicao(rest); 
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try{
        instancia.setSelected(true);
        //diz que a janela interna é maximizável
        instancia.setMaximizable(true);
        //set o tamanho máximo dela, que depende da janela pai
        instancia.setMaximum(true);        // TODO add your handling code here:
         } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.fatec.museu.util.GradientButton btnAlterar;
    private com.fatec.museu.util.GradientButton btnCadastrar;
    private com.fatec.museu.util.GradientButton btnRemover;
    private com.fatec.museu.util.GradientButton btnVoltar;
    private javax.swing.JComboBox<String> cmbNomeInstituicao;
    private javax.swing.JComboBox<String> cmbObra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField txtDataEnvio;
    private javax.swing.JFormattedTextField txtDataRetorno;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
