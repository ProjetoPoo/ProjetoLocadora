package br.com.fean.poo2.locadora.modelo.locacaomidia;
// Generated 01/07/2014 09:45:20 by Hibernate Tools 3.6.0


import br.com.fean.poo2.locadora.modelo.locacao.Locacao;
import br.com.fean.poo2.locadora.modelo.midia.Midia;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LocacaoMidia generated by hbm2java
 */
public class LocacaoMidia  implements java.io.Serializable {


     private Integer id;
     private Locacao locacao;
     private Midia midias;
     private Boolean pago;
     private Date dtPrevDevolucao;
     private Set devolucaos = new HashSet(0);

    public LocacaoMidia() {
    }

	
    public LocacaoMidia(Locacao locacao, Midia midias) {
        this.locacao = locacao;
        this.midias = midias;
    }
    
    public LocacaoMidia(Locacao locacao, Midia midias, Boolean pago, Date dtPrevDevolucao, Set devolucaos) {
       this.locacao = locacao;
       this.midias = midias;
       this.pago = pago;
       this.dtPrevDevolucao = dtPrevDevolucao;
       this.devolucaos = devolucaos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Locacao getLocacao() {
        return this.locacao;
    }
    
    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }
    public Midia getMidias() {
        return this.midias;
    }
    
    public void setMidias(Midia midias) {
        this.midias = midias;
    }
    public Boolean getPago() {
        return this.pago;
    }
    
    public void setPago(Boolean pago) {
        this.pago = pago;
    }
    public Date getDtPrevDevolucao() {
        return this.dtPrevDevolucao;
    }
    
    public void setDtPrevDevolucao(Date dtPrevDevolucao) {
        this.dtPrevDevolucao = dtPrevDevolucao;
    }
    public Set getDevolucaos() {
        return this.devolucaos;
    }
    
    public void setDevolucaos(Set devolucaos) {
        this.devolucaos = devolucaos;
    }




}


