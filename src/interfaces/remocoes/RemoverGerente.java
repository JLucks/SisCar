/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.remocoes;

import banco.DAOgerente;
import base.Gerente;
import base.Main;
import interfaces.HomeAdministrador;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class RemoverGerente extends javax.swing.JPanel {

    /**
     * Creates new form RemoverGerente
     */
    private DAOgerente dao;
    private String[] dados;
    private Gerente entidade;
    
    public RemoverGerente() {
        dao = new DAOgerente();
        loadDados();
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbId = new javax.swing.JComboBox<>(this.dados);
        jtfNome = new javax.swing.JTextField();
        bttRemover = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Remover Gerente");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Cód.:");

        jcbId.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbIdFocusLost(evt);
            }
        });

        jtfNome.setEditable(false);
        jtfNome.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        bttRemover.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemover.setText("Remover");
        bttRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRemoverActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbId, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttVoltar)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttRemover)
                    .addComponent(bttVoltar))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbIdFocusLost
        this.entidade = dao.buscaGerente(Integer.parseInt(jcbId.getSelectedItem().toString()));
        jtfNome.setText(String.valueOf(this.entidade.getCodFun()));
    }//GEN-LAST:event_jcbIdFocusLost

    private void bttRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRemoverActionPerformed
        if(jcbId.getSelectedIndex() != 0){
            if(JOptionPane.showConfirmDialog(null, "Deseja mesmo remover?")==JOptionPane.YES_OPTION){
                dao.deletaGerente(this.entidade.getCodGerente());
                JOptionPane.showConfirmDialog(null, "Removido com sucesso!");
                this.setVisible(false);
                Main.janela.remove(this);
                Main.janela.add(new RemoverGerente());
                Main.janela.setVisible(true);
            }
        }
    }//GEN-LAST:event_bttRemoverActionPerformed

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new HomeAdministrador());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void loadDados(){
        List<Gerente> list = dao.recuperaGerentes();
        this.dados = new String[list.size()+1];
        int i = 1;
        this.dados[0] = "Selecione";
        for(Gerente ger: list){
            this.dados[i] = String.valueOf(ger.getCodGerente());
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttRemover;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jcbId;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}