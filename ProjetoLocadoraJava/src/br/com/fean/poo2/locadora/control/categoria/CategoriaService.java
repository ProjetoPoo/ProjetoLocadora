package br.com.fean.poo2.locadora.control.categoria;

import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import java.util.ArrayList;

public interface CategoriaService {


    public void inserirCategoria(String nome) throws Exception;

    public void alterarCategoria(Integer id, String nome) throws Exception;

    public void deletarCategoria(Categoria categoria) throws Exception;

    public Categoria retornarCategoria(int idCategoria) throws Exception;
    
    public ArrayList<Categoria> retornarCategorias() throws Exception;
    
}
