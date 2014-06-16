package br.com.fean.poo2.locadora.model;


import java.io.Serializable;

import java.lang.Double;
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
@Table(name="devolucao")
public  class Devolucao implements Serializable {


    @Column(name="desconto",table="devolucao",precision=22)
    @Basic
    private Double desconto;


    @Column(name="hora",table="devolucao")
    @Temporal(TemporalType.TIME)
    @Basic
    private Date hora;


    @Column(name="dias_atraso",table="devolucao")
    @Basic
    private Integer diasAtraso;


    @Column(name="data_2",table="devolucao")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date data2;


    @Column(name="multa",table="devolucao",precision=22)
    @Basic
    private Double multa;


    @Column(name="valor",table="devolucao",precision=22)
    @Basic
    private Double valor;


    @Column(name="locacao_midia",table="devolucao",nullable=false)
    @Id
    private int locacaoMidia;


    @Column(name="id",table="devolucao",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;


    @ManyToOne(optional=false,targetEntity=LocacaoMidia.class)
    @JoinColumn(name="locacao_midia",referencedColumnName="id",insertable=false,nullable=true,unique=false,updatable=false)
    private LocacaoMidia locacaoMidia1;


    @ManyToOne(optional=false,targetEntity=Funcionarios.class)
    @JoinColumn(name="funcionario",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Funcionarios funcionario;

    public Devolucao(){

    }


   public Double getDesconto() {
        return this.desconto;
    }


  public void setDesconto (Double desconto) {
        this.desconto = desconto;
    }



   public Date getHora() {
        return this.hora;
    }


  public void setHora (Date hora) {
        this.hora = hora;
    }



   public Integer getDiasAtraso() {
        return this.diasAtraso;
    }


  public void setDiasAtraso (Integer diasAtraso) {
        this.diasAtraso = diasAtraso;
    }



   public Date getData2() {
        return this.data2;
    }


  public void setData2 (Date data2) {
        this.data2 = data2;
    }



   public Double getMulta() {
        return this.multa;
    }


  public void setMulta (Double multa) {
        this.multa = multa;
    }



   public Double getValor() {
        return this.valor;
    }


  public void setValor (Double valor) {
        this.valor = valor;
    }



   public int getLocacaoMidia() {
        return this.locacaoMidia;
    }


  public void setLocacaoMidia (int locacaoMidia) {
        this.locacaoMidia = locacaoMidia;
    }



   public int getId() {
        return this.id;
    }


  public void setId (int id) {
        this.id = id;
    }



   public LocacaoMidia getLocacaoMidia1() {
        return this.locacaoMidia1;
    }


  public void setLocacaoMidia1 (LocacaoMidia locacaoMidia1) {
        this.locacaoMidia1 = locacaoMidia1;
    }



   public Funcionarios getFuncionario() {
        return this.funcionario;
    }


  public void setFuncionario (Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

}

