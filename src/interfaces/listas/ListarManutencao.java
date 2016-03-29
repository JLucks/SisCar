/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.listas;

import banco.DAOmanutencao;
import base.Main;
import base.Manutencao;
import interfaces.HomeGerente;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class ListarManutencao extends javax.swing.JPanel {

    /**
     * Creates new form ListarManutencao
     */
    private DAOmanutencao dao;
    private String[][] objects;
    private String[] colunas = {"ID", "Filial", "Valor", "Descrição"};
    public ListarManutencao() {
        dao = new DAOmanutencao();
        loadElements();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jtList = new javax.swing.JTable(this.objects,this.colunas);
        bttVoltar4 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Lista de Manutenções");

        jtList.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(jtList);

        bttVoltar4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttVoltar4.setText("Voltar");
        bttVoltar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttVoltar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVoltar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(bttVoltar4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttVoltar4)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttVoltar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltar4ActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new HomeGerente());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttVoltar4ActionPerformed

    private void loadElements(){
        List<Manutencao> list = dao.recuperaReceitasDespesas();
        this.objects = new String[list.size()][4];
        int i = 0;
        for(Manutencao rec: list){
            this.objects[i][0] = String.valueOf(rec.getId());
            this.objects[i][1] = String.valueOf(rec.getIdVeiculo());
            this.objects[i][2] = String.valueOf(rec.getValor());
            this.objects[i][3] = rec.getDescricao();
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttVoltar4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtList;
    // End of variables declaration//GEN-END:variables
}
