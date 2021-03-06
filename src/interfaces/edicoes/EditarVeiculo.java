/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.edicoes;

import banco.DAOfilial;
import banco.DAOveiculo;
import base.Filial;
import base.Main;
import base.Veiculo;
import interfaces.HomeGerente;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class EditarVeiculo extends javax.swing.JPanel {

    /**
     * Creates new form EditarVeiculo
     */
    private DAOfilial daof;
    private DAOveiculo dao;
    private String[] filiais;
    private String[] veiculos;
    private Veiculo veiculo;
    
    public EditarVeiculo() {
        daof = new DAOfilial();
        dao = new DAOveiculo();
        loadFiliais();
        loadVeiculos();
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
        jLabel5 = new javax.swing.JLabel();
        jtfPlaca = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfCor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcbFilial = new javax.swing.JComboBox<>(this.filiais);
        bttSalvar = new javax.swing.JButton();
        bttLimpar = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbChassi = new javax.swing.JComboBox<>(this.veiculos);

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Editar Veiculo");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setText("Placa:");

        try {
            jtfPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("***-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfPlaca.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setText("Cor:");

        jtfCor.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel11.setText("Filial:");

        jcbFilial.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbFilial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bttSalvar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttSalvar.setText("Salvar");
        bttSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });

        bttLimpar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttLimpar.setText("Limpar");
        bttLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimparActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Chassi:");

        jcbChassi.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbChassi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbChassi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbChassiFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(250, 250, 250))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bttSalvar)
                            .addGap(157, 157, 157)
                            .addComponent(bttLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttVoltar)
                            .addGap(24, 24, 24)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jtfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bttSalvar)
                        .addComponent(bttVoltar)
                        .addComponent(bttLimpar))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        if(checarCampos()){
            this.veiculo.setCodFilial(daof.buscaFilial(jcbFilial.getSelectedItem().toString()).getCodFilial());
            this.veiculo.setCor(jtfCor.getText());
            this.veiculo.setPlaca(jtfPlaca.getText());
            dao.atualizaVeiculo(this.veiculo);
            JOptionPane.showMessageDialog(null, "Realizado com sucesso!");
            clearCampo();
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        }
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void bttLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimparActionPerformed
        clearCampo();
    }//GEN-LAST:event_bttLimparActionPerformed

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new HomeGerente());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void jcbChassiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbChassiFocusLost
        this.veiculo = dao.buscaVeiculo(jcbChassi.getSelectedItem().toString());
        jtfPlaca.setText(this.veiculo.getPlaca());
        jtfCor.setText(this.veiculo.getCor());
        jcbFilial.setSelectedItem(daof.buscaFilial(this.veiculo.getCodFilial()).getMatricula());
    }//GEN-LAST:event_jcbChassiFocusLost

    private void clearCampo(){
        jcbChassi.setSelectedIndex(0);
        jtfCor.setText("");
        jtfPlaca.setText("");
        jcbFilial.setSelectedIndex(0);
    }
    
    private boolean checarCampos(){
        int campo2 = jcbChassi.getSelectedIndex();
        String campo3 = jtfCor.getText().replaceAll(" ", "");
        String campo5 = jtfPlaca.getText().replaceAll(" ", "");
        int campo6 = jcbFilial.getSelectedIndex();
        return campo2!=0&&!campo3.equals("")&&!campo5.equals("")&&!(campo6==0);
    }

    private void loadFiliais(){
        List<Filial> list = daof.recuperaFilial();
        this.filiais = new String[list.size()+1];
        int i = 1;
        this.filiais[0] = "Selecione";
        for(Filial fil: list){
            this.filiais[i] = String.valueOf(fil.getMatricula());
            i++;
        }
    }

    private void loadVeiculos(){
        List<Veiculo> list = dao.recuperaVeiculos();
        this.veiculos = new String[list.size()+1];
        int i = 1;
        this.veiculos[0] = "Selecione";
        for(Veiculo vei: list){
            this.veiculos[i] = vei.getChassi();
            i++;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttLimpar;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jcbChassi;
    private javax.swing.JComboBox<String> jcbFilial;
    private javax.swing.JTextField jtfCor;
    private javax.swing.JFormattedTextField jtfPlaca;
    // End of variables declaration//GEN-END:variables
}
