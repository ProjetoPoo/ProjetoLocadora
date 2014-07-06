
package br.com.fean.poo2.locadora.view.cadastro.dependente;

import br.com.fean.poo2.locadora.control.dependente.DependenteServiceImpl;
import br.com.fean.poo2.locadora.view.consultar.TelaListaCliente;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCadastroDependente extends javax.swing.JFrame {
    
    private int idDependente = 0;
    
    DependenteServiceImpl dependenteServiceImpl = new DependenteServiceImpl();

    public TelaCadastroDependente() {
        initComponents();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        codigoSocio = new javax.swing.JLabel();
        txtCodigoSocio = new javax.swing.JTextField();
        nomeSocio = new javax.swing.JLabel();
        txtNomeSocio = new javax.swing.JTextField();
        bPesquisarSocio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        codigoDependente01 = new javax.swing.JLabel();
        txtCodigoDependente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        comboSexo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDependete = new javax.swing.JTable();
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Dependente"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sócio"));

        codigoSocio.setText("Código:");

        txtCodigoSocio.setEnabled(false);

        nomeSocio.setText("Nome:");

        txtNomeSocio.setEnabled(false);

        bPesquisarSocio.setText("Pesquisar");
        bPesquisarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarSocioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codigoSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPesquisarSocio)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoSocio)
                    .addComponent(txtCodigoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeSocio)
                    .addComponent(txtNomeSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisarSocio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dependente 01"));

        codigoDependente01.setText("Código:");

        txtCodigoDependente.setEnabled(false);

        jLabel9.setText("Nome:");

        jLabel11.setText("Sexo:");

        jLabel13.setText("Data Nascimento:");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fenimino", "Masculino" }));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(codigoDependente01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoDependente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSexo, 0, 113, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoDependente01)
                    .addComponent(txtCodigoDependente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaDependete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Sócio", "Código", "Nome", "Sexo", "Data Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDependete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDependeteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDependete);
        if (tabelaDependete.getColumnModel().getColumnCount() > 0) {
            tabelaDependete.getColumnModel().getColumn(0).setMinWidth(80);
            tabelaDependete.getColumnModel().getColumn(0).setMaxWidth(80);
            tabelaDependete.getColumnModel().getColumn(1).setMinWidth(80);
            tabelaDependete.getColumnModel().getColumn(1).setMaxWidth(80);
            tabelaDependete.getColumnModel().getColumn(3).setMinWidth(80);
            tabelaDependete.getColumnModel().getColumn(3).setMaxWidth(80);
            tabelaDependete.getColumnModel().getColumn(4).setMinWidth(120);
            tabelaDependete.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void bPesquisarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarSocioActionPerformed
        try {
            // botão pesquisar sócio
            TelaListaCliente listaCliente = new TelaListaCliente();
            listaCliente.setEnabled(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroDependente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bPesquisarSocioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // botão cancelar
        limparCamposDeTexto();
        bloquearCamposDeTexto();
        desabilitarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // botão deletar
        if (JOptionPane.showConfirmDialog(null, "Deseja Apagar Linha Selecionada?") == 0) {           
            try {                
                dependenteServiceImpl.deletarDependente(dependenteServiceImpl.retornarDependente(idDependente));
                JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir Registro! \n \n ERRO: " + ex);
            }
        }
        
        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      /*  // botão salvar
        
        if ((txtNome.getText().length() == 0) && (txtSexo.getText().length() == 0)) {
            JOptionPane.showMessageDialog(null, "Campos Obrigatórios!");        
        } else {

            if (idDependente == 0) {
                try {
                    dependenteServiceImpl.inserirDependente(
                            txtNome.getText(),
                            Integer.parseInt(txtSexo.getText()),                            
                            Date.valueOf(txtDataNascimento.getText())
                    );

                    JOptionPane.showMessageDialog(null, "Novo Registro Salvo Com Sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposDeTexto();
                }
            } else {
                try {
                    dependenteServiceImpl.alterarDependente(
                            txtNome.getText(),
                            Integer.parseInt(txtSexo.getText()),                            
                            Date.valueOf(txtDataNascimento.getText())                           
                    );

                    JOptionPane.showMessageDialog(null, "Alteração Realizada Com Sucesso!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Alterar registro! \n \n Erro: " + ex);
                }
            }
        }
           
            limparCamposDeTexto();
            desabilitarBotoes();
            bloquearCamposDeTexto();
              */
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

    private void tabelaDependeteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDependeteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaDependeteMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // sair
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // combo sexo
       // if(comboSexo.lenth){
            
      //  }
    }//GEN-LAST:event_comboSexoActionPerformed

    
    
    
    
    
    // método limpar campos
    public void limparCamposDeTexto() {
        // dependente 01
        txtNome.setText("");
      //  txtSexo.setText("");       
      //  txtDataNascimento.setText("");        
    }
    // método editar campos
    public void editarCamposDeTexto() {
        // dependente 01
        txtNome.setEnabled(true);
      //  txtSexo.setEnabled(true);        
       // txtDataNascimento.setEnabled(true);             
    }
    // método bloquear campos de texto
    public void bloquearCamposDeTexto() {
        // dependente 01
        txtNome.setEnabled(false);
       // txtSexo.setEnabled(false);
       // txtDataNascimento.setEnabled(false);        
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
    private javax.swing.JButton bPesquisarSocio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel codigoDependente01;
    private javax.swing.JLabel codigoSocio;
    private javax.swing.JComboBox comboSexo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeSocio;
    private javax.swing.JTable tabelaDependete;
    private javax.swing.JTextField txtCodigoDependente;
    private javax.swing.JTextField txtCodigoSocio;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeSocio;
    // End of variables declaration//GEN-END:variables
}
