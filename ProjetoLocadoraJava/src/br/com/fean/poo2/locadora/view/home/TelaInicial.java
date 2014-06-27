package br.com.fean.poo2.locadora.view.home;

import br.com.fean.poo2.locadora.view.cadastro.categoria.TelaCadastroCategoria;
import br.com.fean.poo2.locadora.view.cadastro.classe.TelaCadastroClasse;
import br.com.fean.poo2.locadora.view.cadastro.cliente.TelaCadastroCliente;
import br.com.fean.poo2.locadora.view.cadastro.distribuidor.TelaCadastroDistribuidor;
import br.com.fean.poo2.locadora.view.cadastro.filme.TelaCadastroFilme;
import br.com.fean.poo2.locadora.view.cadastro.funcionario.TelaCadastroFuncionario;
import br.com.fean.poo2.locadora.view.cadastro.midia.TelaCadastroMidia;
import br.com.fean.poo2.locadora.view.cadastro.tipomidia.TelaCadastroTipoMidia;
import br.com.fean.poo2.locadora.view.cadastro.titulo.TelaCadastroTitulo;

import br.com.fean.poo2.locadora.view.consultar.TelaListaCliente;
import br.com.fean.poo2.locadora.view.consultar.TelaListaDependente;
import br.com.fean.poo2.locadora.view.consultar.TelaListaFilmes;
import br.com.fean.poo2.locadora.view.devolver.TelaDevolucao;
import br.com.fean.poo2.locadora.view.locar.TelaLocacao;
import br.com.fean.poo2.locadora.view.resevar.TelaReserva;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaInicial extends javax.swing.JFrame {

    private CardLayout cardLayout;

    private JPanel painelCardLayout;

    public TelaInicial() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    private void init() {
        setLayout(new BorderLayout());
        add(getCardLayout(), BorderLayout.CENTER);
    }

    private JPanel getCardLayout() {
        if (painelCardLayout == null) {
            cardLayout = new CardLayout();
            painelCardLayout = new JPanel();
            painelCardLayout.setLayout(cardLayout);

            painelCardLayout.add(new TelaCadastroTitulo(), "telaCadastroTitulo");
            painelCardLayout.add(new TelaCadastroMidia(), "telaCadastroMidia");
            painelCardLayout.add(new TelaCadastroClasse(), "telaCadastroClasse");
            painelCardLayout.add(new TelaCadastroFuncionario(), "telaCadastroFuncionario");
            painelCardLayout.add(new TelaCadastroTipoMidia(), "telaCadastroTipoMidia");
            painelCardLayout.add(new TelaReserva(), "telaReserva");
            painelCardLayout.add(new TelaLocacao(), "telaLocacao");
            painelCardLayout.add(new TelaDevolucao(), "telaDevolucao");
            painelCardLayout.add(new TelaCadastroFilme(), "telaCadastroFilme");
            painelCardLayout.add(new TelaCadastroDistribuidor(), "telaCadastroDistribuidor");
            painelCardLayout.add(new TelaCadastroCliente(), "telaCadastroCliente");
            painelCardLayout.add(new TelaCadastroCategoria(), "telaCadastroCategoria");
            painelCardLayout.add(new JPanel(), "principal");
            cardLayout.show(painelCardLayout, "principal");
            painelCardLayout.setBackground(Color.GREEN);

            return painelCardLayout;
        } else {
            return painelCardLayout;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        locacao = new javax.swing.JMenu();
        devolucao = new javax.swing.JMenu();
        reserva = new javax.swing.JMenu();
        cadastros = new javax.swing.JMenu();
        categoria = new javax.swing.JMenuItem();
        cliente = new javax.swing.JMenuItem();
        distribuidor = new javax.swing.JMenuItem();
        filmes = new javax.swing.JMenuItem();
        tipoMidia = new javax.swing.JMenuItem();
        funcionario = new javax.swing.JMenuItem();
        classe = new javax.swing.JMenuItem();
        Midia = new javax.swing.JMenuItem();
        titulo = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        consultarCadastros = new javax.swing.JMenu();
        consultaCliente = new javax.swing.JMenuItem();
        consultaDependente = new javax.swing.JMenuItem();
        consultaFilme = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();
        sair = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu4.setText("jMenu4");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        locacao.setText("Locação");
        locacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locacaoMouseClicked(evt);
            }
        });
        jMenuBar1.add(locacao);

        devolucao.setText("Devolução");
        devolucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devolucaoMouseClicked(evt);
            }
        });
        jMenuBar1.add(devolucao);

        reserva.setText("Reserva");
        reserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservaMouseClicked(evt);
            }
        });
        jMenuBar1.add(reserva);

        cadastros.setText("Cadastro");

        categoria.setText("Categoria");
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        cadastros.add(categoria);

        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        cadastros.add(cliente);

        distribuidor.setText("Distribuidor");
        distribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distribuidorActionPerformed(evt);
            }
        });
        cadastros.add(distribuidor);

        filmes.setText("Filmes");
        filmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmesActionPerformed(evt);
            }
        });
        cadastros.add(filmes);

        tipoMidia.setText("Tipos de midia");
        tipoMidia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoMidiaActionPerformed(evt);
            }
        });
        cadastros.add(tipoMidia);

        funcionario.setText("Funcionário");
        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });
        cadastros.add(funcionario);

        classe.setText("Classe");
        classe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classeActionPerformed(evt);
            }
        });
        cadastros.add(classe);

        Midia.setText("Midia");
        Midia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MidiaActionPerformed(evt);
            }
        });
        cadastros.add(Midia);

        titulo.setText("Titulo");
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });
        cadastros.add(titulo);

        jMenuBar1.add(cadastros);
        jMenuBar1.add(jMenu8);

        consultarCadastros.setText("Consultar");

        consultaCliente.setText("Cliente");
        consultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaClienteActionPerformed(evt);
            }
        });
        consultarCadastros.add(consultaCliente);

        consultaDependente.setText("Dependente");
        consultaDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaDependenteActionPerformed(evt);
            }
        });
        consultarCadastros.add(consultaDependente);

        consultaFilme.setText("Filmes");
        consultaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaFilmeActionPerformed(evt);
            }
        });
        consultarCadastros.add(consultaFilme);

        jMenuBar1.add(consultarCadastros);

        sobre.setText("Sobre");
        sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(sobre);

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(916, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        //sair
        System.exit(0);
    }//GEN-LAST:event_sairMouseClicked

    private void locacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locacaoMouseClicked
        // locação
        cardLayout.show(painelCardLayout, "telaLocacao");
    }//GEN-LAST:event_locacaoMouseClicked

    private void devolucaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucaoMouseClicked
        // devolução
        cardLayout.show(painelCardLayout, "telaDevolucao");

    }//GEN-LAST:event_devolucaoMouseClicked

// cadastros ........................................................................................................    
    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
        cardLayout.show(painelCardLayout, "telaCadastroCliente");
    }//GEN-LAST:event_clienteActionPerformed

    private void filmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmesActionPerformed
        // TODO add your handling code here:
        cardLayout.show(painelCardLayout, "telaCadastroFilme");

    }//GEN-LAST:event_filmesActionPerformed

    private void distribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distribuidorActionPerformed
        // tela de cadastro de distribuidor
        cardLayout.show(painelCardLayout, "telaCadastroDistribuidor");

    }//GEN-LAST:event_distribuidorActionPerformed

    private void consultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaClienteActionPerformed
        // tela de lista de cliente
        TelaListaCliente listaCliente;
        try {
            listaCliente = new TelaListaCliente();
            listaCliente.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_consultaClienteActionPerformed

    private void consultaDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaDependenteActionPerformed
        // tela lista de dependetes
        TelaListaDependente listaDependente = new TelaListaDependente();
        listaDependente.setVisible(true);
    }//GEN-LAST:event_consultaDependenteActionPerformed

    private void consultaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaFilmeActionPerformed
        // tela lista filme
        TelaListaFilmes listaFilme;
        try {
            listaFilme = new TelaListaFilmes();
            listaFilme.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_consultaFilmeActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed

        cardLayout.show(painelCardLayout, "telaCadastroCategoria");
    }//GEN-LAST:event_categoriaActionPerformed

    private void reservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservaMouseClicked
        cardLayout.show(painelCardLayout, "telaReserva");
    }//GEN-LAST:event_reservaMouseClicked

    private void sobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreMouseClicked
        // Sobre
        JOptionPane.showMessageDialog(null, "FEAN - Faculdades Energia de Administração e Negocio \n\n"
                + "Sistema desenvolvido pela equipe 2.", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sobreMouseClicked

    private void tipoMidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoMidiaActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroTipoMidia");
    }//GEN-LAST:event_tipoMidiaActionPerformed

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroFuncionario");
    }//GEN-LAST:event_funcionarioActionPerformed

    private void classeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classeActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroClasse");
    }//GEN-LAST:event_classeActionPerformed

    private void MidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MidiaActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroMidia");
    }//GEN-LAST:event_MidiaActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroTitulo");
    }//GEN-LAST:event_tituloActionPerformed
//........................................................................................................................

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Midia;
    private javax.swing.JMenu cadastros;
    private javax.swing.JMenuItem categoria;
    private javax.swing.JMenuItem classe;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem consultaCliente;
    private javax.swing.JMenuItem consultaDependente;
    private javax.swing.JMenuItem consultaFilme;
    private javax.swing.JMenu consultarCadastros;
    private javax.swing.JMenu devolucao;
    private javax.swing.JMenuItem distribuidor;
    private javax.swing.JMenuItem filmes;
    private javax.swing.JMenuItem funcionario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu locacao;
    private javax.swing.JMenu reserva;
    private javax.swing.JMenu sair;
    private javax.swing.JMenu sobre;
    private javax.swing.JMenuItem tipoMidia;
    private javax.swing.JMenuItem titulo;
    // End of variables declaration//GEN-END:variables
}
