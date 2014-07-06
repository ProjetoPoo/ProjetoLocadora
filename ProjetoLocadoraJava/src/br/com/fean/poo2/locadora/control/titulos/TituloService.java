package br.com.fean.poo2.locadora.control.titulos;

import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import br.com.fean.poo2.locadora.modelo.classe.Classe;
import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import java.util.ArrayList;

public interface TituloService {
    
    public void inserirTitulo (String nome, Categoria genero,Classe classe)throws Exception; 
    
    public void alterarTitulo (Integer codigo, String nome, Categoria genero,Classe classe)throws Exception; 
   
    public void deletarTitulo (Titulo titulo)throws Exception; 
    
    public Titulo retornarTitulo (Integer id)throws Exception;
    
    public ArrayList<Titulo> retornarTitulos()throws Exception; 
   
    public ArrayList<Titulo> pesquisarTituloFilme(String nome) throws Exception;
    
    public ArrayList<Titulo> pesquisarCategoriaFilme(String categoria)  throws Exception;

}
