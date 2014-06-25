package br.com.fean.poo2.locadora.control.titulos;

import br.com.fean.poo2.locadora.modelo.titulo.Titulo;
import java.util.ArrayList;

public interface TituloService {
    public void inserirTitulo (Titulo titulo)throws Exception; 
    public void alterarTitulo (Titulo titulo)throws Exception; 
    public void deletarTitulo (Titulo titulo)throws Exception; 
    public Titulo retornarTitulo (Integer id)throws Exception;
    public ArrayList<Titulo> retornarTitulos()throws Exception; 
}
