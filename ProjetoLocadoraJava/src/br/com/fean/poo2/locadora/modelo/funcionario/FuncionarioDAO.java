package br.com.fean.poo2.locadora.modelo.funcionario;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import static br.com.fean.poo2.locadora.util.EntityManagerUtil.getEntityManager;
import static com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author Linali
 */
public class FuncionarioDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public void inserirFuncionario(Funcionario funcionario) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.persist(funcionario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void alterarFuncionario(Funcionario funcionario) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(funcionario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }

    }

    public void deletarFuncionario(Funcionario funcionario) throws Exception {

        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.remove(funcionario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }

    }

    public Funcionario retornarFuncionario(int id) throws Exception {

        Funcionario funcionario = null;

        try {
            funcionario = entityManager.find(Funcionario.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return funcionario;

    }

    public Funcionario pesquisarFuncionario(String nome) throws Exception {

        Funcionario funcionario = null;

        try {
            funcionario = entityManager.find(Funcionario.class, nome);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return funcionario;

    }

    public ArrayList<Funcionario> pesquisarFuncionarioNome(String nome) throws Exception {
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        Query query = entityManager.createQuery("select x from Funcionario x where nome like '%"+nome+"%'");
        lista = (ArrayList<Funcionario>) query.getResultList();
        return lista;

    }
    
    public ArrayList<Funcionario> retornarFuncionarios() throws Exception {
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        Query query = entityManager.createQuery("select x from Funcionario x");
        lista = (ArrayList<Funcionario>) query.getResultList();
        return lista;

    }

    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }

}
