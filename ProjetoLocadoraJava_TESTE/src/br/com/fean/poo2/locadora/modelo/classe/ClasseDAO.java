/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.modelo.classe;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author Linali
 */
public class ClasseDAO {
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    public void inserirClasse(Classe classe) throws Exception{
        EntityTransaction tx = entityManager.getTransaction();
		 
        try {
            tx.begin();
            entityManager.persist(classe);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            
        }
    }
    
    public void alterarClasse(Classe classe) throws Exception{
    EntityTransaction tx = entityManager.getTransaction();
		 
        try {
            tx.begin();
            entityManager.merge(classe);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            
        }
        
    }
   public void deletarClasse(Classe classe) throws Exception{
    
EntityTransaction tx = entityManager.getTransaction();
		 
        try {
            tx.begin();
            entityManager.remove(classe);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            
        }
        
    }

   public Classe retornarClasse(int id) throws Exception{
   
    Classe classe = null;
    try {
            classe = entityManager.find(Classe.class, id);
    } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
    }
            return classe;   
       
   

   }
   public Classe retornarClasse(String nome) throws Exception{
   
    Classe classe = null;
    try {
            classe = entityManager.find(Classe.class, nome);
    } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
    }
            return classe;  

   }
   public ArrayList<Classe> retornarClasses() throws Exception{
    ArrayList<Classe> lista = new ArrayList<Classe>();   
    Query query = entityManager.createQuery("select x from Classe x");
    lista = (ArrayList<Classe>) 
            query.getResultList();
    return lista;

   }
    
}

    
