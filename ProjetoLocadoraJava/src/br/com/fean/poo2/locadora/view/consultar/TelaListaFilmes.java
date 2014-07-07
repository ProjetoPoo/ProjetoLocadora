package br.com.fean.poo2.locadora.view.consultar;

import br.com.fean.poo2.locadora.control.categoria.CategoriaServiceImpl;
import br.com.fean.poo2.locadora.control.midia.MidiaServiceImpl;
import br.com.fean.poo2.locadora.control.titulos.TituloServiceImpl;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import br.com.fean.poo2.locadora.view.locar.TelaLocacao;
import br.com.fean.poo2.locadora.view.resevar.TelaReserva;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListaFilmes extends javax.swing.JFrame {

    private TelaLocacao refpai;
    private TelaReserva refpaireserva;

    public TelaListaFilmes() throws Exception {
        setIcone();
        initComponents();
        carregaClientes();
    }
        private void setIcone() {//Apresenta  icone na frame e na barra de tarefas
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/fean/poo2/locadora/imagens/claquete.gif")));
    }

    public TelaListaFilmes(TelaLocacao framepai) throws Exception {
        initComponents();
        carregaClientes();
        refpai = framepai;
    }
    
    public TelaListaFilmes(TelaReserva framepai) throws Exception {
        initComponents();
        carregaClientes();
        refpaireserva = framepai;
    }
    
    public void carregaClientes() throws Exception {
        ArrayList<Titulo> listatitulos = new ArrayList<Titulo>();
        TituloServiceImpl tituloImpl = new TituloServiceImpl();
        CategoriaServiceImpl categoriaImpl = new CategoriaServiceImpl();
        listatitulos = tituloImpl.retornarTitulos();

        try {
            DefaultTableModel modeloTable = new DefaultTableModel();
            modeloTable.addColumn("Código");
            modeloTable.addColumn("Nome");
            modeloTable.addColumn("Gênero");
            modeloTable.addColumn("Classe");
            modeloTable.addColumn("Valor");
            modeloTable.addColumn("Estoque");
            modeloTable.addColumn("Distribuidor");
            for (Titulo titulo : listatitulos) {
                modeloTable.addRow(new Object[]{titulo.getId(), titulo.getNome(),
                    titulo.getCategorias().getNome(), titulo.getClasses().getNome(), titulo.getClasses().getValor()});
            }
            tabela.setModel(modeloTable);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na leitura dos dados de título! \n \n  ERRO: " + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        nListaFilme = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        nGenero = new javax.swing.JLabel();
        cbPesquisaGenero = new javax.swing.JComboBox();
        cbPesquisaFilme = new javax.swing.JComboBox();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Gênero", "Classe", "Valor", "Estoque", "Distribuidor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, false, true
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
            tabela.getColumnModel().getColumn(0).setMinWidth(50);
            tabela.getColumnModel().getColumn(0).setMaxWidth(50);
            tabela.getColumnModel().getColumn(2).setMinWidth(90);
            tabela.getColumnModel().getColumn(2).setMaxWidth(90);
            tabela.getColumnModel().getColumn(3).setMinWidth(90);
            tabela.getColumnModel().getColumn(3).setMaxWidth(90);
            tabela.getColumnModel().getColumn(4).setMinWidth(70);
            tabela.getColumnModel().getColumn(4).setMaxWidth(70);
            tabela.getColumnModel().getColumn(5).setMinWidth(70);
            tabela.getColumnModel().getColumn(5).setMaxWidth(70);
        }

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        nListaFilme.setText("Lista de Filmes");

        btnPesquisar.setText("Pesquisar");

        nGenero.setText("Gênero:");

        cbPesquisaGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum", "Ação", "Adulto", "Comédia", "Drama", "Documentário", "Ficção Científica", "Infantil", "Romance", "Suspense", "Show", "Western" }));

        cbPesquisaFilme.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Título", "Código" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nListaFilme)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbPesquisaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPesquisaGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nListaFilme)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nGenero)
                        .addComponent(cbPesquisaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbPesquisaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(768, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        Integer linhaSelecionada = tabela.getSelectedRow();
        Integer valorCodigoSelecionado = (Integer) tabela.getValueAt(linhaSelecionada, 0);
        String valorNomeSelecionado = (String) tabela.getValueAt(linhaSelecionada, 1);
        String valorClasseFilme = (String) tabela.getValueAt(linhaSelecionada, 3);
        MidiaServiceImpl midiaservice = new MidiaServiceImpl();
        Integer nrMidias = midiaservice.nrMidiasTituloDisponiveis(valorCodigoSelecionado);
        if (!nrMidias.equals(0)) {
        refpai.setCodFilme(valorCodigoSelecionado);
        refpai.setNomeFilme(valorNomeSelecionado);
        refpai.setquantidadeMidias(nrMidias);
        refpai.setIdMidiaSelecionada(midiaservice.idMidiaLocacao(valorCodigoSelecionado));
        Date data = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        

        if (valorClasseFilme.equals("Super-Lançamento")) {
            cal.add(Calendar.DAY_OF_MONTH, 1);
            refpai.setDataDevolucao(cal);
        } else if (valorClasseFilme.equals("Lançamento")) {
            cal.add(Calendar.DAY_OF_MONTH, 2);
            refpai.setDataDevolucao(cal);
        } else if (valorClasseFilme.equals("Ouro")) {
            cal.add(Calendar.DAY_OF_MONTH, 3);
            refpai.setDataDevolucao(cal);
        } else if (valorClasseFilme.equals("Prata")) {
            cal.add(Calendar.DAY_OF_MONTH, 5);
            refpai.setDataDevolucao(cal);
        } else if (valorClasseFilme.equals("Bronze")) {
            cal.add(Calendar.DAY_OF_MONTH, 7);
            refpai.setDataDevolucao(cal);
        } else {
            cal.add(Calendar.DAY_OF_MONTH, 7);
            refpai.setDataDevolucao(cal);
        }
        dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Não possui mídias disponíveis para a locação deste Filme!");
        }
    }//GEN-LAST:event_tabelaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox cbPesquisaFilme;
    private javax.swing.JComboBox cbPesquisaGenero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nGenero;
    private javax.swing.JLabel nListaFilme;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
