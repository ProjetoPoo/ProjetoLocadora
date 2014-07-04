package br.com.fean.poo2.locadora.modelo.titulo;
// Generated 19/06/2014 18:08:01 by Hibernate Tools 3.6.0

import br.com.fean.poo2.locadora.modelo.categoria.Categoria;
import br.com.fean.poo2.locadora.modelo.classe.Classe;
import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.midia.Midia;
import java.util.HashSet;
import java.util.Set;

public class Titulo  implements java.io.Serializable {

     private Integer id;
     private Categoria categorias;
     private Classe classes;
     private String nome;
     private Midia midia;
     private Distribuidor distribuidor; 
     private Set midiases = new HashSet(0);

    public Titulo() {
    }

	
    public Titulo(Categoria categorias, Classe classes) {
        this.categorias = categorias;
        this.classes = classes;
    }

    public Titulo(Categoria categorias, Classe classes, String nome, Midia midia, Distribuidor distribuidor) {
        this.categorias = categorias;
        this.classes = classes;
        this.nome = nome;
        this.midia = midia;
        this.distribuidor = distribuidor;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Categoria getCategorias() {
        return this.categorias;
    }
    
    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }
    public Classe getClasses() {
        return this.classes;
    }
    
    public void setClasses(Classe classes) {
        this.classes = classes;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getMidiases() {
        return this.midiases;
    }
    
    public void setMidiases(Set midiases) {
        this.midiases = midiases;
    }

    
}


