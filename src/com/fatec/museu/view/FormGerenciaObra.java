/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.museu.view;

import com.fatec.museu.controllers.ControleGerenciarAcervo;
import javax.swing.table.DefaultTableModel;
import com.fatec.museu.model.Obra;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Panda
 */
public class FormGerenciaObra extends javax.swing.JInternalFrame {
    static private FormGerenciaObra instanciaObra;
    private byte[] byteArray;
    private ControleGerenciarAcervo controle = new ControleGerenciarAcervo();
    /**
     * Creates new form FormGerenciaObra
     */
    public FormGerenciaObra() {
        initComponents();
    }

    public static FormGerenciaObra getInstance() {
        if(instanciaObra == null) {
            instanciaObra = new FormGerenciaObra();
        }
        return instanciaObra;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngTipoObra = new javax.swing.ButtonGroup();
        btnCadastrar = new com.fatec.museu.util.GradientButton();
        btnVoltar = new com.fatec.museu.util.GradientButton();
        txtTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoObra = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDoadorObra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        btnProcurarImagem = new com.fatec.museu.util.GradientButton();
        jLabel9 = new javax.swing.JLabel();
        btnExcluir = new com.fatec.museu.util.GradientButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_dados = new javax.swing.JTable();
        btnAlterar = new com.fatec.museu.util.GradientButton();
        txtDataObra = new javax.swing.JFormattedTextField();
        rdbObraFisica = new javax.swing.JRadioButton();
        rdbObraVirtual = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDadosBiograficos = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(1100, 800));
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

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 120, 40));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 680, 100, 40));

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 210, 30));

        jLabel1.setText("Título");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 60, 30));

        jLabel2.setText("Data da Obra");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 70, 30));

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 200, 30));

        jLabel3.setText("Categoria");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, 30));

        cmbTipoObra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbTipoObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 210, 30));

        jLabel4.setText("Tipo de Obra");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, -1));

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 210, 30));

        jLabel5.setText("Autor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, 20));

        jLabel6.setText("Dados Biográficos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 100, 30));

        txtDoadorObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoadorObraActionPerformed(evt);
            }
        });
        getContentPane().add(txtDoadorObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 210, 30));

        jLabel7.setText("Doador da Obra");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 30));

        lblImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 390, 240));

        btnProcurarImagem.setText("Procurar Imagem");
        btnProcurarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarImagemActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcurarImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, -1, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setText("Gerenciar Obras");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        btnExcluir.setText("Excluir");
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 110, 40));

        tb_dados.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_dados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_dadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_dados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 1070, 240));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 680, 110, 40));

        try {
            txtDataObra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDataObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 200, 30));

        btngTipoObra.add(rdbObraFisica);
        rdbObraFisica.setText("Obra Física");
        rdbObraFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbObraFisicaActionPerformed(evt);
            }
        });
        getContentPane().add(rdbObraFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        btngTipoObra.add(rdbObraVirtual);
        rdbObraVirtual.setText("Obra Virtual");
        getContentPane().add(rdbObraVirtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        txtDadosBiograficos.setColumns(20);
        txtDadosBiograficos.setRows(5);
        jScrollPane2.setViewportView(txtDadosBiograficos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 210, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtDoadorObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoadorObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoadorObraActionPerformed

    private void btnProcurarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarImagemActionPerformed
        
        
         BufferedImage imagemBuffer = null;
        
         JFileChooser buscaFoto = new JFileChooser();
        
        buscaFoto.setFileFilter(new FileNameExtensionFilter("Imagem", "bmp", "png", "jpg", "jpeg"));
        buscaFoto.setAcceptAllFileFilterUsed(false);
        
         buscaFoto.setDialogTitle("Selecionar Imagem");
        buscaFoto.showOpenDialog(this);
        String caminho = ""+buscaFoto.getSelectedFile().getAbsolutePath();
        try {
            imagemBuffer = ImageIO.read(new File(caminho));
        } catch (IOException ex) {
            Logger.getLogger(FormGerenciaObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Image diminuirImagem = imagemBuffer.getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), 0);
       
        lblImagem.setText("");
        
        lblImagem.setIcon(new ImageIcon(diminuirImagem));
        
        
        try {
            byteArray = Files.readAllBytes(Paths.get(caminho));
            
            
        } catch (IOException ex) {
            Logger.getLogger(FormGerenciaObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
    }//GEN-LAST:event_btnProcurarImagemActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Obra obra = new Obra();
        //SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");


        obra.setAutor(txtAutor.getText());
        obra.setDadosBiograficos(txtDadosBiograficos.getText());
        obra.setTitulo(txtTitulo.getText());
        obra.setCategoria(cmbTipoObra.getSelectedItem().toString());

        String xgh = txtDataObra.getText();
        String[] parts = xgh.split("/");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];

        int day = Integer.parseInt(part1);
        int month = Integer.parseInt(part2) - 1;
        int year = Integer.parseInt(part3);

        obra.setDataDeObra(new GregorianCalendar(year,month,day));




        /*
        try {
            obra.setDataDeObra(format.parse(txtDataObra.getText()));
        } catch (ParseException ex) {

            Logger.getLogger(FormGerenciaObra.class.getName()).log(Level.SEVERE, null, ex);
        }
        */

        obra.setCategoria(txtCategoria.getText());
        obra.setDoadorDeObra(txtDoadorObra.getText());

        if(rdbObraFisica.isSelected())
            obra.setTipoDeObra("Físico");
        else
            obra.setTipoDeObra("Virtual");
        
        
        obra.setImagem(byteArray);
        

        controle.registrarObra(obra);
        carregarDados();
        

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void rdbObraFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbObraFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbObraFisicaActionPerformed


    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    
    private void carregarDados() {
        DefaultTableModel tableModel = new DefaultTableModel(controle.carregaLinhas(), controle.carregaColuna()){
            
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
         }
            
        };
        tb_dados.setModel(tableModel);
    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        carregarDados();
        
        try{
            instanciaObra.setSelected(true);
            //diz que a janela interna é maximizável
            instanciaObra.setMaximizable(false);
            //set o tamanho máximo dela, que depende da janela pai
            instanciaObra.setPreferredSize(new Dimension(700, 500));
            instanciaObra.setResizable(false);
            
         } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_formInternalFrameOpened

    private void tb_dadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_dadosMouseClicked
         
        DefaultTableModel model = (DefaultTableModel)tb_dados.getModel();
        int selectedRowIndex = tb_dados.getSelectedRow();
        
        txtTitulo.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtDataObra.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtAutor.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txtCategoria.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtDadosBiograficos.setText(model.getValueAt(selectedRowIndex, 6).toString());
        txtDoadorObra.setText(model.getValueAt(selectedRowIndex, 7).toString());
        
        if("Físico".equals(model.getValueAt(selectedRowIndex, 3).toString())){
            rdbObraFisica.setSelected(true);
        } else {
            rdbObraVirtual.setSelected(true);
        }
        
        
        
        byte[] imagebyte = controle.buscarFotoObra((Long)(model.getValueAt(selectedRowIndex, 0)));
        Image image = getToolkit().createImage(imagebyte);
        
       
        
   
        Image diminuirImagem = image.getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), 0);
         ImageIcon icon = new ImageIcon(diminuirImagem);
        
        lblImagem.setText("");
        lblImagem.setIcon(icon);

    }//GEN-LAST:event_tb_dadosMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.fatec.museu.util.GradientButton btnAlterar;
    private com.fatec.museu.util.GradientButton btnCadastrar;
    private com.fatec.museu.util.GradientButton btnExcluir;
    private com.fatec.museu.util.GradientButton btnProcurarImagem;
    private com.fatec.museu.util.GradientButton btnVoltar;
    private javax.swing.ButtonGroup btngTipoObra;
    private javax.swing.JComboBox<String> cmbTipoObra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JRadioButton rdbObraFisica;
    private javax.swing.JRadioButton rdbObraVirtual;
    private javax.swing.JTable tb_dados;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtDadosBiograficos;
    private javax.swing.JFormattedTextField txtDataObra;
    private javax.swing.JTextField txtDoadorObra;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
