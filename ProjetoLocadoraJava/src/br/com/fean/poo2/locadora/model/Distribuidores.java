package br.com.fean.poo2.locadora.model;

import java.io.Serializable;
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
@Table(name="distribuidores")
public  class Distribuidores implements Serializable {

    @Column(name="fone",table="distribuidores",length=100)
    @Basic
    private String fone;


    @Column(name="pessoa_contato",table="distribuidores",length=100)
    @Basic
    private String pessoaContato;


    @Column(name="endereco",table="distribuidores",length=200)
    @Basic
    private String endereco;


    @Column(name="id",table="distribuidores",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="cnpj",table="distribuidores",length=20)
    @Basic
    private String cnpj;


    @OneToMany(targetEntity=Midias.class,mappedBy="distribuidor")
    private Collection<Midias> midiasCollection;


    @Column(name="razao_social",table="distribuidores",length=100)
    @Basic
    private String razaoSocial;

    public Distribuidores(){

    }


   public String getFone() {
        return this.fone;
    }


  public void setFone (String fone) {
        this.fone = fone;
    }



   public String getPessoaContato() {
        return this.pessoaContato;
    }


  public void setPessoaContato (String pessoaContato) {
        this.pessoaContato = pessoaContato;
    }



   public String getEndereco() {
        return this.endereco;
    }


  public void setEndereco (String endereco) {
        this.endereco = endereco;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public String getCnpj() {
        return this.cnpj;
    }


  public void setCnpj (String cnpj) {
        this.cnpj = cnpj;
    }



   public Collection<Midias> getMidiasCollection() {
        return this.midiasCollection;
    }


  public void setMidiasCollection (Collection<Midias> midiasCollection) {
        this.midiasCollection = midiasCollection;
    }



   public String getRazaoSocial() {
        return this.razaoSocial;
    }


  public void setRazaoSocial (String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}

