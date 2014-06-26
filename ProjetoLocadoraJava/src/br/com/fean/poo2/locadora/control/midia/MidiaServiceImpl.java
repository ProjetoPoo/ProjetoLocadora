package br.com.fean.poo2.locadora.control.midia;

import br.com.fean.poo2.locadora.control.midia.*;
import br.com.fean.poo2.locadora.control.midia.*;
import br.com.fean.poo2.locadora.modelo.midia.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MidiaServiceImpl implements MidiaService {

    MidiaDAO midiaDAO = new MidiaDAO();

/*    @Override
    public void inserirMidia(Midia midia) {
        if (midia.getNome().length() > 3) {
            try {
                midiaDAO.inserirMidia(midia);
            } catch (Exception ex) {
                Logger.getLogger(MidiaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
*/
    @Override
    public void alterarMidia(Midia midia) {
        try {
            midiaDAO.alterarMidia(midia);
        } catch (Exception ex) {
            Logger.getLogger(MidiaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletarMidia(Midia midia) {
        try {
            midiaDAO.deletarMidia(midia);
        } catch (Exception ex) {
            Logger.getLogger(MidiaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Midia> pesquisaMidiaCodigo(Integer codigo) {
        ArrayList<Midia> midias = new ArrayList<Midia>();
        try {
            midias = midiaDAO.pesquisaMidiaCodigo(codigo);
        } catch (Exception ex) {
            Logger.getLogger(MidiaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return midias;
    }
    
    @Override
    public Integer nrMidiasTituloDisponiveis(Integer codtitulo) {
        ArrayList<Midia> midias = new ArrayList<Midia>();
        Integer contador = new Integer(0);
        try {
            midias = midiaDAO.midiasPorTitulo(codtitulo);
        } catch (Exception ex) {
            Logger.getLogger(MidiaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Midia midia : midias) {
            contador++;
        }
        
        return contador;
    }
    
    public Integer idMidiaLocacao(Integer codtitulo) {
        ArrayList<Midia> midias = new ArrayList<Midia>();
        Integer contador = new Integer(0);
        try {
            midias = midiaDAO.midiasPorTitulo(codtitulo);
        } catch (Exception ex) {
            Logger.getLogger(MidiaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Midia midia : midias) {
            contador = midia.getId();
        }
        
        return contador;
    }

    @Override
    public ArrayList<Midia> retornarMidias() {
        ArrayList<Midia> midias = new ArrayList<Midia>();
        try {
            midias = midiaDAO.retornaMidias();
        } catch (Exception ex) {
            Logger.getLogger(MidiaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return midias;
    }
    
    @Override
    public Midia retornaMidia(Integer idmidia) {
        ArrayList<Midia> midias = new ArrayList<Midia>();
        Midia midiaselecionada = new Midia();
        try {
            midias = midiaDAO.pesquisaMidiaCodigo(idmidia);
        } catch (Exception ex) {
            Logger.getLogger(MidiaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Midia midia : midias) {
            midiaselecionada = midia;
        }
        return midiaselecionada;
    }

}
