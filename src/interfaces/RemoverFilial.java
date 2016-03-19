/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import banco.DAOfilial;
import base.Filial;
import base.Main;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joaovvr
 */
public class RemoverFilial extends javax.swing.JPanel {

    /**
     * Creates new form RemoverFilial
     */
    private DAOfilial dao;
    private String[] filiais;
    private Filial filial;
    
    public RemoverFilial() {
        dao = new DAOfilial();
        loadFiliais();
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
        jcbFilial = new javax.swing.JComboBox<>(this.filiais);
        jLabel4 = new javax.swing.JLabel();
        bttRemover = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();
        jtfNome = new javax.swing.JTextField();

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Remover Filial");

        jcbFilial.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbFilial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbFilialFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Filial:");

        bttRemover.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemover.setText("Remover");
        bttRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRemoverActionPerformed(evt);
            }
        });

        bttVoltar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttVoltar.setText("Voltar");
        bttVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVoltarActionPerformed(evt);
            }
        });

        jtfNome.setEditable(false);
        jtfNome.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addGap(256, 256, 256))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcbFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bttRemover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttVoltar))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttRemover)
                    .addComponent(bttVoltar))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbFilialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbFilialFocusLost
        this.filial = dao.buscaFilial(jcbFilial.getSelectedItem().toString());
        jtfNome.setText(String.valueOf(this.filial.getEndereco()));
    }//GEN-LAST:event_jcbFilialFocusLost

    private void bttRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttRemoverActionPerformed
        if(jcbFilial.getSelectedIndex() != 0){
            if(JOptionPane.showConfirmDialog(null, "Deseja mesmo remover?")==JOptionPane.YES_OPTION){
                dao.deletaFilal(this.filial.getCodFilial());
                JOptionPane.showConfirmDialog(null, "Removido com sucesso!");
                jcbFilial.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_bttRemoverActionPerformed

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new HomeAdministrador());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void loadFiliais(){
        List<Filial> list = dao.recuperaFilial();
        this.filiais = new String[list.size()+1];
        int i = 1;
        this.filiais[0] = "Selecione";
        for(Filial fil: list){
            this.filiais[i] = String.valueOf(fil.getMatricula());
            i++;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttRemover;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jcbFilial;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}