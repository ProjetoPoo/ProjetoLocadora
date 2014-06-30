package br.com.fean.poo2.locadora.modelo.socio;

import br.com.fean.poo2.locadora.modelo.socio.*;
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


public class SocioDAO {
    
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    // método para inseir o sócio
    public void inserirSocio(Socio socio) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(socio);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    
    //método para alterar sócio
    public void alterarSocio(Socio socio) throws Exception{
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

    // método de deletar socio
    public void deletarSocio(Socio socio) throws Exception{
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

 
    
    // método de retornar dados pelo cpf
    public Socio retornarSocio(int cpf) throws Exception{
        Socio socio = null;
        try {
            socio = entityManager.find(Socio.class, cpf);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERRO ao Retornar Sócios Pelo CPF" +ex);
        }
        return socio; 
    }
    
    // método para retornar socio pelo nome
    public Socio retornarSocio(String nome) throws Exception{
        Socio socio = null;
        try {
            socio = entityManager.find(Socio.class, nome);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERRO ao Retornar Sócios Pelo Nome" +ex);
        }
        return socio; 
    }
    
    // método que retorna um array de todos os socio
    public ArrayList<Socio> retornarTodosSocio() throws Exception{
        ArrayList<Socio> lista = new ArrayList<Socio>();   
        Query query = entityManager.createQuery("select x from socio x");
        lista = (ArrayList<Socio>)query.getResultList();
        return lista;
    }
    
    // metodo que pesquisa socio pelo nome
    public ArrayList<Socio> pesquisarSocioNome(String nome) throws Exception{
        ArrayList<Socio> listaPesquisada = new ArrayList<Socio>();   
        Query query = entityManager.createQuery("select x from socio x");
        listaPesquisada = (ArrayList<Socio>)query.getResultList();
        return listaPesquisada;
    }
    
    // método que pesquisa sócio pelo cpf
    public Socio pesquisarSocioCPF(String cpf) throws Exception{
        Socio socio = null;
        Query query = entityManager.createQuery("select x from socio x");
        socio = entityManager.find(Socio.class, cpf);
        return socio;
   }
    
    
    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }    


}
