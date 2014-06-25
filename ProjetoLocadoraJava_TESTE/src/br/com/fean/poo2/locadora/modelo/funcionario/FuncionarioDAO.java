/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.modelo.funcionario;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
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
    
    public void inserirFuncionario(Funcionario funcionario) throws Exception{
        EntityTransaction tx = entityManager.getTransaction();
		 
        try {
            tx.begin();
            entityManager.persist(funcionario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            
        }
    }
    
    public void alterarFuncionario(Funcionario funcionario) throws Exception{
    EntityTransaction tx = entityManager.getTransaction();
		 
        try {
            tx.begin();
            entityManager.merge(funcionario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            
        }
        
    }
   public void deletarFuncionario(Funcionario funcionario) throws Exception{
    
EntityTransaction tx = entityManager.getTransaction();
		 
        try {
            tx.begin();
            entityManager.remove(funcionario);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            
        }
        
    }

   public Funcionario retornarFuncionario(int id) throws Exception{
   
    Funcionario funcionario = null;
    try {
            funcionario = entityManager.find(Funcionario.class, id);
    } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
    }
            return funcionario;   
       
   

   }
   public Funcionario retornarFuncionario(String nome) throws Exception{
   
    Funcionario funcionario = null;
    try {
            funcionario = entityManager.find(Funcionario.class, nome);
    } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
    }
            return funcionario;  

   }
   public ArrayList<Funcionario> retornarFuncionarios() throws Exception{
    ArrayList<Funcionario> lista = new ArrayList<Funcionario>();   
    Query query = entityManager.createQuery("select x from Funcionario x");
    lista = (ArrayList<Funcionario>) 
            query.getResultList();
    return lista;

   }
    
}

    
