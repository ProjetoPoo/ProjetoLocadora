package br.com.fean.poo2.locadora.modelo.dependente;

import br.com.fean.poo2.locadora.modelo.dependente.*;
import br.com.fean.poo2.locadora.modelo.dependente.*;
import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import static br.com.fean.poo2.locadora.util.EntityManagerUtil.getEntityManager;
import static com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author Jaime Campos
 */
public class DependenteDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public void inserirDependente(Dependente dependente) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(dependente);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void alterarDependente(Dependente dependente) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(dependente);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void deletarDependente(Dependente dependente) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.remove(dependente);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public ArrayList<Dependente> pesquisaDependenteCodigo(int id) throws Exception {
        ArrayList<Dependente> lista = new ArrayList<Dependente>();
        Query query = entityManager.createQuery("select x from Dependente x where id like '%"+id+"%'");
        lista = (ArrayList<Dependente>) query.getResultList();
        return lista;
    }
    
    public ArrayList<Dependente> pesquisaDependenteNome(String nome) throws Exception {
        ArrayList<Dependente> lista = new ArrayList<Dependente>();
        Query query = entityManager.createQuery("select x from Dependente x where nome like '%"+nome+"%'");
        lista = (ArrayList<Dependente>) query.getResultList();
        return lista;
    }
    

    public ArrayList<Dependente> retornaDependentes() throws Exception {
        ArrayList<Dependente> lista = new ArrayList<Dependente>();
        Query query = entityManager.createQuery("select x from Dependente x");
        lista = (ArrayList<Dependente>) query.getResultList();
        return lista;
    }

    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }

}
