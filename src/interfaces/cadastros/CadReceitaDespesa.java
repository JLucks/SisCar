/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.cadastros;

import banco.DAOfilial;
import banco.DAOreceitasDespesas;
import base.Filial;
import base.Main;
import base.ReceitaDespesa;
import interfaces.HomeGerente;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class CadReceitaDespesa extends javax.swing.JPanel {

    /**
     * Creates new form CadReceitaDespesa
     */
    private DAOfilial daof;
    private String[] dados;
    
    public CadReceitaDespesa() {
        daof = new DAOfilial();
        loadFiliais();
        initComponents();
        jcRec.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbFilial = new javax.swing.JComboBox<>(this.dados);
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtades = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        bttSalvar = new javax.swing.JButton();
        bttLimpar = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();
        jcRec = new javax.swing.JCheckBox();
        jcDes = new javax.swing.JCheckBox();

        jcbFilial.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbFilial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel11.setText("Filial:");

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Cadastrar Receita/Despesa");

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setText("Valor:");

        try {
            jtfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("RS #####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfValor.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jtades.setColumns(20);
        jtades.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtades.setRows(5);
        jScrollPane1.setViewportView(jtades);

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Descrição:");

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

        jcRec.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcRec.setText("Receita");
        jcRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRecActionPerformed(evt);
            }
        });

        jcDes.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcDes.setText("Despesa");
        jcDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bttSalvar)
                        .addGap(157, 157, 157)
                        .addComponent(bttLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(bttVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jcRec)
                                .addGap(27, 27, 27)
                                .addComponent(jcDes))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcRec)
                    .addComponent(jcDes))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttSalvar)
                            .addComponent(bttVoltar)
                            .addComponent(bttLimpar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        if(checarCampos()){
            ReceitaDespesa rec = new ReceitaDespesa();
            DAOreceitasDespesas dao = new DAOreceitasDespesas();
            rec.setIdFilial(daof.buscaFilial(jcbFilial.getSelectedItem().toString()).getCodFilial());
            rec.setDescricao(jtades.getText());
            String sal = jtfValor.getText().replaceAll("RS", "");
            sal = sal.replaceAll(" ", "");
            float valor = Float.parseFloat(sal);
            if(jcDes.isSelected())
                valor *= -1;
            rec.setValor(valor);
            dao.adicionaReceitasDespesas(rec);
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

    private void jcRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRecActionPerformed
        jcDes.setSelected(false);
    }//GEN-LAST:event_jcRecActionPerformed

    private void jcDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDesActionPerformed
        jcRec.setSelected(true);
    }//GEN-LAST:event_jcDesActionPerformed

    private boolean checarCampos(){
        String campo = jtfValor.getText().replaceAll(" ", "");
        String campo2 = jtades.getText().replaceAll(" ", "");
        int campo10 = jcbFilial.getSelectedIndex();
        return !campo.equals("")&&!campo2.equals("")&&!(campo10==0);
    }
    
    private void loadFiliais(){
        List<Filial> list = daof.recuperaFilial();
        this.dados = new String[list.size()+1];
        int i = 1;
        this.dados[0] = "Selecione";
        for(Filial fil: list){
            this.dados[i] = String.valueOf(fil.getMatricula());
            i++;
        }
    }
    
    private void clearCampo(){
        jtfValor.setText("");
        jcbFilial.setSelectedIndex(0);
        jtades.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttLimpar;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcDes;
    private javax.swing.JCheckBox jcRec;
    private javax.swing.JComboBox<String> jcbFilial;
    private javax.swing.JTextArea jtades;
    private javax.swing.JFormattedTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
