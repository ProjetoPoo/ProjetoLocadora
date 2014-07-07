/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.modelo.devolucao;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import static br.com.fean.poo2.locadora.util.EntityManagerUtil.getEntityManager;
import static com.mysql.jdbc.AbandonedConnectionCleanupThread.shutdown;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre
 */
public class DevolucaoDAO {
    
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    public Devolucao pesquisaDevolucao(int id) throws Exception {
        Devolucao devolucao = null;
        
        try {
            devolucao = entityManager.find(Devolucao.class, id);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO ao Retornar Devolução Pelo ID" + ex);
        }
        
        return devolucao;
    }
    
    public void inserirDevolucao(Devolucao devolucao) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(devolucao);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }
    
    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }
    
}
