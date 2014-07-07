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
public interface DevolucaoService {
    
    /**
     * NOTAS:
     *
     * Nesta classe será criado a interface dos serviços de categoria.
     *
     */
    public void inserirDevolucao(Devolucao devolucao) throws Exception;//Inserir

    public void alterarDevolucao(Integer id, Funcionario funcionarios, LocacaoMidia locacaoMidia, Date data2, Date hora, Integer diasAtraso, Double multa, Double desconto, Double valor) throws Exception;//Alterar

    public void deletarDevolucao(Devolucao devoluvao) throws Exception;//Apagar

    public Devolucao retornarDevolucao(Integer id) throws Exception;//Retorna o categoria com o id passado

    public ArrayList<Devolucao> retornarDevolucao() throws Exception;//Retorna todo os registros
    
    public Devolucao calcularPagamento(int id) throws Exception;
    
}
