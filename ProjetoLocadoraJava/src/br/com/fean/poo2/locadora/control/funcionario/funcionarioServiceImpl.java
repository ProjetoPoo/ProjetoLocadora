package br.com.fean.poo2.locadora.control.funcionario;

import br.com.fean.poo2.locadora.modelo.funcionario.Funcionario;
import br.com.fean.poo2.locadora.modelo.funcionario.FuncionarioDAO;
import java.util.ArrayList;

/**
 *
 * @author Linali
 */
public class FuncionarioServiceImpl implements FuncionarioService {

    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    @Override
    public void inserirFuncionario(String nome, String fone, String usuario, String senha) throws Exception {

        if (nome.length() > 3 && senha.length() >= 5) {

            Funcionario funcionario = new Funcionario();

            funcionario.setNome(nome);
            funcionario.setFone(fone);
            funcionario.setUsuario(usuario);
            funcionario.setSenha(senha);
            funcionarioDAO.inserirFuncionario(funcionario);
        }
    }

    @Override
    public void alterarFuncionario(Integer id, String nome, String fone, String usuario, String senha) throws Exception {

        Funcionario funcionario = new Funcionario();

        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setFone(fone);
        funcionario.setUsuario(usuario);
        funcionario.setSenha(senha);

        funcionarioDAO.alterarFuncionario(funcionario);
    }

    @Override
    public void deletarFuncionario(Funcionario funcionario) throws Exception {
        funcionarioDAO.deletarFuncionario(funcionario);
    }

    @Override
    public Funcionario retornarFuncionario(int id) throws Exception {
        return funcionarioDAO.retornarFuncionario(id);
    }

    @Override
    public Funcionario pesquisarFuncionario(String nome) throws Exception {
        return funcionarioDAO.pesquisarFuncionario(nome);
    }

    @Override
    public ArrayList<Funcionario> pesquisarFuncionarioNome(String nome) throws Exception {
        return funcionarioDAO.pesquisarFuncionarioNome(nome);
    }

    @Override
    public ArrayList<Funcionario> retornarFuncionarios() throws Exception {
        return funcionarioDAO.retornarFuncionarios();
    }

}
