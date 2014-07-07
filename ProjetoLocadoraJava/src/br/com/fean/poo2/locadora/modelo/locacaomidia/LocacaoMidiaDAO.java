/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.modelo.locacaomidia;

import br.com.fean.poo2.locadora.modelo.socio.Socio;
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
 * @author Alexandre
 */
public class LocacaoMidiaDAO {
    
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    public void inserirLocacaoMidia(LocacaoMidia locacaomidia) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(locacaomidia);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }
    
    public ArrayList<LocacaoMidia> retornaLocacaos(Socio socio) throws Exception {
        
        ArrayList<LocacaoMidia> lista = new ArrayList<LocacaoMidia>();
        String comando = "select lm from LocacaoMidia lm left join fetch lm.locacao as loc "
                + "where loc.socios.id = :socio";
        Query query = entityManager.createQuery(comando, LocacaoMidia.class);
        query.setParameter("socio", socio.getId());
        lista = (ArrayList<LocacaoMidia>) query.getResultList();
        
        return lista;
    }
    
    private void close() throws InterruptedException {

        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }
    
    public LocacaoMidia pesquisaLocacaoMidia(int id) throws Exception {
        LocacaoMidia locacaoMidia = null;
        
        try {
            locacaoMidia = entityManager.find(LocacaoMidia.class, id);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO ao Retornar Locacao Midia Pelo ID" + ex);
        }
        
        return locacaoMidia;
    }
    
}
