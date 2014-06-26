package br.com.fean.poo2.locadora.control.dependente;

import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.modelo.dependente.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DependenteServiceImpl implements DependenteService {

    DependenteDAO dependenteDAO = new DependenteDAO();

    @Override
    public void inserirDependente(Dependente dependente) {
        if (dependente.getNome().length() > 3) {
            try {
                dependenteDAO.inserirDependente(dependente);
            } catch (Exception ex) {
                Logger.getLogger(DependenteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void alterarDependente(Dependente dependente) {
        try {
            dependenteDAO.alterarDependente(dependente);
        } catch (Exception ex) {
            Logger.getLogger(DependenteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletarDependente(Dependente dependente) {
        try {
            dependenteDAO.deletarDependente(dependente);
        } catch (Exception ex) {
            Logger.getLogger(DependenteServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
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
