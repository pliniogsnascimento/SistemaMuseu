/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.museu.view;

import com.fatec.museu.controllers.ControleGerenciarExposicao;
import com.fatec.museu.model.Exposicao;
import com.fatec.museu.model.Obra;
import com.fatec.museu.model.Sala;
import com.fatec.museu.model.Temporaria;
import static java.sql.JDBCType.NULL;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Panda
 */
public class FormGerenciaExposicao extends javax.swing.JInternalFrame {
    static private FormGerenciaExposicao instanciaExposicao;
    
    private List<Obra> obras = new LinkedList();
    private ControleGerenciarExposicao controle = new ControleGerenciarExposicao();
    
    
    public FormGerenciaExposicao() {
        initComponents();
    }
    
    public static FormGerenciaExposicao getInstance() {
        if(instanciaExposicao == null) {
            instanciaExposicao = new FormGerenciaExposicao();
        }
        return instanciaExposicao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        gradientButton2 = new com.fatec.museu.util.GradientButton();
        gradientButton3 = new com.fatec.museu.util.GradientButton();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbSala = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDados = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cmbObra = new javax.swing.JComboBox<>();
        gradientButton4 = new com.fatec.museu.util.GradientButton();
        txtDataInicio = new javax.swing.JFormattedTextField();
        txtDataTermino = new javax.swing.JFormattedTextField();
        rdbTemporario = new javax.swing.JRadioButton();

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
        jLabel1.setText("Gerenciar Exposição");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 11, -1, -1));

        gradientButton2.setText("Criar");
        gradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 100, 40));

        gradientButton3.setText("Adicionar Obra");
        gradientButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 110, 30));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 210, 30));

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 30));

        jLabel3.setText("Sala");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        jLabel4.setText("Data de Início");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, 30));

        jLabel5.setText("Data de Termino");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 30));

        cmbSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 210, 30));

        tbDados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbDados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 780, 240));

        jLabel6.setText("Obra");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 30, 20));

        cmbObra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 150, 30));

        gradientButton4.setText("Voltar");
        gradientButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(gradientButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 493, 100, 40));

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 130, 30));

        try {
            txtDataTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDataTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 130, 30));

        rdbTemporario.setText("Temporário");
        rdbTemporario.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbTemporarioStateChanged(evt);
            }
        });
        rdbTemporario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbTemporarioMouseClicked(evt);
            }
        });
        rdbTemporario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbTemporarioActionPerformed(evt);
            }
        });
        getContentPane().add(rdbTemporario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton2ActionPerformed
        
        Exposicao expo;
        Sala sala = new Sala();
        
        if(rdbTemporario.isSelected())
        expo = new Temporaria();
        else
        expo = new Exposicao();
        
        if(rdbTemporario.isSelected()){
       
        String xgh = txtDataInicio.getText();
        String[] parts = xgh.split("/");
        String part1 = parts[0]; 
        String part2 = parts[1]; 
        String part3 = parts[2];
        
        int day = Integer.parseInt(part1);
        int month = Integer.parseInt(part2) - 1;
        int year = Integer.parseInt(part3);
        
        
        expo.setDataTermino(new GregorianCalendar(year,month,day));
        }
        
        
       String xgh2 = txtDataInicio.getText();
       String[] partes = xgh2.split("/");
       String parte1 = partes[0]; 
       String parte2 = partes[1]; 
       String parte3 = partes[2];
        
       int day = Integer.parseInt(parte1);
       int month = Integer.parseInt(parte2) - 1;
       int year = Integer.parseInt(parte3);
        
       expo.setDataInicio(new GregorianCalendar(year,month,day));
       
       
       expo.setNome(txtNome.getText());
       //expo.setSala();
       expo.setObras(obras);
       
       
       controle.registrarExposicao(expo);

    }//GEN-LAST:event_gradientButton2ActionPerformed

    private void gradientButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton3ActionPerformed
 
    }//GEN-LAST:event_gradientButton3ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void gradientButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_gradientButton4ActionPerformed

    private void rdbTemporarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbTemporarioActionPerformed
        if(rdbTemporario.isSelected()){
        txtDataTermino.setEditable(true);
        } else {
        txtDataTermino.setText("");
        txtDataTermino.setEditable(false);
        }
    }//GEN-LAST:event_rdbTemporarioActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtDataTermino.setEditable(false);
        
        DefaultTableModel tableModel = new DefaultTableModel(controle.carregarLinhas(), controle.carregarColunas());
        tbDados.setModel(tableModel);
        
        DefaultComboBoxModel cmbObraModel = new DefaultComboBoxModel(controle.carrebaObras().toArray());
        cmbObra.setModel(cmbObraModel);
        
        DefaultComboBoxModel cmdSalaModel = new DefaultComboBoxModel(controle.carregaSalas().toArray());
        cmbSala.setModel(cmdSalaModel);
    }//GEN-LAST:event_formInternalFrameOpened

    private void rdbTemporarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbTemporarioMouseClicked
        
    }//GEN-LAST:event_rdbTemporarioMouseClicked

    private void rdbTemporarioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbTemporarioStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbTemporarioStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbObra;
    private javax.swing.JComboBox<String> cmbSala;
    private com.fatec.museu.util.GradientButton gradientButton2;
    private com.fatec.museu.util.GradientButton gradientButton3;
    private com.fatec.museu.util.GradientButton gradientButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbTemporario;
    private javax.swing.JTable tbDados;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JFormattedTextField txtDataTermino;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
