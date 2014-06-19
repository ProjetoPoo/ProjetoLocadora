package br.com.fean.poo2.locadora.model;

import java.io.Serializable;
import java.lang.Double;
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
@Table(name="classes")
public  class Classes implements Serializable {

    @Column(name="diasdevolucao",table="classes")
    @Basic
    private Integer diasdevolucao;

    @Column(name="valor",table="classes",precision=22)
    @Basic
    private Double valor;

    @Column(name="nome",table="classes",length=50)
    @Basic
    private String nome;

    @Column(name="id",table="classes",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

//    @OneToMany(targetEntity=Titulos.class,mappedBy="classe")
    private Collection<Titulos> titulosCollection;

    public Classes(){

    }

    public Integer getDiasdevolucao() {
        return this.diasdevolucao;
    }

    public void setDiasdevolucao (Integer diasdevolucao) {
        this.diasdevolucao = diasdevolucao;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor (Double valor) {
        this.valor = valor;
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

