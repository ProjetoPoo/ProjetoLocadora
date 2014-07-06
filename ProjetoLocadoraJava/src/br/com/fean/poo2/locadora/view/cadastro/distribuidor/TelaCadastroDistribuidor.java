package br.com.fean.poo2.locadora.view.cadastro.distribuidor;

import br.com.fean.poo2.locadora.control.distribuidor.DistribuidorServiceImpl;
import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.view.consultar.TelaListaCliente;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroDistribuidor extends javax.swing.JPanel {

    private int idDistribuidor = 0;
    DistribuidorServiceImpl distribuidorServiceImpl = new DistribuidorServiceImpl();

    public TelaCadastroDistribuidor() {
        initComponents();
        retornarTodosDistribuidores();
        desabilitarBotoes();
        bloquearCamposDeTexto();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        painelCadastroDistribuidor = new javax.swing.JPanel();
        nCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        nRazaoSocial = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        nEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        painelContato = new javax.swing.JPanel();
        nNomeContato = new javax.swing.JLabel();
        txtNomeContato = new javax.swing.JTextField();
        nTelefoneContato = new javax.swing.JLabel();
        txtTelefoneContato = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        painelPesquisar = new javax.swing.JPanel();
        cbPequisaDistribuidor = new javax.swing.JComboBox();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 600));

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(52, 52));
        btnCancelar.setMinimumSize(new java.awt.Dimension(32, 32));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        painelCadastroDistribuidor.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Distribuidor"));

        nCNPJ.setText("CNPJ:");

        nRazaoSocial.setText("Razão Social:");

        nEndereco.setText("Endereço:");

        painelContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        nNomeContato.setText("Nome:");

        nTelefoneContato.setText("Telefone:");

        javax.swing.GroupLayout painelContatoLayout = new javax.swing.GroupLayout(painelContato);
        painelContato.setLayout(painelContatoLayout);
        painelContatoLayout.setHorizontalGroup(
            painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nNomeContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nTelefoneContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        painelContatoLayout.setVerticalGroup(
            painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nTelefoneContato))
                    .addGroup(painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nNomeContato)
                        .addComponent(txtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelCadastroDistribuidorLayout = new javax.swing.GroupLayout(painelCadastroDistribuidor);
        painelCadastroDistribuidor.setLayout(painelCadastroDistribuidorLayout);
        painelCadastroDistribuidorLayout.setHorizontalGroup(
            painelCadastroDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroDistribuidorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelCadastroDistribuidorLayout.createSequentialGroup()
                        .addGroup(painelCadastroDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelCadastroDistribuidorLayout.createSequentialGroup()
                                .addComponent(nEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco))
                            .addGroup(painelCadastroDistribuidorLayout.createSequentialGroup()
                                .addComponent(nCNPJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nRazaoSocial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelCadastroDistribuidorLayout.setVerticalGroup(
            painelCadastroDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroDistribuidorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCNPJ)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nRazaoSocial)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setText("Novo");
        btnNovo.setMaximumSize(new java.awt.Dimension(52, 52));
        btnNovo.setMinimumSize(new java.awt.Dimension(32, 32));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(52, 52));
        btnSalvar.setMinimumSize(new java.awt.Dimension(32, 32));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.setMaximumSize(new java.awt.Dimension(52, 52));
        btnDeletar.setMinimumSize(new java.awt.Dimension(32, 32));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "CNPJ", "Razão social", "Endereço", "Contato", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        painelDeRolagem.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(60);
            tabela.getColumnModel().getColumn(0).setMaxWidth(60);
            tabela.getColumnModel().getColumn(1).setMinWidth(120);
            tabela.getColumnModel().getColumn(1).setMaxWidth(120);
            tabela.getColumnModel().getColumn(5).setMinWidth(100);
            tabela.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        painelPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        cbPequisaDistribuidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Razão Social", "CNPJ" }));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPesquisarLayout = new javax.swing.GroupLayout(painelPesquisar);
        painelPesquisar.setLayout(painelPesquisarLayout);
        painelPesquisarLayout.setHorizontalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbPequisaDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelPesquisarLayout.setVerticalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPesquisarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPequisaDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelCadastroDistribuidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        idDistribuidor = Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtCNPJ.setText(modelo.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtRazaoSocial.setText(modelo.getValueAt(tabela.getSelectedRow(), 2).toString());
        txtEndereco.setText(modelo.getValueAt(tabela.getSelectedRow(), 3).toString());
        txtNomeContato.setText(modelo.getValueAt(tabela.getSelectedRow(), 4).toString());
        txtTelefoneContato.setText(modelo.getValueAt(tabela.getSelectedRow(), 5).toString());

        editarCamposDeTexto();
        habilitarBotoes();
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        idDistribuidor = 0;
        limparCamposDeTexto();
        editarCamposDeTexto();
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if ((txtRazaoSocial.getText().length() == 0 && txtTelefoneContato.getText().length() == 0)) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
        } else if (txtRazaoSocial.getText().length() == 0 && txtTelefoneContato.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo da razão social e telefone!");
        } else {

            if (idDistribuidor == 0) {
                try {
                    distribuidorServiceImpl.inserirDistribuidor(
                            txtCNPJ.getText(),
                            txtRazaoSocial.getText(),
                            txtEndereco.getText(),
                            txtNomeContato.getText(),
                            txtTelefoneContato.getText()
                    );

                    JOptionPane.showMessageDialog(null, "Novo registro salvo com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposDeTexto();
                }
            } else {
                try {
                    distribuidorServiceImpl.alterarDistribuidor(
                            idDistribuidor,
                            txtCNPJ.getText(),
                            txtRazaoSocial.getText(),
                            txtEndereco.getText(),
                            txtNomeContato.getText(),
                            txtTelefoneContato.getText()
                    );

                    JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n ERRO: " + ex);
                }
            }

            retornarTodosDistribuidores();
            limparCamposDeTexto();
            desabilitarBotoes();
            bloquearCamposDeTexto();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {

            try {

                distribuidorServiceImpl.deletarDistribuidor(distribuidorServiceImpl.retornarDistribuidor(idDistribuidor));
                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar registro! \n \n ERRO: " + ex);
            }
        }
        retornarTodosDistribuidores();
        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCamposDeTexto();
        bloquearCamposDeTexto();
        desabilitarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            pesquisaFiltroCombo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar! \n \n ERRO: " + ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    public void pesquisaFiltroCombo() throws Exception {

        if (cbPequisaDistribuidor.getSelectedIndex() == 0) {
            ArrayList<Distribuidor> listaDist = new ArrayList<Distribuidor>();
            DistribuidorServiceImpl distribuidorImpl = new DistribuidorServiceImpl();
            listaDist = distribuidorImpl.pesquisaDistribuidorRazaoSocial(txtPesquisar.getText());

            carregarDadosDaTabela(listaDist);
        }
        if (cbPequisaDistribuidor.getSelectedIndex() == 1) {
            ArrayList<Distribuidor> listaDist = new ArrayList<Distribuidor>();
            DistribuidorServiceImpl distribuidorImpl = new DistribuidorServiceImpl();
            listaDist = distribuidorImpl.pesquisaDistribuidorCNPJ(txtPesquisar.getText());

            carregarDadosDaTabela(listaDist);

        }
    }

    public void limparCamposDeTexto() {
        txtCNPJ.setText("");
        txtRazaoSocial.setText("");
        txtEndereco.setText("");
        txtNomeContato.setText("");
        txtTelefoneContato.setText("");

    }

    public void editarCamposDeTexto() {

        txtCNPJ.setEnabled(true);
        txtRazaoSocial.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNomeContato.setEnabled(true);
        txtTelefoneContato.setEnabled(true);
    }

    public void bloquearCamposDeTexto() {
        txtCNPJ.setEnabled(false);
        txtRazaoSocial.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNomeContato.setEnabled(false);
        txtTelefoneContato.setEnabled(false);
    }

    public void habilitarBotoes() {
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    public void desabilitarBotoes() {
        btnSalvar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    public void retornarTodosDistribuidores() {
        ArrayList<Distribuidor> lista = new ArrayList<Distribuidor>();
        try {
            lista = (distribuidorServiceImpl.retornarDistribuidores());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar Distribuidores! \n \n ERRO: " + ex);
        }
        carregarDadosDaTabela(lista);
    }

    public void carregarDadosDaTabela(ArrayList<Distribuidor> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        try {

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getCnpj(),
                    lista.get(i).getRazaoSocial(),
                    lista.get(i).getEndereco(),
                    lista.get(i).getPessoaContato(),
                    lista.get(i).getFone()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela! \n \n ERRO: " + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbPequisaDistribuidor;
    private javax.swing.JLabel nCNPJ;
    private javax.swing.JLabel nEndereco;
    private javax.swing.JLabel nNomeContato;
    private javax.swing.JLabel nRazaoSocial;
    private javax.swing.JLabel nTelefoneContato;
    private javax.swing.JPanel painelCadastroDistribuidor;
    private javax.swing.JPanel painelContato;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JPanel painelPesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeContato;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefoneContato;
    // End of variables declaration//GEN-END:variables
}
