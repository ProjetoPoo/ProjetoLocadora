package br.com.fean.poo2.locadora.control.dependente;

import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.modelo.dependente.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DependenteServiceImpl implements DependenteService {

    DependenteDAO dependenteDAO = new DependenteDAO();

    @Override
    public void inserirDependente(String nome, Integer sexo, Date datanascimento) throws Exception {
        if(nome.length() > 3){ 
           Dependente dependente = new Dependente();
            dependente.setNome(nome);
            dependente.setSexo(sexo);
            dependente.setDatanascimento(datanascimento);
            dependenteDAO.inserirDependente(dependente);  
        }
    }

    @Override
    public void alterarDependente(String nome, Integer sexo, Date datanascimento) throws Exception {
        Dependente dependente = new Dependente();        
        dependente.setNome(nome); 
        dependente.setSexo(sexo);
        dependente.setDatanascimento(datanascimento);
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

    @Override
    public ArrayList<Dependente> pesquisaDependenteCodigo(Integer codigo) {
        ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
        try {
            dependentes = dependenteDAO.pesquisaDependenteCodigo(codigo);
        } catch (Exception ex) {
            Logger.getLogger(DependenteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dependentes;
    }

    @Override
    public ArrayList<Dependente> pesquisaDependenteNome(String nome) {
        ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
        try {
            dependentes = dependenteDAO.pesquisaDependenteNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(DependenteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dependentes;
    }

    @Override
    public ArrayList<Dependente> retornarDependentes() {
        ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
        try {
            dependentes = dependenteDAO.retornaDependentes();
        } catch (Exception ex) {
            Logger.getLogger(DependenteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dependentes;
    }

}
