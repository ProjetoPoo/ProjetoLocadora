/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.locacao;

import br.com.fean.poo2.locadora.modelo.dependente.Dependente;
import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import br.com.fean.poo2.locadora.modelo.locacao.Locacao;
import br.com.fean.poo2.locadora.modelo.locacao.LocacaoDAO;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class LocacaoServiceImpl implements LocacaoService{
    
    LocacaoDAO locacaoDAO = new LocacaoDAO();

    @Override
    public void inserirLocacao(Locacao locacao) throws Exception {
        locacaoDAO.inserirLocacao(locacao);
    }

    @Override
    public void alterarLocacao(Integer id, Dependente dependentes, Funcionario funcionarios, Socio socios, Date data2, Date hora, Double valortotal) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarLocacao(Locacao locacao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Locacao retornarLocacao(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Locacao> retornarLocacao() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
