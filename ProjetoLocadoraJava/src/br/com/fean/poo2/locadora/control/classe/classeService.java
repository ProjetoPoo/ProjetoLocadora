package br.com.fean.poo2.locadora.control.classe;

import br.com.fean.poo2.locadora.modelo.classe.Classe;
import java.util.ArrayList;

public interface classeService {

    public void inserirClasse(Integer id, String nome, Double valor, Integer diasdevolucao) throws Exception;

    public void alterarClasse(Integer id, String nome, Double valor, Integer diasdevolucao) throws Exception;

    public void deletarClasse(Classe classe) throws Exception;

    public Classe retornarClasse(int id) throws Exception;

    public ArrayList<Classe> retornarClasses() throws Exception;

}
