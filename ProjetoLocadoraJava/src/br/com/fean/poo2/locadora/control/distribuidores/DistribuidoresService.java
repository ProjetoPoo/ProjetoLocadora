package br.com.fean.poo2.locadora.control.distribuidores;

import br.com.fean.poo2.locadora.model.Distribuidores;
import java.util.ArrayList;

public interface DistribuidoresService {
    public void inserirDistribuidor (Distribuidores distribuidor); 
    public void alterarDistribuidor (Distribuidores distribuidor); 
    public void deletarDistribuidor (Distribuidores distribuidor); 
    public Distribuidores retornarDistribuidor (Integer id);
    public ArrayList<Distribuidores> retornarDistribuidores(); 
}
