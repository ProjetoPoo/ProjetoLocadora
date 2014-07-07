/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.modelo.devolucao;

import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import javax.persistence.EntityManager;
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
    
}
