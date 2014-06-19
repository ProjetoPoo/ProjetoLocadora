package br.com.fean.poo2.locadora.model;

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
@Table(name="locacao_midia")
public  class LocacaoMidia implements Serializable {

//    @ManyToOne(optional=false,targetEntity=Midias.class)
    @JoinColumn(name="midia",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Midias midia;

    @Column(name="id",table="locacao_midia",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

//    @ManyToOne(optional=false,targetEntity=Locacao.class)
    @JoinColumn(name="locacao",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Locacao locacao;

    @Column(name="pago",table="locacao_midia")
    @Basic
    private Boolean pago;

    @OneToMany(targetEntity=Devolucao.class,mappedBy="locacaoMidia1")
    private Collection<Devolucao> devolucaoCollection;

    public LocacaoMidia(){

    }

   public Midias getMidia() {
        return this.midia;
    }

  public void setMidia (Midias midia) {
        this.midia = midia;
    }

   public Integer getId() {
        return this.id;
    }

  public void setId (Integer id) {
        this.id = id;
    }

   public Locacao getLocacao() {
        return this.locacao;
    }

  public void setLocacao (Locacao locacao) {
        this.locacao = locacao;
    }

    public Boolean isPago() {
        return this.pago;
    }

  public void setPago (Boolean pago) {
        this.pago = pago;
    }

   public Collection<Devolucao> getDevolucaoCollection() {
        return this.devolucaoCollection;
    }

  public void setDevolucaoCollection (Collection<Devolucao> devolucaoCollection) {
        this.devolucaoCollection = devolucaoCollection;
    }
}

