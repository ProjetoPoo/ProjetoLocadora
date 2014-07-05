package br.com.fean.poo2.locadora.control.dependente;

import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.modelo.dependente.*;
import br.com.fean.poo2.locadora.modelo.dependente.Dependente;
import java.util.ArrayList;
import java.util.Date;

public interface DependenteService {
    
    public void inserirDependente(String nome, Integer sexo, Date datanascimento) throws Exception;
    // alterar
    public void alterarDependente(String nome, Integer sexo, Date datanascimento) throws Exception;
    // deletar
    public void deletarDependente(Dependente dependente) throws Exception;
    // retorna pelo nome
    public Dependente retornarDependente(String nome) throws Exception;
    // retorna pelo id
    public Dependente retornarDependente(int id) throws Exception;
    // array que retorna todos os dependentes
    public ArrayList<Dependente> retornarTodosDependentes() throws Exception;
    // array que´pesquisar os deéndetes pelo nome
    public ArrayList<Dependente> pesquisarDependenteNome(String nome) throws Exception;
    // pesquisa dependentes pelo nome
    public Dependente pesquisarDependenteId(String id) throws Exception; 
    public ArrayList<Dependente> pesquisaDependenteNome (String nome);
    public ArrayList<Dependente> pesquisaDependenteCodigo (Integer codigo);
    public ArrayList<Dependente> retornarDependentes(); 
}
