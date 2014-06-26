<<<<<<< HEAD
package br.com.fean.poo2.locadora.control.socio;

import br.com.fean.poo2.locadora.control.socio.*;
import br.com.fean.poo2.locadora.modelo.socio.*;
=======

package br.com.fean.poo2.locadora.control.socio;

import br.com.fean.poo2.locadora.modelo.socio.Socio;
>>>>>>> origin/master
import java.util.ArrayList;

public interface SocioService {
    
<<<<<<< HEAD
    public void inserirSocio (Socio socio); 
    public void alterarSocio (Socio socio); 
    public void deletarSocio (Socio socio); 
    public ArrayList<Socio> pesquisaSocioNome (String nome);
    public ArrayList<Socio> pesquisaSocioCPF (String cpf);
    public ArrayList<Socio> pesquisaSocioCodigo (Integer codigo);
    public ArrayList<Socio> retornarSocios(); 
}
=======
    // inserir
    public void inserirSocio(String nome) throws Exception;
    // alterar
    public void alterarSocio(Integer id, String nome) throws Exception;
    // deletar
    public void deletarSocio(Socio socio) throws Exception;
    // retorna dados pelo CPF
    public Socio retornarSocio(int cpf) throws Exception;
    // retorna dados pelo NOME
    public Socio retornarSocio(String nome) throws Exception;
    // retorn TODOS os dados
    public ArrayList<Socio> retornarTodosSocio() throws Exception;
    // pequisa pelo NOME
    public ArrayList<Socio> pesquisarSocioNome(String nome) throws Exception;
    // pesquisa pelo CPF
    public Socio pesquisarSocioCPF(String cpf) throws Exception;    
}
>>>>>>> origin/master
