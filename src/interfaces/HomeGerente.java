/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import base.Main;

/**
 *
 * @author Jorge
 */
public class HomeGerente extends javax.swing.JPanel {

    /**
     * Creates new form HomeGerente
     */
    public HomeGerente() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttSair = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bttCadastrarF = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bttEditarF = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bttListarF = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bttRemoverF = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        bttCadastrarV = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        bttEditarV = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bttListarV = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        bttRemoverV = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        bttCadastrarC = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        bttEditarC = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bttListarC = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        bttRemoverC = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        bttGerarF = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        bttGerarV = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        bttGerarC = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        bttGerarA = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(617, 518));

        jTabbedPane1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(617, 484));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Bem Vindo ao SisCar");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outros/carros.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(592, 383));

        bttSair.setText("Sair");
        bttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSairActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel29.setText("Logado como Gerente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttSair)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel29)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bttSair))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29))
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Gerenciamento de Funcionarios");

        bttCadastrarF.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttCadastrarF.setText("Cadastrar");
        bttCadastrarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("Cadastrar");

        bttEditarF.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttEditarF.setText("Editar");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setText("Editar");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setText("Listar");

        bttListarF.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttListarF.setText("Listar");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setText("Remover");

        bttRemoverF.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemoverF.setText("Remover");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(135, 135, 135))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(137, 137, 137))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(bttListarF))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(bttCadastrarF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttRemoverF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttEditarF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(117, 117, 117))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel3)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCadastrarF)
                    .addComponent(bttEditarF))
                .addGap(113, 113, 113)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttListarF)
                    .addComponent(bttRemoverF))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionarios", jPanel2);

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel13.setText("Gerenciamento de Veiculos");

        bttCadastrarV.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttCadastrarV.setText("Cadastrar");
        bttCadastrarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarVActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel14.setText("Cadastrar");

        bttEditarV.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttEditarV.setText("Editar");

        jLabel15.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel15.setText("Editar");

        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel16.setText("Listar");

        bttListarV.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttListarV.setText("Listar");

        jLabel17.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel17.setText("Remover");

        bttRemoverV.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemoverV.setText("Remover");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(135, 135, 135))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(137, 137, 137))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(bttListarV))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(bttCadastrarV)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttRemoverV, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttEditarV, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(117, 117, 117))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel13)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCadastrarV)
                    .addComponent(bttEditarV))
                .addGap(113, 113, 113)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttListarV)
                    .addComponent(bttRemoverV))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Veiculos", jPanel7);

        jLabel18.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel18.setText("Gerenciamento de Clientes");

        bttCadastrarC.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttCadastrarC.setText("Cadastrar");
        bttCadastrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarCActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel19.setText("Cadastrar");

        bttEditarC.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttEditarC.setText("Editar");

        jLabel20.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel20.setText("Editar");

        jLabel21.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel21.setText("Listar");

        bttListarC.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttListarC.setText("Listar");

        jLabel22.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel22.setText("Remover");

        bttRemoverC.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttRemoverC.setText("Remover");

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setText("Ver Alugueis");

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton1.setText("Ver Alugueis");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(135, 135, 135))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(137, 137, 137))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(bttCadastrarC))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(bttListarC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttRemoverC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttEditarC, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(117, 117, 117))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel18))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel8)))))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel18)
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttCadastrarC)
                    .addComponent(bttEditarC))
                .addGap(113, 113, 113)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttListarC)
                    .addComponent(bttRemoverC))
                .addGap(55, 55, 55)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jPanel8);

        jLabel23.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel23.setText("Gerar Relatorios");

        jLabel24.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel24.setText("Relatorios Funcionarios:");

        bttGerarF.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttGerarF.setText("Gerar");

        jLabel25.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel25.setText("Relatorio Veiculos:");

        bttGerarV.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttGerarV.setText("Gerar");

        jLabel26.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel26.setText("Relatorio Clientes:");

        bttGerarC.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttGerarC.setText("Gerar");

        jLabel27.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel27.setText("Relatorio Alugueis:");

        bttGerarA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttGerarA.setText("Gerar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel23))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttGerarF))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bttGerarC))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bttGerarV)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttGerarA)))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel23)
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(bttGerarF))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(bttGerarV))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(bttGerarC))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(bttGerarA))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Relatorios", jPanel4);

        jLabel28.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel28.setText("Logado como Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(jLabel28)
                    .addContainerGap(224, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(251, 251, 251)
                    .addComponent(jLabel28)
                    .addContainerGap(251, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSairActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new Login());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttSairActionPerformed

    private void bttCadastrarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarFActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new CadastroFuncionario(2));
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttCadastrarFActionPerformed

    private void bttCadastrarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarVActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new CadastroVeiculo());
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttCadastrarVActionPerformed

    private void bttCadastrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarCActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new CadastroCliente(0));
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttCadastrarCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCadastrarC;
    private javax.swing.JButton bttCadastrarF;
    private javax.swing.JButton bttCadastrarV;
    private javax.swing.JButton bttEditarC;
    private javax.swing.JButton bttEditarF;
    private javax.swing.JButton bttEditarV;
    private javax.swing.JButton bttGerarA;
    private javax.swing.JButton bttGerarC;
    private javax.swing.JButton bttGerarF;
    private javax.swing.JButton bttGerarV;
    private javax.swing.JButton bttListarC;
    private javax.swing.JButton bttListarF;
    private javax.swing.JButton bttListarV;
    private javax.swing.JButton bttRemoverC;
    private javax.swing.JButton bttRemoverF;
    private javax.swing.JButton bttRemoverV;
    private javax.swing.JButton bttSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
