/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.remocoes.RemoverFilial;
import interfaces.listas.ListarFiliais;
import interfaces.edicoes.EditarFilial;
import interfaces.cadastros.CadastroGerente;
import interfaces.cadastros.CadastroFilial;
import base.Main;
import interfaces.edicoes.EditarGerente;
import interfaces.listas.ListarGerentes;
import interfaces.remocoes.RemoverGerente;

/**
 *
 * @author Jorge
 */
public class HomeAdministrador extends javax.swing.JPanel {

    /**
     * Creates new form HomeAdministrador
     */
    public HomeAdministrador() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttSair = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bttCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bttEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bttListar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bttRemover = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bttCadastrarGe = new javax.swing.JButton();
        bttEditarGe = new javax.swing.JButton();
        bttRemoverGe = new javax.swing.JButton();
        bttListarGe = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bttGerarFiliais = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        bttGerarGerentes = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(617, 512));

        jTabbedPane1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Bem Vindo ao SisCar");
        jLabel1.setFocusable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outros/carros.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(592, 383));

        bttSair.setText("Sair");
        bttSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSairActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel16.setText("Logado como Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttSair)
                .addGap(18, 18, 18))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(217, 217, 217))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel16))
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Gerenciamento de Filiais");

        bttCadastrar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttCadastrar.setText("Cadastrar");
        bttCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Cadastrar");

        bttEditar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttEditar.setText("Editar");
        bttEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEditarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setText("Editar");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setText("Listar");

        bttListar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttListar.setText("Listar");
        bttListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttListarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setText("Remover");

        bttRemover.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemover.setText("Remover");
        bttRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(135, 135, 135))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(137, 137, 137))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(bttListar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(bttCadastrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttRemover, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttEditar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(117, 117, 117))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel3)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCadastrar)
                    .addComponent(bttEditar))
                .addGap(113, 113, 113)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttListar)
                    .addComponent(bttRemover))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Filiais", jPanel2);

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setText("Gerenciamento de Gerentes");

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setText("Cadastrar");

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel10.setText("Editar");

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel11.setText("Listar");

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel12.setText("Remover");

        bttCadastrarGe.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttCadastrarGe.setText("Cadastrar");
        bttCadastrarGe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttCadastrarGe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarGeActionPerformed(evt);
            }
        });

        bttEditarGe.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttEditarGe.setText("Editar");
        bttEditarGe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttEditarGe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEditarGeActionPerformed(evt);
            }
        });

        bttRemoverGe.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemoverGe.setText("Remover");
        bttRemoverGe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttRemoverGe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRemoverGeActionPerformed(evt);
            }
        });

        bttListarGe.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttListarGe.setText("Listar");
        bttListarGe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttListarGe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttListarGeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttCadastrarGe)
                    .addComponent(bttListarGe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttRemoverGe)
                    .addComponent(bttEditarGe))
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(203, 203, 203))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCadastrarGe)
                    .addComponent(bttEditarGe))
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttRemoverGe)
                    .addComponent(bttListarGe))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gerentes", jPanel3);

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel13.setText("Gerar Relatorios");

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel14.setText("Relatorios Filiais:");

        bttGerarFiliais.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttGerarFiliais.setText("Gerar");
        bttGerarFiliais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel15.setText("Relatorio Gerentes:");

        bttGerarGerentes.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttGerarGerentes.setText("Gerar");
        bttGerarGerentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttGerarGerentes))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttGerarFiliais)))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel13)
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(bttGerarFiliais))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(bttGerarGerentes))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relatorios", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSairActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new Login());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttSairActionPerformed

    private void bttCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new CadastroFilial());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttCadastrarActionPerformed

    private void bttCadastrarGeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarGeActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new CadastroGerente());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttCadastrarGeActionPerformed

    private void bttEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEditarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new EditarFilial());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttEditarActionPerformed

    private void bttRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRemoverActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new RemoverFilial());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttRemoverActionPerformed

    private void bttListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttListarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new ListarFiliais());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttListarActionPerformed

    private void bttEditarGeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEditarGeActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new EditarGerente());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttEditarGeActionPerformed

    private void bttListarGeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttListarGeActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new ListarGerentes());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttListarGeActionPerformed

    private void bttRemoverGeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRemoverGeActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new RemoverGerente());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttRemoverGeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCadastrar;
    private javax.swing.JButton bttCadastrarGe;
    private javax.swing.JButton bttEditar;
    private javax.swing.JButton bttEditarGe;
    private javax.swing.JButton bttGerarFiliais;
    private javax.swing.JButton bttGerarGerentes;
    private javax.swing.JButton bttListar;
    private javax.swing.JButton bttListarGe;
    private javax.swing.JButton bttRemover;
    private javax.swing.JButton bttRemoverGe;
    private javax.swing.JButton bttSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
