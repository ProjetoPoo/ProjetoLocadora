package br.com.fean.poo2.locadora.control.titulos;

import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import br.com.fean.poo2.locadora.modelo.titulo.TituloDAO;
import java.util.ArrayList;

public class TituloServiceImpl implements TituloService {
    TituloDAO tituloDAO = new TituloDAO();
    
    @Override
    public void inserirTitulo(Titulo titulo) throws Exception {
        if (titulo.getNome().length() > 3) {
            tituloDAO.inserirTitulo(titulo);
        }
    }

    @Override
    public void alterarTitulo(Titulo titulo) throws Exception {
        tituloDAO.alteraTitulo(titulo);
    }

    @Override
    public void deletarTitulo(Titulo titulo) throws Exception {
        tituloDAO.deletarTitulo(titulo);
    }

    @Override
    public Titulo retornarTitulo(Integer id) throws Exception {
        return tituloDAO.retornarTitulo(id);
    }

    @Override
    public ArrayList<Titulo> retornarTitulos() throws Exception {
        return tituloDAO.retornarTitulos();
    }
    
}
