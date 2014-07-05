package br.com.fean.poo2.locadora.modelo.distribuidor;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import static br.com.fean.poo2.locadora.util.EntityManagerUtil.getEntityManager;
import static com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class DistribuidorDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public void inserirDistribuidor(Distribuidor distribuidor) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.persist(distribuidor);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void alterarDistribuidor(Distribuidor distribuidor) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(distribuidor);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void deletarDistribuidor(Distribuidor distribuidor) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.remove(distribuidor);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public Distribuidor retornarDistribuidor(Integer id) throws Exception {
        Distribuidor distribuidor = null;
        try {
            distribuidor = entityManager.find(Distribuidor.class, id);
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            close();
        }
        return distribuidor;
    }

    public ArrayList<Distribuidor> retornarDistribuidores() throws Exception {

        ArrayList<Distribuidor> lista = new ArrayList<Distribuidor>();
        Query query = entityManager.createQuery("select x from Distribuidor x");
        lista = (ArrayList<Distribuidor>) query.getResultList();
        return lista;
    }

    public ArrayList<Distribuidor> pesquisaDistribuidorNome(String razaoSocial) throws Exception {
        ArrayList<Distribuidor> lista = new ArrayList<Distribuidor>();
        Query query = entityManager.createQuery("select x from Distribuidor x where razaoSocial like '%" + razaoSocial + "%'");
        lista = (ArrayList<Distribuidor>) query.getResultList();
        return lista;
    }
    
    public ArrayList<Distribuidor> pesquisaDistribuidorCNPJ(String cnpj) throws Exception {
        ArrayList<Distribuidor> lista = new ArrayList<Distribuidor>();
        Query query = entityManager.createQuery("select x from Distribuidor x where cnpj like '%" + cnpj + "%'");
        lista = (ArrayList<Distribuidor>) query.getResultList();
        return lista;
    }

    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }

}
