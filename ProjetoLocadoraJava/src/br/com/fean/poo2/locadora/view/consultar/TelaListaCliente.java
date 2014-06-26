package br.com.fean.poo2.locadora.view.consultar;

import br.com.fean.poo2.locadora.control.dependente.DependenteServiceImpl;
import br.com.fean.poo2.locadora.control.socio.SocioServiceImpl;
import br.com.fean.poo2.locadora.modelo.dependente.Dependente;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import br.com.fean.poo2.locadora.view.cadastro.cliente.TelaCadastroCliente;
import br.com.fean.poo2.locadora.view.locar.TelaLocacao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListaCliente extends javax.swing.JFrame {

    private TelaLocacao refpai;

    public TelaListaCliente() throws Exception {
        initComponents();
        carregaClientes();
    }

    public TelaListaCliente(TelaLocacao framepai) throws Exception {
        initComponents();
        carregaClientes();
        refpai = framepai;
    }

    public void pesquisaFiltro() throws Exception {
        if (jComboBox1.getSelectedIndex() == 0) {
            ArrayList<Socio> listasocios = new ArrayList<Socio>();
            SocioServiceImpl socioImpl = new SocioServiceImpl();
            listasocios = socioImpl.pesquisaSocioNome(jTextField1.getText());

            try {
                DefaultTableModel modeloTable = new DefaultTableModel();
                modeloTable.addColumn("Codigo");
                modeloTable.addColumn("Nome");
                modeloTable.addColumn("Endereço");
                modeloTable.addColumn("Fone Res");
                modeloTable.addColumn("Local Trabalho");
                modeloTable.addColumn("CPF");
                for (Socio socio : listasocios) {
                    modeloTable.addRow(new Object[]{socio.getId(),
                        socio.getNome(), socio.getEndereco(),
                        socio.getFoneRes(), socio.getLocalTrabalho(), socio.getCpf()});
                }
                tabelaListaCliente.setModel(modeloTable);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "leitura de dados "
                        + "de socio com problema..."
                        + " erro: " + e);
            }
        }
        if (jComboBox1.getSelectedIndex() == 0) {
            ArrayList<Socio> listasocios = new ArrayList<Socio>();
            SocioServiceImpl socioImpl = new SocioServiceImpl();
            listasocios = socioImpl.pesquisaSocioNome(jTextField1.getText());

            try {
                DefaultTableModel modeloTable = new DefaultTableModel();
                modeloTable.addColumn("Codigo");
                modeloTable.addColumn("Nome");
                modeloTable.addColumn("Endereço");
                modeloTable.addColumn("Fone Res");
                modeloTable.addColumn("Local Trabalho");
                modeloTable.addColumn("CPF");
                for (Socio socio : listasocios) {
                    modeloTable.addRow(new Object[]{socio.getId(),
                        socio.getNome(), socio.getEndereco(),
                        socio.getFoneRes(), socio.getLocalTrabalho(), socio.getCpf()});
                }
                tabelaListaCliente.setModel(modeloTable);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "leitura de dados "
                        + "de socio com problema..."
                        + " erro: " + e);
            }
        }
        if (jComboBox1.getSelectedIndex() == 1) {
            ArrayList<Dependente> listadependentes = new ArrayList<Dependente>();
            DependenteServiceImpl dependenteImpl = new DependenteServiceImpl();
            listadependentes = dependenteImpl.pesquisaDependenteNome(jTextField1.getText());

            try {
                DefaultTableModel modeloTable = new DefaultTableModel();
                modeloTable.addColumn("Codigo");
                modeloTable.addColumn("Nome Dependente");
                for (Dependente dependente : listadependentes) {
                    modeloTable.addRow(new Object[]{dependente.getId(),
                        dependente.getNome()});
                }
                tabelaListaCliente.setModel(modeloTable);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "leitura de dados "
                        + "de socio com problema..."
                        + " erro: " + e);
            }
        }
        if (jComboBox1.getSelectedIndex() == 3) {
            ArrayList<Socio> listasocios = new ArrayList<Socio>();
            SocioServiceImpl socioImpl = new SocioServiceImpl();
            listasocios = socioImpl.pesquisaSocioCodigo(Integer.parseInt(jTextField1.getText()));

            try {
                DefaultTableModel modeloTable = new DefaultTableModel();
                modeloTable.addColumn("Codigo");
                modeloTable.addColumn("Nome");
                modeloTable.addColumn("Endereço");
                modeloTable.addColumn("Fone Res");
                modeloTable.addColumn("Local Trabalho");
                modeloTable.addColumn("CPF");
                for (Socio socio : listasocios) {
                    modeloTable.addRow(new Object[]{socio.getId(),
                        socio.getNome(), socio.getEndereco(),
                        socio.getFoneRes(), socio.getLocalTrabalho(), socio.getCpf()});
                }
                tabelaListaCliente.setModel(modeloTable);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "leitura de dados "
                        + "de socio com problema..."
                        + " erro: " + e);
            }
        }
    }

    public void carregaClientes() throws Exception {
        ArrayList<Socio> listasocios = new ArrayList<Socio>();
        SocioServiceImpl socioImpl = new SocioServiceImpl();
        listasocios = socioImpl.retornarSocios();

        try {
            DefaultTableModel modeloTable = new DefaultTableModel();
            modeloTable.addColumn("Codigo");
            modeloTable.addColumn("Nome");
            modeloTable.addColumn("Endereço");
            modeloTable.addColumn("Fone Res");
            modeloTable.addColumn("Local Trabalho");
            modeloTable.addColumn("CPF");
            for (Socio socio : listasocios) {
                modeloTable.addRow(new Object[]{socio.getId(),
                    socio.getNome(), socio.getEndereco(),
                    socio.getFoneRes(), socio.getLocalTrabalho(), socio.getCpf()});
            }
            tabelaListaCliente.setModel(modeloTable);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "leitura de dados "
                    + "de socio com problema..."
                    + " erro: " + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListaCliente = new javax.swing.JTable();
        sair = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Lista de Clientes");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelaListaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaListaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaListaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaListaCliente);
        if (tabelaListaCliente.getColumnModel().getColumnCount() > 0) {
            tabelaListaCliente.getColumnModel().getColumn(0).setMinWidth(60);
            tabelaListaCliente.getColumnModel().getColumn(0).setMaxWidth(60);
            tabelaListaCliente.getColumnModel().getColumn(2).setMinWidth(120);
            tabelaListaCliente.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "CPF", "Dependente", "Código" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(670, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void tabelaListaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaListaClienteMouseClicked
        Integer linhaSelecionada = tabelaListaCliente.getSelectedRow();
        Integer valorCodigoSelecionado = (Integer) tabelaListaCliente.getValueAt(linhaSelecionada, 0);
        String valorNomeSelecionado = (String) tabelaListaCliente.getValueAt(linhaSelecionada, 1);
        refpai.setCodCliente(valorCodigoSelecionado);
        refpai.setNomeCliente(valorNomeSelecionado);
        dispose();
    }//GEN-LAST:event_tabelaListaClienteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            pesquisaFiltro();
        } catch (Exception ex) {
            Logger.getLogger(TelaListaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton sair;
    private javax.swing.JTable tabelaListaCliente;
    // End of variables declaration//GEN-END:variables
}
