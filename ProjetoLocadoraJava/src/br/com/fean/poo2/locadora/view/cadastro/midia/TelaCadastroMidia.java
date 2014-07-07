package br.com.fean.poo2.locadora.view.cadastro.midia;

import br.com.fean.poo2.locadora.control.distribuidor.DistribuidorServiceImpl;
import br.com.fean.poo2.locadora.control.midia.MidiaServiceImpl;
import br.com.fean.poo2.locadora.control.tipomidia.TipoMidiaServiceImpl;
import br.com.fean.poo2.locadora.control.titulos.TituloServiceImpl;
import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.midia.Midia;
import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidia;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroMidia extends javax.swing.JPanel {

    private TituloServiceImpl tituloServiceImpl;
    private TipoMidiaServiceImpl tipoMidiaServiceImpl;
    private DistribuidorServiceImpl distribuidorServiceImpl;
    private List<Titulo> titulos;
    private ArrayList<TipoMidia> tipoMidias;
    private ArrayList<Distribuidor> distribuidores;
    private MidiaServiceImpl midiaServiceImpl;

    public TelaCadastroMidia() {
        initComponents();

        tituloServiceImpl = new TituloServiceImpl();
        tipoMidiaServiceImpl = new TipoMidiaServiceImpl();
        distribuidorServiceImpl = new DistribuidorServiceImpl();
        midiaServiceImpl = new MidiaServiceImpl();

        try {
            titulos = tituloServiceImpl.retornarTitulos();
            tipoMidias = tipoMidiaServiceImpl.retornarTipoMidia();
            distribuidores = distribuidorServiceImpl.retornarDistribuidores();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel carregar os dados do combo box" + e);
        }

        for (Titulo t : titulos) {
            cmbTitulo.addItem(t);
        }

        for (TipoMidia tm : tipoMidias) {
            cmbTipoMidia.addItem(tm);
        }

        for (Distribuidor d : distribuidores) {
            cmbDistribuidor.addItem(d);
        }

        preencherTabelaMidias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastroMidia = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        cmbTitulo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbTipoMidia = new javax.swing.JComboBox();
        cmbDistribuidor = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtDataAquisicao = new com.toedter.calendar.JDateChooser();
        nDataDevolucao = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        nDataDevolucao1 = new javax.swing.JLabel();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        nDataDevolucao2 = new javax.swing.JLabel();
        txtSituacao = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();

        painelCadastroMidia.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Mídias"));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jLabel1.setText("Titulo:");

        jLabel2.setText("Tipo Midia:");

        jLabel3.setText("Distribuidor:");

        txtDataAquisicao.setName("txtDataAquisicao"); // NOI18N

        nDataDevolucao.setText("Data de Aquisição:");

        txtNumSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSerieActionPerformed(evt);
            }
        });

        nDataDevolucao1.setText("Numero serie:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Tipo Midia", "Distribuidor", "N. Serie", "Data de Aquisição", "Situção"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        nDataDevolucao2.setText("Situação:");

        txtSituacao.setEditable(false);
        txtSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSituacaoActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        javax.swing.GroupLayout painelCadastroMidiaLayout = new javax.swing.GroupLayout(painelCadastroMidia);
        painelCadastroMidia.setLayout(painelCadastroMidiaLayout);
        painelCadastroMidiaLayout.setHorizontalGroup(
            painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroMidiaLayout.createSequentialGroup()
                        .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                                .addComponent(nDataDevolucao1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumSerie)
                                .addGap(37, 37, 37)
                                .addComponent(nDataDevolucao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbTitulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(32, 32, 32))
                    .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                        .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipoMidia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnNovo)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                        .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                                .addComponent(nDataDevolucao2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE))))
        );

        painelCadastroMidiaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnDeletar, btnNovo, btnSalvar});

        painelCadastroMidiaLayout.setVerticalGroup(
            painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroMidiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                        .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmbTipoMidia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nDataDevolucao)
                        .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nDataDevolucao1))
                    .addComponent(txtDataAquisicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nDataDevolucao2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroMidia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroMidia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        limparCampos();
        txtId.setText("0");
        txtSituacao.setText(Situacao.DISPONIVEL.name());
        txtDataAquisicao.setDate(new Date());

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
//        if ((txtRazaoSocial.getText().length() == 0 && txtTelefoneContato.getText().length() == 0)) {
//            JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
//        } else if (txtRazaoSocial.getText().length() == 0 && txtTelefoneContato.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Preencha o campo da razão social e telefone!");
//        } else {

        Situacao s;
        if (txtSituacao.getText().equals(Situacao.DISPONIVEL.name())) {
            s = Situacao.DISPONIVEL;
        } else {
            s = Situacao.LOCADO;
        }

        if (txtId.getText().equalsIgnoreCase("0")) {
            try {
                midiaServiceImpl.inserirMidia(
                        null,
                        (Titulo) cmbTitulo.getSelectedItem(),
                        (TipoMidia) cmbTipoMidia.getSelectedItem(),
                        (Distribuidor) cmbDistribuidor.getSelectedItem(),
                        s.getValor(),
                        txtDataAquisicao.getDate(),
                        txtNumSerie.getText());

                JOptionPane.showMessageDialog(null, "Novo registro salvo com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
            }
        } else {
            try {
                midiaServiceImpl.alterarMidia(
                        Integer.parseInt(txtId.getText()),
                        (Titulo) cmbTitulo.getSelectedItem(),
                        (TipoMidia) cmbTipoMidia.getSelectedItem(),
                        (Distribuidor) cmbDistribuidor.getSelectedItem(),
                        s.getValor(),
                        txtDataAquisicao.getDate(),
                        txtNumSerie.getText());

                JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n ERRO: " + ex);
            }
        }

        preencherTabelaMidias();
        limparCampos();
//            desabilitarBotoes();
//            bloquearCamposDeTexto();
//        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed

        if (tabela.getSelectedRow() > -1) {
            Midia m = new Midia();
            m.setId(Integer.parseInt(txtId.getText()));
            midiaServiceImpl.deletarMidia(m);
        }

        preencherTabelaMidias();
        limparCampos();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtNumSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumSerieActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        setarValorTitulo((Titulo) modelo.getValueAt(tabela.getSelectedRow(), 1));

        setarValorTipoMidia((TipoMidia) modelo.getValueAt(tabela.getSelectedRow(), 2));

        setarValorDistribuidor((Distribuidor) modelo.getValueAt(tabela.getSelectedRow(), 3));

        txtId.setText(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtNumSerie.setText(modelo.getValueAt(tabela.getSelectedRow(), 4).toString());
        txtDataAquisicao.setDate(new Date());
        txtSituacao.setText(modelo.getValueAt(tabela.getSelectedRow(), 6).toString());

//        editarCamposTexto(true);
//        habilitarBotoes(true);
    }//GEN-LAST:event_tabelaMouseClicked

    private void txtSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSituacaoActionPerformed

    /* Na mensagem de erro da tabela utilizar:
    
     "Erro ao preencher a tabela! \n \n ERRO: "
    
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbDistribuidor;
    private javax.swing.JComboBox cmbTipoMidia;
    private javax.swing.JComboBox cmbTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nDataDevolucao;
    private javax.swing.JLabel nDataDevolucao1;
    private javax.swing.JLabel nDataDevolucao2;
    private javax.swing.JPanel painelCadastroMidia;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JTable tabela;
    private com.toedter.calendar.JDateChooser txtDataAquisicao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtSituacao;
    // End of variables declaration//GEN-END:variables

    private void preencherTabelaMidias() {
        List<Midia> midias = midiaServiceImpl.retornarMidias();
        Situacao s;

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        try {
            for (Midia m : midias) {

                if (m.getSituacao() == 0) {
                    s = Situacao.DISPONIVEL;
                } else {
                    s = Situacao.LOCADO;
                }

                modelo.addRow(new Object[]{
                    m.getId(),
                    m.getTitulos(),
                    m.getTipoMidias(),
                    m.getDistribuidores(),
                    m.getNrserie(),
                    m.getDataaquisicao(),
                    s.name()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela! \n \n ERRO: " + e);
        }
    }

    private void setarValorTitulo(Titulo titulo) {
        for (Titulo t : titulos) {
            if (t.getId() == titulo.getId()) {
                cmbTitulo.setSelectedItem(t);
            }
        }
    }

    private void setarValorTipoMidia(TipoMidia tipoMidia) {
        for (TipoMidia tm : tipoMidias) {
            if (tm.getId() == tipoMidia.getId()) {
                cmbTipoMidia.setSelectedItem(tm);
            }
        }
    }

    private void setarValorDistribuidor(Distribuidor distribuidor) {
        for (Distribuidor d : distribuidores) {
            if (d.getId() == distribuidor.getId()) {
                cmbDistribuidor.setSelectedItem(d);
            }
        }
    }

    private void limparCampos() {
        cmbTitulo.setSelectedIndex(-1);
        cmbTipoMidia.setSelectedIndex(-1);
        cmbDistribuidor.setSelectedIndex(-1);
        txtId.setText("");
        txtDataAquisicao.setDate(null);
        txtSituacao.setText("");
        txtNumSerie.setText("");

    }
}
