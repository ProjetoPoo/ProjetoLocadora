/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.tipomidia;

import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidia;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface TipoMidiaService {
    public void inserirTipoMidia(TipoMidia tipomidia) throws Exception;
    public void alterarTipoMidia(TipoMidia tipomidia) throws Exception;
    public void deletarTipoMidia(TipoMidia tipomidia) throws Exception;
    public TipoMidia retornarTipoMidia(int id) throws Exception;
    public TipoMidia retornarTipoMidia(String nome) throws Exception;
    public ArrayList<TipoMidia> retornarTipoMidia() throws Exception;
}
