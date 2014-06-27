package br.com.fean.poo2.locadora.modelo.midia;

import br.com.fean.poo2.locadora.modelo.midia.*;
import br.com.fean.poo2.locadora.modelo.midia.*;
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
public class MidiaDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public void inserirMidia(Midia midia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.persist(midia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void alterarMidia(Midia midia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(midia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void deletarMidia(Midia midia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.remove(midia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public ArrayList<Midia> pesquisaMidiaCodigoLike(int id) throws Exception {
        ArrayList<Midia> lista = new ArrayList<Midia>();
        Query query = entityManager.createQuery("select x from Midia x where id like '%"+id+"%'");
        lista = (ArrayList<Midia>) query.getResultList();
        return lista;
    }
    
    public ArrayList<Midia> pesquisaMidiaCodigo(int id) throws Exception {
        ArrayList<Midia> lista = new ArrayList<Midia>();
        Query query = entityManager.createQuery("select x from Midia x where id = "+id+"");
        lista = (ArrayList<Midia>) query.getResultList();
        return lista;
    }
    
    public ArrayList<Midia> midiasPorTitulo(int codtitulo) throws Exception {
        ArrayList<Midia> lista = new ArrayList<Midia>();
        Query query = entityManager.createQuery("select x from Midia x where titulo like '%"+codtitulo+"%'");
        lista = (ArrayList<Midia>) query.getResultList();
        return lista;
    }

    public ArrayList<Midia> retornaMidias() throws Exception {
        ArrayList<Midia> lista = new ArrayList<Midia>();
        Query query = entityManager.createQuery("select x from Midia x");
        lista = (ArrayList<Midia>) query.getResultList();
        return lista;
    }

    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }

}
