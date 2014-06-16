package br.com.fean.poo2.locadora.model;


import java.io.Serializable;

import java.lang.Integer;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="reservas")
public  class Reservas implements Serializable {


    @ManyToOne(optional=false,targetEntity=Midias.class)
    @JoinColumn(name="midia",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Midias midia;


    @ManyToOne(optional=false,targetEntity=Socios.class)
    @JoinColumn(name="socio",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Socios socio;


    @Column(name="hora",table="reservas")
    @Temporal(TemporalType.TIME)
    @Basic
    private Date hora;


    @Column(name="data_2",table="reservas")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date data2;


    @ManyToOne(optional=false,targetEntity=Dependentes.class)
    @JoinColumn(name="dependente",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Dependentes dependente;


    @Column(name="id",table="reservas",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Reservas(){

    }


   public Midias getMidia() {
        return this.midia;
    }


  public void setMidia (Midias midia) {
        this.midia = midia;
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



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }

}

