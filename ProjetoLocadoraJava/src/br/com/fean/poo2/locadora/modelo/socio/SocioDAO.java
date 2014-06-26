package br.com.fean.poo2.locadora.modelo.socio;

import br.com.fean.poo2.locadora.modelo.socio.*;
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
public class SocioDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public void inserirSocio(Socio socio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(socio);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void alterarSocio(Socio socio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(socio);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void deletarSocio(Socio socio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.remove(socio);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public ArrayList<Socio> pesquisaSocioCodigo(int id) throws Exception {
        ArrayList<Socio> lista = new ArrayList<Socio>();
        Query query = entityManager.createQuery("select x from Socio x where id like '%"+id+"%'");
        lista = (ArrayList<Socio>) query.getResultList();
        return lista;
    }
    
public ArrayList<Socio> pesquisaSocioCPF(String cpf) throws Exception {
        ArrayList<Socio> lista = new ArrayList<Socio>();
        Query query = entityManager.createQuery("select x from Socio x where cpf like '%"+cpf+"%'");
        lista = (ArrayList<Socio>) query.getResultList();
        return lista;
    }
    
    public ArrayList<Socio> pesquisaSocioNome(String nome) throws Exception {
        ArrayList<Socio> lista = new ArrayList<Socio>();
        Query query = entityManager.createQuery("select x from Socio x where nome like '%"+nome+"%'");
        lista = (ArrayList<Socio>) query.getResultList();
        return lista;
    }
    

    public ArrayList<Socio> retornaSocios() throws Exception {
        ArrayList<Socio> lista = new ArrayList<Socio>();
        Query query = entityManager.createQuery("select x from Socio x");
        lista = (ArrayList<Socio>) query.getResultList();
        return lista;
    }

    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }

}
