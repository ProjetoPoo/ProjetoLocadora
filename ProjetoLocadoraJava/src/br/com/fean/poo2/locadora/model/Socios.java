package br.com.fean.poo2.locadora.model;


import java.io.Serializable;

import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="socios")
public  class Socios implements Serializable {


    @Column(name="fone_res",table="socios",length=40)
    @Basic
    private String foneRes;


    @Column(name="tipo",table="socios")
    @Basic
    private Integer tipo;


    @Column(name="fone_com",table="socios",length=40)
    @Basic
    private String foneCom;


    @Column(name="inscricao",table="socios",length=10)
    @Basic
    private String inscricao;


    @Column(name="endereco",table="socios",length=200)
    @Basic
    private String endereco;


    @Column(name="nome",table="socios",length=100)
    @Basic
    private String nome;


    @OneToMany(targetEntity=Dependentes.class,mappedBy="socio")
    private Collection<Dependentes> dependentesCollection;


    @Column(name="datanascimento",table="socios")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datanascimento;


    @Column(name="local_trabalho",table="socios",length=100)
    @Basic
    private String localTrabalho;


    @OneToMany(targetEntity=Reservas.class,mappedBy="socio")
    private Collection<Reservas> reservasCollection;


    @OneToMany(targetEntity=Locacao.class,mappedBy="socio")
    private Collection<Locacao> locacaoCollection;


    @Column(name="cpf",table="socios",length=15)
    @Basic
    private String cpf;


    @Column(name="id",table="socios",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="sexo",table="socios")
    @Basic
    private Integer sexo;

    public Socios(){

    }


   public String getFoneRes() {
        return this.foneRes;
    }


  public void setFoneRes (String foneRes) {
        this.foneRes = foneRes;
    }



   public Integer getTipo() {
        return this.tipo;
    }


  public void setTipo (Integer tipo) {
        this.tipo = tipo;
    }



   public String getFoneCom() {
        return this.foneCom;
    }


  public void setFoneCom (String foneCom) {
        this.foneCom = foneCom;
    }



   public String getInscricao() {
        return this.inscricao;
    }


  public void setInscricao (String inscricao) {
        this.inscricao = inscricao;
    }



   public String getEndereco() {
        return this.endereco;
    }


  public void setEndereco (String endereco) {
        this.endereco = endereco;
    }



   public String getNome() {
        return this.nome;
    }


  public void setNome (String nome) {
        this.nome = nome;
    }



   public Collection<Dependentes> getDependentesCollection() {
        return this.dependentesCollection;
    }


  public void setDependentesCollection (Collection<Dependentes> dependentesCollection) {
        this.dependentesCollection = dependentesCollection;
    }



   public Date getDatanascimento() {
        return this.datanascimento;
    }


  public void setDatanascimento (Date datanascimento) {
        this.datanascimento = datanascimento;
    }



   public String getLocalTrabalho() {
        return this.localTrabalho;
    }


  public void setLocalTrabalho (String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }



   public Collection<Reservas> getReservasCollection() {
        return this.reservasCollection;
    }


  public void setReservasCollection (Collection<Reservas> reservasCollection) {
        this.reservasCollection = reservasCollection;
    }



   public Collection<Locacao> getLocacaoCollection() {
        return this.locacaoCollection;
    }


  public void setLocacaoCollection (Collection<Locacao> locacaoCollection) {
        this.locacaoCollection = locacaoCollection;
    }



   public String getCpf() {
        return this.cpf;
    }


  public void setCpf (String cpf) {
        this.cpf = cpf;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Integer getSexo() {
        return this.sexo;
    }


  public void setSexo (Integer sexo) {
        this.sexo = sexo;
    }

}

