package br.com.fean.poo2.locadora.control.distribuidor;

import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import java.util.ArrayList;

public interface DistribuidorService {
    
    public void inserirDistribuidor (Distribuidor distribuidor)throws Exception; 
    public void alterarDistribuidor (Distribuidor distribuidor)throws Exception; 
    public void deletarDistribuidor (Distribuidor distribuidor)throws Exception; 
    public Distribuidor retornarDistribuidor (Integer id)throws Exception;
    public ArrayList<Distribuidor> retornarDistribuidores()throws Exception; 
}
