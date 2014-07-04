package br.com.fean.poo2.locadora.control.titulos;

import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import br.com.fean.poo2.locadora.modelo.classe.Classe;
import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.midia.Midia;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import br.com.fean.poo2.locadora.modelo.titulo.TituloDAO;
import java.util.ArrayList;

public class TituloServiceImpl implements TituloService {
    TituloDAO tituloDAO = new TituloDAO();
    
    @Override
    public void inserirTitulo(String nome, Midia midia, Categoria genero, Midia nSerie, Classe classe, Midia estoque, Classe valor, Midia dataAquisicao, Distribuidor distribuidor) throws Exception {
        if (nome.length() > 3) {
             Titulo titulo = new Titulo();
             titulo.setNome(nome);
             titulo.setMidia(midia);
             titulo.setCategorias(genero);
             titulo.setMidia(nSerie);
             titulo.setClasses(classe);
             titulo.setMidia(estoque);
             titulo.setClasses(valor);
             titulo.setMidia(dataAquisicao);
             titulo.setDistribuidor(distribuidor);
             tituloDAO.inserirTitulo(titulo);
        }
    }

    @Override
    public void alterarTitulo(Integer codigo, String nome, Midia nSerie, Classe classe, Classe valor, Distribuidor distribuidor) throws Exception {
        Titulo titulo = new Titulo();
        titulo.setId(codigo);
        titulo.setNome(nome);
        titulo.setMidia(nSerie);
        titulo.setClasses(classe);
        titulo.setClasses(valor);
        titulo.setDistribuidor(distribuidor);
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
