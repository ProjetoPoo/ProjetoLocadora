package br.com.fean.poo2.locadora.view.cadastro.titulo;

import br.com.fean.poo2.locadora.control.categoria.CategoriaServiceImpl;
import br.com.fean.poo2.locadora.control.classe.ClasseServiceImpl;
import br.com.fean.poo2.locadora.control.titulos.TituloServiceImpl;
import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import br.com.fean.poo2.locadora.modelo.classe.Classe;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroTitulo extends javax.swing.JPanel {

    private int idTitulo = 0;
    TituloServiceImpl tituloServiceImpl = new TituloServiceImpl();
    CategoriaServiceImpl categoriaServiceImpl = new CategoriaServiceImpl();
    ClasseServiceImpl classeServiceImpl = new ClasseServiceImpl();

    Titulo titulo = new Titulo();

    public TelaCadastroTitulo() {
        initComponents();
        preencherComboCategorias();
        preencherComboClasses();
        retornarTitulos();
        desabilitarBotoes();
        bloquearCamposDeTexto();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        painelCadastroFilme = new javax.swing.JPanel();
        nTitulo = new javax.swing.JLabel();
        nCategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        nClasse = new javax.swing.JLabel();
        cbClasse = new javax.swing.JComboBox();
        txtTitulo = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        painelPesquisar = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisaTitulo = new javax.swing.JTextField();
        cbPesquisaTitulos = new javax.swing.JComboBox();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        painelCadastroFilme.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Filme"));

        nTitulo.setText("Título:");

        nCategoria.setText("Categoria:");

        nClasse.setText("Classe:");

        javax.swing.GroupLayout painelCadastroFilmeLayout = new javax.swing.GroupLayout(painelCadastroFilme);
        painelCadastroFilme.setLayout(painelCadastroFilmeLayout);
        painelCadastroFilmeLayout.setHorizontalGroup(
            painelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroFilmeLayout.createSequentialGroup()
                        .addComponent(nTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitulo))
                    .addGroup(painelCadastroFilmeLayout.createSequentialGroup()
                        .addComponent(nCategoria)
                        .addGap(18, 18, 18)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nClasse)
                        .addGap(18, 18, 18)
                        .addComponent(cbClasse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelCadastroFilmeLayout.setVerticalGroup(
            painelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nCategoria)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nClasse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        painelPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        cbPesquisaTitulos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Título", "Categoria" }));

        javax.swing.GroupLayout painelPesquisarLayout = new javax.swing.GroupLayout(painelPesquisar);
        painelPesquisar.setLayout(painelPesquisarLayout);
        painelPesquisarLayout.setHorizontalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbPesquisaTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPesquisaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelPesquisarLayout.setVerticalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbPesquisaTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Categoria", "Classe"
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
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(80);
            tabela.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCadastroFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnDeletar, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        try {
            pesquisaFiltroCombo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar! \n \n ERRO: " + ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {

            try {
                tituloServiceImpl.deletarTitulo(tituloServiceImpl.retornarTitulo(idTitulo));
                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar registro! \n \n ERRO: " + ex);
            }
        }
        retornarTitulos();
        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCamposDeTexto();
        bloquearCamposDeTexto();
        desabilitarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        idTitulo = Integer.parseInt(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtTitulo.setText(modelo.getValueAt(tabela.getSelectedRow(), 1).toString());
        setSelectedValue(cbCategoria, (modelo.getValueAt(tabela.getSelectedRow(), 2).toString()));
        setSelectedValue(cbClasse, (modelo.getValueAt(tabela.getSelectedRow(), 3).toString()));

        editarCamposDeTexto();
        habilitarBotoes();
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        idTitulo = 0;
        limparCamposDeTexto();
        editarCamposDeTexto();
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if ((txtTitulo.getText().length() == 0)) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
        } else if (txtTitulo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome!");
        } else {

            if (idTitulo == 0) {
                try {
                    tituloServiceImpl.inserirTitulo(txtTitulo.getText(), (Categoria) cbCategoria.getSelectedItem(), (Classe) cbClasse.getSelectedItem());
                    JOptionPane.showMessageDialog(null, "Novo registro salvo com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposDeTexto();
                }
            } else {
                try {
                    tituloServiceImpl.alterarTitulo(idTitulo, txtTitulo.getText(), (Categoria) cbCategoria.getSelectedItem(), (Classe) cbClasse.getSelectedItem());
                    JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!" );
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n ERRO: " + ex);
                }
            }
        }
        retornarTitulos();
        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();

    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void setSelectedValue(JComboBox comboBox, String value) {//Popula a ComboBox com objetos
        String item = "";
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = comboBox.getItemAt(i).toString();
            if (item.equals(value)) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }

    public void preencherComboCategorias() {

        try {
            ArrayList<Categoria> categorias = categoriaServiceImpl.retornarCategorias();

            for (int i = 0; i < categorias.size(); i++) {
                cbCategoria.addItem(categorias.get(i));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher Categorias! \n \n ERRO: " + ex);
        }
    }

    public void preencherComboClasses() {

        try {
            ArrayList<Classe> classes = classeServiceImpl.retornarClasses();

            for (int i = 0; i < classes.size(); i++) {
                cbClasse.addItem(classes.get(i));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher Classes! \n \n ERRO: " + ex);
        }
    }

    public void pesquisaFiltroCombo() throws Exception {

        if (cbPesquisaTitulos.getSelectedIndex() == 0) {
            ArrayList<Titulo> listaTitulo = new ArrayList<Titulo>();
            TituloServiceImpl tituloServiceImpl = new TituloServiceImpl();
            listaTitulo = tituloServiceImpl.pesquisarTituloFilme(txtPesquisaTitulo.getText());

            carregarDadosDaTabela(listaTitulo);
        }

        if (cbPesquisaTitulos.getSelectedIndex() == 1) {
            ArrayList<Titulo> listaCategoria = new ArrayList<Titulo>();
            TituloServiceImpl tituloServiceImpl = new TituloServiceImpl();
            listaCategoria = tituloServiceImpl.pesquisarCategoriaFilme(txtPesquisaTitulo.getText());

            carregarDadosDaTabela(listaCategoria);
        }
    }

    public void limparCamposDeTexto() {
        txtTitulo.setText("");
    }

    public void editarCamposDeTexto() {
        txtTitulo.setEnabled(true);
        cbCategoria.setEnabled(true);
        cbClasse.setEnabled(true);
    }

    public void bloquearCamposDeTexto() {
        txtTitulo.setEnabled(false);
        cbCategoria.setEnabled(false);
        cbClasse.setEnabled(false);
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

    public void retornarTitulos() {
        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        try {
            lista = (tituloServiceImpl.retornarTitulos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar Títulos! \n \n ERRO: " + ex);
        }
        carregarDadosDaTabela(lista);
    }

    public void carregarDadosDaTabela(ArrayList<Titulo> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        try {

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getCategorias().getNome(),
                    lista.get(i).getClasses().getNome()});
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
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbClasse;
    private javax.swing.JComboBox cbPesquisaTitulos;
    private javax.swing.JLabel nCategoria;
    private javax.swing.JLabel nClasse;
    private javax.swing.JLabel nTitulo;
    private javax.swing.JPanel painelCadastroFilme;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JPanel painelPesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisaTitulo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
