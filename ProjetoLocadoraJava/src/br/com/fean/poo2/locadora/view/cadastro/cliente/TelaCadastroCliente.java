package br.com.fean.poo2.locadora.view.cadastro.cliente;

import br.com.fean.poo2.locadora.control.socio.SocioServiceImpl;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import br.com.fean.poo2.locadora.view.cadastro.dependente.TelaCadastroDependente;
import static br.com.fean.poo2.locadora.view.cadastro.titulo.TelaCadastroTitulo.setSelectedValue;
import br.com.fean.poo2.locadora.view.consultar.TelaListaCliente;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroCliente extends javax.swing.JPanel {

    private CardLayout cardLayout;
    private JPanel painelCardLayout;

    private int idCliente = 0;
    private int sexo;

    SocioServiceImpl socioServiceImpl = new SocioServiceImpl();

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date dataNascimento = new Date();

    public TelaCadastroCliente() {
        initComponents();
        desabilitarBotoes();
        bloquearCamposDeTexto();
        retornarTodosSocios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastroCliente = new javax.swing.JPanel();
        nNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        nCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        nEndereco = new javax.swing.JLabel();
        nSexo = new javax.swing.JLabel();
        nTelefoneEmpresa = new javax.swing.JLabel();
        txtTelefoneEmpresa = new javax.swing.JTextField();
        nTelefoneResidencial = new javax.swing.JLabel();
        txtTelefoneResidencial = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        nCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        nEmpresa = new javax.swing.JLabel();
        painelDeRolagem = new javax.swing.JScrollPane();
        txtEndereco = new javax.swing.JTextArea();
        txtDataNascimento = new com.toedter.calendar.JDateChooser();
        nDataNascimento = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDependente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nomeSocio = new javax.swing.JLabel();
        txtNomeSocio = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSocios = new javax.swing.JTable();

        painelCadastroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Cliente"));

        nNome.setText("Nome:");

        nCPF.setText("CPF:");

        nEndereco.setText("Endereço:");

        nSexo.setText("Sexo:");

        nTelefoneEmpresa.setText("Telefone:");

        nTelefoneResidencial.setText("Telefone Residencial:");

        nCodigo.setText("Código:");

        txtCodigo.setEnabled(false);

        nEmpresa.setText("Empresa:");

        txtEndereco.setColumns(20);
        txtEndereco.setRows(5);
        painelDeRolagem.setViewportView(txtEndereco);

        nDataNascimento.setText("Data de Nascimento:");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Feminino", "Masculino" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroClienteLayout = new javax.swing.GroupLayout(painelCadastroCliente);
        painelCadastroCliente.setLayout(painelCadastroClienteLayout);
        painelCadastroClienteLayout.setHorizontalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(nEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(nTelefoneEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(nCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(nCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nTelefoneResidencial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneResidencial))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(nEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelDeRolagem)))
                .addContainerGap())
        );
        painelCadastroClienteLayout.setVerticalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nCPF)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nTelefoneResidencial)
                        .addComponent(txtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nDataNascimento))
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nTelefoneEmpresa)
                    .addComponent(txtTelefoneEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nEmpresa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnDependente.setText("Dependente");
        btnDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDependenteActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        nomeSocio.setText("Nome:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeSocio)
                    .addComponent(txtNomeSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSociosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSocios);
        if (tabelaSocios.getColumnModel().getColumnCount() > 0) {
            tabelaSocios.getColumnModel().getColumn(0).setMinWidth(80);
            tabelaSocios.getColumnModel().getColumn(0).setMaxWidth(80);
            tabelaSocios.getColumnModel().getColumn(2).setMinWidth(120);
            tabelaSocios.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDependente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jScrollPane1, painelCadastroCliente});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar)
                    .addComponent(btnDependente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // pesquisar
        ArrayList<Socio> lista = new ArrayList<Socio>();
        try {
            lista = socioServiceImpl.pesquisarSocioNome(btnPesquisar.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao pesquisar cliente - " + ex);
        }
        carregarDadosTabela(lista);

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // botao novo
        idCliente = 0;
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(false);
        limparCamposDeTexto();
        editarCamposDeTexto();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // botão salvar
        Date data = new Date();
        Socio socio = new Socio(idCliente,
                txtNome.getText(),
                sexo,
                txtCPF.getText(),
                txtDataNascimento.getDate(),
                txtTelefoneResidencial.getText(),
                txtEndereco.getText(),
                txtEmpresa.getText(),
                txtTelefoneEmpresa.getText());
        if ((txtNome.getText().length() == 0) && (txtCPF.getText().length() == 0 && (txtTelefoneResidencial.getText().length() == 0))) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
        } else if (txtEmpresa.getText().length() == 0 && txtTelefoneEmpresa.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha os campos empresa e telefone comercial!");
        } else {

            if (idCliente == 0) {
                try {
                    socioServiceImpl.inserirSocio(socio);

                    JOptionPane.showMessageDialog(null, "Novo registro salvo com sucesso!");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposDeTexto();
                }
            } else {
                try {
                    socioServiceImpl.alterarSocio(socio);

                    JOptionPane.showMessageDialog(null, "Alteração realizada com suceso!");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n ERRO: " + ex);
                }
            }
        }
        retornarTodosSocios();
        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // botão deletar
        if (JOptionPane.showConfirmDialog(null, "DESEJA EXCLUIR DADOS???") == 0) {
            try {
                Socio socio = socioServiceImpl.retornarSocio(idCliente);
                socioServiceImpl.deletarSocio(socio);
                retornarTodosSocios();
                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar registro! \n \n ERRO: " + ex);
            }
        }

        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // botão cancelar
        limparCamposDeTexto();
        bloquearCamposDeTexto();
        desabilitarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDependenteActionPerformed
        // tela dependete
        TelaCadastroDependente telaDependete = new TelaCadastroDependente();
        telaDependete.setVisible(true);
    }//GEN-LAST:event_btnDependenteActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // combo sexo
        if (cbSexo.getSelectedIndex() == 0) {
            sexo = 0;//Feminino
        } else {
            sexo = 1;//Masculino
        }
    }//GEN-LAST:event_cbSexoActionPerformed

    private void tabelaSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSociosMouseClicked
        // tabela com a lista de socios (clientes)
        DefaultTableModel clienteTebela = (DefaultTableModel) tabelaSocios.getModel();
        idCliente = Integer.parseInt(clienteTebela.getValueAt(tabelaSocios.getSelectedRow(), 0).toString());
        //txtNome.setText(clienteTebela.getValueAt(tabelaSocios.getSelectedRow(), 1).toString());
        //txtCPF.setText(clienteTebela.getValueAt(tabelaSocios.getSelectedRow(), 2).toString());
        try {
            Socio socio = socioServiceImpl.retornarSocio(idCliente);
            txtNome.setText(socio.getNome());
            txtCPF.setText(socio.getCpf());
            txtCodigo.setText(socio.getId().toString());
            txtEmpresa.setText(socio.getLocalTrabalho());
            txtTelefoneEmpresa.setText(socio.getFoneCom());
            txtTelefoneResidencial.setText(socio.getFoneRes());

        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        editarCamposDeTexto();
        habilitarBotoes();
    }//GEN-LAST:event_tabelaSociosMouseClicked

    public void retornarTodosSocios() {
        ArrayList<Socio> lista = new ArrayList<Socio>();
        try {
            lista = socioServiceImpl.retornarSocios();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao retornar todos os Clientes" + ex);
        }
        carregarDadosTabela(lista);
    }

    public void carregarDadosTabela(ArrayList<Socio> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaSocios.getModel();
        modelo.setRowCount(0);
        try {
            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getCpf()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro - leitura de dados de Cliente com problema - " + ex);
        }
    }

    // método limpar campos
    public void limparCamposDeTexto() {
        txtNome.setText("");
        cbSexo.setSelectedIndex(0);
        txtCPF.setText("");
        txtDataNascimento.setDate(dataNascimento);
        txtTelefoneResidencial.setText("");
        txtEndereco.setText("");
        txtEmpresa.setText("");
        txtTelefoneEmpresa.setText("");
    }

    // método editar campos
    public void editarCamposDeTexto() {
        txtNome.setEnabled(true);
        cbSexo.setEnabled(true);
        txtCPF.setEnabled(true);
        txtDataNascimento.setEnabled(true);
        txtTelefoneResidencial.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtEmpresa.setEnabled(true);
        txtTelefoneEmpresa.setEnabled(true);
    }

    // método bloquear campos de texto
    public void bloquearCamposDeTexto() {
        txtNome.setEnabled(false);
        cbSexo.setEnabled(false);
        txtCPF.setEnabled(false);
        txtDataNascimento.setEnabled(false);
        txtTelefoneResidencial.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtEmpresa.setEnabled(false);
        txtTelefoneEmpresa.setEnabled(false);
    }

    // habilitar botões
    public void habilitarBotoes() {
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    // desabilitar botões
    public void desabilitarBotoes() {
        btnSalvar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDependente;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nCPF;
    private javax.swing.JLabel nCodigo;
    private javax.swing.JLabel nDataNascimento;
    private javax.swing.JLabel nEmpresa;
    private javax.swing.JLabel nEndereco;
    private javax.swing.JLabel nNome;
    private javax.swing.JLabel nSexo;
    private javax.swing.JLabel nTelefoneEmpresa;
    private javax.swing.JLabel nTelefoneResidencial;
    private javax.swing.JLabel nomeSocio;
    private javax.swing.JPanel painelCadastroCliente;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JTable tabelaSocios;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private com.toedter.calendar.JDateChooser txtDataNascimento;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextArea txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeSocio;
    private javax.swing.JTextField txtTelefoneEmpresa;
    private javax.swing.JTextField txtTelefoneResidencial;
    // End of variables declaration//GEN-END:variables

}
