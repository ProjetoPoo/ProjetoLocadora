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
@Table(name="funcionarios")
public  class Funcionarios implements Serializable {


    @Column(name="fone",table="funcionarios",length=50)
    @Basic
    private String fone;


    @Column(name="senha",table="funcionarios",length=10)
    @Basic
    private String senha;


    @OneToMany(targetEntity=Locacao.class,mappedBy="funcionario")
    private Collection<Locacao> locacaoCollection;


    @Column(name="nome",table="funcionarios",length=100)
    @Basic
    private String nome;


    @Column(name="usuario",table="funcionarios",length=10)
    @Basic
    private String usuario;


    @Column(name="id",table="funcionarios",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @OneToMany(targetEntity=Devolucao.class,mappedBy="funcionario")
    private Collection<Devolucao> devolucaoCollection;

    public Funcionarios(){

    }


   public String getFone() {
        return this.fone;
    }


  public void setFone (String fone) {
        this.fone = fone;
    }



   public String getSenha() {
        return this.senha;
    }


  public void setSenha (String senha) {
        this.senha = senha;
    }



   public Collection<Locacao> getLocacaoCollection() {
        return this.locacaoCollection;
    }


  public void setLocacaoCollection (Collection<Locacao> locacaoCollection) {
        this.locacaoCollection = locacaoCollection;
    }



   public String getNome() {
        return this.nome;
    }


  public void setNome (String nome) {
        this.nome = nome;
    }



   public String getUsuario() {
        return this.usuario;
    }


  public void setUsuario (String usuario) {
        this.usuario = usuario;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Collection<Devolucao> getDevolucaoCollection() {
        return this.devolucaoCollection;
    }


  public void setDevolucaoCollection (Collection<Devolucao> devolucaoCollection) {
        this.devolucaoCollection = devolucaoCollection;
    }

}

