
package br.com.fean.poo2.locadora.control.dependente;

import br.com.fean.poo2.locadora.modelo.dependente.Dependente;
import java.util.ArrayList;

public interface DependenteService {
    
    // inserir
    public void inserirDependente(String nome) throws Exception;
    // alterar
    public void alterarDependente(Integer id, String nome) throws Exception;
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
}