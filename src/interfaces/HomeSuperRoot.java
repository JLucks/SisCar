/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.remocoes.RemoverAdministrador;
import interfaces.listas.ListarAdministrador;
import interfaces.edicoes.EditarAdministrador;
import interfaces.cadastros.CadastroUsuario;
import interfaces.cadastros.CadastroAdministrador;
import base.Main;
import interfaces.listas.ListarUsuarios;
import interfaces.remocoes.RemoverUsuario;

/**
 *
 * @author Jorge
 */
public class HomeSuperRoot extends javax.swing.JPanel {

    /**
     * Creates new form HomeSuperRoot
     */
    public HomeSuperRoot() {
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
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bttCadastrarA = new javax.swing.JButton();
        bttRemoverA = new javax.swing.JButton();
        bttListarA = new javax.swing.JButton();
        bttEditarA = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bttCadastrarU = new javax.swing.JButton();
        bttListarU = new javax.swing.JButton();
        bttRemoverU = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        bttLimpar = new javax.swing.JButton();
        bttTrade = new javax.swing.JButton();

        jTabbedPane1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Bem Vindo ao SisCar");
        jLabel1.setFocusable(false);

        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel16.setText("Logado como SuperRoot");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outros/carros.png"))); // NOI18N

        bttSair.setText("Sair");
        bttSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162)
                .addComponent(bttSair)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Gerenciamento de Administradores");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Cadastrar");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setText("Listar");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setText("Remover");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setText("Editar");

        bttCadastrarA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttCadastrarA.setText("Cadastrar");
        bttCadastrarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttCadastrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarAActionPerformed(evt);
            }
        });

        bttRemoverA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemoverA.setText("Remover");
        bttRemoverA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttRemoverA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRemoverAActionPerformed(evt);
            }
        });

        bttListarA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttListarA.setText("Listar");
        bttListarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttListarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttListarAActionPerformed(evt);
            }
        });

        bttEditarA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttEditarA.setText("Editar");
        bttEditarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttEditarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEditarAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(bttCadastrarA)
                    .addComponent(bttRemoverA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bttListarA, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bttEditarA, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)))
                .addGap(115, 115, 115))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel3)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCadastrarA)
                    .addComponent(bttListarA))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttRemoverA)
                    .addComponent(bttEditarA))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Administradores", jPanel2);

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setText("Cadastrar");

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setText("Listar");

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel10.setText("Remover");

        bttCadastrarU.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttCadastrarU.setText("Cadastrar");
        bttCadastrarU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttCadastrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarUActionPerformed(evt);
            }
        });

        bttListarU.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttListarU.setText("Listar");
        bttListarU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttListarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttListarUActionPerformed(evt);
            }
        });

        bttRemoverU.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemoverU.setText("Remover");
        bttRemoverU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttRemoverU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRemoverUActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel11.setText("Gerenciamento de Usuarios");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(171, 171, 171))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(bttCadastrarU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(bttListarU)
                .addGap(155, 155, 155))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(bttRemoverU))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCadastrarU)
                    .addComponent(bttListarU))
                .addGap(100, 100, 100)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttRemoverU)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuarios", jPanel3);

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel12.setText("Controle do Banco de Dados");

        bttLimpar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttLimpar.setText("Limpar Banco");
        bttLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimparActionPerformed(evt);
            }
        });

        bttTrade.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttTrade.setText("Trocar UsuarioRoot");
        bttTrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttTradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(bttLimpar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(bttTrade)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel12)
                .addGap(38, 38, 38)
                .addComponent(bttLimpar)
                .addGap(40, 40, 40)
                .addComponent(bttTrade)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Banco", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttCadastrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarAActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new CadastroAdministrador());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttCadastrarAActionPerformed

    private void bttListarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttListarAActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new ListarAdministrador());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttListarAActionPerformed

    private void bttRemoverAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRemoverAActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new RemoverAdministrador());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttRemoverAActionPerformed

    private void bttCadastrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarUActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new CadastroUsuario());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttCadastrarUActionPerformed

    private void bttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSairActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new LoginRoot());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttSairActionPerformed

    private void bttEditarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEditarAActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new EditarAdministrador());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttEditarAActionPerformed

    private void bttListarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttListarUActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new ListarUsuarios());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttListarUActionPerformed

    private void bttRemoverUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRemoverUActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new RemoverUsuario());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttRemoverUActionPerformed

    private void bttLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimparActionPerformed
        Main.deletarBanco();
        Main.criarBanco();
    }//GEN-LAST:event_bttLimparActionPerformed

    private void bttTradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttTradeActionPerformed
        Main.deletarRoot();
        Main.criarBanco();
    }//GEN-LAST:event_bttTradeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCadastrarA;
    private javax.swing.JButton bttCadastrarU;
    private javax.swing.JButton bttEditarA;
    private javax.swing.JButton bttLimpar;
    private javax.swing.JButton bttListarA;
    private javax.swing.JButton bttListarU;
    private javax.swing.JButton bttRemoverA;
    private javax.swing.JButton bttRemoverU;
    private javax.swing.JButton bttSair;
    private javax.swing.JButton bttTrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
