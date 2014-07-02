package br.com.fean.poo2.locadora.control.midia;

import br.com.fean.poo2.locadora.control.midia.*;
import br.com.fean.poo2.locadora.control.midia.*;
import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.midia.*;
import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidia;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import java.util.ArrayList;
import java.util.Date;

public interface MidiaService {
    
    public void inserirMidia (Integer id, Titulo titulos, TipoMidia tipoMidias, Distribuidor distribuidores, Integer situacao, Date dataaquisicao, String nrserie)throws Exception; 
    public void alterarMidia (Integer id, Titulo titulos, TipoMidia tipoMidias, Distribuidor distribuidores, Integer situacao, Date dataaquisicao, String nrserie)throws Exception; 
    public void deletarMidia (Midia midia); 
    public ArrayList<Midia> pesquisaMidiaCodigo (Integer codigo);
    public Integer nrMidiasTituloDisponiveis(Integer codtitulo);
    public ArrayList<Midia> retornarMidias(); 
    public Midia retornaMidia(Integer idmidia);
}
