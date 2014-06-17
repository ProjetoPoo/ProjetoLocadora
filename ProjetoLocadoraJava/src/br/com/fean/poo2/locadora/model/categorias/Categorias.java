package br.com.fean.poo2.locadora.model.categorias;


import br.com.fean.poo2.locadora.model.Titulos;
import java.io.Serializable;

import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public  class Categorias implements Serializable {


    @Column(name="nome",table="categorias",length=50)
    @Basic
    private String nome;


    @Column(name="id",table="categorias",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @OneToMany(targetEntity=Titulos.class,mappedBy="categoria")
    private Collection<Titulos> titulosCollection;

    public Categorias(){

    }


   public String getNome() {
        return this.nome;
    }


  public void setNome (String nome) {
        this.nome = nome;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Collection<Titulos> getTitulosCollection() {
        return this.titulosCollection;
    }


  public void setTitulosCollection (Collection<Titulos> titulosCollection) {
        this.titulosCollection = titulosCollection;
    }

}

