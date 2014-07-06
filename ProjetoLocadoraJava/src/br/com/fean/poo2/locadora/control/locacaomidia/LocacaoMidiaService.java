/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.locacaomidia;

import br.com.fean.poo2.locadora.modelo.locacaomidia.LocacaoMidia;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public interface LocacaoMidiaService {
    
    public void inserirLocacaoMidia(LocacaoMidia locacaomidia) throws Exception;//Inserir

    public void alterarLocacaoMidia() throws Exception;//Alterar

    public void deletarLocacaoMidia() throws Exception;//Apagar

    
}
