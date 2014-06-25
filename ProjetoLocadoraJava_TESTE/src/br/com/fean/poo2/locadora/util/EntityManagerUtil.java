package br.com.fean.poo2.locadora.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
public class EntityManagerUtil {
  private static EntityManagerFactory emf;
         public static EntityManager getEntityManager() {
                 if (emf == null){
                          emf = Persistence.createEntityManagerFactory("ProjetoLocadoraJavaPU");
                 }
                 return emf.createEntityManager();
         }
}
