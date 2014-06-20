package br.com.fean.poo2.locadora.control.distribuidor;

import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import java.util.ArrayList;

public interface DistribuidorService {
    
    public void inserirDistribuidor (Distribuidor distribuidor); 
    public void alterarDistribuidor (Distribuidor distribuidor); 
    public void deletarDistribuidor (Distribuidor distribuidor); 
    public Distribuidor retornarDistribuidor (Integer id);
    public ArrayList<Distribuidor> retornarDistribuidor(); 
}
