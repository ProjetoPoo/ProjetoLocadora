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
 * @author Linali
 */
public class classeServiceImpl {
     ClasseDAO classeDAO = new ClasseDAO();

    /**
     *
     * @param classe
     * @throws Exception
     */
    public void inserirClasse(Classe classe) throws Exception{
        if (classe.getNome().length()>3){
            classeDAO.inserirClasse(classe);
        }
    }

    public void alterarClasse(Classe classe) throws Exception {
            classeDAO.alterarClasse(classe);
    }

    public void deletarClasse(Classe classe) throws Exception {
        classeDAO.deletarClasse(classe);
    }

    public Classe retornarClasse(int id) throws Exception {
        return classeDAO.retornarClasse(id);
    }
     
    public Classe retornarClasse(String nome) throws Exception {
        return classeDAO.retornarClasse(nome);
    }

   
    public ArrayList<Classe> retornarClasses() throws Exception  {
        return classeDAO.retornarClasses();
    }
    
}

    
