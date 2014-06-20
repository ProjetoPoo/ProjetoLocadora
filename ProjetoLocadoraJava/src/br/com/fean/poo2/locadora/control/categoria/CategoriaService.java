package br.com.fean.poo2.locadora.control.categoria;

import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import java.util.ArrayList;

public interface CategoriaService {

    /**
     * NOTAS:
     *
     * Nesta classe será criado a interface dos serviços de categoria.
     *
     */
    public void inserirCategoria(Categoria categoria) throws Exception;//Inserir

    public void alterarCategoria(Categoria categoria) throws Exception;//Alterar

    public void deletarCategoria(Categoria categoria) throws Exception;//Apagar

    public Categoria retornarCategoria(int idCategoria) throws Exception;//Retorna o categoria com o id passado

    public ArrayList<Categoria> retornarCategorias() throws Exception;//Retorna todo os categoria cadastrados  

}
