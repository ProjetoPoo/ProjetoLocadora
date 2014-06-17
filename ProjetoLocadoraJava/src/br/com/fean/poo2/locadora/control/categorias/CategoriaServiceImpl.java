package br.com.fean.poo2.locadora.control.categorias;


import br.com.fean.poo2.locadora.model.categorias.Categorias;
import br.com.fean.poo2.locadora.model.categorias.CategoriasDAO;
import java.util.ArrayList;

public class CategoriaServiceImpl implements CategoriaService {

    CategoriasDAO categoriaDAO = new CategoriasDAO();

    @Override
    public void inserirCategoria(Categorias categoria) throws Exception {
        if (categoria.getNome().length() > 3) {
            categoriaDAO.inserirCategorias(categoria);
        }
    }

    @Override
    public void alterarCategoria(Categorias categoria) throws Exception {
        categoriaDAO.alterarCategorias(categoria);
    }

    @Override
    public void deletarCategoria(Categorias categoria) throws Exception {
        categoriaDAO.deletarCategorias(categoria);
    }

    @Override
    public Categorias retornarCategoria(int idCategorias) throws Exception {
        return categoriaDAO.retornaCategorias(idCategorias);
    }


    @Override
    public ArrayList<Categorias> retornarCategorias() throws Exception {
        return categoriaDAO.retornaCategoriass();
    }

}
