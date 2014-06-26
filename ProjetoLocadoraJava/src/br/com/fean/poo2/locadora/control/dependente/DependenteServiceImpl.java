
package br.com.fean.poo2.locadora.control.dependente;

import br.com.fean.poo2.locadora.modelo.dependente.Dependente;
import br.com.fean.poo2.locadora.modelo.dependente.DependenteDAO;
import java.util.ArrayList;

public class DependenteServiceImpl implements DependenteService{
    
    DependenteDAO dependenteDAO = new DependenteDAO();

    @Override
    public void inserirDependente(String nome) throws Exception {
        Dependente dependente = new Dependente();
        dependente.setNome(nome);        
        dependenteDAO.inserirDependente(dependente);   
    }

    @Override
    public void alterarDependente(Integer id, String nome) throws Exception {
        Dependente dependente = new Dependente();
        dependente.setId(id);
        dependente.setNome(nome);  
        dependenteDAO.alterarDependente(dependente); 
    }

    @Override
    public void deletarDependente(Dependente dependente) throws Exception {
        dependenteDAO.deletarDependente(dependente);
    }

    @Override
    public Dependente retornarDependente(String nome) throws Exception {
        return dependenteDAO.retornarDependente(nome);
    }

    @Override
    public Dependente retornarDependente(int id) throws Exception {
        return dependenteDAO.retornarDependente(id);
    }

    @Override
    public ArrayList<Dependente> retornarTodosDependentes() throws Exception {
        return dependenteDAO.retornarTodosDependentes();
    }

    @Override
    public ArrayList<Dependente> pesquisarDependenteNome(String nome) throws Exception {
        return dependenteDAO.pesquisarDependenteNome(nome);
    }

    @Override
    public Dependente pesquisarDependenteId(String id) throws Exception {
        return dependenteDAO.pesquisarDependenteId(id);
    }
}