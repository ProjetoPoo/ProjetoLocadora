package br.com.fean.poo2.locadora.view.telaprincipal;

import br.com.fean.poo2.locadora.view.cadastro.categoria.TelaCadastroCategoria;
import br.com.fean.poo2.locadora.view.cadastro.classe.TelaCadastroClasse;
import br.com.fean.poo2.locadora.view.cadastro.cliente.TelaCadastroCliente;
import br.com.fean.poo2.locadora.view.cadastro.distribuidor.TelaCadastroDistribuidor;
import br.com.fean.poo2.locadora.view.cadastro.funcionario.TelaCadastroFuncionario;
import br.com.fean.poo2.locadora.view.cadastro.midia.TelaCadastroMidia;
import br.com.fean.poo2.locadora.view.cadastro.tipomidia.TelaCadastroTipoMidia;
import br.com.fean.poo2.locadora.view.cadastro.titulo.TelaCadastroTitulo;
import br.com.fean.poo2.locadora.view.consultar.TelaListaCliente;
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

public class TelaPrincipal extends javax.swing.JFrame {

    private CardLayout cardLayout;

    private JPanel painelCardLayout;

    public TelaPrincipal() {
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

            painelCardLayout.add(new TelaCadastroCategoria(), "telaCadastroCategoria");
            painelCardLayout.add(new TelaCadastroCliente(), "telaCadastroCliente");
            painelCardLayout.add(new TelaCadastroDistribuidor(), "telaCadastroDistribuidor");
            painelCardLayout.add(new TelaCadastroTipoMidia(), "telaCadastroTipoMidia");
            painelCardLayout.add(new TelaCadastroFuncionario(), "telaCadastroFuncionario");
            painelCardLayout.add(new TelaCadastroClasse(), "telaCadastroClasse");
            painelCardLayout.add(new TelaCadastroMidia(), "telaCadastroMidia");
            painelCardLayout.add(new TelaCadastroTitulo(), "telaCadastroTitulo");

            painelCardLayout.add(new TelaReserva(), "telaReserva");
            painelCardLayout.add(new TelaLocacao(), "telaLocacao");
            painelCardLayout.add(new TelaDevolucao(), "telaDevolucao");

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
        menuAcoes = new javax.swing.JMenuBar();
        mLocacao = new javax.swing.JMenu();
        mDevolucao = new javax.swing.JMenu();
        mReserva = new javax.swing.JMenu();
        mCadastro = new javax.swing.JMenu();
        miCategoria = new javax.swing.JMenuItem();
        miCliente = new javax.swing.JMenuItem();
        miDistribuidor = new javax.swing.JMenuItem();
        miTiposMidia = new javax.swing.JMenuItem();
        miFuncionario = new javax.swing.JMenuItem();
        miClasse = new javax.swing.JMenuItem();
        miMidia = new javax.swing.JMenuItem();
        miTitulo = new javax.swing.JMenuItem();
        mConsultar = new javax.swing.JMenu();
        miConsultarClientes = new javax.swing.JMenuItem();
        miConsultarFilmes = new javax.swing.JMenuItem();
        mSobre = new javax.swing.JMenu();
        mSair = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu4.setText("jMenu4");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video Locadora Passa Tempo");

        mLocacao.setText("Locação");
        mLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mLocacaoMouseClicked(evt);
            }
        });
        menuAcoes.add(mLocacao);

        mDevolucao.setText("Devolução");
        mDevolucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mDevolucaoMouseClicked(evt);
            }
        });
        menuAcoes.add(mDevolucao);

        mReserva.setText("Reserva");
        mReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mReservaMouseClicked(evt);
            }
        });
        menuAcoes.add(mReserva);

        mCadastro.setText("Cadastro");

        miCategoria.setText("Categoria");
        miCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCategoriaActionPerformed(evt);
            }
        });
        mCadastro.add(miCategoria);

        miCliente.setText("Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        mCadastro.add(miCliente);

        miDistribuidor.setText("Distribuidor");
        miDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDistribuidorActionPerformed(evt);
            }
        });
        mCadastro.add(miDistribuidor);

        miTiposMidia.setText("Tipos de mídia");
        miTiposMidia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTiposMidiaActionPerformed(evt);
            }
        });
        mCadastro.add(miTiposMidia);

        miFuncionario.setText("Funcionário");
        miFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncionarioActionPerformed(evt);
            }
        });
        mCadastro.add(miFuncionario);

        miClasse.setText("Classe");
        miClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClasseActionPerformed(evt);
            }
        });
        mCadastro.add(miClasse);

        miMidia.setText("Mídia");
        miMidia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMidiaActionPerformed(evt);
            }
        });
        mCadastro.add(miMidia);

        miTitulo.setText("Título");
        miTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTituloActionPerformed(evt);
            }
        });
        mCadastro.add(miTitulo);

        menuAcoes.add(mCadastro);

        mConsultar.setText("Consultar");

        miConsultarClientes.setText("Clientes");
        miConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarClientesActionPerformed(evt);
            }
        });
        mConsultar.add(miConsultarClientes);

        miConsultarFilmes.setText("Filmes");
        miConsultarFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarFilmesActionPerformed(evt);
            }
        });
        mConsultar.add(miConsultarFilmes);

        menuAcoes.add(mConsultar);

        mSobre.setText("Sobre");
        mSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSobreMouseClicked(evt);
            }
        });
        menuAcoes.add(mSobre);

        mSair.setText("Sair");
        mSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSairMouseClicked(evt);
            }
        });
        menuAcoes.add(mSair);

        setJMenuBar(menuAcoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSairMouseClicked
        //sair
        System.exit(0);
    }//GEN-LAST:event_mSairMouseClicked

    private void mLocacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mLocacaoMouseClicked
        // locação
        cardLayout.show(painelCardLayout, "telaLocacao");
    }//GEN-LAST:event_mLocacaoMouseClicked

    private void mDevolucaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mDevolucaoMouseClicked
        // devolução
        cardLayout.show(painelCardLayout, "telaDevolucao");

    }//GEN-LAST:event_mDevolucaoMouseClicked

// cadastros ........................................................................................................    
    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        // TODO add your handling code here:
        cardLayout.show(painelCardLayout, "telaCadastroCliente");
    }//GEN-LAST:event_miClienteActionPerformed

    private void miDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDistribuidorActionPerformed
        // tela de cadastro de distribuidor
        cardLayout.show(painelCardLayout, "telaCadastroDistribuidor");

    }//GEN-LAST:event_miDistribuidorActionPerformed

    private void miConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarClientesActionPerformed
        // tela de lista de cliente
        TelaListaCliente listaCliente;
        try {
            listaCliente = new TelaListaCliente();
            listaCliente.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_miConsultarClientesActionPerformed

    private void miConsultarFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarFilmesActionPerformed
        // tela lista filme
        TelaListaFilmes listaFilme;
        try {
            listaFilme = new TelaListaFilmes();
            listaFilme.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_miConsultarFilmesActionPerformed

    private void miCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCategoriaActionPerformed

        cardLayout.show(painelCardLayout, "telaCadastroCategoria");
    }//GEN-LAST:event_miCategoriaActionPerformed

    private void mReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mReservaMouseClicked
        cardLayout.show(painelCardLayout, "telaReserva");
    }//GEN-LAST:event_mReservaMouseClicked

    private void mSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSobreMouseClicked
        // Sobre
        JOptionPane.showMessageDialog(null, "FEAN - Faculdades Energia de Administração e Negocio \n\n"
                + "Sistema desenvolvido pela equipe 2.", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mSobreMouseClicked

    private void miTiposMidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTiposMidiaActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroTipoMidia");
    }//GEN-LAST:event_miTiposMidiaActionPerformed

    private void miFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFuncionarioActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroFuncionario");
    }//GEN-LAST:event_miFuncionarioActionPerformed

    private void miClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClasseActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroClasse");
    }//GEN-LAST:event_miClasseActionPerformed

    private void miMidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMidiaActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroMidia");
    }//GEN-LAST:event_miMidiaActionPerformed

    private void miTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTituloActionPerformed
        cardLayout.show(painelCardLayout, "telaCadastroTitulo");
    }//GEN-LAST:event_miTituloActionPerformed
//........................................................................................................................

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mConsultar;
    private javax.swing.JMenu mDevolucao;
    private javax.swing.JMenu mLocacao;
    private javax.swing.JMenu mReserva;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenu mSobre;
    private javax.swing.JMenuBar menuAcoes;
    private javax.swing.JMenuItem miCategoria;
    private javax.swing.JMenuItem miClasse;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miConsultarClientes;
    private javax.swing.JMenuItem miConsultarFilmes;
    private javax.swing.JMenuItem miDistribuidor;
    private javax.swing.JMenuItem miFuncionario;
    private javax.swing.JMenuItem miMidia;
    private javax.swing.JMenuItem miTiposMidia;
    private javax.swing.JMenuItem miTitulo;
    // End of variables declaration//GEN-END:variables
}
