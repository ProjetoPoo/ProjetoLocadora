package br.com.fean.poo2.locadora.modelo.categoria;

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
public class CategoriaDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public void inserirCategorias(Categoria categoria) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(categoria);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void alterarCategorias(Categoria categoria) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(categoria);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void deletarCategorias(Categoria categoria) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.remove(categoria);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public Categoria retornaCategorias(int id) throws Exception {

        Categoria categoria = null;
        try {
            categoria = entityManager.find(Categoria.class, id);
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            close();
        }
        return categoria;
    }

    public ArrayList<Categoria> retornaCategoriass() throws Exception {

        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        Query query = entityManager.createQuery("select x from Categoria x");
        lista = (ArrayList<Categoria>) query.getResultList();
        return lista;
    }

    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }

}
