package br.com.fean.poo2.locadora.view.consultar;

import br.com.fean.poo2.locadora.control.categoria.CategoriaServiceImpl;
import br.com.fean.poo2.locadora.control.midia.MidiaServiceImpl;
import br.com.fean.poo2.locadora.control.titulos.TituloServiceImpl;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import br.com.fean.poo2.locadora.view.cadastro.filme.TelaCadastroFilme;
import br.com.fean.poo2.locadora.view.locar.TelaLocacao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListaFilmes extends javax.swing.JFrame {

    private TelaLocacao refpai;

    public TelaListaFilmes() throws Exception {
        initComponents();
        carregaClientes();
    }

    public TelaListaFilmes(TelaLocacao framepai) throws Exception {
        initComponents();
        carregaClientes();
        refpai = framepai;
    }
    
    public void carregaClientes() throws Exception {
        ArrayList<Titulo> listatitulos = new ArrayList<Titulo>();
        TituloServiceImpl tituloImpl = new TituloServiceImpl();
        CategoriaServiceImpl categoriaImpl = new CategoriaServiceImpl();
        listatitulos = tituloImpl.retornarTitulos();

        try {
            DefaultTableModel modeloTable = new DefaultTableModel();
            modeloTable.addColumn("Codigo");
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
            telaListaFilme.setModel(modeloTable);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "leitura de dados "
                    + "de titulo com problema..."
                    + " erro: " + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        telaListaFilme = new javax.swing.JTable();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        telaListaFilme.setModel(new javax.swing.table.DefaultTableModel(
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
        telaListaFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaListaFilmeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(telaListaFilme);
        if (telaListaFilme.getColumnModel().getColumnCount() > 0) {
            telaListaFilme.getColumnModel().getColumn(0).setMinWidth(50);
            telaListaFilme.getColumnModel().getColumn(0).setMaxWidth(50);
            telaListaFilme.getColumnModel().getColumn(2).setMinWidth(90);
            telaListaFilme.getColumnModel().getColumn(2).setMaxWidth(90);
            telaListaFilme.getColumnModel().getColumn(3).setMinWidth(90);
            telaListaFilme.getColumnModel().getColumn(3).setMaxWidth(90);
            telaListaFilme.getColumnModel().getColumn(4).setMinWidth(70);
            telaListaFilme.getColumnModel().getColumn(4).setMaxWidth(70);
            telaListaFilme.getColumnModel().getColumn(5).setMinWidth(70);
            telaListaFilme.getColumnModel().getColumn(5).setMaxWidth(70);
        }

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de Filmes");

        jButton1.setText("Pesquisar");

        jLabel5.setText("Gênero:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum", "Ação", "Adulto", "Comédia", "Drama", "Documentário", "Ficção Científica", "Infantil", "Romance", "Suspense", "Show", "Western" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Título", "Código" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(768, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void telaListaFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaListaFilmeMouseClicked
        Integer linhaSelecionada = telaListaFilme.getSelectedRow();
        Integer valorCodigoSelecionado = (Integer) telaListaFilme.getValueAt(linhaSelecionada, 0);
        String valorNomeSelecionado = (String) telaListaFilme.getValueAt(linhaSelecionada, 1);
        String valorClasseFilme = (String) telaListaFilme.getValueAt(linhaSelecionada, 3);
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
            JOptionPane.showMessageDialog(null, "Não possui midias disponiveis para locação deste Filme!");
        }
    }//GEN-LAST:event_telaListaFilmeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton sair;
    private javax.swing.JTable telaListaFilme;
    // End of variables declaration//GEN-END:variables
}
