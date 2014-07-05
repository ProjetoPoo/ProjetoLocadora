package br.com.fean.poo2.locadora.control.tipomidia;

import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidia;
import java.util.ArrayList;

/**
 *
 * @author Romulo
 */
public interface TipoMidiaService {
    
    public void inserirTipoMidia(String nome) throws Exception;
    
    public void alterarTipoMidia(Integer id, String nome) throws Exception;
    
    public void deletarTipoMidia(TipoMidia tipomidia) throws Exception;
    
    public TipoMidia retornarTipoMidia(int id) throws Exception;
    
    public TipoMidia retornarTipoMidia(String nome) throws Exception;
    
    public ArrayList<TipoMidia> retornarTipoMidia() throws Exception;
}
