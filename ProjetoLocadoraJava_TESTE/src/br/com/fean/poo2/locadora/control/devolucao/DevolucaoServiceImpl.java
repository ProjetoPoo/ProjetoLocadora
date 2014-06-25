/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.devolucao;

import br.com.fean.poo2.locadora.modelo.devolucao.Devolucao;
import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import br.com.fean.poo2.locadora.modelo.locacaomidia.LocacaoMidia;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class DevolucaoServiceImpl implements DevolucaoService{

    @Override
    public void inserirDevolucao(Funcionario funcionarios, LocacaoMidia locacaoMidia, Date data2, Date hora, Integer diasAtraso, Double multa, Double desconto, Double valor) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarDevolucao(Integer id, Funcionario funcionarios, LocacaoMidia locacaoMidia, Date data2, Date hora, Integer diasAtraso, Double multa, Double desconto, Double valor) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarDevolucao(Devolucao devoluvao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Devolucao retornarDevolucao(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Devolucao> retornarDevolucao() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
