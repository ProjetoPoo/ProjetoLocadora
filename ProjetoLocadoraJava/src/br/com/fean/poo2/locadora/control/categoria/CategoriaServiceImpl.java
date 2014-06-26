package br.com.fean.poo2.locadora.control.categoria;


import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import br.com.fean.poo2.locadora.modelo.categoria.CategoriaDAO;
import java.util.ArrayList;

public class CategoriaServiceImpl implements CategoriaService {

    CategoriaDAO categoriaDAO = new CategoriaDAO();

    @Override
    public void inserirCategoria(String nome) throws Exception {
        
        if (nome.length() > 3) {
            Categoria categoria = new Categoria();
            categoria.setNome(nome);
            categoriaDAO.inserirCategoria(categoria);
        }
    }

    @Override
    public void alterarCategoria(Integer id, String nome) throws Exception {
        
        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoria.setNome(nome);
        
        categoriaDAO.alterarCategoria(categoria);
    }

    @Override
    public void deletarCategoria(Categoria categoria) throws Exception {
        
        categoriaDAO.deletarCategoria(categoria);
    }

    @Override
    public Categoria retornarCategoria(int idCategorias) throws Exception {
        return categoriaDAO.retornaCategoria(idCategorias);
    }


    @Override
    public ArrayList<Categoria> retornarCategorias() throws Exception {
        return categoriaDAO.retornaCategorias();
    }

}
