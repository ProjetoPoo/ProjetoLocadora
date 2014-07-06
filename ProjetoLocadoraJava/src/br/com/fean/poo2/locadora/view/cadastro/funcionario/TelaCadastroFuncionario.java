package br.com.fean.poo2.locadora.view.cadastro.funcionario;

import br.com.fean.poo2.locadora.control.funcionario.FuncionarioServiceImpl;
import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroFuncionario extends javax.swing.JPanel {

    int idFuncionarioSelecionado = 0;

    FuncionarioServiceImpl funcionarioServiceImpl = new FuncionarioServiceImpl();

    public TelaCadastroFuncionario() {
        initComponents();
        retornarFuncionarios();
        desabilitarBotoes();
        bloquearCamposTexto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastroFuncionario = new javax.swing.JPanel();
        nCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        nNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        nUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        nSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        nTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        painelPesquisar = new javax.swing.JPanel();
        nPesquisaNome = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        painelCadastroFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Funcionário"));

        nCodigo.setText("Código:");

        txtCodigo.setEnabled(false);

        nNome.setText("Nome:");

        nUsuario.setText("Usuário:");

        nSenha.setText("Senha:");

        nTelefone.setText("Telefone:");

        javax.swing.GroupLayout painelCadastroFuncionarioLayout = new javax.swing.GroupLayout(painelCadastroFuncionario);
        painelCadastroFuncionario.setLayout(painelCadastroFuncionarioLayout);
        painelCadastroFuncionarioLayout.setHorizontalGroup(
            painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroFuncionarioLayout.createSequentialGroup()
                                .addComponent(nNome)
                                .addGap(27, 27, 27)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nTelefone))
                            .addGroup(painelCadastroFuncionarioLayout.createSequentialGroup()
                                .addComponent(nCodigo)
                                .addGap(21, 21, 21)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelCadastroFuncionarioLayout.createSequentialGroup()
                        .addComponent(nUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nSenha)
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                .addContainerGap())
        );
        painelCadastroFuncionarioLayout.setVerticalGroup(
            painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroFuncionarioLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        nPesquisaNome.setText("Nome:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelPesquisarLayout = new javax.swing.GroupLayout(painelPesquisar);
        painelPesquisar.setLayout(painelPesquisarLayout);
        painelPesquisarLayout.setHorizontalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nPesquisaNome)
                .addGap(21, 21, 21)
                .addComponent(txtPesquisar)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addContainerGap())
        );
        painelPesquisarLayout.setVerticalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nPesquisaNome)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnPesquisar))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
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
            tabela.getColumnModel().getColumn(0).setMinWidth(100);
            tabela.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCadastroFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNovo))
                .addGap(7, 7, 7))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        idFuncionarioSelecionado = 0;
        limparCamposTexto();
        editarCamposTexto();
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(false);
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if ((txtNome.getText().length() == 0 && txtTelefone.getText().length() == 0 && txtUsuario.getText().length() == 0 && txtSenha.getText().length() <= 5)) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
        } else if (txtNome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome!");
        } else if (txtTelefone.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de telefone!");
        } else if (txtUsuario.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de usuário!");
        } else if (txtSenha.getText().length() <= 5) {
            JOptionPane.showMessageDialog(null, "A senha deve possuir mais de 6 caracteres!");
        } else {

            if (idFuncionarioSelecionado == 0) {
                try {
                    funcionarioServiceImpl.inserirFuncionario(
                            txtNome.getText(),
                            txtTelefone.getText(),
                            txtUsuario.getText(),
                            txtSenha.getText());

                    JOptionPane.showMessageDialog(null, "Novo registro salvo com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposTexto();
                }
            } else {

                try {

                    funcionarioServiceImpl.alterarFuncionario(
                            idFuncionarioSelecionado,
                            txtNome.getText(),
                            txtTelefone.getText(),
                            txtUsuario.getText(),
                            txtSenha.getText());

                    JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!" );

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n ERRO: " + ex);
                }
            }

            retornarFuncionarios();
            limparCamposTexto();
            desabilitarBotoes();
            bloquearCamposTexto();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {

            try {
                funcionarioServiceImpl.deletarFuncionario(funcionarioServiceImpl.retornarFuncionario(idFuncionarioSelecionado));

                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar registro! \n \n ERRO: " + ex);
            }
            
        }
        retornarFuncionarios();
        limparCamposTexto();
        desabilitarBotoes();
        bloquearCamposTexto();
    }//GEN-LAST:event_btnDeletarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        limparCamposTexto();
        bloquearCamposTexto();
        desabilitarBotoes();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        idFuncionarioSelecionado = Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());

        try {
            Funcionario funcionario = funcionarioServiceImpl.retornarFuncionario(idFuncionarioSelecionado);

            txtCodigo.setText(funcionario.getId().toString());
            txtNome.setText(funcionario.getNome().toString());
            txtTelefone.setText(funcionario.getFone().toString());
            txtUsuario.setText(funcionario.getUsuario().toString());
            txtSenha.setText(funcionario.getSenha().toString());

        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        editarCamposTexto();
        habilitarBotoes();
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        if (txtPesquisar.getText().equals("")) {
            retornarFuncionarios();

        } else {

            ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
            try {
                lista = funcionarioServiceImpl.pesquisarFuncionarioNome(txtPesquisar.getText());
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "Erro ao pesquisar! \n \n ERRO: " + ex);
            }

            carregarDadosTabela(lista);
        }
    }//GEN-LAST:event_btnPesquisarMouseClicked

    public void retornarFuncionarios() {

        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        try {
            lista = (funcionarioServiceImpl.retornarFuncionarios());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar Funcionários! \n \n ERRO: " + ex);
        }
        carregarDadosTabela(lista);

    }

    public void carregarDadosTabela(ArrayList<Funcionario> lista) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);

        try {

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getUsuario()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela! \n \n ERRO: "  + ex);
        }
    }

    public void limparCamposTexto() {

        txtCodigo.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtSenha.setText("");
        txtUsuario.setText("");
    }

    public void editarCamposTexto() {

        txtNome.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtSenha.setEnabled(true);
        txtUsuario.setEnabled(true);

    }

    public void bloquearCamposTexto() {
        txtNome.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtSenha.setEnabled(false);
        txtUsuario.setEnabled(false);
    }

    public void habilitarBotoes() {
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    public void desabilitarBotoes() {
        btnCancelar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel nCodigo;
    private javax.swing.JLabel nNome;
    private javax.swing.JLabel nPesquisaNome;
    private javax.swing.JLabel nSenha;
    private javax.swing.JLabel nTelefone;
    private javax.swing.JLabel nUsuario;
    private javax.swing.JPanel painelCadastroFuncionario;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JPanel painelPesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
