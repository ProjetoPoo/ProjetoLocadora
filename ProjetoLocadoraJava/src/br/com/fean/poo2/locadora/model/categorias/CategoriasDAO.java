package br.com.fean.poo2.locadora.model.categorias;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author Jaime Campos
 */
public class CategoriasDAO {
    
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public void inserirCategorias(Categorias categoria) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.persist(categoria);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {

        }
    }

    public void alterarCategorias(Categorias categoria) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.merge(categoria);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {

        }
    }

    public void deletarCategorias(Categorias categoria) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();

        try {
            tx.begin();
            entityManager.remove(categoria);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {

        }
    }

    public Categorias retornaCategorias(int idCategorias) throws Exception {
        
        Categorias categoria = null;
        try {
            categoria = entityManager.find(Categorias.class, idCategorias);
        } catch (Exception e) {
          
            e.printStackTrace();
        }
        return categoria;
    }

    public ArrayList<Categorias> retornaCategoriass() throws Exception {
        
        ArrayList<Categorias> lista = new ArrayList<Categorias>();
        Query query = entityManager.createQuery("select x from Categorias x");
        lista = (ArrayList<Categorias>) query.getResultList();
        return lista;
    }

}
