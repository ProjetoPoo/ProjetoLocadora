
package br.com.fean.poo2.locadora.view.cadastro.cliente;


import br.com.fean.poo2.locadora.control.socio.SocioServiceImpl;
import br.com.fean.poo2.locadora.view.consultar.TelaListaCliente;

import java.awt.CardLayout;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TelaCadastroCliente extends javax.swing.JPanel {

    private CardLayout cardLayout;
    private JPanel painelCardLayout;
    
    private int idCliente = 0;
    
    SocioServiceImpl socioServiceImpl = new SocioServiceImpl();

    public TelaCadastroCliente() {
        initComponents();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        dataNascimento = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        foneComercial = new javax.swing.JLabel();
        txtTelefoneComercial = new javax.swing.JTextField();
        foneResidencial = new javax.swing.JLabel();
        txtTelefoneResidencial = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        codigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        empresa = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEndereco = new javax.swing.JTextArea();
        contato = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        txtDataNascimento = new com.toedter.calendar.JDateChooser();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Cliente"));

        nome.setText("Nome:");

        cpf.setText("CPF:");

        dataNascimento.setText("Data Nascimento:");

        endereco.setText("Endereço:");

        sexo.setText("Sexo:");

        foneComercial.setText("Telefone:");

        foneResidencial.setText("Telefone Residencial:");

        codigo.setText("Código:");

        txtCodigo.setEnabled(false);

        empresa.setText("Empresa:");

        txtEndereco.setColumns(20);
        txtEndereco.setRows(5);
        jScrollPane1.setViewportView(txtEndereco);

        contato.setText("Contato:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(empresa)
                        .addGap(8, 8, 8)
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foneComercial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContato))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(codigo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sexo))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(endereco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(cpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dataNascimento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(foneResidencial)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpf)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataNascimento)
                        .addComponent(foneResidencial)
                        .addComponent(txtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foneComercial)
                    .addComponent(txtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresa)
                    .addComponent(contato)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnDeletar, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // pesquisar
        TelaListaCliente telaCliente;
        try {
            telaCliente = new TelaListaCliente();
            telaCliente.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // botao novo
        idCliente = 0;        
        btnSalvar.setVisible(true);
        btnCancelar.setVisible(true);
        btnDeletar.setVisible(false);        
        limparCamposDeTexto();
        editarCamposDeTexto();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // botão salvar
        
        if ((txtNome.getText().length() == 0) && (txtSexo.getText().length() == 0) && (txtCPF.getText().length() == 0 && (txtTelefoneResidencial.getText().length() == 0))) {
            JOptionPane.showMessageDialog(null, "Campos Obrigatórios!");
        } else if (txtEmpresa.getText().length() == 0 && txtTelefoneComercial.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha os Campos Empresa e Telefone Comercial!");
        } else {

            if (idCliente == 0) {
                try {
                    socioServiceImpl.inserirSocio(
                            txtNome.getText(),
                            Integer.parseInt(txtSexo.getText()),
                            txtCPF.getText(),
                            Date.valueOf(txtDataNascimento.getText()),
                            txtTelefoneResidencial.getText(),                            
                            txtEndereco.getText(),
                            txtEmpresa.getText(),
                            txtTelefoneComercial.getText()
                    );

                    JOptionPane.showMessageDialog(null, "Novo registro salvo!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar registro!\n \n ERRO: " + ex);
                } finally {
                    limparCamposDeTexto();
                }
            } else {
                try {
                    socioServiceImpl.alterarSocio(
                            txtNome.getText(),
                            Integer.parseInt(txtSexo.getText()),
                            txtCPF.getText(),
                            Date.valueOf(txtDataNascimento.getText()),
                            txtTelefoneResidencial.getText(),                            
                            txtEndereco.getText(),
                            txtEmpresa.getText(),
                            txtTelefoneComercial.getText()
                    );

                    JOptionPane.showMessageDialog(null, "Alteração realizada!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Alterar registro! \n \n Erro: " + ex);
                }
            }
        }
           
            limparCamposDeTexto();
            desabilitarBotoes();
            bloquearCamposDeTexto();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // botão deletar
        if (JOptionPane.showConfirmDialog(null, "Deseja Apagar Linha Selecionada?") == 0) {           
            try {                
                socioServiceImpl.deletarSocio(socioServiceImpl.retornarSocioId(idCliente));
                JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir Registro! \n \n ERRO: " + ex);
            }
        }
        
        limparCamposDeTexto();
        desabilitarBotoes();
        bloquearCamposDeTexto();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // botão cancelar
        limparCamposDeTexto();
        bloquearCamposDeTexto();
        desabilitarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    
    
    
    // método limpar campos
    public void limparCamposDeTexto() {
        txtNome.setText("");
        txtSexo.setText("");
        txtCPF.setText("");
        txtDataNascimento.setText("");
        txtTelefoneResidencial.setText("");        
        txtEndereco.setText("");
        txtEmpresa.setText("");
        txtTelefoneComercial.setText("");
    }
    // método editar campos
    public void editarCamposDeTexto() {
        txtNome.setEnabled(true);
        txtSexo.setEnabled(true);
        txtCPF.setEnabled(true);
        txtDataNascimento.setEnabled(true);
        txtTelefoneResidencial.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtEmpresa.setEnabled(true);
        txtTelefoneComercial.setEnabled(true);
    }
    // método bloquear campos de texto
    public void bloquearCamposDeTexto() {
        txtNome.setEnabled(false);
        txtSexo.setEnabled(false);
        txtCPF.setEnabled(false);
        txtDataNascimento.setEnabled(false);
        txtTelefoneResidencial.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtEmpresa.setEnabled(false);
        txtTelefoneComercial.setEnabled(false);
    }
    // habilitar botões
    public void habilitarBotoes() {
        btnSalvar.setVisible(true);
        btnDeletar.setVisible(true);
        btnCancelar.setVisible(true);
    }
    // desabilitar botões
    public void desabilitarBotoes() {
        btnSalvar.setVisible(false);
        btnDeletar.setVisible(false);
        btnCancelar.setVisible(false);
    }
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel contato;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel dataNascimento;
    private javax.swing.JLabel empresa;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel foneComercial;
    private javax.swing.JLabel foneResidencial;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContato;
    private com.toedter.calendar.JDateChooser txtDataNascimento;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextArea txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefoneComercial;
    private javax.swing.JTextField txtTelefoneResidencial;
    // End of variables declaration//GEN-END:variables

}
