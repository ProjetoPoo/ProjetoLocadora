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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre
 */
public class DevolucaoServiceImpl implements DevolucaoService{
    
    DevolucaoDAO devolucaoDao = new DevolucaoDAO();
    LocacaoMidiaServiceImpl locacaoMidiaServiceImpl = new LocacaoMidiaServiceImpl();

    @Override
    public void inserirDevolucao(Devolucao devolucao) throws Exception {
                
        devolucaoDao.inserirDevolucao(devolucao);
        
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
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Devolucao devolucao = new Devolucao();
        LocacaoMidia locacaoMidia = locacaoMidiaServiceImpl.retornarLocacaoMidia(id);
        Date dataAtual = new Date();
        String conv = df.format(locacaoMidia.getDtPrevDevolucao());
        Date dataDevolucao = df.parse(conv);
       
        if (locacaoMidia.getDtPrevDevolucao().after(dataAtual)){
            // devolvento antes do prazo
            devolucao.setData2(dataAtual);
            devolucao.setLocacaoMidia(locacaoMidia);
            devolucao.setValor(locacaoMidia.getMidias().getTitulos().getClasses().getValor());
            devolucao.setMulta(0.00);
            
        } else{
            // devolvendo fora do prazo
            String a = String.valueOf(getDateDifference(locacaoMidia.getDtPrevDevolucao(),dataAtual));
            int atraso = Integer.parseInt(a);
            devolucao.setData2(dataAtual);
            devolucao.setLocacaoMidia(locacaoMidia);
            devolucao.setValor(locacaoMidia.getMidias().getTitulos().getClasses().getValor());
            devolucao.setDiasAtraso(atraso);
            double multa = locacaoMidia.getMidias().getTitulos().getClasses().getValor() * atraso;
            devolucao.setMulta(multa);
            
        } 
       
        return devolucao;
    }
    
    private long getDateDifference(Date date1, Date date2) {
        return ((date2.getTime()-date1.getTime())/86400000);
    } 
}
