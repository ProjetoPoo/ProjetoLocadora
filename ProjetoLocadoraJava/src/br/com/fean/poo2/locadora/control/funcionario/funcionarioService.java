package br.com.fean.poo2.locadora.control.funcionario;

import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Linali
 */
public interface FuncionarioService {

    public void inserirFuncionario(String nome, String fone, String usuario, String senha) throws Exception;

    public void alterarFuncionario(Integer id, String nome, String fone, String usuario, String senha) throws Exception;

    public void deletarFuncionario(Funcionario funcionario) throws Exception;

    public Funcionario retornarFuncionario(int id) throws Exception;

    public Funcionario pesquisarFuncionario(String nome) throws Exception;
    
    public ArrayList<Funcionario> pesquisarFuncionarioNome(String nome) throws Exception;

    public ArrayList<Funcionario> retornarFuncionarios() throws Exception;
}
