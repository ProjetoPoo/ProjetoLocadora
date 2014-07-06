package br.com.fean.poo2.locadora.view.devolver;

import br.com.fean.poo2.locadora.control.locacaomidia.LocacaoMidiaServiceImpl;
import br.com.fean.poo2.locadora.control.socio.SocioServiceImpl;
import br.com.fean.poo2.locadora.modelo.locacaomidia.LocacaoMidia;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import br.com.fean.poo2.locadora.view.consultar.TelaListaCliente;
import br.com.fean.poo2.locadora.view.consultar.TelaListaClienteDevolucao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaDevolucao extends javax.swing.JPanel {
    
    private ArrayList<LocacaoMidia> locacaofilmes = null;
    LocacaoMidiaServiceImpl locacaoMidiaServiceImpl = new LocacaoMidiaServiceImpl();
    SocioServiceImpl socioServiceImpl = new SocioServiceImpl();

    public TelaDevolucao() {
        initComponents();
    }
    
    public void carregaListaLocacao(Socio socio) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Double valorfilme = 0.0;
        Double totalapagar = 0.0;
//        DefaultTableModel modeloTable = new DefaultTableModel();
//        modeloTable.addColumn("Codigo");
//        modeloTable.addColumn("Titulo");
//        modeloTable.addColumn("Data Locação");
//        modeloTable.addColumn("Data Devolução");
 //       modeloTable.addColumn("Valor");
        try {
            locacaofilmes = locacaoMidiaServiceImpl.retornarLocacao(socio);
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
                //locacaoMidia.getLocacao().getDtLocacao(),
                dateFormat.format(locacaoMidia.getLocacao().getDtLocacao()),
                dateFormat.format(locacaoMidia.getDtPrevDevolucao()),
                valorfilme});
            }
            tabela.setModel(modeloTable);
            //jTextField3.setText(String.valueOf(totalapagar));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na leitura dos dados de locação! \n \n  ERRO: " + e);
        }
    }
    
    public void setCodCliente(Integer codigo) {
        Integer id = codigo;
        txtCodigoCliente.setText(Integer.toString(codigo));
        Socio socio;
        try {
            socio = socioServiceImpl.retornarSocioId(id);
            carregaListaLocacao(socio);
        } catch (Exception ex) {
            Logger.getLogger(TelaDevolucao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNomeCliente(String nome) {
        txtNomeCliente.setText(nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDevolucao = new javax.swing.JPanel();
        painelCliente = new javax.swing.JPanel();
        nCodigoCliente = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        nNomeCliente = new javax.swing.JLabel();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        painelSaldoPagar = new javax.swing.JPanel();
        nSaldo = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        nTotalPagar = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        nMulta = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();

        painelDevolucao.setBorder(javax.swing.BorderFactory.createTitledBorder("Devolução"));

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

        painelSaldoPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo a Pagar"));

        nSaldo.setText("Saldo:");

        txtSaldo.setEnabled(false);

        nTotalPagar.setText("Total a Pagar:");

        txtTotalPagar.setEnabled(false);

        nMulta.setText("Multa:");

        txtMulta.setEnabled(false);

        javax.swing.GroupLayout painelSaldoPagarLayout = new javax.swing.GroupLayout(painelSaldoPagar);
        painelSaldoPagar.setLayout(painelSaldoPagarLayout);
        painelSaldoPagarLayout.setHorizontalGroup(
            painelSaldoPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaldoPagarLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(nSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nMulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nTotalPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSaldoPagarLayout.setVerticalGroup(
            painelSaldoPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaldoPagarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(painelSaldoPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSaldoPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nTotalPagar)
                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelSaldoPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nSaldo)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nMulta)
                        .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFinalizar.setText("Finalizar");

        javax.swing.GroupLayout painelDevolucaoLayout = new javax.swing.GroupLayout(painelDevolucao);
        painelDevolucao.setLayout(painelDevolucaoLayout);
        painelDevolucaoLayout.setHorizontalGroup(
            painelDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDevolucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDeRolagem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelDevolucaoLayout.createSequentialGroup()
                        .addComponent(painelSaldoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addComponent(btnFinalizar)))
                .addContainerGap())
        );
        painelDevolucaoLayout.setVerticalGroup(
            painelDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDevolucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(painelDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelSaldoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoClienteMouseClicked
        // chama a tela de lista de clientes

        TelaListaClienteDevolucao listaCliente;
        try {
            listaCliente = new TelaListaClienteDevolucao(TelaDevolucao.this);
            listaCliente.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaDevolucao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_txtCodigoClienteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel nCodigoCliente;
    private javax.swing.JLabel nMulta;
    private javax.swing.JLabel nNomeCliente;
    private javax.swing.JLabel nSaldo;
    private javax.swing.JLabel nTotalPagar;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JPanel painelDevolucao;
    private javax.swing.JPanel painelSaldoPagar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
