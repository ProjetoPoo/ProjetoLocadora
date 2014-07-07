package br.com.fean.poo2.locadora.view.consultar;

import br.com.fean.poo2.locadora.control.dependente.DependenteServiceImpl;
import br.com.fean.poo2.locadora.control.socio.SocioServiceImpl;
import br.com.fean.poo2.locadora.modelo.dependente.Dependente;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import br.com.fean.poo2.locadora.modelo.socio.SocioDAO;
import br.com.fean.poo2.locadora.view.cadastro.cliente.TelaCadastroCliente;
import br.com.fean.poo2.locadora.view.devolver.TelaDevolucao;
import br.com.fean.poo2.locadora.view.locar.TelaLocacao;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListaCliente extends javax.swing.JFrame {

    SocioDAO socioDao = new SocioDAO();

    private TelaLocacao refpai;
    private TelaCadastroCliente refpaicadastrocliente;

    public TelaListaCliente() throws Exception {
        setIcone();
        initComponents();
        carregaClientes();
        //        preencherTabela();
    }
        private void setIcone() {//Apresenta  icone na frame e na barra de tarefas
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/fean/poo2/locadora/imagens/claquete.gif")));
    }

    public TelaListaCliente(TelaLocacao framepai) throws Exception {
        initComponents();
        carregaClientes();
        //        preencherTabela();
        refpai = framepai;
    }

    public void pesquisaFiltro() throws Exception {
        if (cbCliente.getSelectedIndex() == 0) {
            ArrayList<Socio> listasocios; // = new ArrayList<Socio>();
            SocioServiceImpl socioImpl = new SocioServiceImpl();
            listasocios = socioImpl.pesquisaSocioNome(txtPesquisarCliente.getText());

            try {
                DefaultTableModel modeloTable = new DefaultTableModel();
                modeloTable.addColumn("Código");
                modeloTable.addColumn("Nome");
                modeloTable.addColumn("Endereço");
                modeloTable.addColumn("Telefone residencial");
                modeloTable.addColumn("Local de trabalho");
                modeloTable.addColumn("CPF");
                for (Socio socio : listasocios) {
                    modeloTable.addRow(new Object[]{socio.getId(),
                        socio.getNome(), socio.getEndereco(),
                        socio.getFoneRes(), socio.getLocalTrabalho(), socio.getCpf()});
                }
                tabela.setModel(modeloTable);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na leitura dos dados do sócio! \n \n  ERRO: " + e);
            }
        }
        if (cbCliente.getSelectedIndex() == 0) {
            ArrayList<Socio> listasocios; // = new ArrayList<Socio>();
            SocioServiceImpl socioImpl = new SocioServiceImpl();
            listasocios = socioImpl.pesquisaSocioNome(txtPesquisarCliente.getText());

            try {
                DefaultTableModel modeloTable = new DefaultTableModel();
                modeloTable.addColumn("Código");
                modeloTable.addColumn("Nome");
                modeloTable.addColumn("Endereço");
                modeloTable.addColumn("Telefone residencial");
                modeloTable.addColumn("Local de trabalho");
                modeloTable.addColumn("CPF");
                for (Socio socio : listasocios) {
                    modeloTable.addRow(new Object[]{socio.getId(),
                        socio.getNome(), socio.getEndereco(),
                        socio.getFoneRes(), socio.getLocalTrabalho(), socio.getCpf()});
                }
                tabela.setModel(modeloTable);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na leitura dos dados do sócio! \n \n  ERRO: " + e);
            }
        }
        if (cbCliente.getSelectedIndex() == 1) {
            ArrayList<Dependente> listadependentes; // = new ArrayList<Dependente>();
            DependenteServiceImpl dependenteImpl = new DependenteServiceImpl();
            listadependentes = dependenteImpl.pesquisaDependenteNome(txtPesquisarCliente.getText());

            try {
                DefaultTableModel modeloTable = new DefaultTableModel();
                modeloTable.addColumn("Código");
                modeloTable.addColumn("Nome do dependente");
                for (Dependente dependente : listadependentes) {
                    modeloTable.addRow(new Object[]{dependente.getId(),
                        dependente.getNome()});
                }
                tabela.setModel(modeloTable);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na leitura dos dados do sócio! \n \n  ERRO: " + e);
            }
        }
        if (cbCliente.getSelectedIndex() == 3) {
            ArrayList<Socio> listasocios; // = new ArrayList<Socio>();
            SocioServiceImpl socioImpl = new SocioServiceImpl();
            listasocios = socioImpl.pesquisaSocioCodigo(Integer.parseInt(txtPesquisarCliente.getText()));

            try {
                DefaultTableModel modeloTable = new DefaultTableModel();
                modeloTable.addColumn("Código");
                modeloTable.addColumn("Nome");
                modeloTable.addColumn("Endereço");
                modeloTable.addColumn("Telefone residencial");
                modeloTable.addColumn("Local de trabalho");
                modeloTable.addColumn("CPF");
                for (Socio socio : listasocios) {
                    modeloTable.addRow(new Object[]{socio.getId(),
                        socio.getNome(), socio.getEndereco(),
                        socio.getFoneRes(), socio.getLocalTrabalho(), socio.getCpf()});
                }
                tabela.setModel(modeloTable);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na leitura dos dados do sócio! \n \n  ERRO: " + e);
            }
        }
    }

    public void carregaClientes() throws Exception {
        ArrayList<Socio> listasocios; // = new ArrayList<Socio>();
        SocioServiceImpl socioImpl = new SocioServiceImpl();
        listasocios = socioImpl.retornarSocios();

        try {
            DefaultTableModel modeloTable = new DefaultTableModel();
            modeloTable.addColumn("Código");
            modeloTable.addColumn("Nome");
            modeloTable.addColumn("Endereço");
            modeloTable.addColumn("Telefone residencial");
            modeloTable.addColumn("Local de trabalho");
            modeloTable.addColumn("CPF");
            for (Socio socio : listasocios) {
                modeloTable.addRow(new Object[]{socio.getId(),
                    socio.getNome(), socio.getEndereco(),
                    socio.getFoneRes(), socio.getLocalTrabalho(), socio.getCpf()});
            }
            tabela.setModel(modeloTable);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na leitura dos dados do sócio! \n \n  ERRO: " + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nListaClientes = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisarCliente = new javax.swing.JTextField();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        cbCliente = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nListaClientes.setText("Lista de Clientes");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
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
            tabela.getColumnModel().getColumn(0).setMinWidth(60);
            tabela.getColumnModel().getColumn(0).setMaxWidth(60);
            tabela.getColumnModel().getColumn(2).setMinWidth(120);
            tabela.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        cbCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome Titular", "Nome Dependente", "CPF Titular", "Código Titular" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDeRolagem)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nListaClientes)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nListaClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(670, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (refpai != null){
        Integer linhaSelecionada = tabela.getSelectedRow();
        Integer valorCodigoSelecionado = (Integer) tabela.getValueAt(linhaSelecionada, 0);
        refpai.setCodCliente(valorCodigoSelecionado);
        String valorNomeSelecionado = (String) tabela.getValueAt(linhaSelecionada, 1);
        refpai.setNomeCliente(valorNomeSelecionado);
        dispose();
        } else {
            
        }

    }//GEN-LAST:event_tabelaMouseClicked

    private void preencherTabela() {

        ArrayList<Socio> lista = new ArrayList<>();

        try {
            lista = socioDao.retornarTodosSocio();
        } catch (Exception ex) {
            Logger.getLogger(TelaListaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

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
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            pesquisaFiltro();

        } catch (Exception ex) {
            Logger.getLogger(TelaListaCliente.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JLabel nListaClientes;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisarCliente;
    // End of variables declaration//GEN-END:variables
}
