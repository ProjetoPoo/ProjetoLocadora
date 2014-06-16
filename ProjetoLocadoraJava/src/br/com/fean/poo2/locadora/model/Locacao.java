package br.com.fean.poo2.locadora.model;


import java.io.Serializable;

import java.lang.Double;
import java.lang.Integer;
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
@Table(name="locacao")
public  class Locacao implements Serializable {


    @OneToMany(targetEntity=LocacaoMidia.class,mappedBy="locacao")
    private Collection<LocacaoMidia> locacaoMidiaCollection;


    @ManyToOne(optional=false,targetEntity=Socios.class)
    @JoinColumn(name="socio",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Socios socio;


    @Column(name="hora",table="locacao")
    @Temporal(TemporalType.TIME)
    @Basic
    private Date hora;


    @Column(name="data_2",table="locacao")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date data2;


    @ManyToOne(optional=false,targetEntity=Dependentes.class)
    @JoinColumn(name="dependente",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Dependentes dependente;


    @Column(name="valortotal",table="locacao",precision=22)
    @Basic
    private Double valortotal;


    @Column(name="id",table="locacao",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @ManyToOne(optional=false,targetEntity=Funcionarios.class)
    @JoinColumn(name="funcionario",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Funcionarios funcionario;

    public Locacao(){

    }


   public Collection<LocacaoMidia> getLocacaoMidiaCollection() {
        return this.locacaoMidiaCollection;
    }


  public void setLocacaoMidiaCollection (Collection<LocacaoMidia> locacaoMidiaCollection) {
        this.locacaoMidiaCollection = locacaoMidiaCollection;
    }



   public Socios getSocio() {
        return this.socio;
    }


  public void setSocio (Socios socio) {
        this.socio = socio;
    }



   public Date getHora() {
        return this.hora;
    }


  public void setHora (Date hora) {
        this.hora = hora;
    }



   public Date getData2() {
        return this.data2;
    }


  public void setData2 (Date data2) {
        this.data2 = data2;
    }



   public Dependentes getDependente() {
        return this.dependente;
    }


  public void setDependente (Dependentes dependente) {
        this.dependente = dependente;
    }



   public Double getValortotal() {
        return this.valortotal;
    }


  public void setValortotal (Double valortotal) {
        this.valortotal = valortotal;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Funcionarios getFuncionario() {
        return this.funcionario;
    }


  public void setFuncionario (Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

}

