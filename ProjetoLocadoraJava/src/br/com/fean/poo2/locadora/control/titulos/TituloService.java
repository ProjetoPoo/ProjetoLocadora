package br.com.fean.poo2.locadora.control.titulos;

import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import br.com.fean.poo2.locadora.modelo.classe.Classe;
import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.midia.Midia;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import java.util.ArrayList;

public interface TituloService {
    public void inserirTitulo (String nome, Midia midia, Categoria genero, Midia nSerie, Classe classe, Midia estoque, Classe valor, Midia dataAquisicao, Distribuidor distribuidor)throws Exception; 
    public void alterarTitulo (Integer codigo, String nome, Midia nSerie, Classe classe, Classe valor, Distribuidor distribuidor)throws Exception; 
    public void deletarTitulo (Titulo titulo)throws Exception; 
    public Titulo retornarTitulo (Integer id)throws Exception;
    public ArrayList<Titulo> retornarTitulos()throws Exception; 
    public ArrayList<Titulo> pesquisarCodigoTitulo(String id) throws Exception;
    public ArrayList<Titulo> pesquisarTituloFilme(String nome) throws Exception;

}
