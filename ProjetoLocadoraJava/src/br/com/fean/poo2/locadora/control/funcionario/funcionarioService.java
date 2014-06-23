/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fean.poo2.locadora.control.funcionario;

import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Linali
 */
public interface funcionarioService {
    public void inserirFuncionario(Funcionario funcionario)  throws Exception;
    public void alterarFuncionario(Funcionario funcionario) throws Exception;
    public void deletarFuncionario(Funcionario funcionario) throws Exception;
    public Funcionario retornarFuncionario(int id) throws Exception;
    public Funcionario retornarFuncionario(String nome) throws Exception;
    public ArrayList<Funcionario> retornarFuncionarios() throws Exception;  
    
}
