package br.com.fean.poo2.locadora.view.cadastro.categoria;

import br.com.fean.poo2.locadora.control.categoria.CategoriaServiceImpl;
import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroCategoria extends javax.swing.JPanel {

    private int idControle = 0;
    
    CategoriaServiceImpl categoriaServiceImpl = new CategoriaServiceImpl();


    public TelaCadastroCategoria() {
        initComponents();
        retornarTodosCategoria();
        desabilitarBotoes();
        bloquearCamposTexto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastroCategorias = new javax.swing.JPanel();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        painelCodigoeNome = new javax.swing.JPanel();
        nCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        nNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();

        painelCadastroCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Categorias"));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
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
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.setToolTipText("Excluir Registro");
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarMouseClicked(evt);
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

        painelCodigoeNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nCodigo.setText("Código:");

        txtCodigo.setEnabled(false);

        nNome.setText("Nome:");

        javax.swing.GroupLayout painelCodigoeNomeLayout = new javax.swing.GroupLayout(painelCodigoeNome);
        painelCodigoeNome.setLayout(painelCodigoeNomeLayout);
        painelCodigoeNomeLayout.setHorizontalGroup(
            painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCodigoeNomeLayout.createSequentialGroup()
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
        painelCodigoeNomeLayout.setVerticalGroup(
            painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCodigoeNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCodigoeNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nCodigo)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelCadastroCategoriasLayout = new javax.swing.GroupLayout(painelCadastroCategorias);
        painelCadastroCategorias.setLayout(painelCadastroCategoriasLayout);
        painelCadastroCategoriasLayout.setHorizontalGroup(
            painelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(painelCadastroCategoriasLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelCodigoeNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelCadastroCategoriasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnDeletar, btnNovo, btnSalvar});

        painelCadastroCategoriasLayout.setVerticalGroup(
            painelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCodigoeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelCadastroCategoriasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnDeletar, btnNovo, btnSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        idControle = 0;
        limparCamposTexto();
        editarCamposTexto();
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(false);
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if ((txtNome.getText().length() == 0)) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
        } else if (txtNome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome!");
        } else {
            if (idControle == 0) {
                try {
                    categoriaServiceImpl.inserirCategoria(txtNome.getText());
                    JOptionPane.showMessageDialog(null, "Novo registro salvo com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposTexto();
                }
            } else {
                try {
                    categoriaServiceImpl.alterarCategoria(idControle, txtNome.getText());
                    JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!" );
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n ERRO: " + ex);
                }
            }

            retornarTodosCategoria();
            limparCamposTexto();
            desabilitarBotoes();
            bloquearCamposTexto();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseClicked

        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {
          
            try {
               
                categoriaServiceImpl.deletarCategoria(categoriaServiceImpl.retornarCategoria(idControle));

                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "Erro ao deletar registro! \n \n ERRO: " + ex);
            }
        }
        retornarTodosCategoria();
        limparCamposTexto();
        desabilitarBotoes();
        bloquearCamposTexto();
    }//GEN-LAST:event_btnDeletarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCamposTexto();
        bloquearCamposTexto();
        desabilitarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void retornarTodosCategoria() {

        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        try {
            lista = (categoriaServiceImpl.retornarCategorias());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar Categorias! \n \n ERRO: " + ex);
        }
        carregarDadosTabela(lista);

    }

    public void carregarDadosTabela(ArrayList<Categoria> lista) {

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

    public void limparCamposTexto() {
        txtCodigo.setText("");
        txtNome.setText("");

    }

    public void editarCamposTexto() {
        txtNome.setEnabled(true);

        txtNome.setBackground(new java.awt.Color(255, 255, 255));

    }

    public void bloquearCamposTexto() {
        txtNome.setEnabled(false);

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
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel nCodigo;
    private javax.swing.JLabel nNome;
    private javax.swing.JPanel painelCadastroCategorias;
    private javax.swing.JPanel painelCodigoeNome;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
