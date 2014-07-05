/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.locacaomidia;

import br.com.fean.poo2.locadora.control.locacao.*;
import br.com.fean.poo2.locadora.modelo.dependente.Dependente;
import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import br.com.fean.poo2.locadora.modelo.locacao.Locacao;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexandre
 */
public interface LocacaoService {
    
    public void inserirLocacao(Locacao locacao) throws Exception;//Inserir

    public void alterarLocacao(Integer id, Dependente dependentes, Funcionario funcionarios, Socio socios, Date data2, Date hora, Double valortotal) throws Exception;//Alterar

    public void deletarLocacao(Locacao locacao) throws Exception;//Apagar

    public Locacao retornarLocacao(Integer id) throws Exception;//Retorna o categoria com o id passado

    public ArrayList<Locacao> retornarLocacao() throws Exception;//Retorna todo os registros  
    
    
}
