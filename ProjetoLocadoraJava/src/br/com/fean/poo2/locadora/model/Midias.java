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
@Table(name="midias")
public  class Midias implements Serializable {


    @Column(name="situacao",table="midias")
    @Basic
    private Integer situacao;


    @Column(name="nrserie",table="midias",length=100)
    @Basic
    private String nrserie;


    @ManyToOne(optional=false,targetEntity=TipoMidias.class)
    @JoinColumn(name="tipo_midia",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private TipoMidias tipoMidia;


    @OneToMany(targetEntity=LocacaoMidia.class,mappedBy="midia")
    private Collection<LocacaoMidia> locacaoMidiaCollection;


    @OneToMany(targetEntity=Reservas.class,mappedBy="midia")
    private Collection<Reservas> reservasCollection;


    @ManyToOne(optional=false,targetEntity=Titulos.class)
    @JoinColumn(name="titulo",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Titulos titulo;


    @Column(name="id",table="midias",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="dataaquisicao",table="midias")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataaquisicao;


    @ManyToOne(optional=false,targetEntity=Distribuidores.class)
    @JoinColumn(name="distribuidor",referencedColumnName="id",insertable=true,nullable=true,unique=false,updatable=true)
    private Distribuidores distribuidor;

    public Midias(){

    }


   public Integer getSituacao() {
        return this.situacao;
    }


  public void setSituacao (Integer situacao) {
        this.situacao = situacao;
    }



   public String getNrserie() {
        return this.nrserie;
    }


  public void setNrserie (String nrserie) {
        this.nrserie = nrserie;
    }



   public TipoMidias getTipoMidia() {
        return this.tipoMidia;
    }


  public void setTipoMidia (TipoMidias tipoMidia) {
        this.tipoMidia = tipoMidia;
    }



   public Collection<LocacaoMidia> getLocacaoMidiaCollection() {
        return this.locacaoMidiaCollection;
    }


  public void setLocacaoMidiaCollection (Collection<LocacaoMidia> locacaoMidiaCollection) {
        this.locacaoMidiaCollection = locacaoMidiaCollection;
    }



   public Collection<Reservas> getReservasCollection() {
        return this.reservasCollection;
    }


  public void setReservasCollection (Collection<Reservas> reservasCollection) {
        this.reservasCollection = reservasCollection;
    }



   public Titulos getTitulo() {
        return this.titulo;
    }


  public void setTitulo (Titulos titulo) {
        this.titulo = titulo;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Date getDataaquisicao() {
        return this.dataaquisicao;
    }


  public void setDataaquisicao (Date dataaquisicao) {
        this.dataaquisicao = dataaquisicao;
    }



   public Distribuidores getDistribuidor() {
        return this.distribuidor;
    }


  public void setDistribuidor (Distribuidores distribuidor) {
        this.distribuidor = distribuidor;
    }

}

