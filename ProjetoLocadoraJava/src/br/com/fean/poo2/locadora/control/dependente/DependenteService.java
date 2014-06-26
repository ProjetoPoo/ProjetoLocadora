package br.com.fean.poo2.locadora.control.dependente;

import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.control.dependente.*;
import br.com.fean.poo2.locadora.modelo.dependente.*;
import java.util.ArrayList;

public interface DependenteService {
    
    public void inserirDependente (Dependente dependente); 
    public void alterarDependente (Dependente dependente); 
    public void deletarDependente (Dependente dependente); 
    public ArrayList<Dependente> pesquisaDependenteNome (String nome);
    public ArrayList<Dependente> pesquisaDependenteCodigo (Integer codigo);
    public ArrayList<Dependente> retornarDependentes(); 
}
