/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import banco.DAOaluguel;
import banco.DAOcliente;
import banco.DAOveiculo;
import base.Aluguel;
import base.Cliente;
import base.Main;
import base.Veiculo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class CadAluguel extends javax.swing.JPanel {

    /**
     * Creates new form Aluguel
     */
    private DAOcliente daoc;
    private DAOveiculo daov;
    private String[] clientes;
    private String[] veiculos;
    
    public CadAluguel() {
        daoc = new DAOcliente();
        loadClientes();
        daov = new DAOveiculo();
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
        jLabel2 = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>(this.clientes);
        jLabel3 = new javax.swing.JLabel();
        jcbVeiculo = new javax.swing.JComboBox<>(this.veiculos);
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaResultado = new javax.swing.JTextArea();
        bttCalcular = new javax.swing.JButton();
        bttConfirmar = new javax.swing.JButton();
        bttLimpar = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();
        bttAdicionarCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jlCodVend = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jlMulta = new javax.swing.JLabel();
        jtfTempo = new javax.swing.JFormattedTextField();
        jtfDesconto = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Fazer Aluguel");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        jcbCliente.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Veiculo:");

        jcbVeiculo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Tempo:");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setText("dias");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setText("Preço diario:");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setText("R$");

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setText("Desconto:");

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setText("%");

        jtaResultado.setEditable(false);
        jtaResultado.setColumns(20);
        jtaResultado.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jtaResultado.setRows(5);
        jtaResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 14))); // NOI18N
        jScrollPane1.setViewportView(jtaResultado);

        bttCalcular.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttCalcular.setText("Calcular");
        bttCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCalcularActionPerformed(evt);
            }
        });

        bttConfirmar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttConfirmar.setText("Confirmar");
        bttConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttConfirmarActionPerformed(evt);
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

        bttAdicionarCliente.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttAdicionarCliente.setText("Adicionar Cliente");
        bttAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAdicionarClienteActionPerformed(evt);
            }
        });

        jLabel10.setText("Vendedor:");

        jlCodVend.setText("00000000000");

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel12.setText("Multa Diaria:");

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel13.setText("R$");

        jlPreco.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jlPreco.setText("0.00");

        jlMulta.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jlMulta.setText("0.00");

        try {
            jtfTempo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTempo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        try {
            jtfDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfDesconto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttAdicionarCliente)
                .addGap(35, 35, 35)
                .addComponent(bttConfirmar)
                .addGap(48, 48, 48)
                .addComponent(bttLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bttCalcular)
                                .addGap(235, 235, 235))
                            .addComponent(bttVoltar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfTempo))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlMulta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(8, 8, 8)
                                .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(9, 9, 9)))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCodVend)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jlCodVend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jlPreco)
                    .addComponent(jtfTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jlMulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttCalcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttConfirmar)
                    .addComponent(bttLimpar)
                    .addComponent(bttVoltar)
                    .addComponent(bttAdicionarCliente))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAdicionarClienteActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new CadastroCliente(2));
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttAdicionarClienteActionPerformed

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new HomeVendedor());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void bttLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimparActionPerformed
        clearCampos();
    }//GEN-LAST:event_bttLimparActionPerformed

    private void bttCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCalcularActionPerformed
        if(checarCampos()){
            jtaResultado.setText("Vendedor: "+jlCodVend.getText()+"\n");
            jtaResultado.setText(jtaResultado.getText()+"Cliente: "+jcbCliente.getSelectedItem().toString()+"\n");
            jtaResultado.setText(jtaResultado.getText()+"Vendedor: "+jcbVeiculo.getSelectedItem().toString()+"\n");
            jtaResultado.setText(jtaResultado.getText()+"Data Devolução: "+dateDev()+"\n");
            jtaResultado.setText(jtaResultado.getText()+"Preço: "+precTotal()+"\n");
            jtaResultado.setText(jtaResultado.getText()+"Multa: "+jlMulta.getText()+"\n");
        }
        else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        }
    }//GEN-LAST:event_bttCalcularActionPerformed

    private void bttConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttConfirmarActionPerformed
        if(checarCampos()){
            Aluguel aluguel = new Aluguel();
            DAOaluguel dao = new DAOaluguel();
            aluguel.setCodCli(Integer.parseInt(jcbCliente.getSelectedItem().toString()));
            aluguel.setCodVei(Integer.parseInt(jcbVeiculo.getSelectedItem().toString()));
            aluguel.setCodVen(Integer.parseInt(jlCodVend.getText()));
            aluguel.setDesconto(Integer.parseInt(jtfDesconto.getText()));
            aluguel.setMulta(Float.parseFloat(jlMulta.getText()));
            aluguel.setPreco(Float.parseFloat(jlPreco.getText()));
            aluguel.setTempo(Integer.parseInt(jtfTempo.getText()));
            aluguel.setTotal(Float.parseFloat(precTotal()));
            //salvar dao
            JOptionPane.showMessageDialog(null, "Realizado com sucesso!");
            clearCampos();
            
        }else{
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        }
    }//GEN-LAST:event_bttConfirmarActionPerformed

    private void clearCampos(){
        jtfDesconto.setText("");
        jtfTempo.setText("");
        jcbCliente.setSelectedIndex(0);
        jcbVeiculo.setSelectedIndex(0);
        jtaResultado.setText("");
    }
    
     private boolean checarCampos(){
        int campo = jcbCliente.getSelectedIndex();
        int campo2 = jcbVeiculo.getSelectedIndex();
        String campo3 = jtfTempo.getText().replaceAll(" ", "");
        String campo4 = jtfDesconto.getText().replaceAll(" ", "");
        return !(campo==0)&&!(campo2==0)&&!campo3.equals("")&&!campo4.equals(",");
    }
    
    private String dateDev(){
        String res, format = "dd/MM/yyyy";
        Calendar c = Calendar.getInstance();
        SimpleDateFormat date = new SimpleDateFormat(format);
        c.add(Calendar.DATE, +Integer.parseInt(jtfTempo.getText()));
        res = date.format(c.getTime());
        return res;
    }
    
    private String precTotal(){
        String res;
        int temp = Integer.parseInt(jtfTempo.getText());
        float preco = Float.parseFloat(jlPreco.getText().replaceAll(",", ".")), desc = Float.parseFloat(jtfDesconto.getText().replaceAll(",", "."));
        res = String.valueOf(((desc/100)*(preco*temp)));
        return res;
    }
    
    private void loadClientes(){
        List<Cliente> list = daoc.recuperaClientes();
        this.clientes = new String[list.size()+1];
        int i = 1;
        this.clientes[0] = "Selecione";
        for(Cliente cli: list){
            this.clientes[i] = String.valueOf(cli.getCodCli());
            i++;
        }
    }
    
    private void loadVeiculos(){
        List<Veiculo> list = daov.recuperaVeiculos();
        this.veiculos = new String[list.size()+1];
        int i = 1;
        this.veiculos[0] = "Selecione";
        for(Veiculo vei: list){
            this.veiculos[i] = String.valueOf(vei.getCodVei());
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAdicionarCliente;
    private javax.swing.JButton bttCalcular;
    private javax.swing.JButton bttConfirmar;
    private javax.swing.JButton bttLimpar;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbVeiculo;
    private javax.swing.JLabel jlCodVend;
    private javax.swing.JLabel jlMulta;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JTextArea jtaResultado;
    private javax.swing.JFormattedTextField jtfDesconto;
    private javax.swing.JFormattedTextField jtfTempo;
    // End of variables declaration//GEN-END:variables
}
