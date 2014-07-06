package br.com.fean.poo2.locadora.view.locar;

import br.com.fean.poo2.locadora.control.funcionario.FuncionarioServiceImpl;
import br.com.fean.poo2.locadora.control.locacao.LocacaoServiceImpl;
import br.com.fean.poo2.locadora.control.locacaomidia.LocacaoMidiaServiceImpl;
import br.com.fean.poo2.locadora.control.midia.MidiaServiceImpl;
import br.com.fean.poo2.locadora.control.socio.SocioServiceImpl;
import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import br.com.fean.poo2.locadora.modelo.locacao.Locacao;
import br.com.fean.poo2.locadora.modelo.locacaomidia.LocacaoMidia;
import br.com.fean.poo2.locadora.modelo.midia.Midia;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import br.com.fean.poo2.locadora.view.consultar.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaLocacao extends javax.swing.JPanel {

    private Integer idmidiaselecionada;
    private ArrayList<LocacaoMidia> locacaofilmes = new ArrayList<LocacaoMidia>();
    private Locacao locacao = new Locacao();

    public TelaLocacao() {
        initComponents();
        carregaListaLocacao();
    }

    public void carregaListaLocacao() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date datalocacao = new Date();
        Double valorfilme = 0.0;
        Double totalapagar = 0.0;
        try {
            DefaultTableModel modeloTable = new DefaultTableModel();
            modeloTable.addColumn("Código");
            modeloTable.addColumn("Título");
            modeloTable.addColumn("Data de locação");
            modeloTable.addColumn("Data de devolução");
            modeloTable.addColumn("Valor");
            
            for (LocacaoMidia locacaoMidia : locacaofilmes) {
            if (locacaoMidia.getMidias().getTitulos().getClasses().getNome().equals("Super-Lançamento")) {
                valorfilme = 7.00;
            } else if (locacaoMidia.getMidias().getTitulos().getClasses().getNome().equals("Lançamento")) {
                valorfilme = 5.00;
            } else if (locacaoMidia.getMidias().getTitulos().getClasses().getNome().equals("Ouro")) {
                valorfilme = 4.00;
            } else if (locacaoMidia.getMidias().getTitulos().getClasses().getNome().equals("Prata")) {
                valorfilme = 3.00;
            } else if (locacaoMidia.getMidias().getTitulos().getClasses().getNome().equals("Bronze")) {
                valorfilme = 2.00;
            } else {
                valorfilme = 7.00;
            }
            totalapagar = totalapagar + valorfilme;
            modeloTable.addRow(new Object[]{
                locacaoMidia.getMidias().getTitulos().getId(),
                locacaoMidia.getMidias().getTitulos().getNome(),
                dateFormat.format(datalocacao),
                dateFormat.format(locacaoMidia.getDtPrevDevolucao()),
                valorfilme});
            }
            tabela.setModel(modeloTable);
            txtTotalPagar.setText(String.valueOf(totalapagar));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na leitura dos dados de locação! \n \n  ERRO: " + e);
        }
    }

    public void setCodCliente(Integer codigo) {
        txtCodigoCliente.setText(Integer.toString(codigo));
    }

    public void setNomeCliente(String nome) {
        txtNomeCliente.setText(nome);
    }

    public void setCodFilme(Integer codigo) {
        txtCodigoFilme.setText(Integer.toString(codigo));
    }

    public void setNomeFilme(String nome) {
        txtTituloFilme.setText(nome);
    }

    public void setDataDevolucao(Calendar cal) {
        txtDataDevolucao.setCalendar(cal);
    }

    public void setquantidadeMidias(Integer nromidia) {
        txtEstoque.setText(Integer.toString(nromidia));
    }

    public void setIdMidiaSelecionada(Integer idmidiaselecionada) {
        this.idmidiaselecionada = idmidiaselecionada;
    }

    public Integer getIdMidiaSelecinada() {
        return this.idmidiaselecionada;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLocacao = new javax.swing.JPanel();
        painelCliente = new javax.swing.JPanel();
        nCodigoCliente = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        nNomeCliente = new javax.swing.JLabel();
        painelFilme = new javax.swing.JPanel();
        nCodigoFilme = new javax.swing.JLabel();
        txtCodigoFilme = new javax.swing.JTextField();
        nTituloFilme = new javax.swing.JLabel();
        txtTituloFilme = new javax.swing.JTextField();
        nDataDevolucao = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        nEstoque = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        txtDataDevolucao = new com.toedter.calendar.JDateChooser();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        painelSaldoPagar = new javax.swing.JPanel();
        nTotalPagar = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        painelLocacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Locação"));

        painelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        nCodigoCliente.setText("Código:");

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
                .addComponent(nCodigoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCliente)
                .addContainerGap())
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCodigoCliente)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        painelFilme.setBorder(javax.swing.BorderFactory.createTitledBorder("Filme"));

        nCodigoFilme.setText("Código:");

        txtCodigoFilme.setEnabled(false);
        txtCodigoFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoFilmeMouseClicked(evt);
            }
        });

        nTituloFilme.setText("Título:");

        txtTituloFilme.setEnabled(false);

        nDataDevolucao.setText("Data de Devolução:");

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        nEstoque.setText("Estoque:");

        txtEstoque.setEnabled(false);

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
                        .addComponent(nTituloFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
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
                        .addComponent(nTituloFilme)
                        .addComponent(txtTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        painelSaldoPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo a Pagar"));

        nTotalPagar.setText("Total a Pagar:");

        txtTotalPagar.setEnabled(false);

        javax.swing.GroupLayout painelSaldoPagarLayout = new javax.swing.GroupLayout(painelSaldoPagar);
        painelSaldoPagar.setLayout(painelSaldoPagarLayout);
        painelSaldoPagarLayout.setHorizontalGroup(
            painelSaldoPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaldoPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nTotalPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        painelSaldoPagarLayout.setVerticalGroup(
            painelSaldoPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaldoPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSaldoPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nTotalPagar)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");

        javax.swing.GroupLayout painelLocacaoLayout = new javax.swing.GroupLayout(painelLocacao);
        painelLocacao.setLayout(painelLocacaoLayout);
        painelLocacaoLayout.setHorizontalGroup(
            painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDeRolagem)
                    .addGroup(painelLocacaoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelSaldoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        painelLocacaoLayout.setVerticalGroup(
            painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLocacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLocacaoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair))
                    .addComponent(painelSaldoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoClienteMouseClicked
        TelaListaCliente listaCliente;
        try {
            listaCliente = new TelaListaCliente(TelaLocacao.this); 
            listaCliente.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCodigoClienteMouseClicked

    private void txtCodigoFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoFilmeMouseClicked
        TelaListaFilmes telaFilme;
        txtCodigoFilme.setText(null);
        txtTituloFilme.setText(null);
        txtEstoque.setText(null);
        txtDataDevolucao.setCalendar(null);
        idmidiaselecionada = 0;
        try {
            telaFilme = new TelaListaFilmes(TelaLocacao.this);
            telaFilme.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtCodigoFilmeMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Date data = new Date();
        Funcionario funcionario = new Funcionario();
        Socio socio = new Socio();
        SocioServiceImpl socioimpl = new SocioServiceImpl();
        FuncionarioServiceImpl funcimpl = new FuncionarioServiceImpl();
        LocacaoServiceImpl locacaoimpl = new LocacaoServiceImpl();
        LocacaoMidiaServiceImpl locacaomidiaimpl = new LocacaoMidiaServiceImpl();
        try {
            funcionario = funcimpl.retornarFuncionario(1);
            socio = socioimpl.retornarSocioId(Integer.valueOf(txtCodigoCliente.getText()));
            locacao.setFuncionarios(funcionario);
            locacao.setDtLocacao(data);
            locacao.setSocios(socio);
            locacao.setValortotal(Double.valueOf(txtTotalPagar.getText()));
            locacaoimpl.inserirLocacao(locacao);
            for (LocacaoMidia locacaoMidia : locacaofilmes) {
                locacaoMidia.setLocacao(locacao);
                locacaomidiaimpl.inserirLocacaoMidia(locacaoMidia);              
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Midia midia = new Midia();
        MidiaServiceImpl midiaservice = new MidiaServiceImpl();
        midia = midiaservice.retornaMidia(idmidiaselecionada);
        LocacaoMidia locacaomidia = new LocacaoMidia();
        locacaomidia.setMidias(midia);
        locacaomidia.setPago(false);
        locacaomidia.setDtPrevDevolucao(txtDataDevolucao.getDate());
        locacaofilmes.add(locacaomidia);
        carregaListaLocacao();
    }//GEN-LAST:event_btnIncluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel nCodigoCliente;
    private javax.swing.JLabel nCodigoFilme;
    private javax.swing.JLabel nDataDevolucao;
    private javax.swing.JLabel nEstoque;
    private javax.swing.JLabel nNomeCliente;
    private javax.swing.JLabel nTituloFilme;
    private javax.swing.JLabel nTotalPagar;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JPanel painelFilme;
    private javax.swing.JPanel painelLocacao;
    private javax.swing.JPanel painelSaldoPagar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoFilme;
    private com.toedter.calendar.JDateChooser txtDataDevolucao;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTituloFilme;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
