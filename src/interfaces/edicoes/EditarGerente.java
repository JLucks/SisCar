/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.edicoes;
import banco.DAOgerente;
import base.Gerente;
import base.Main;
import interfaces.HomeAdministrador;
import interfaces.HomeSuperRoot;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class EditarGerente extends javax.swing.JPanel {

    /**
     * Creates new form EditarGerente
     */
    private DAOgerente dao;
    private String[] gerentes;
    private Gerente gerente;
    
    public EditarGerente() {
        dao = new DAOgerente();
        loadGer();
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
        jcbGer = new javax.swing.JComboBox<>(this.gerentes);
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaEspe = new javax.swing.JTextArea();
        bttSalvar = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Editar Gerente");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Gerente:");

        jcbGer.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbGer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbGer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbGerFocusLost(evt);
            }
        });

        jtfNome.setEditable(false);
        jtfNome.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Cód Funcionario:");

        jtaEspe.setColumns(20);
        jtaEspe.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtaEspe.setRows(5);
        jScrollPane1.setViewportView(jtaEspe);

        bttSalvar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttSalvar.setText("Salvar");
        bttSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(bttSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttVoltar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbGer, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbGer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttSalvar)
                    .addComponent(bttVoltar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbGerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbGerFocusLost
        this.gerente = dao.buscaGerente(Integer.parseInt(jcbGer.getSelectedItem().toString()));
        jtfNome.setText(String.valueOf(this.gerente.getCodFun()));
        jtaEspe.setText(this.gerente.getEsperiencias());
    }//GEN-LAST:event_jcbGerFocusLost

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        if(!jtaEspe.getText().replaceAll(" ", "").equals("")&&jcbGer.getSelectedIndex()!=0){
            dao.atualizaGerente(this.gerente.getCodGerente(), jtaEspe.getText());
            JOptionPane.showMessageDialog(null, "Atualizado!");
            jcbGer.setSelectedIndex(0);
            jtfNome.setText("");
            jtaEspe.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new HomeAdministrador());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void loadGer(){
        List<Gerente> list = dao.recuperaGerentes();
        this.gerentes = new String[list.size()+1];
        int i = 1;
        this.gerentes[0] = "Selecione";
        for(Gerente ger: list){
            this.gerentes[i] = String.valueOf(ger.getCodGerente());
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttSalvar;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbGer;
    private javax.swing.JTextArea jtaEspe;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}