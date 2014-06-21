package br.com.fean.poo2.locadora.view.consultar;

import br.com.fean.poo2.locadora.control.distribuidor.DistribuidorServiceImpl;
import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListaDistribuidor extends javax.swing.JFrame {

    private int cnpj = 0;
    DistribuidorServiceImpl distribuidorServiceImpl = new DistribuidorServiceImpl();

    public TelaListaDistribuidor() {
        initComponents();
        retornarTodosDistribuidores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbDistribuidor = new javax.swing.JComboBox();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListaDistribuidor = new javax.swing.JTable();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Distribuidor"));

        cbDistribuidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "CNPJ" }));

        btnPesquisar.setText("Pesquisar");

        tabelaListaDistribuidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNPJ", "Razão Social", "Telefone", "Contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaListaDistribuidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaListaDistribuidorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaListaDistribuidor);
        if (tabelaListaDistribuidor.getColumnModel().getColumnCount() > 0) {
            tabelaListaDistribuidor.getColumnModel().getColumn(0).setMinWidth(120);
            tabelaListaDistribuidor.getColumnModel().getColumn(0).setMaxWidth(120);
            tabelaListaDistribuidor.getColumnModel().getColumn(2).setMinWidth(100);
            tabelaListaDistribuidor.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(sair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(705, 592));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // sair
        dispose();

    }//GEN-LAST:event_sairActionPerformed

    private void tabelaListaDistribuidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaListaDistribuidorMouseClicked

        DefaultTableModel modelo = (DefaultTableModel) tabelaListaDistribuidor.getModel();

        cnpj = Integer.parseInt(modelo.getValueAt(tabelaListaDistribuidor.getSelectedRow(), 0).toString());
        
        

    }//GEN-LAST:event_tabelaListaDistribuidorMouseClicked

    public void retornarTodosDistribuidores() {

        ArrayList<Distribuidor> lista = new ArrayList<Distribuidor>();
        try {
            lista = (distribuidorServiceImpl.retornarDistribuidor());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar Cursos! \n \n ERRO: " + ex);
        }
        carregarDadosTabela(lista);

    }

    public void carregarDadosTabela(ArrayList<Distribuidor> lista) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaListaDistribuidor.getModel();
        modelo.setRowCount(0);

        try {

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getCnpj(),
                    lista.get(i).getRazaoSocial(),
                    lista.get(i).getFone(),
                    lista.get(i).getPessoaContato()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela! \n \n ERRO: " + ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox cbDistribuidor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sair;
    private javax.swing.JTable tabelaListaDistribuidor;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
