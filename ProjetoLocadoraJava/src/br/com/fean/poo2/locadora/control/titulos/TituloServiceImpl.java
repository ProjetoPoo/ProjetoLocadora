package br.com.fean.poo2.locadora.control.titulos;

import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import br.com.fean.poo2.locadora.modelo.classe.Classe;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import br.com.fean.poo2.locadora.modelo.titulo.TituloDAO;
import java.util.ArrayList;

public class TituloServiceImpl implements TituloService {

    TituloDAO tituloDAO = new TituloDAO();

    @Override
    public void inserirTitulo(String nome, Categoria genero, Classe classe) throws Exception {
        if (nome.length() > 3) {
            Titulo titulo = new Titulo();
            titulo.setNome(nome);
            titulo.setCategorias(genero);
            titulo.setClasses(classe);
            tituloDAO.inserirTitulo(titulo);
        }
    }

    @Override
    public void alterarTitulo(Integer codigo, String nome, Categoria genero, Classe classe) throws Exception {
        Titulo titulo = new Titulo();
        titulo.setId(codigo);
        titulo.setNome(nome);
        titulo.setCategorias(genero);
        titulo.setClasses(classe);
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

    @Override
    public ArrayList<Titulo> pesquisarTituloFilme(String nome) throws Exception {
        return tituloDAO.pesquisarTituloFilme(nome);
    }

    @Override
    public ArrayList<Titulo> pesquisarCategoriaFilme(String categoria) throws Exception {
        return tituloDAO.pesquisarCategoriaFilme(categoria);
    }

}
