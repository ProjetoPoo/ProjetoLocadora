<<<<<<< HEAD
package br.com.fean.poo2.locadora.control.dependente;

import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.modelo.dependente.*;
=======

package br.com.fean.poo2.locadora.control.dependente;

import br.com.fean.poo2.locadora.modelo.dependente.Dependente;
>>>>>>> origin/master
import java.util.ArrayList;

public interface DependenteService {
    
<<<<<<< HEAD
    public void inserirDependente (Dependente dependente); 
    public void alterarDependente (Dependente dependente); 
    public void deletarDependente (Dependente dependente); 
    public ArrayList<Dependente> pesquisaDependenteNome (String nome);
    public ArrayList<Dependente> pesquisaDependenteCodigo (Integer codigo);
    public ArrayList<Dependente> retornarDependentes(); 
}
=======
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
>>>>>>> origin/master
