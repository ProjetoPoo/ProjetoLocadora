/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.tipomidia;

import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidia;
import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidiaDAO;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TipoMidiaServiceImpl implements TipoMidiaService {
    
    TipoMidiaDAO tipomidiaDAO = new TipoMidiaDAO();
    

    @Override
    public void inserirTipoMidia(TipoMidia tipomidia) throws Exception {
        if (tipomidia.getNome().length() > 2) {
            tipomidiaDAO.inserirTipoMidia(tipomidia);
        }
    }

    @Override
    public void alterarTipoMidia(TipoMidia tipomidia) throws Exception {
        //TipoMidia tipomidia2 = new TipoMidia();
        //tipomidia2.setId(tipomidia.getId());
        //tipomidia2.setNome(tipomidia.getNome());
        tipomidiaDAO.alterarTipoMidia(tipomidia);
        
    }

    @Override
    public void deletarTipoMidia(TipoMidia tipomidia) throws Exception {
        tipomidiaDAO.deletarCurso(tipomidia);
    }

    @Override
    public TipoMidia retornarTipoMidia(int id) throws Exception {
        return tipomidiaDAO.retornarTipoMidia(id);
    }

    @Override
    public TipoMidia retornarTipoMidia(String nome) throws Exception {
        return tipomidiaDAO.retornarTipoMidia(nome);
    }

    @Override
    public ArrayList<TipoMidia> retornarTipoMidia() throws Exception {
        return tipomidiaDAO.retornarTipoMidias();
    }
    
    
}
