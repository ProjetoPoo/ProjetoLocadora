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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="dependentes")
public  class Dependentes implements Serializable {


    @Column(name="inscricao",table="dependentes",length=10)
    @Basic
    private String inscricao;


    @ManyToOne(optional=false,targetEntity=Socios.class)
    @JoinColumn(name="socio",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Socios socio;


    @OneToMany(targetEntity=Reservas.class,mappedBy="dependente")
    private Collection<Reservas> reservasCollection;


    @OneToMany(targetEntity=Locacao.class,mappedBy="dependente")
    private Collection<Locacao> locacaoCollection;


    @Column(name="nome",table="dependentes",length=100)
    @Basic
    private String nome;


    @Column(name="id",table="dependentes",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="sexo",table="dependentes")
    @Basic
    private Integer sexo;


    @Column(name="datanascimento",table="dependentes")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datanascimento;

    public Dependentes(){

    }


   public String getInscricao() {
        return this.inscricao;
    }


  public void setInscricao (String inscricao) {
        this.inscricao = inscricao;
    }



   public Socios getSocio() {
        return this.socio;
    }


  public void setSocio (Socios socio) {
        this.socio = socio;
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



   public Integer getSexo() {
        return this.sexo;
    }


  public void setSexo (Integer sexo) {
        this.sexo = sexo;
    }



   public Date getDatanascimento() {
        return this.datanascimento;
    }


  public void setDatanascimento (Date datanascimento) {
        this.datanascimento = datanascimento;
    }

}

