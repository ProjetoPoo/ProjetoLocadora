/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.locacaomidia;

import br.com.fean.poo2.locadora.modelo.locacaomidia.LocacaoMidia;
import br.com.fean.poo2.locadora.modelo.locacaomidia.LocacaoMidiaDAO;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class LocacaoMidiaServiceImpl implements LocacaoMidiaService{
    
    LocacaoMidiaDAO locacaoMidiaDao = new LocacaoMidiaDAO();

    @Override
    public void inserirLocacaoMidia(LocacaoMidia locacaomidia) throws Exception {
        locacaoMidiaDao.inserirLocacaoMidia(locacaomidia);
    }

    @Override
    public void alterarLocacaoMidia() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarLocacaoMidia() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<LocacaoMidia> retornarLocacao(Socio socio) throws Exception {
        
        ArrayList<LocacaoMidia> lista;
        lista = locacaoMidiaDao.retornaLocacaos(socio);
        return lista;
        
    }

    @Override
    public LocacaoMidia retornarLocacaoMidia(int id) throws Exception {
        LocacaoMidia locacaoMidia;
        locacaoMidia = locacaoMidiaDao.pesquisaLocacaoMidia(id);
        return locacaoMidia;
        
    }
    
}
