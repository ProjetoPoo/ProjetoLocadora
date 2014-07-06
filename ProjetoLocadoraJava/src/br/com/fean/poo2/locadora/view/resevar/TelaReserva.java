package br.com.fean.poo2.locadora.view.resevar;

import br.com.fean.poo2.locadora.view.consultar.TelaListaFilmes;
import br.com.fean.poo2.locadora.view.locar.TelaLocacao;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaReserva extends javax.swing.JPanel {
    private Integer idMidiaSelecionada;


    public TelaReserva() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelReservas = new javax.swing.JPanel();
        painelCliente = new javax.swing.JPanel();
        cCodigoCliente = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        nNomeCliente = new javax.swing.JLabel();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        painelFilme = new javax.swing.JPanel();
        nCodigoFilme = new javax.swing.JLabel();
        txtCodigoFilme = new javax.swing.JTextField();
        nTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        nDataDevolucao = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        nEstoque = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        txtDataDevolucao = new com.toedter.calendar.JDateChooser();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();

        painelReservas.setBorder(javax.swing.BorderFactory.createTitledBorder("Reservas"));

        painelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        cCodigoCliente.setText("Código:");

        txtCodigoCliente.setEnabled(false);
        txtCodigoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoClienteMouseClicked(evt);
            }
        });

        txtNomeCliente.setEnabled(false);

        nNomeCliente.setText("Nome:");

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cCodigoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cCodigoCliente)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Data de locação", "Data de devolução", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        painelDeRolagem.setViewportView(tabela);

        painelFilme.setBorder(javax.swing.BorderFactory.createTitledBorder("Filme"));

        nCodigoFilme.setText("Código:");

        txtCodigoFilme.setEnabled(false);
        txtCodigoFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoFilmeMouseClicked(evt);
            }
        });

        nTitulo.setText("Título:");

        txtTitulo.setEnabled(false);

        nDataDevolucao.setText("Data de Devolução:");

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        nEstoque.setText("Estoque:");

        txtEstoque.setEnabled(false);

        txtDataDevolucao.setEnabled(false);
        txtDataDevolucao.setName("txtDataDevolucao"); // NOI18N

        javax.swing.GroupLayout painelFilmeLayout = new javax.swing.GroupLayout(painelFilme);
        painelFilme.setLayout(painelFilmeLayout);
        painelFilmeLayout.setHorizontalGroup(
            painelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFilmeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelFilmeLayout.createSequentialGroup()
                        .addComponent(nEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstoque))
                    .addGroup(painelFilmeLayout.createSequentialGroup()
                        .addComponent(nCodigoFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelFilmeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nDataDevolucao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFilmeLayout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelFilmeLayout.setVerticalGroup(
            painelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFilmeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nCodigoFilme)
                        .addComponent(txtCodigoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nTitulo)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nDataDevolucao))
                    .addComponent(txtDataDevolucao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIncluir)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFilmeLayout.createSequentialGroup()
                        .addGroup(painelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nEstoque)
                            .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout painelReservasLayout = new javax.swing.GroupLayout(painelReservas);
        painelReservas.setLayout(painelReservasLayout);
        painelReservasLayout.setHorizontalGroup(
            painelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDeRolagem)
                    .addComponent(painelFilme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelReservasLayout.setVerticalGroup(
            painelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setText("Novo");

        btnSalvar.setText("Salvar");

        btnDeletar.setText("Deletar");

        btnCancelar.setText("Cancelar");

        btnReservar.setText("Reservar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReservar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnDeletar, btnNovo, btnReservar, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar)
                    .addComponent(btnReservar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoClienteMouseClicked

    private void txtCodigoFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoFilmeMouseClicked
        TelaListaFilmes telaFilme;
        txtCodigoFilme.setText(null);
        txtTitulo.setText(null);
        txtEstoque.setText(null);
        txtDataDevolucao.setCalendar(null);
        try {
            telaFilme = new TelaListaFilmes(TelaReserva.this);
            telaFilme.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_txtCodigoFilmeMouseClicked

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
  /*      Midia midia = new Midia();
        MidiaServiceImpl midiaservice = new MidiaServiceImpl();
        midia = midiaservice.retornaMidia(idMidiaSelecionada);
        LocacaoMidia locacaomidia = new LocacaoMidia();
        locacaomidia.setMidias(midia);
        locacaomidia.setPago(false);
        System.out.println(midia.getId());
        System.out.println(idMidiaSelecionada);

        try {
            DefaultTableModel modeloTable = new DefaultTableModel();
            modeloTable.addColumn("Código");
            modeloTable.addColumn("Título");
            modeloTable.addColumn("Data de locação");
            modeloTable.addColumn("Data de devolução");
            modeloTable.addColumn("Valor");
            modeloTable.addRow(new Object[]{
                codigoFilme.getText(), jTextField4.getText()});
        tabelaListaLocacao.setModel(modeloTable);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na leitura dos dados de locação! \n \n  ERRO: " + e);
        } */
    }//GEN-LAST:event_btnIncluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel cCodigoCliente;
    private javax.swing.JLabel nCodigoFilme;
    private javax.swing.JLabel nDataDevolucao;
    private javax.swing.JLabel nEstoque;
    private javax.swing.JLabel nNomeCliente;
    private javax.swing.JLabel nTitulo;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JPanel painelFilme;
    private javax.swing.JPanel painelReservas;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoFilme;
    private com.toedter.calendar.JDateChooser txtDataDevolucao;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
