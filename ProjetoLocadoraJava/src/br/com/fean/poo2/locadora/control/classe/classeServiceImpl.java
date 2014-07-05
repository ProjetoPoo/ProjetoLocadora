/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fean.poo2.locadora.control.classe;

import br.com.fean.poo2.locadora.modelo.classe.Classe;
import br.com.fean.poo2.locadora.modelo.classe.ClasseDAO;
import java.util.ArrayList;

/**
 *
 * @author Filipe
 */
public class ClasseServiceImpl implements ClasseService {

    ClasseDAO classeDAO = new ClasseDAO();

    /**
     *
     * @param classe
     * @throws Exception
     */
    public void inserirClasse(String nome, Double valor, Integer diasdevolucao) throws Exception {
        

            Classe classe = new Classe();

            classe.setNome(nome);
            classe.setValor(valor);
            classe.setDiasdevolucao(diasdevolucao);

            classeDAO.inserirClasse(classe);
        
    }

    public void alterarClasse(Integer id, String nome, Double valor, Integer diasdevolucao) throws Exception {

        Classe classe = new Classe();
        classe.setId(id);
        classe.setNome(nome);
        classe.setValor(valor);
        classe.setDiasdevolucao(diasdevolucao);

        classeDAO.alterarClasse(classe);
    }

    public void deletarClasse(Classe classe) throws Exception {
        classeDAO.deletarClasse(classe);
    }

    public Classe retornarClasse(int id) throws Exception {
        return classeDAO.retornarClasse(id);
    }

    public ArrayList<Classe> retornarClasses() throws Exception {
        return classeDAO.retornarClasses();
    }

}
