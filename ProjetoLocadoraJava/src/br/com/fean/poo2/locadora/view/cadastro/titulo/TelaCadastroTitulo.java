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
        jPanel1 = new javax.swing.JPanel();
        nTitulo = new javax.swing.JLabel();
        nGenero = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        nClasse = new javax.swing.JLabel();
        cbClasse = new javax.swing.JComboBox();
        txtTitulo = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        cbPesquisa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Filme"));

        nTitulo.setText("Título:");

        nGenero.setText("Categoria:");

        nClasse.setText("Classe:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nGenero)
                        .addGap(18, 18, 18)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nClasse)
                        .addGap(18, 18, 18)
                        .addComponent(cbClasse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nGenero)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nClasse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExcluir.setText("Deletar");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        cbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Título", "Categoria" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jScrollPane1.setViewportView(tabela);
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnExcluir, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {

            try {
                tituloServiceImpl.deletarTitulo(tituloServiceImpl.retornarTitulo(idTitulo));
                JOptionPane.showMessageDialog(null, "Registro excluido!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir registro! \n \n ERRO: " + ex);
            }
        }
        retornarTitulos();
        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }//GEN-LAST:event_btnExcluirActionPerformed

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
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if ((txtTitulo.getText().length() == 0)) {
            JOptionPane.showMessageDialog(null, "Campos Obrigatórios!");
        } else if (txtTitulo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome!");
        } else {

            if (idTitulo == 0) {
                try {
                    tituloServiceImpl.inserirTitulo(txtTitulo.getText(), (Categoria) cbCategoria.getSelectedItem(), (Classe) cbClasse.getSelectedItem());
                    JOptionPane.showMessageDialog(null, "Novo registro salvo!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposDeTexto();
                }
            } else {
                try {
                    tituloServiceImpl.alterarTitulo(idTitulo, txtTitulo.getText(), (Categoria) cbCategoria.getSelectedItem(), (Classe) cbClasse.getSelectedItem());
                    JOptionPane.showMessageDialog(null, "Alteração realizada!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n Erro: " + ex);
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
            JOptionPane.showMessageDialog(null, "Erro ao preencher combobox Categorias! \n \n ERRO: " + ex);
        }
    }

    public void preencherComboClasses() {

        try {
            ArrayList<Classe> classes = classeServiceImpl.retornarClasses();

            for (int i = 0; i < classes.size(); i++) {
                cbClasse.addItem(classes.get(i));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher combobox Classes! \n \n ERRO: " + ex);
        }
    }

    public void pesquisaFiltroCombo() throws Exception {

        if (cbPesquisa.getSelectedIndex() == 0) {
            ArrayList<Titulo> listaTitulo = new ArrayList<Titulo>();
            TituloServiceImpl tituloServiceImpl = new TituloServiceImpl();
            listaTitulo = tituloServiceImpl.pesquisarTituloFilme(txtPesquisa.getText());

            carregarDadosDaTabela(listaTitulo);
        }

        if (cbPesquisa.getSelectedIndex() == 1) {
            ArrayList<Titulo> listaCategoria = new ArrayList<Titulo>();
            TituloServiceImpl tituloServiceImpl = new TituloServiceImpl();
            listaCategoria = tituloServiceImpl.pesquisarCategoriaFilme(txtPesquisa.getText());

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
        btnExcluir.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    public void desabilitarBotoes() {
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    public void retornarTitulos() {
        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        try {
            lista = (tituloServiceImpl.retornarTitulos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar Titulos! \n \n ERRO: " + ex);
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
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbClasse;
    private javax.swing.JComboBox cbPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nClasse;
    private javax.swing.JLabel nGenero;
    private javax.swing.JLabel nTitulo;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
