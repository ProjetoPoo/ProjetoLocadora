package br.com.fean.poo2.locadora.control.midia;

import br.com.fean.poo2.locadora.control.midia.*;
import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.midia.*;
import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidia;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MidiaServiceImpl implements MidiaService {

    MidiaDAO midiaDAO = new MidiaDAO();

    @Override
    public void inserirMidia(Integer id, Titulo titulos, TipoMidia tipoMidias, Distribuidor distribuidores, Integer situacao, Date dataaquisicao, String nrserie) throws Exception {
        if (titulos.getNome().length() > 3) {
            Midia midia = new Midia();
            midia.setId(id);
            midia.setTitulos(titulos);
            midia.setTipoMidias(tipoMidias);
            midia.setDistribuidores(distribuidores);
            midia.setSituacao(situacao);
            midia.setDataaquisicao(dataaquisicao);
            midia.setNrserie(nrserie);

            midiaDAO.inserirMidia(midia);

        }
    }

    public void alterarMidia(Integer id, Titulo titulos, TipoMidia tipoMidias, Distribuidor distribuidores, Integer situacao, Date dataaquisicao, String nrserie) throws Exception {

        Midia midia = new Midia();
        midia.setId(id);
        midia.setTitulos(titulos);
        midia.setTipoMidias(tipoMidias);
        midia.setDistribuidores(distribuidores);
        midia.setSituacao(situacao);
        midia.setDataaquisicao(dataaquisicao);
        midia.setNrserie(nrserie);

        midiaDAO.alterarMidia(midia);

    }

    @Override
    public void deletarMidia(Midia midia) {
        try {
            midiaDAO.deletarMidia(midia);
        } catch (Exception ex) {
            Logger.getLogger(MidiaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterarSituacaoMidia (Midia midia) throws Exception {
        midiaDAO.alterarMidia(midia);
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
