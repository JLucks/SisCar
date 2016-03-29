/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.listas;

import banco.DAOcliente;
import base.Cliente;
import base.Main;
import base.Vendedor;
import interfaces.HomeGerente;
import interfaces.HomeVendedor;
import java.util.List;

/**
 *
 * @author joaovvr
 */
public class ListarCliente extends javax.swing.JPanel {

    /**
     * Creates new form ListarCliente
     */
    private DAOcliente dao;
    private String[][] clientes;
    private String[] colunas = {"ID","Nome","CPF","Endereço","Telefone"};
    private int mode;
    private Vendedor vendedor;
    
    public ListarCliente(int mode) {
        dao = new DAOcliente();
        loadElements();
        initComponents();
        this.mode = mode;
    }

    public ListarCliente(int mode, Vendedor vendedor) {
        dao = new DAOcliente();
        loadElements();
        initComponents();
        this.mode = mode;
        this.vendedor = vendedor;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlListadeClientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListarCliente = new javax.swing.JTable(this.clientes,this.colunas);
        bttVoltar = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(617, 512));

        jlListadeClientes.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jlListadeClientes.setText("Lista de Clientes");

        jtListarCliente.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jtListarCliente);

        bttVoltar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttVoltar.setText("Voltar");
        bttVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bttVoltar)
                .addGap(267, 267, 267))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jlListadeClientes)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlListadeClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(bttVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        switch(this.mode){
            case 0:
                this.setVisible(false);
                Main.janela.remove(this);
                Main.janela.add(new HomeGerente());
                Main.janela.setVisible(true);
                break;
            case 1:
                this.setVisible(false);
                Main.janela.remove(this);
                Main.janela.add(new HomeVendedor(this.vendedor));
                Main.janela.setVisible(true);
                break;
        }
    }//GEN-LAST:event_bttVoltarActionPerformed

    private void loadElements(){
        List<Cliente> list = dao.recuperaClientes();
        this.clientes = new String[list.size()][5];
        int i = 0;
        for(Cliente clie: list){
            this.clientes[i][0] = String.valueOf(clie.getCodCli());
            this.clientes[i][1] = clie.getNome();
            this.clientes[i][2] = clie.getCPF();
            this.clientes[i][3] = clie.getEndereco();
            this.clientes[i][4] = clie.getTelefone();
            i++;
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlListadeClientes;
    private javax.swing.JTable jtListarCliente;
    // End of variables declaration//GEN-END:variables
}