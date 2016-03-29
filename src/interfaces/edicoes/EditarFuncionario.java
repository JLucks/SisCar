/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.edicoes;

import interfaces.cadastros.CadastroUsuario;
import interfaces.cadastros.CadastroGerente;
import interfaces.cadastros.CadastroAdministrador;
import banco.DAOfilial;
import banco.DAOfuncionario;
import base.Filial;
import base.Funcionario;
import base.Main;
import interfaces.HomeAdministrador;
import interfaces.HomeGerente;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class EditarFuncionario extends javax.swing.JPanel {

    /**
     * Creates new form EditarFuncionario
     */
    private DAOfilial daof;
    private DAOfuncionario dao;
    private String[] filiais;
    private String[] funcionarios;
    private Funcionario func;
    
    public EditarFuncionario() {
        daof = new DAOfilial();
        dao = new DAOfuncionario();
        loadFiliais();
        loadFuncionarios();
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
        jtfNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbCpf = new javax.swing.JComboBox<>(this.funcionarios);
        jLabel4 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaEndereco = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jtfSalario = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfCgHoraria = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jcbFilial = new javax.swing.JComboBox<>(this.filiais);
        bttSalvar = new javax.swing.JButton();
        bttLimpar = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Editar Funcionario");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jtfNome.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setText("CPF:");

        jcbCpf.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcbCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbCpfFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTelefone.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Endereço:");

        jtaEndereco.setColumns(20);
        jtaEndereco.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtaEndereco.setRows(5);
        jScrollPane1.setViewportView(jtaEndereco);

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setText("Salário:");

        try {
            jtfSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("RS #####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfSalario.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setText("Carga horária:");

        try {
            jtfCgHoraria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCgHoraria.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCgHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttSalvar)
                .addGap(175, 175, 175)
                .addComponent(bttLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(bttVoltar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCgHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcbFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttSalvar)
                    .addComponent(bttVoltar)
                    .addComponent(bttLimpar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        if(checarCampos()){
            this.func.setCargaH(Integer.parseInt(jtfCgHoraria.getText()));
            this.func.setCodFilial(daof.buscaFilial(jcbFilial.getSelectedItem().toString()).getCodFilial());
            this.func.setEndereco(jtaEndereco.getText());
            this.func.setNome(jtfNome.getText());
            String sal = jtfSalario.getText().replaceAll("RS", "");
            sal = sal.replaceAll(" ", "");
            this.func.setSalario(Float.parseFloat(sal));
            this.func.setTelefone(jtfTelefone.getText());
            dao.atualizaFuncionario(this.func);
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

    private void jcbCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbCpfFocusLost
        this.func = dao.buscaFuncionario(jcbCpf.getSelectedItem().toString());
        jtfNome.setText(this.func.getNome());
        jtaEndereco.setText(this.func.getEndereco());
        jtfTelefone.setText(this.func.getTelefone());
        jtfCgHoraria.setText(String.valueOf(this.func.getCargaH()));
        String sal = "RS "+String.valueOf(this.func.getSalario());
        jtfSalario.setText(sal);
        jcbFilial.setSelectedItem(daof.buscaFilial(this.func.getCodFilial()).getMatricula());
    }//GEN-LAST:event_jcbCpfFocusLost

    private boolean checarCampos(){
        String campo = jtfNome.getText().replaceAll(" ", "");
        String campo2 = jtaEndereco.getText().replaceAll(" ", "");
        String campo3 = jtfTelefone.getText().replaceAll(" ", "");
        String campo5 = jtfCgHoraria.getText().replaceAll(" ", "");
        String campo6 = jtfSalario.getText().replaceAll(" ", "");
        int campo9 = jcbCpf.getSelectedIndex();
        int campo10 = jcbFilial.getSelectedIndex();
        return !campo.equals("")&&!campo2.equals("")&&!campo3.equals("()-")&&!campo5.equals("")&&!campo6.equals("R$,")&&!(campo9==0)&&!(campo10==0);
    }
    
    private void clearCampo(){
        jtfNome.setText("");
        jcbCpf.setSelectedIndex(0);
        jtfTelefone.setText("");
        jtfCgHoraria.setText("");
        jtfSalario.setText("");
        jcbFilial.setSelectedIndex(0);
        jtaEndereco.setText("");
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
    
    private void loadFuncionarios(){
        List<Funcionario> list = dao.recuperaFuncionarios();
        this.funcionarios = new String[list.size()+1];
        int i = 1;
        this.funcionarios[0] = "Selecione";
        for(Funcionario ful: list){
            this.funcionarios[i] = ful.getCpf();
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCpf;
    private javax.swing.JComboBox<String> jcbFilial;
    private javax.swing.JTextArea jtaEndereco;
    private javax.swing.JFormattedTextField jtfCgHoraria;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JFormattedTextField jtfSalario;
    private javax.swing.JFormattedTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}