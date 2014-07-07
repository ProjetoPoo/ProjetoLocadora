package br.com.fean.poo2.locadora.view.cadastro.tipomidia;

import br.com.fean.poo2.locadora.control.tipomidia.TipoMidiaService;
import br.com.fean.poo2.locadora.control.tipomidia.TipoMidiaServiceImpl;
import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroTipoMidia extends javax.swing.JPanel {
    private int idControle = 0;
    private final TipoMidiaService tipoMidiaService = new TipoMidiaServiceImpl();

    public TelaCadastroTipoMidia() {
        initComponents();
        retornarTodosTipoMidia();
        desabilitarBotoes();
        bloquearCamposTexto();
    }

    public void retornarTodosTipoMidia() {
        ArrayList<TipoMidia> lista = new ArrayList<TipoMidia>();
        try {
            lista = (this.tipoMidiaService.retornarTipoMidia());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar tipos de m�dia! \n \n ERRO: " + ex);
        }
        carregarDadosTabela(lista);
    }

    public void carregarDadosTabela(ArrayList<TipoMidia> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        try {
            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela! \n \n ERRO: " + ex);
        }
    }
    
    public void desabilitarBotoes() {
        btnCancelar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

    public void bloquearCamposTexto() {
        txtNome.setEnabled(false);
    }

    public void editarCamposTexto() {
        txtNome.setEnabled(true);
        txtNome.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void habilitarBotoes() {
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    public void limparCamposTexto() {
        txtCodigo.setText("");
        txtNome.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastroTipoMidia = new javax.swing.JPanel();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        nNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();

        PainelCadastroTipoMidia.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Tipo de M�dia"));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C�digo", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
            tabela.getColumnModel().getColumn(0).setMinWidth(90);
            tabela.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Novo Registro");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.setToolTipText("Excluir Registro");
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarMouseClicked(evt);
            }
        });
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(32, 32));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nCodigo.setText("C�digo:");

        txtCodigo.setEnabled(false);

        nNome.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nCodigo)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nNome)
                .addGap(18, 18, 18)
                .addComponent(txtNome)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nCodigo)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCadastroTipoMidiaLayout = new javax.swing.GroupLayout(PainelCadastroTipoMidia);
        PainelCadastroTipoMidia.setLayout(PainelCadastroTipoMidiaLayout);
        PainelCadastroTipoMidiaLayout.setHorizontalGroup(
            PainelCadastroTipoMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroTipoMidiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCadastroTipoMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(PainelCadastroTipoMidiaLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PainelCadastroTipoMidiaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnDeletar, btnNovo, btnSalvar});

        PainelCadastroTipoMidiaLayout.setVerticalGroup(
            PainelCadastroTipoMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroTipoMidiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PainelCadastroTipoMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelCadastroTipoMidia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelCadastroTipoMidia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        idControle = Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtCodigo.setText(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtNome.setText(modelo.getValueAt(tabela.getSelectedRow(), 1).toString());
        editarCamposTexto();
        habilitarBotoes();
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {
            try {
                this.tipoMidiaService.deletarTipoMidia(this.tipoMidiaService.retornarTipoMidia(idControle));
                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar registro! \n \n ERRO: " + ex);
            }
        }
        retornarTodosTipoMidia();
        limparCamposTexto();
        desabilitarBotoes();
        bloquearCamposTexto();
    }//GEN-LAST:event_btnDeletarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCamposTexto();
        bloquearCamposTexto();
        desabilitarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (this.tipoMidiaService.pesquisaCampoTabela(tabela, txtNome.getText().toUpperCase())) {
            JOptionPane.showMessageDialog(null, "ERRO: Registro duplicado");
            return;
        }
        if (txtNome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome!");
            return;
        }
        if (idControle == 0) {
            try {
                this.tipoMidiaService.inserirTipoMidia(txtNome.getText().toUpperCase());
                JOptionPane.showMessageDialog(null, "Novo registro salvo com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
            } finally {
                limparCamposTexto();
            }
        } else {
            try {
                this.tipoMidiaService.alterarTipoMidia(idControle, txtNome.getText());
                JOptionPane.showMessageDialog(null, "Altera��o realizada com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n ERRO: " + ex);
            }
        }
        retornarTodosTipoMidia();
        limparCamposTexto();
        desabilitarBotoes();
        bloquearCamposTexto();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {
            try {
                TipoMidia tipomidia = this.tipoMidiaService.retornarTipoMidia(idControle);
                this.tipoMidiaService.deletarTipoMidia(tipomidia);
                retornarTodosTipoMidia();
                limparCamposTexto();
                desabilitarBotoes();
                bloquearCamposTexto();
                JOptionPane.showMessageDialog(null, "Dele��o realizada com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar registro! \\n \\n ERRO: " + ex);
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        idControle = 0;
        limparCamposTexto();
        editarCamposTexto();
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCadastroTipoMidia;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nCodigo;
    private javax.swing.JLabel nNome;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
