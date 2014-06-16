package br.com.fean.poo2.locadora.model;


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
@Table(name="tipo_midias")
public  class TipoMidias implements Serializable {


    @Column(name="nome",table="tipo_midias",length=50)
    @Basic
    private String nome;


    @Column(name="id",table="tipo_midias",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @OneToMany(targetEntity=Midias.class,mappedBy="tipoMidia")
    private Collection<Midias> midiasCollection;

    public TipoMidias(){

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

