/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.devolucao;

import br.com.fean.poo2.locadora.control.locacaomidia.LocacaoMidiaServiceImpl;
import br.com.fean.poo2.locadora.modelo.devolucao.Devolucao;
import br.com.fean.poo2.locadora.modelo.devolucao.DevolucaoDAO;
import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import br.com.fean.poo2.locadora.modelo.locacaomidia.LocacaoMidia;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class DevolucaoServiceImpl implements DevolucaoService{
    
    DevolucaoDAO devolucaoDao = new DevolucaoDAO();
    LocacaoMidiaServiceImpl locacaoMidiaServiceImpl = new LocacaoMidiaServiceImpl();

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

    @Override
    public Devolucao calcularPagamento(int id) throws Exception {
        Devolucao devolucao = new Devolucao();
        LocacaoMidia locacaoMidia = locacaoMidiaServiceImpl.retornarLocacaoMidia(id);
        Date dataAtual = new Date();
        if (locacaoMidia.getDtPrevDevolucao().before(dataAtual)){
            // devolvento antes do prazo
            devolucao.setData2(dataAtual);
            devolucao.setLocacaoMidia(locacaoMidia);
            devolucao.setValor(locacaoMidia.getMidias().getTitulos().getClasses().getValor());
            devolucao.setMulta(1.00);
            
        } else{
            // devolvendo fora do prazo
        } 
       
        return devolucao;
    }
}
