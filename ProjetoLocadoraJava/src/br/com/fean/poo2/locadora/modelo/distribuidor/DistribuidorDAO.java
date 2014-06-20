package br.com.fean.poo2.locadora.modelo.distribuidor;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DistribuidorDAO {
    
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();;
    public EntityManager getEntityManager(){
        return entityManager;
    }
    
    public void inserirDistribuidor (Distribuidor distribuidor){
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
    
    public void alterarDistribuidor (Distribuidor distribuidor){
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
    
    public void deletarDistribuidor (Distribuidor distribuidor){
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

    public Distribuidor retornarDistribuidor(Integer id){
        Session session = (Session) getEntityManager().getDelegate();
        return (Distribuidor) session.createCriteria(Distribuidor.class).add(Restrictions.eq("id", id)).uniqueResult();
    }
    
    public ArrayList<Distribuidor> retornarDistribuidores(){
        Session session = (Session) getEntityManager().getDelegate();
        return (ArrayList<Distribuidor>) session.createCriteria(Distribuidor.class).list();
}
    
    private void close(){
    }
    
}

