/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.funcionario;

import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import br.com.fean.poo2.locadora.modelo.funcionario.FuncionarioDAO;
import java.util.ArrayList;

/**
 *
 * @author Linali
 */
public class FuncionarioServiceImpl {
     FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    /**
     *
     * @param funcionario
     * @throws Exception
     */
    public void inserirFuncionario(Funcionario funcionario) throws Exception{
        if (funcionario.getNome().length()>3){
            funcionarioDAO.inserirFuncionario(funcionario);
        }
    }

    public void alterarFuncionario(Funcionario funcionario) throws Exception {
            funcionarioDAO.alterarFuncionario(funcionario);
    }

    public void deletarFuncionario(Funcionario funcionario) throws Exception {
        funcionarioDAO.deletarFuncionario(funcionario);
    }

    public Funcionario retornarFuncionario(int id) throws Exception {
        return funcionarioDAO.retornarFuncionario(id);
    }
     
    public Funcionario retornarFuncionario(String nome) throws Exception {
        return funcionarioDAO.retornarFuncionario(nome);
    }

   
    public ArrayList<Funcionario> retornarFuncionarios() throws Exception  {
        return funcionarioDAO.retornarFuncionarios();
    }
    public ArrayList<Funcionario> pesquisarFuncionarios(String nome) throws Exception  {
        //return alunoDAO.pesquisarFuncionarios(nome);
        return new ArrayList<Funcionario>();
    }
    
}

    
