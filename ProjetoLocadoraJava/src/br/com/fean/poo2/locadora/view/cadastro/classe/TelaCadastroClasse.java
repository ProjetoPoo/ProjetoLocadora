package br.com.fean.poo2.locadora.view.cadastro.classe;

import br.com.fean.poo2.locadora.control.classe.ClasseServiceImpl;
import br.com.fean.poo2.locadora.modelo.classe.Classe;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroClasse extends javax.swing.JPanel {

    ClasseServiceImpl classeServiceImpl;

    public TelaCadastroClasse() {
        initComponents();
        classeServiceImpl = new ClasseServiceImpl();
        editarCamposTexto(false);
        habilitarBotoes(false);
        retornarTodasClasses();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastroClasses = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        painelCodigoeNome = new javax.swing.JPanel();
        nCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        nNome = new javax.swing.JLabel();
        nValor = new javax.swing.JLabel();
        cbDiasDevolucao = new javax.swing.JComboBox();
        nDiasDevolucao = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        painelCadastroClasses.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Classes"));
        painelCadastroClasses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        painelCadastroClasses.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 72, -1));

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        painelCadastroClasses.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        painelCodigoeNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nCodigo.setText("Código:");

        txtCodigo.setEnabled(false);

        nNome.setText("Nome:");

        nValor.setText("Valor:");

        cbDiasDevolucao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));

        nDiasDevolucao.setText("Dias devolução");

        javax.swing.GroupLayout painelCodigoeNomeLayout = new javax.swing.GroupLayout(painelCodigoeNome);
        painelCodigoeNome.setLayout(painelCodigoeNomeLayout);
        painelCodigoeNomeLayout.setHorizontalGroup(
            painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCodigoeNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nCodigo)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(nValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nDiasDevolucao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDiasDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        painelCodigoeNomeLayout.setVerticalGroup(
            painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCodigoeNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nValor)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nDiasDevolucao)
                        .addComponent(cbDiasDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nCodigo)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        painelCadastroClasses.add(painelCodigoeNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 640, 50));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "Dias Devolução"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        painelCadastroClasses.add(painelDeRolagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 640, 300));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelCadastroClasses.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 72, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        painelCadastroClasses.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroClasses, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroClasses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        editarCamposTexto(true);
        habilitarBotoes(true);
        limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {

            try {

                classeServiceImpl.deletarClasse(classeServiceImpl.retornarClasse(Integer.parseInt(txtCodigo.getText().toString())));
                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar registro! \n \n ERRO: " + e);
            }
        }
        retornarTodasClasses();
        limparCampos();
        habilitarBotoes(false);
        editarCamposTexto(false);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if ((txtNome.getText().length() == 0 && txtValor.getText().length() == 0)) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
        } else if (isDouble(txtValor.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Campo valor contém dados inválidos");

        } else {

            if (txtCodigo.getText().length() == 0) {
                try {
                    classeServiceImpl.inserirClasse(
                            txtNome.getText(),
                            Double.parseDouble(txtValor.getText()),
                            Integer.parseInt(cbDiasDevolucao.getSelectedItem().toString()));

                    JOptionPane.showMessageDialog(null, "Novo registro salvo com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                }
            } else {
                try {
                    classeServiceImpl.alterarClasse(
                            Integer.parseInt(txtCodigo.getText()),
                            txtNome.getText(),
                            Double.parseDouble(txtValor.getText()),
                            Integer.parseInt(cbDiasDevolucao.getSelectedItem().toString()));

                    JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n ERRO: " + e);
                }
            }

            retornarTodasClasses();

        }

        editarCamposTexto(false);
        habilitarBotoes(false);
        limparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        txtCodigo.setText(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());

        txtNome.setText(modelo.getValueAt(tabela.getSelectedRow(), 1).toString());

        txtValor.setText(modelo.getValueAt(tabela.getSelectedRow(), 2).toString());

        setSelectedValue(cbDiasDevolucao, modelo.getValueAt(tabela.getSelectedRow(), 3).toString());

        editarCamposTexto(true);
        habilitarBotoes(true);
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        editarCamposTexto(false);
        habilitarBotoes(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void setSelectedValue(JComboBox comboBox, String value) {
        String item = "";
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = comboBox.getItemAt(i).toString();
            if (item.equals(value)) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }

    private void editarCamposTexto(boolean editar) {
        txtNome.setEnabled(editar);
        txtValor.setEnabled(editar);
        cbDiasDevolucao.setEnabled(editar);
    }

    private void habilitarBotoes(boolean habilitar) {
        btnSalvar.setEnabled(habilitar);
        btnDeletar.setEnabled(habilitar);
        btnCancelar.setEnabled(habilitar);
    }

    private boolean isDouble(String valor) {
        boolean resultado = false;
        try {
            Double.parseDouble(valor);
            resultado = true;
        } finally {
            return resultado;
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        txtValor.setText("");
        txtCodigo.setText("");
        cbDiasDevolucao.setSelectedIndex(0);
    }

    private void retornarTodasClasses() {
        ArrayList<Classe> lista = new ArrayList<Classe>();
        try {
            lista = (classeServiceImpl.retornarClasses());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar Distribuidores! \n \n ERRO: " + ex);
        }
        carregarDadosDaTabela(lista);
    }

    private void carregarDadosDaTabela(ArrayList<Classe> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        try {

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getValor(),
                    lista.get(i).getDiasdevolucao()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela! \n \n ERRO: " + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbDiasDevolucao;
    private javax.swing.JLabel nCodigo;
    private javax.swing.JLabel nDiasDevolucao;
    private javax.swing.JLabel nNome;
    private javax.swing.JLabel nValor;
    private javax.swing.JPanel painelCadastroClasses;
    private javax.swing.JPanel painelCodigoeNome;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
