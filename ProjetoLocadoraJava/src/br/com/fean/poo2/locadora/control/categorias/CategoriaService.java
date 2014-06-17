package br.com.fean.poo2.locadora.control.categorias;


import br.com.fean.poo2.locadora.model.categorias.Categorias;
import java.util.ArrayList;

public interface CategoriaService {

    /**
     * NOTAS:
     *
     * Nesta classe será criado a interface dos serviços de categoria.
     *
     */
    public void inserirCategoria(Categorias categoria) throws Exception;//Inserir

    public void alterarCategoria(Categorias categoria) throws Exception;//Alterar

    public void deletarCategoria(Categorias categoria) throws Exception;//Apagar

    public Categorias retornarCategoria(int idCategoria) throws Exception;//Retorna o categoria com o id passado

    public ArrayList<Categorias> retornarCategorias() throws Exception;//Retorna todo os categoria cadastrados  

}
