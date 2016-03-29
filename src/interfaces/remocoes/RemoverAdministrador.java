/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.remocoes;

import banco.DAOadministrador;
import base.Administrador;
import base.Main;
import interfaces.HomeSuperRoot;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jluck_000
 */
public class RemoverAdministrador extends javax.swing.JPanel {

    /**
     * Creates new form RemoverAdministrador
     */
    private DAOadministrador dao;
    private String[] adms;
    private Administrador admin;
    
    public RemoverAdministrador() {
        dao = new DAOadministrador();
        loadAdms();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAdms = new javax.swing.JComboBox<>(this.adms);
        bttVoltar = new javax.swing.JButton();
        bttRemover = new javax.swing.JButton();
        jtfNome = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Remover Administrador");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Administrador:");

        jcbAdms.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbAdms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbAdms.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbAdmsFocusLost(evt);
            }
        });

        bttVoltar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttVoltar.setText("Voltar");
        bttVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVoltarActionPerformed(evt);
            }
        });

        bttRemover.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemover.setText("Remover");
        bttRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRemoverActionPerformed(evt);
            }
        });

        jtfNome.setEditable(false);
        jtfNome.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bttRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbAdms, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAdms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttVoltar)
                    .addComponent(bttRemover))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new HomeSuperRoot());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void jcbAdmsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbAdmsFocusLost
        this.admin = dao.buscaAdministrador(Integer.parseInt(jcbAdms.getSelectedItem().toString()));
        jtfNome.setText(String.valueOf(this.admin.getCodFunc()));
    }//GEN-LAST:event_jcbAdmsFocusLost

    private void bttRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRemoverActionPerformed
        if(jcbAdms.getSelectedIndex() != 0){
            if(JOptionPane.showConfirmDialog(null, "Deseja mesmo remover?")==JOptionPane.YES_OPTION){
                dao.deletaAdministrador(this.admin.getId());
                JOptionPane.showConfirmDialog(null, "Removido com sucesso!");
                this.setVisible(false);
                Main.janela.remove(this);
                Main.janela.add(new RemoverAdministrador());
                Main.janela.setVisible(true);
            }
        }
    }//GEN-LAST:event_bttRemoverActionPerformed

    private void loadAdms(){
        List<Administrador> list = dao.recuperaAdministradores();
        this.adms = new String[list.size()+1];
        int i = 1;
        this.adms[0] = "Selecione";
        for(Administrador adm: list){
            this.adms[i] = String.valueOf(adm.getId());
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttRemover;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jcbAdms;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}