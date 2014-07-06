
package br.com.fean.poo2.locadora.view.cadastro.cliente;


import br.com.fean.poo2.locadora.control.socio.SocioServiceImpl;
import br.com.fean.poo2.locadora.view.cadastro.dependente.TelaCadastroDependente;
import br.com.fean.poo2.locadora.view.consultar.TelaListaCliente;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TelaCadastroCliente extends javax.swing.JPanel {

    private CardLayout cardLayout;
    private JPanel painelCardLayout;
    
    private int idCliente = 0;
    
    SocioServiceImpl socioServiceImpl = new SocioServiceImpl();
    
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date dataNascimento = new Date();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEndereco = new javax.swing.JTextArea();
        txtDataNascimento = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnDependente = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Cliente"));

        nome.setText("Nome:");

        cpf.setText("CPF:");

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

        jLabel1.setText("Data Nascimento:");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Feminino", "Masculino" }));
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(empresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(foneComercial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foneResidencial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneResidencial))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(endereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
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
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpf)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(foneResidencial)
                        .addComponent(txtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
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
                    .addComponent(empresa))
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

        btnDependente.setText("Dependete");
        btnDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDependenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDependente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDependente, btnPesquisar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnDependente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // pesquisar
        TelaListaCliente telaCliente;
        try {
            telaCliente = new TelaListaCliente();
            telaCliente.setEnabled(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // botao novo
        idCliente = 0;        
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(false);        
        limparCamposDeTexto();
        editarCamposDeTexto();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      /*  // botão salvar
        Date data = new Date();
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
                            txtDataNascimento.getDate(),
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
                            txtDataNascimento.getDate(),
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
              */
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

    private void btnDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDependenteActionPerformed
        // tela dependete
        TelaCadastroDependente telaDependete = new TelaCadastroDependente();
        telaDependete.setEnabled(true);
    }//GEN-LAST:event_btnDependenteActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // combo sexo
        if(comboSexo.getSelectedIndex() == 0){
            SocioServiceImpl socioServiceImp = new SocioServiceImpl();
            
            
            
            //DistribuidorServiceImpl distribuidorImpl = new DistribuidorServiceImpl();
            //listaDist = distribuidorImpl.pesquisaDistribuidorRazaoSocial(txtPesquisar.getText());
            
        }
    }//GEN-LAST:event_comboSexoActionPerformed

    
    
    
    
    // método limpar campos
    public void limparCamposDeTexto() {
        txtNome.setText("");
        //txtSexo.setText("");
        txtCPF.setText("");
        txtDataNascimento.setDate(dataNascimento);
        txtTelefoneResidencial.setText("");        
        txtEndereco.setText("");
        txtEmpresa.setText("");
        txtTelefoneComercial.setText("");
    }
    // método editar campos
    public void editarCamposDeTexto() {
        txtNome.setEnabled(true);
        //txtSexo.setEnabled(true);
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
        //txtSexo.setEnabled(false);
        txtCPF.setEnabled(false);
        txtDataNascimento.setEnabled(false);
        txtTelefoneResidencial.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtEmpresa.setEnabled(false);
        txtTelefoneComercial.setEnabled(false);
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
    private javax.swing.JButton btnDependente;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel codigo;
    private javax.swing.JComboBox comboSexo;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel empresa;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel foneComercial;
    private javax.swing.JLabel foneResidencial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private com.toedter.calendar.JDateChooser txtDataNascimento;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextArea txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefoneComercial;
    private javax.swing.JTextField txtTelefoneResidencial;
    // End of variables declaration//GEN-END:variables

}
