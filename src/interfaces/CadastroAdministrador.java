/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import banco.DAOadministrador;
import base.Administrador;
import base.Main;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class CadastroAdministrador extends javax.swing.JPanel {

    /**
     * Creates new form CadastroAdministrador
     */
    public CadastroAdministrador() {
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
        jcbFuncionario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaEspecializacao = new javax.swing.JTextArea();
        bttAdicionarFuncionario = new javax.swing.JButton();
        bttSalvar = new javax.swing.JButton();
        bttLimpar = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Cadastrar Administrador");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Funcionario:");

        jcbFuncionario.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Selecione"}));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Especialiazações:");

        jtaEspecializacao.setColumns(20);
        jtaEspecializacao.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtaEspecializacao.setRows(5);
        jScrollPane1.setViewportView(jtaEspecializacao);

        bttAdicionarFuncionario.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttAdicionarFuncionario.setText("Adicionar Funcionario");

        bttSalvar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttSalvar.setText("Salvar");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });

        bttLimpar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttLimpar.setText("Limpar");
        bttLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimparActionPerformed(evt);
            }
        });

        bttVoltar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttVoltar.setText("Voltar");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttAdicionarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(bttSalvar)
                        .addGap(61, 61, 61)
                        .addComponent(bttLimpar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttAdicionarFuncionario)
                    .addComponent(bttSalvar)
                    .addComponent(bttLimpar)
                    .addComponent(bttVoltar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimparActionPerformed
        clearCampos();
    }//GEN-LAST:event_bttLimparActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        if(checarCampos()){
            Administrador adm = new Administrador();
            DAOadministrador dao = new DAOadministrador();
            adm.setCodFunc(Integer.parseInt(jcbFuncionario.getSelectedItem().toString()));
            adm.setEspecializacoes(jtaEspecializacao.getText());
            dao.adicionaAdministrador(adm);
            JOptionPane.showMessageDialog(null, "Realizado com sucesso!");
            clearCampos();
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        }
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new HomeSuperRoot());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void clearCampos(){
        jcbFuncionario.setSelectedIndex(0);
        jtaEspecializacao.setText("");
    }
    
    private boolean checarCampos(){
        int campo = jcbFuncionario.getSelectedIndex();
        String campo2 = jtaEspecializacao.getText().replaceAll(" ", "");
        return !(campo==0)&&!campo2.equals("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAdicionarFuncionario;
    private javax.swing.JButton bttLimpar;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbFuncionario;
    private javax.swing.JTextArea jtaEspecializacao;
    // End of variables declaration//GEN-END:variables
}
