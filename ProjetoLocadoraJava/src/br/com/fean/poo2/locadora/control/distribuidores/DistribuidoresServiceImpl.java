package br.com.fean.poo2.locadora.control.distribuidores;

import br.com.fean.poo2.locadora.model.Distribuidores;
import br.com.fean.poo2.locadora.model.DistribuidoresDAO;
import java.util.ArrayList;


public class DistribuidoresServiceImpl implements DistribuidoresService{
    DistribuidoresDAO distribuidoresDAO = new DistribuidoresDAO();

    @Override
    public void inserirDistribuidor(Distribuidores distribuidor) {
        if (distribuidor.getRazaoSocial().length() > 3) {
            distribuidoresDAO.inserirDistribuidor(distribuidor);
        }
    }

    @Override
    public void alterarDistribuidor(Distribuidores distribuidor) {
       distribuidoresDAO.alterarDistribuidor(distribuidor);
    }

    @Override
    public void deletarDistribuidor(Distribuidores distribuidor) {
        distribuidoresDAO.deletarDistribuidor(distribuidor);
    }

    @Override
    public Distribuidores retornarDistribuidor(Integer id) {
       return distribuidoresDAO.retornarDistribuidor(id);
    }

    @Override
    public ArrayList<Distribuidores> retornarDistribuidores() {
       return distribuidoresDAO.retornarDistribuidores();
    }
    
}
