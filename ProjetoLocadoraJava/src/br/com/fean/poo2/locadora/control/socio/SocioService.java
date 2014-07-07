package br.com.fean.poo2.locadora.control.socio;

import br.com.fean.poo2.locadora.control.socio.*;
import br.com.fean.poo2.locadora.modelo.socio.*;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import java.util.ArrayList;
import java.util.Date;


public interface SocioService {
    
    public void inserirSocio(Socio socio) throws Exception;    
    public void alterarSocio(Socio socio) throws Exception;    
    public void deletarSocio(Socio socio) throws Exception; 
    public ArrayList<Socio> pesquisaSocioNome (String nome);
    public ArrayList<Socio> pesquisaSocioCPF (String cpf);
    public ArrayList<Socio> pesquisaSocioCodigo (Integer codigo);

    public ArrayList<Socio> retornarSocios();    

    //public ArrayList<Socio> retornarSocios(); 
    

    public Socio retornarSocioId(int id) throws Exception;

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
   
