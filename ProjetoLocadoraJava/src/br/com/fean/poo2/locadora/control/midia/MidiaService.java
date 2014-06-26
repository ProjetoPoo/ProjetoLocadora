package br.com.fean.poo2.locadora.control.midia;

import br.com.fean.poo2.locadora.control.midia.*;
import br.com.fean.poo2.locadora.control.midia.*;
import br.com.fean.poo2.locadora.modelo.midia.*;
import java.util.ArrayList;

public interface MidiaService {
    
    //public void inserirMidia (Midia midia); 
    public void alterarMidia (Midia midia); 
    public void deletarMidia (Midia midia); 
    public ArrayList<Midia> pesquisaMidiaCodigo (Integer codigo);
    public Integer nrMidiasTituloDisponiveis(Integer codtitulo);
    public ArrayList<Midia> retornarMidias(); 
    public Midia retornaMidia(Integer idmidia);
}
