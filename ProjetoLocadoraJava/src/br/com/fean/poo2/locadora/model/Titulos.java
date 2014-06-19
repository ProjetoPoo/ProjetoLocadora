package br.com.fean.poo2.locadora.model;

import br.com.fean.poo2.locadora.model.categorias.Categorias;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="titulos")
public  class Titulos implements Serializable {

//    @ManyToOne(optional=false,targetEntity=Classes.class)
    @JoinColumn(name="classe",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Classes classe;

//    @ManyToOne(optional=false,targetEntity=Categorias.class)
    @JoinColumn(name="categoria",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Categorias categoria;

    @Column(name="nome",table="titulos",length=100)
    @Basic
    private String nome;

    @Column(name="id",table="titulos",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @OneToMany(targetEntity=Midias.class,mappedBy="titulo")
    private Collection<Midias> midiasCollection;

    public Titulos(){

    }

   public Classes getClasse() {
        return this.classe;
    }

   public void setClasse (Classes classe) {
        this.classe = classe;
    }

   public Categorias getCategoria() {
        return this.categoria;
    }

   public void setCategoria (Categorias categoria) {
        this.categoria = categoria;
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

   public Collection<Midias> getMidiasCollection() {
        return this.midiasCollection;
    }

   public void setMidiasCollection (Collection<Midias> midiasCollection) {
        this.midiasCollection = midiasCollection;
    }
}

