/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.modelo.locacaomidia;

import br.com.fean.poo2.locadora.modelo.socio.Socio;
import br.com.fean.poo2.locadora.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Alexandre
 */
public class LocacaoMidiaDAO {
    
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    public ArrayList<LocacaoMidia> retornaLocacaos(Socio socio) throws Exception {
        
        ArrayList<LocacaoMidia> lista = new ArrayList<LocacaoMidia>();
        Query query = entityManager.createQuery("select x from Locacao x where x.locacao.getSocio(:socio)");
        query.setParameter("socio", socio);
        lista = (ArrayList<LocacaoMidia>) query.getResultList();
        
        return lista;
    }

    
}
