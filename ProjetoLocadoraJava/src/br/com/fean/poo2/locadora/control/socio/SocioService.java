
package br.com.fean.poo2.locadora.control.socio;

import br.com.fean.poo2.locadora.modelo.socio.Socio;
import java.util.ArrayList;

public interface SocioService {
    
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