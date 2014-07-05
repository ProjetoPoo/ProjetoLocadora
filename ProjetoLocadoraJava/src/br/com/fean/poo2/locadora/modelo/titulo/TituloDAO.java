package br.com.fean.poo2.locadora.modelo.titulo;

import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import static br.com.fean.poo2.locadora.util.EntityManagerUtil.getEntityManager;
import static com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class TituloDAO {
    
     private final EntityManager entityManager = EntityManagerUtil.getEntityManager();;
    public EntityManager getEntityManager(){
        return entityManager;
    }
    
    public void inserirTitulo (Titulo titulo) throws Exception {
        EntityTransaction tx = getEntityManager().getTransaction();
        try{
            tx.begin();
            getEntityManager().merge(titulo);
            tx.commit();
        }catch (Throwable t){
            t.printStackTrace();
            tx.rollback();
        }finally{
            close();
        }
    }
    
        public void alteraTitulo (Titulo titulo) throws Exception{
            EntityTransaction tx = getEntityManager().getTransaction();
            try{
                tx.begin();
                getEntityManager().merge(titulo);
                tx.commit();
            }catch (Throwable t){
                t.printStackTrace();
                tx.rollback();
            }finally{
                close();
            }
        }

        public void deletarTitulo (Titulo titulo) throws Exception{
            EntityTransaction tx = getEntityManager().getTransaction();
            try{
                tx.begin();
                getEntityManager().remove(titulo);
                tx.commit();
            }catch (Throwable t){
                t.printStackTrace();
                tx.rollback();
            }finally{
                close();
            }
        }
        
        public Titulo retornarTitulo(int id) throws Exception{
           Titulo titulo = null;
        try {
            titulo = entityManager.find(Titulo.class, id);
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            close();
        }
        return titulo;
    }

        public ArrayList<Titulo> retornarTitulos() throws Exception{
            ArrayList<Titulo> lista = new ArrayList<Titulo>();
            Query query = entityManager.createQuery("select x from titulos x");
            lista = (ArrayList<Titulo>) query.getResultList();
            return lista;
        }
        
        public ArrayList<Titulo> pesquisarCodigoTitulo(String id) throws Exception {
        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        Query query = entityManager.createQuery("select x from titulos x where id like '%" + id + "%'");
        lista = (ArrayList<Titulo>) query.getResultList();
        return lista;
        }
    
        public ArrayList<Titulo> pesquisarTituloFilme(String nome) throws Exception{
        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        Query query = entityManager.createQuery("select x from titulos x where nome like '%" + nome + "%'");
        lista = (ArrayList<Titulo>) query.getResultList();
        return lista;
        }
        
        private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }
}