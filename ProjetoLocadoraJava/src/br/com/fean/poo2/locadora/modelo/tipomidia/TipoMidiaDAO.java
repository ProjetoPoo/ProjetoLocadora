package br.com.fean.poo2.locadora.modelo.tipomidia;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import static br.com.fean.poo2.locadora.util.EntityManagerUtil.getEntityManager;
import static com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public class TipoMidiaDAO {
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    public void inserirTipoMidia(TipoMidia tipomidia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(tipomidia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }
    
    public void alterarTipoMidia(TipoMidia tipomidia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(tipomidia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }
    
    public void deletarCurso(TipoMidia tipomidia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(tipomidia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public TipoMidia retornarTipoMidia(int id) throws Exception {
        TipoMidia tipomidia = null;
        try {
            tipomidia = entityManager.find(TipoMidia.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipomidia;
    }
    
    public TipoMidia retornarTipoMidia(String nome) throws Exception {
        TipoMidia tipomidia = null;
        try {
            tipomidia = entityManager.find(TipoMidia.class, nome);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipomidia;
    }
    
    public ArrayList<TipoMidia> retornarTipoMidias() throws Exception {
        ArrayList<TipoMidia> lista = new ArrayList<TipoMidia>();
        Query query = entityManager.createQuery("select x from TipoMidia x");
        lista = (ArrayList<TipoMidia>) query.getResultList();
        return lista;
    }
/*    
    public ArrayList<TipoMidia> retornarMidiasDoTipoMidias(TipoMidia tipoMidia) throws Exception {
        ArrayList<Midia> lista = new ArrayList<Midia>();
        Query query = entityManager.createQuery("from Midias m where m.tipoMidia = :tp");
        query.setParameter("tp", tipoMidia);
        lista = (ArrayList<TipoMidia>) query.getResultList();
        return lista;
    }
*/    
    private void close() throws InterruptedException {
        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }
}
