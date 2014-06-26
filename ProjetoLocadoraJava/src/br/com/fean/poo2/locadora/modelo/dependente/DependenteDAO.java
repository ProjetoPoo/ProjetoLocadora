
package br.com.fean.poo2.locadora.modelo.dependente;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import static br.com.fean.poo2.locadora.util.EntityManagerUtil.getEntityManager;
import static com.sun.glass.ui.android.Activity.shutdown;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class DependenteDAO {
    
     private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
     
     // método para inseir o dependente
    public void inserirDependente(Dependente Dependente) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(Dependente);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }
    
    //método para alterar dependente
    public void alterarDependente(Dependente dependente) throws Exception{
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(dependente);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        }finally {
            close();
        }
    }
    
    // método de deletar Dependentes
    public void deletarDependente(Dependente dependente) throws Exception{
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(dependente);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        }finally {
            close();
        } 
    }
    
    // método para retornar dependentes pelo nome
    public Dependente retornarDependente(String nome) throws Exception{
        Dependente dependente = null;
        try {
            dependente = entityManager.find(Dependente.class, nome);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERRO ao Retornar Dependentes Pelo Nome - " +ex);
        }
        return dependente; 
    }
    
    // método de retornar dados pelo Id
    public Dependente retornarDependente(int id) throws Exception{
        Dependente dependente = null;
        try {
            dependente = entityManager.find(Dependente.class, id);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERRO ao Retornar Dependentes Pelo id - " +ex);
        }
        return dependente; 
    }
    
    // método que retorna um array de todos os Dependentes
    public ArrayList<Dependente> retornarTodosDependentes() throws Exception{
        ArrayList<Dependente> lista = new ArrayList<Dependente>();   
        Query query = entityManager.createQuery("select x from dependentes x");
        lista = (ArrayList<Dependente>)query.getResultList();
        return lista;
    }
    
    // metodo que pesquisa Dependentes pelo nome
    public ArrayList<Dependente> pesquisarDependenteNome(String nome) throws Exception{
        ArrayList<Dependente> listaPesquisada = new ArrayList<Dependente>();   
        Query query = entityManager.createQuery("select x from dependentes x");
        listaPesquisada = (ArrayList<Dependente>)query.getResultList();
        return listaPesquisada;
    }
    
    // método que pesquisa Dependentes pelo id
    public Dependente pesquisarDependenteId(String id) throws Exception{
        Dependente dependente = null;
        Query query = entityManager.createQuery("select x from dependentes x");
        dependente = entityManager.find(Dependente.class, id);
        return dependente;
   }
    
    // método de fechhamento de conexão com o banco de dados
    private void close() throws InterruptedException {
        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }
}