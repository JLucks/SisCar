/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import banco.DAOcliente;
import base.Cliente;
import base.Main;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class EditarCliente extends javax.swing.JPanel {

    /**
     * Creates new form EditarCliente
     */
    private DAOcliente dao;
    private String[] clientes;
    private Cliente cli;
    private int mode;
    
    public EditarCliente(int mode) {
        dao = new DAOcliente();
        loadClientes();
        initComponents();
        this.mode = mode;
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
        jcbCliente = new javax.swing.JComboBox<>(this.clientes);
        jLabel2 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        bttSalvar = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Editar Cliente");

        jcbCliente.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbCliente.setPreferredSize(new java.awt.Dimension(79, 26));
        jcbCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbClienteFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        jtfEndereco.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        jtfTelefone.setColumns(2);
        jtfTelefone.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        bttSalvar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttSalvar.setText("Salvar");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });

        bttVoltar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttVoltar.setText("Voltar");
        bttVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVoltarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setText("Nome:");

        jtfNome.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(bttSalvar)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbCliente, 0, 444, Short.MAX_VALUE)
                            .addComponent(jtfEndereco)
                            .addComponent(jtfTelefone)
                            .addComponent(jtfNome))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttVoltar)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttSalvar)
                    .addComponent(bttVoltar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        switch(mode){
            case 0:
                this.setVisible(false);
                Main.janela.remove(this);
                Main.janela.add(new HomeGerente());
                Main.janela.setVisible(true);
                break;
            case 1:
                this.setVisible(false);
                Main.janela.remove(this);
                Main.janela.add(new HomeVendedor());
                Main.janela.setVisible(true);
                break;
        }
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        if(checarCampos()){
            dao.atualizaEnderecoCliente(this.cli.getCodCli(), jtfEndereco.getText());
            dao.atualizaTelefoneCliente(this.cli.getCodCli(), jtfTelefone.getText());
            dao.atualizaNomeCliente(this.cli.getCodCli(), jtfNome.getText());
            JOptionPane.showMessageDialog(null, "Atualizado!");
            jcbCliente.setSelectedIndex(0);
            jtfNome.setText("");
            jtfEndereco.setText("");
            jtfTelefone.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void jcbClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbClienteFocusLost
        this.cli = dao.buscaCliente(jcbCliente.getSelectedItem().toString());
        jtfNome.setText(this.cli.getNome());
        jtfEndereco.setText(this.cli.getEndereco());
        jtfTelefone.setText(this.cli.getTelefone());
    }//GEN-LAST:event_jcbClienteFocusLost

    private void loadClientes(){
        List<Cliente> list = dao.recuperaClientes();
        this.clientes = new String[list.size()+1];
        int i = 1;
        this.clientes[0] = "Selecione";
        for(Cliente clien: list){
            this.clientes[i] = String.valueOf(clien.getCPF());
            i++;
        }
    }
    
    private boolean checarCampos(){
        String campo = jtfNome.getText().replaceAll(" ", "");
        String campo2 = jtfEndereco.getText().replaceAll(" ", "");
        String campo3 = jtfTelefone.getText().replaceAll(" ", "");
        return !campo.equals("")&&!campo2.equals("")&&!campo3.equals("()-");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttSalvar;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}