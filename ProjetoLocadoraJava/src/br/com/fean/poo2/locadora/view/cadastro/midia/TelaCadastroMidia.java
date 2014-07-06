package br.com.fean.poo2.locadora.view.cadastro.midia;

public class TelaCadastroMidia extends javax.swing.JPanel {

    public TelaCadastroMidia() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastroMidia = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        painelCadastroMidia.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Mídias"));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout painelCadastroMidiaLayout = new javax.swing.GroupLayout(painelCadastroMidia);
        painelCadastroMidia.setLayout(painelCadastroMidiaLayout);
        painelCadastroMidiaLayout.setHorizontalGroup(
            painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroMidiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeletar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        painelCadastroMidiaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnDeletar, btnNovo, btnSalvar});

        painelCadastroMidiaLayout.setVerticalGroup(
            painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroMidiaLayout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addGroup(painelCadastroMidiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroMidia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroMidia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
     
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      
        /* Para manter a uniformidade entre as mensagens utilizar:
        
        "Novo registro salvo com sucesso!"
        "Erro ao salvar registro!\n \n ERRO: "

        "Alteração realizada com sucesso!"     
        "Erro ao alterar registro! \n \n ERRO: "
        
        */
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
       
        /* Para manter a uniformidade entre as mensagens utilizar:
        
        "Deseja realmente apagar a linha selecionada?"
        "Registro deletado com sucesso!"
        "Erro ao deletar registro! \n \n ERRO: "
        
        */
        
    }//GEN-LAST:event_btnDeletarActionPerformed

    /* Na mensagem de erro da tabela utilizar:
    
    "Erro ao preencher a tabela! \n \n ERRO: "
    
    */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel painelCadastroMidia;
    // End of variables declaration//GEN-END:variables
}
