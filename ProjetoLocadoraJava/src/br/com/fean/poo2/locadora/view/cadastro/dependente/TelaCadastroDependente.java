package br.com.fean.poo2.locadora.view.cadastro.dependente;

import br.com.fean.poo2.locadora.control.dependente.DependenteServiceImpl;
import br.com.fean.poo2.locadora.modelo.dependente.Dependente;
import br.com.fean.poo2.locadora.view.consultar.TelaListaCliente;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroDependente extends javax.swing.JFrame {
    
    private int idDependente = 0;
    private int sexo;
    
    DependenteServiceImpl dependenteServiceImpl = new DependenteServiceImpl();

    public TelaCadastroDependente() {
        initComponents();
        retornarTodosDepenetes();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        painelCadastrarDependente = new javax.swing.JPanel();
        painelSocio = new javax.swing.JPanel();
        nCodigoSocio = new javax.swing.JLabel();
        txtCodigoSocio = new javax.swing.JTextField();
        nNomeSocio = new javax.swing.JLabel();
        txtNomeSocio = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        painelDependente = new javax.swing.JPanel();
        nCodigoDependente = new javax.swing.JLabel();
        txtCodigoDependente = new javax.swing.JTextField();
        nNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        nSexo = new javax.swing.JLabel();
        nDataNascimento = new javax.swing.JLabel();
        txtDataNascimento = new com.toedter.calendar.JDateChooser();
        cbSexo = new javax.swing.JComboBox();
        painelDeRolagem = new javax.swing.JScrollPane();
        tabelaDependente = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelCadastrarDependente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Dependente"));

        painelSocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Sócio"));

        nCodigoSocio.setText("Código:");

        txtCodigoSocio.setEnabled(false);

        nNomeSocio.setText("Nome:");

        txtNomeSocio.setEnabled(false);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSocioLayout = new javax.swing.GroupLayout(painelSocio);
        painelSocio.setLayout(painelSocioLayout);
        painelSocioLayout.setHorizontalGroup(
            painelSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSocioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nCodigoSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nNomeSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addContainerGap())
        );
        painelSocioLayout.setVerticalGroup(
            painelSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSocioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCodigoSocio)
                    .addComponent(txtCodigoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nNomeSocio)
                    .addComponent(txtNomeSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDependente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dependente 01"));

        nCodigoDependente.setText("Código:");

        txtCodigoDependente.setEnabled(false);

        nNome.setText("Nome:");

        nSexo.setText("Sexo:");

        nDataNascimento.setText("Data de Nascimento:");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fenimino", "Masculino" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDependenteLayout = new javax.swing.GroupLayout(painelDependente);
        painelDependente.setLayout(painelDependenteLayout);
        painelDependenteLayout.setHorizontalGroup(
            painelDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDependenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDependenteLayout.createSequentialGroup()
                        .addComponent(nCodigoDependente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoDependente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSexo, 0, 113, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(painelDependenteLayout.createSequentialGroup()
                        .addComponent(nDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelDependenteLayout.setVerticalGroup(
            painelDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDependenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCodigoDependente)
                    .addComponent(txtCodigoDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nDataNascimento)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaDependente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDependente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDependenteMouseClicked(evt);
            }
        });
        painelDeRolagem.setViewportView(tabelaDependente);
        if (tabelaDependente.getColumnModel().getColumnCount() > 0) {
            tabelaDependente.getColumnModel().getColumn(0).setMinWidth(80);
            tabelaDependente.getColumnModel().getColumn(0).setMaxWidth(80);
            tabelaDependente.getColumnModel().getColumn(2).setMinWidth(80);
            tabelaDependente.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        javax.swing.GroupLayout painelCadastrarDependenteLayout = new javax.swing.GroupLayout(painelCadastrarDependente);
        painelCadastrarDependente.setLayout(painelCadastrarDependenteLayout);
        painelCadastrarDependenteLayout.setHorizontalGroup(
            painelCadastrarDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarDependenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastrarDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDeRolagem)
                    .addGroup(painelCadastrarDependenteLayout.createSequentialGroup()
                        .addGroup(painelCadastrarDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(painelDependente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelCadastrarDependenteLayout.setVerticalGroup(
            painelCadastrarDependenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarDependenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

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

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCadastrarDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnDeletar, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastrarDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(753, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            // botão pesquisar sócio
            TelaListaCliente listaCliente = new TelaListaCliente();
            listaCliente.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroDependente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // botão cancelar
        limparCamposDeTexto();
        bloquearCamposDeTexto();
        desabilitarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // botão deletar
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar a linha selecionada?") == 0) {           
            try {                
                dependenteServiceImpl.deletarDependente(dependenteServiceImpl.retornarDependente(idDependente));
                retornarTodosDepenetes();
                JOptionPane.showMessageDialog(null, "Registro deletado com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar registro! \n \n ERRO: " + ex);
            }
        }
        
        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // botão salvar
        Dependente dependente = new Dependente (idDependente, txtNome.getText(), sexo, txtDataNascimento.getDate());
        if (txtNome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios!");        
        } else {

            if (idDependente == 0) {
                try {
                    dependenteServiceImpl.inserirDependente(dependente);

                    JOptionPane.showMessageDialog(null, "Novo registro salvo com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposDeTexto();
                }
            } else {
                try {
                    dependenteServiceImpl.alterarDependente(dependente);

                    JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar registro! \n \n ERRO: " + ex);
                }
            }
        }
        retornarTodosDepenetes();   
        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();
             
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // botão novo
        idDependente = 0;        
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(false);        
        limparCamposDeTexto();
        editarCamposDeTexto();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tabelaDependenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDependenteMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dependenteTebela = (DefaultTableModel) tabelaDependente.getModel();        
        idDependente = Integer.parseInt(dependenteTebela.getValueAt(tabelaDependente.getSelectedRow(), 0).toString());
        txtNome.setText(dependenteTebela.getValueAt(tabelaDependente.getSelectedRow(), 1).toString());
        cbSexo.setSelectedItem(dependenteTebela.getValueAt (tabelaDependente.getSelectedRow(), 2));
        
    }//GEN-LAST:event_tabelaDependenteMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // sair
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // combo sexo
       if (cbSexo.getSelectedIndex() == 0) {
            sexo = 0;//Feminino
        } else {
            sexo = 1;//Masculino
        }
    }//GEN-LAST:event_cbSexoActionPerformed
    
    
    public void retornarTodosDepenetes(){
        ArrayList<Dependente> lista = new ArrayList<Dependente>();
        try {
            lista = dependenteServiceImpl.retornarDependentes();
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"erro ao retornar todos os dependente" + ex);
        }
        carregarDadosTabela(lista);
    }      
    
    public void carregarDadosTabela(ArrayList<Dependente> lista){
        DefaultTableModel modelo = (DefaultTableModel) tabelaDependente.getModel();
        modelo.setRowCount( 0 );        
        try {
            for (int i=0;i<lista.size();i++){
                modelo.addRow(new Object[]{lista.get(i).getId(), 
                                           lista.get(i).getNome(),
                                           lista.get(i).getSexo()});  
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Erro - leitura de dados de Dependete com problema - "  +ex);
        }
    }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // método limpar campos
    public void limparCamposDeTexto() {
        // dependente 01
        txtNome.setText("");  
        
                
    }
    // método editar campos
    public void editarCamposDeTexto() {
        // dependente 01
        txtNome.setEnabled(true); 
        cbSexo.setEnabled(true);
        txtDataNascimento.setEnabled(true);
    }
    // método bloquear campos de texto
    public void bloquearCamposDeTexto() {
        // dependente 01
        txtNome.setEnabled(false);
        cbSexo.setEnabled(false);
        txtDataNascimento.setEnabled(false);        
    }
    // habilitar botões
    public void habilitarBotoes() {
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }
    // desabilitar botões
    public void desabilitarBotoes() {
        btnSalvar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbSexo;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel nCodigoDependente;
    private javax.swing.JLabel nCodigoSocio;
    private javax.swing.JLabel nDataNascimento;
    private javax.swing.JLabel nNome;
    private javax.swing.JLabel nNomeSocio;
    private javax.swing.JLabel nSexo;
    private javax.swing.JPanel painelCadastrarDependente;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JPanel painelDependente;
    private javax.swing.JPanel painelSocio;
    private javax.swing.JTable tabelaDependente;
    private javax.swing.JTextField txtCodigoDependente;
    private javax.swing.JTextField txtCodigoSocio;
    private com.toedter.calendar.JDateChooser txtDataNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeSocio;
    // End of variables declaration//GEN-END:variables
}
