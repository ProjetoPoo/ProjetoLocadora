package br.com.fean.poo2.locadora.view.cadastro.titulo;

import br.com.fean.poo2.locadora.control.categoria.CategoriaServiceImpl;
import br.com.fean.poo2.locadora.control.classe.classeServiceImpl;
import br.com.fean.poo2.locadora.control.distribuidor.DistribuidorServiceImpl;
import br.com.fean.poo2.locadora.control.midia.MidiaServiceImpl;
import br.com.fean.poo2.locadora.control.tipomidia.TipoMidiaServiceImpl;
import br.com.fean.poo2.locadora.control.titulos.TituloServiceImpl;
import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import br.com.fean.poo2.locadora.modelo.classe.Classe;
import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.midia.Midia;
import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidia;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import br.com.fean.poo2.locadora.view.consultar.TelaListaFilmes;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroTitulo extends javax.swing.JPanel {

    private int idTitulo = 0;
    TituloServiceImpl tituloServiceImpl = new TituloServiceImpl();
    Titulo titulo = new Titulo();
    public TelaCadastroTitulo() {
        initComponents();
        retornarTitulos();
        desabilitarBotoes();
        bloquearCamposDeTexto();
        FillComboDistribuidores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nTitulo = new javax.swing.JLabel();
        nGenero = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox();
        nClasse = new javax.swing.JLabel();
        cbClasse = new javax.swing.JComboBox();
        nNumeroSerie = new javax.swing.JLabel();
        txtNumeroSerie = new javax.swing.JTextField();
        nValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        nMidia = new javax.swing.JLabel();
        cbMidia = new javax.swing.JComboBox();
        nDistribuidor = new javax.swing.JLabel();
        nDataAquisicao = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        nEstoque = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        cbDistribuidor = new javax.swing.JComboBox();
        txtCodigo = new javax.swing.JTextField();
        nCodigo = new javax.swing.JLabel();
        txtDataAquisicao = new com.toedter.calendar.JDateChooser();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        nPesquisaTitulo = new javax.swing.JLabel();
        txtTituloPesquisa = new javax.swing.JTextField();
        cbCodigo = new javax.swing.JComboBox();
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

        nGenero.setText("Gênero:");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ação", "Adulto", "Comédia", "Drama", "Documentário", "Ficção Científica", "Infantil", "Romance", "Suspense", "Show", "Western" }));

        nClasse.setText("Classe:");

        cbClasse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Super-Lançamento" }));

        nNumeroSerie.setText("Número de Série:");

        nValor.setText("Valor:");

        nMidia.setText("Mídia:");

        cbMidia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DVD", "Blue-Ray", "VHS" }));

        nDistribuidor.setText("Distribuidor:");

        nDataAquisicao.setText("Data de Aquisição:");

        nEstoque.setText("Estoque:");

        txtEstoque.setEnabled(false);

        txtCodigo.setEnabled(false);

        nCodigo.setText("Código:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nCodigo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nMidia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMidia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nNumeroSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nDistribuidor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 24, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nClasse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nValor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nDataAquisicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nCodigo)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nTitulo)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nMidia)
                    .addComponent(cbMidia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nGenero)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nNumeroSerie)
                    .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nClasse)
                        .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nEstoque)
                        .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nValor)
                        .addComponent(nDataAquisicao))
                    .addComponent(txtDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nDistribuidor)
                    .addComponent(cbDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        nPesquisaTitulo.setText("Título");

        cbCodigo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Título" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nPesquisaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloPesquisa)
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
                        .addComponent(nPesquisaTitulo)
                        .addComponent(txtTituloPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Mídia"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(100);
            tabela.getColumnModel().getColumn(0).setMaxWidth(100);
            tabela.getColumnModel().getColumn(2).setMinWidth(120);
            tabela.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnExcluir, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // pesquisar
        TelaListaFilmes listaFilme;
        try {
            listaFilme = new TelaListaFilmes();
            listaFilme.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroTitulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        idTitulo = 0;
        limparCamposDeTexto();
        editarCamposDeTexto();
        btnSalvar.setVisible(true);
        btnCancelar.setVisible(true);
        btnExcluir.setVisible(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        /*Midia midia = new Midia();
        MidiaServiceImpl midiaServiceImpl = new MidiaServiceImpl();
        TipoMidia tipomidia = new TipoMidia();
        TipoMidiaServiceImpl tipomidiaimpl = new TipoMidiaServiceImpl();
        String tipomidianome = (String) cbMidia.getSelectedItem();
        Categoria categoria = new Categoria();
        CategoriaServiceImpl categoriaServiceImpl = new CategoriaServiceImpl();
        String categoriaNome = (String) cbGenero.getSelectedItem();
        Classe classe = new Classe();
        classeServiceImpl classeServiceImpl = new classeServiceImpl();
        String classeNome = (String) cbClasse.getSelectedItem();
        Distribuidor distribuidor = new Distribuidor();
        DistribuidorServiceImpl distribuidorServiceImpl = new DistribuidorServiceImpl();
        String distribuidorNome = (String) cbDistribuidor.getSelectedItem();
                
        
        //JOptionPane.showMessageDialog(btnNovo, tipomidia.getNome());
        //Seria isso?!
        try {
            titulo.setNome(txtTitulo.getText());
            tipomidia = tipomidiaimpl.retornarTipoMidia(tipomidianome);
            midia.setTipoMidias(tipomidia);
            categoria = categoriaServiceImpl.retornarCategoriaNome(categoriaNome);
            categoria.setNome(categoriaNome);
            titulo.getMidia().setNrserie(txtNumeroSerie.getText());
            classe = classeServiceImpl.retornarClasseNome(classeNome);
            classe.setNome(classeNome);
            titulo.getClasses().setValor(Double.valueOf(txtValor.getText()));
            titulo.getMidia().setDataaquisicao(txtDataAquisicao.getDate());
            distribuidor = distribuidorServiceImpl.retornarDistribuidorNome(distribuidorNome);
            distribuidor.setRazaoSocial(distribuidorNome);
            
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroTitulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               retornarTitulos();
            limparCamposDeTexto();
            desabilitarBotoes();
            bloquearCamposDeTexto();
        */
    }//GEN-LAST:event_btnSalvarActionPerformed

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
        cbMidia.setSelectedItem(modelo.getValueAt(tabela.getSelectedRow(), 2).toString());
        cbGenero.setSelectedItem(modelo.getValueAt(tabela.getSelectedRow(), 3).toString());
        txtNumeroSerie.setText(modelo.getValueAt(tabela.getSelectedRow(), 4).toString());
        cbClasse.setSelectedItem(modelo.getValueAt(tabela.getSelectedRow(), 5).toString());
        txtEstoque.setText(modelo.getValueAt(tabela.getSelectedRow(), 6).toString());
        txtValor.setText(modelo.getValueAt(tabela.getSelectedRow(), 7).toString());
        txtDataAquisicao.setDateFormatString(modelo.getValueAt(tabela.getSelectedRow(), 8).toString());
        cbDistribuidor.setSelectedItem(modelo.getValueAt(tabela.getSelectedRow(), 9).toString());

        editarCamposDeTexto();
        habilitarBotoes();
    }//GEN-LAST:event_tabelaMouseClicked

    public void limparCamposDeTexto() {
        txtTitulo.setText("");
        txtNumeroSerie.setText("");
        txtValor.setText("");
        txtDataAquisicao.setDateFormatString("");
    }

    public void editarCamposDeTexto() {

        txtTitulo.setEnabled(true);
        txtNumeroSerie.setEnabled(true);
        txtValor.setEnabled(true);
        txtDataAquisicao.setEnabled(true);

    }

    public void bloquearCamposDeTexto() {
        txtTitulo.setEnabled(false);
        txtNumeroSerie.setEnabled(false);
        txtValor.setEnabled(false);
        txtDataAquisicao.setEnabled(false);
    }

    public void habilitarBotoes() {
        btnSalvar.setVisible(true);
        btnExcluir.setVisible(true);
        btnCancelar.setVisible(true);
    }

    public void desabilitarBotoes() {
        btnSalvar.setVisible(false);
        btnExcluir.setVisible(false);
        btnCancelar.setVisible(false);
    }

    public void FillComboDistribuidores() {
        EntityManagerUtil entityManager = new EntityManagerUtil();
//        cbDistribuidor.addItem(entityManager.getEntityManager().createQuery("select razaoSocial from disciplina"));
    }

    public void retornarTitulos() {
        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        try {
//            lista = (tituloServiceImpl.retornarTitulos());
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
                    lista.get(i).getMidia().getTipoMidias().getNome(),
                    lista.get(i).getCategorias().getNome(),
                    lista.get(i).getMidia().getNrserie(),
                    lista.get(i).getClasses().getNome(),
                    lista.get(i).getMidia().getSituacao(),
                    lista.get(i).getClasses().getValor(),
                    lista.get(i).getMidia().getDataaquisicao(),
                    lista.get(i).getMidia().getSituacao(),
                    lista.get(i).getDistribuidor().getRazaoSocial()});
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
    private javax.swing.JComboBox cbClasse;
    private javax.swing.JComboBox cbCodigo;
    private javax.swing.JComboBox cbDistribuidor;
    private javax.swing.JComboBox cbGenero;
    private javax.swing.JComboBox cbMidia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nClasse;
    private javax.swing.JLabel nCodigo;
    private javax.swing.JLabel nDataAquisicao;
    private javax.swing.JLabel nDistribuidor;
    private javax.swing.JLabel nEstoque;
    private javax.swing.JLabel nGenero;
    private javax.swing.JLabel nMidia;
    private javax.swing.JLabel nNumeroSerie;
    private javax.swing.JLabel nPesquisaTitulo;
    private javax.swing.JLabel nTitulo;
    private javax.swing.JLabel nValor;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private com.toedter.calendar.JDateChooser txtDataAquisicao;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtNumeroSerie;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTituloPesquisa;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
