package br.com.fean.poo2.locadora.control.distribuidor;

import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import java.util.ArrayList;

public interface DistribuidorService {
    
    public void inserirDistribuidor (String cnpj, String razaoSocial, String endereco, String pessoaContato, String fone)throws Exception; 
   
    public void alterarDistribuidor (Integer id, String cnpj, String razaoSocial, String endereco, String pessoaContato, String fone)throws Exception; 
   
    public void deletarDistribuidor (Distribuidor distribuidor)throws Exception; 
   
    public Distribuidor retornarDistribuidor (Integer id)throws Exception;
   
    public ArrayList<Distribuidor> retornarDistribuidores()throws Exception; 
    
    public ArrayList<Distribuidor> pesquisaDistribuidorRazaoSocial (String razaoSocial) throws Exception;
    
    public ArrayList<Distribuidor> pesquisaDistribuidorCNPJ (String cnpj) throws Exception;
}
