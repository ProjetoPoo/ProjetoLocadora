package br.com.fean.poo2.locadora.control.distribuidor;


import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.distribuidor.DistribuidorDAO;
import java.util.ArrayList;


public class DistribuidorServiceImpl implements DistribuidorService{
    DistribuidorDAO distribuidorDAO = new DistribuidorDAO();

    @Override
    public void inserirDistribuidor(Distribuidor distribuidor)throws Exception {
        if (distribuidor.getRazaoSocial().length() > 3) {
            distribuidorDAO.inserirDistribuidor(distribuidor);
        }
    }

    @Override
    public void alterarDistribuidor(Distribuidor distribuidor)throws Exception {
       distribuidorDAO.alterarDistribuidor(distribuidor);
    }

    @Override
    public void deletarDistribuidor(Distribuidor distribuidor)throws Exception {
        distribuidorDAO.deletarDistribuidor(distribuidor);
    }

    @Override
    public Distribuidor retornarDistribuidor(Integer id)throws Exception {
       return distribuidorDAO.retornarDistribuidor(id);
    }

    @Override
    public ArrayList<Distribuidor> retornarDistribuidores()throws Exception {
       return distribuidorDAO.retornarDistribuidores();
    }
    
}
