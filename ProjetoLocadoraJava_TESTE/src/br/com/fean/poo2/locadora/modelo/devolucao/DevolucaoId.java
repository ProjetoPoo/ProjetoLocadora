package br.com.fean.poo2.locadora.modelo.devolucao;
// Generated 19/06/2014 18:08:01 by Hibernate Tools 3.6.0



/**
 * DevolucaoId generated by hbm2java
 */
public class DevolucaoId  implements java.io.Serializable {


     private int id;
     private int locacaoMidia;

    public DevolucaoId() {
    }

    public DevolucaoId(int id, int locacaoMidia) {
       this.id = id;
       this.locacaoMidia = locacaoMidia;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getLocacaoMidia() {
        return this.locacaoMidia;
    }
    
    public void setLocacaoMidia(int locacaoMidia) {
        this.locacaoMidia = locacaoMidia;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DevolucaoId) ) return false;
		 DevolucaoId castOther = ( DevolucaoId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getLocacaoMidia()==castOther.getLocacaoMidia());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getLocacaoMidia();
         return result;
   }   


}


