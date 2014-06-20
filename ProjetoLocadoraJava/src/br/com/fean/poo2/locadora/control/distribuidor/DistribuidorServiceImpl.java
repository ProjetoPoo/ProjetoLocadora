package br.com.fean.poo2.locadora.control.distribuidor;


import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.distribuidor.DistribuidorDAO;
import java.util.ArrayList;


public class DistribuidorServiceImpl implements DistribuidorService{
    DistribuidorDAO distribuidorDAO = new DistribuidorDAO();

    @Override
    public void inserirDistribuidor(Distribuidor distribuidor) {
        if (distribuidor.getRazaoSocial().length() > 3) {
            distribuidorDAO.inserirDistribuidor(distribuidor);
        }
    }

    @Override
    public void alterarDistribuidor(Distribuidor distribuidor) {
       distribuidorDAO.alterarDistribuidor(distribuidor);
    }

    @Override
    public void deletarDistribuidor(Distribuidor distribuidor) {
        distribuidorDAO.deletarDistribuidor(distribuidor);
    }

    @Override
    public Distribuidor retornarDistribuidor(Integer id) {
       return distribuidorDAO.retornarDistribuidor(id);
    }

    @Override
    public ArrayList<Distribuidor> retornarDistribuidor() {
       return distribuidorDAO.retornarDistribuidores();
    }
    
}
