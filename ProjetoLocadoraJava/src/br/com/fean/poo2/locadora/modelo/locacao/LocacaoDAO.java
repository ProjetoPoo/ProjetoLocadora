package br.com.fean.poo2.locadora.modelo.locacao;

import br.com.fean.poo2.locadora.modelo.locacao.Locacao;
import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import static br.com.fean.poo2.locadora.util.EntityManagerUtil.getEntityManager;
import static com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaime Campos
 */
public class LocacaoDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    // método para inseir o sócio
    public void inserirLocacao(Locacao locacao) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(locacao);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    //método para alterar sócio
    public void alterarLocacao(Locacao locacao) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(locacao);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    // método de deletar locacao
    public void deletarLocacao(Locacao locacao) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(locacao);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public ArrayList<Locacao> pesquisaLocacaoCodigo(int id) throws Exception {
        ArrayList<Locacao> lista = new ArrayList<Locacao>();
        Query query = entityManager.createQuery("select x from Locacao x where id like '%" + id + "%'");
        lista = (ArrayList<Locacao>) query.getResultList();
        return lista;
    }

    public Locacao pesquisaLocacaoId(int id) throws Exception {
        Locacao locacao = null;
        try {
            locacao = entityManager.find(Locacao.class, id);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO ao Retornar Sócios Pelo ID" + ex);
        }
        return locacao;
    }

    public ArrayList<Locacao> retornaLocacaos() throws Exception {
        ArrayList<Locacao> lista = new ArrayList<Locacao>();
        Query query = entityManager.createQuery("select x from Locacao x");
        lista = (ArrayList<Locacao>) query.getResultList();
        return lista;
    }

 


    // método que retorna um array de todos os locacao
    public ArrayList<Locacao> retornarTodosLocacao() throws Exception {
        ArrayList<Locacao> lista = new ArrayList<Locacao>();
        Query query = entityManager.createQuery("select x from locacao x");
        lista = (ArrayList<Locacao>) query.getResultList();
        return lista;
    }

    // metodo que pesquisa locacao pelo nome
    public ArrayList<Locacao> pesquisarLocacaoNome(String nome) throws Exception {
        ArrayList<Locacao> listaPesquisada = new ArrayList<Locacao>();
        Query query = entityManager.createQuery("select x from locacao x");
        listaPesquisada = (ArrayList<Locacao>) query.getResultList();
        return listaPesquisada;
    }


    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }

}
