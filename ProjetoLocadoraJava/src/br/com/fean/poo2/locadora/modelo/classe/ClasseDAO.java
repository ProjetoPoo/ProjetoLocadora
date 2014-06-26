package br.com.fean.poo2.locadora.modelo.classe;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import static br.com.fean.poo2.locadora.util.EntityManagerUtil.getEntityManager;
import static com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author Filipe
 */
public class ClasseDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public void inserirClasse(Classe classe) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(classe);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void alterarClasse(Classe classe) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(classe);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void deletarClasse(Classe classe) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.remove(classe);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public Classe retornarClasse(int id) throws Exception {

        Classe classe = null;
        try {
            classe = entityManager.find(Classe.class, id);
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            close();
        }
        return classe;
    }

    public ArrayList<Classe> retornarClasses() throws Exception {

        ArrayList<Classe> lista = new ArrayList<Classe>();
        Query query = entityManager.createQuery("select x from Classe x");
        lista = (ArrayList<Classe>) query.getResultList();
        return lista;
    }

    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }

}
