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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Categorias"));

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
        jScrollPane1.setViewportView(tabela);
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

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir Registro");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
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

        jLabel3.setText("Código:");

        txtCodigo.setEnabled(false);

        jLabel4.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
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
                        .addComponent(jLabel4)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnExcluir, btnNovo, btnSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnExcluir, btnNovo, btnSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if ((txtNome.getText().length() == 0)) {
            JOptionPane.showMessageDialog(null, "Campos Obrigatórios!");
        } else if (txtNome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome!");
        } else {
            if (idControle == 0) {
                try {
                    categoriaServiceImpl.inserirCategoria(txtNome.getText());
                    JOptionPane.showMessageDialog(null, "Novo registro salvo!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposTexto();
                }
            } else {
                try {
                    categoriaServiceImpl.alterarCategoria(idControle, txtNome.getText());
                    JOptionPane.showMessageDialog(null, "Alteração realizada!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n Erro: " + ex);
                }
            }

            retornarTodosCategoria();
            limparCamposTexto();
            desabilitarBotoes();
            bloquearCamposTexto();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked

        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {
          
            try {
               
                categoriaServiceImpl.deletarCategoria(categoriaServiceImpl.retornarCategoria(idControle));

                JOptionPane.showMessageDialog(null, "Registro excluido!");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "Erro ao excluir registro! \n \n ERRO: " + ex);
            }
        }
        retornarTodosCategoria();
        limparCamposTexto();
        desabilitarBotoes();
        bloquearCamposTexto();
    }//GEN-LAST:event_btnExcluirMouseClicked

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
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela! \n \n ERRO: " + ex);
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
        btnExcluir.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    public void desabilitarBotoes() {
        btnCancelar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
