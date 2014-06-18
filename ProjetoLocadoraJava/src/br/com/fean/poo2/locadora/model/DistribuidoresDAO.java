package br.com.fean.poo2.locadora.model;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DistribuidoresDAO {
    
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();;
    public EntityManager getEntityManager(){
        return entityManager;
    }
    
    public void inserirDistribuidor (Distribuidores distribuidor){
        EntityTransaction tx = getEntityManager().getTransaction();
        try{
            tx.begin();
            getEntityManager().persist(distribuidor);
            tx.commit();
        }catch (Throwable t){
            t.printStackTrace();
            tx.rollback();
        }finally{
            close();
        }
    }
    
    public void alterarDistribuidor (Distribuidores distribuidor){
        EntityTransaction tx = getEntityManager().getTransaction();
        
    try{
        tx.begin();
        getEntityManager().merge(distribuidor);
        tx.commit();
    }catch (Throwable t){
        t.printStackTrace();
        tx.rollback();
    }finally{
        close();
    }    
    }
    
    public void deletarDistribuidor (Distribuidores distribuidor){
        EntityTransaction tx = getEntityManager().getTransaction();
    try{
        tx.begin();
        getEntityManager().remove(distribuidor);
        tx.commit();
    }catch (Throwable t){
        t.printStackTrace();
        tx.rollback();
    }finally{
        close();
}
}

    public Distribuidores retornarDistribuidor(Integer id){
        Session session = (Session) getEntityManager().getDelegate();
        return (Distribuidores) session.createCriteria(Distribuidores.class).add(Restrictions.eq("id", id)).uniqueResult();
    }
    
    public ArrayList<Distribuidores> retornarDistribuidores(){
        Session session = (Session) getEntityManager().getDelegate();
        return (ArrayList<Distribuidores>) session.createCriteria(Distribuidores.class).list();
}
    
    private void close(){
    }
    
}

