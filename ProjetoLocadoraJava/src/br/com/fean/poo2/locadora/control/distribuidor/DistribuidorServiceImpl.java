package br.com.fean.poo2.locadora.control.distribuidor;

import br.com.fean.poo2.locadora.modelo.distribuidor.Distribuidor;
import br.com.fean.poo2.locadora.modelo.distribuidor.DistribuidorDAO;
import java.util.ArrayList;

public class DistribuidorServiceImpl implements DistribuidorService {

    DistribuidorDAO distribuidorDAO = new DistribuidorDAO();

    @Override
    public void inserirDistribuidor(String cnpj, String razaoSocial, String endereco, String pessoaContato, String fone) throws Exception {

        if (razaoSocial.length() > 3) {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.setCnpj(cnpj);
            distribuidor.setRazaoSocial(razaoSocial);
            distribuidor.setEndereco(endereco);
            distribuidor.setPessoaContato(pessoaContato);
            distribuidor.setFone(fone);

            distribuidorDAO.inserirDistribuidor(distribuidor);
        }
    }

    @Override
    public void alterarDistribuidor(Integer id, String cnpj, String razaoSocial, String endereco, String pessoaContato, String fone) throws Exception {
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.setId(id);
        distribuidor.setCnpj(cnpj);
        distribuidor.setRazaoSocial(razaoSocial);
        distribuidor.setEndereco(endereco);
        distribuidor.setPessoaContato(pessoaContato);
        distribuidor.setFone(fone);

        distribuidorDAO.alterarDistribuidor(distribuidor);
    }

    @Override
    public void deletarDistribuidor(Distribuidor distribuidor) throws Exception {
        distribuidorDAO.deletarDistribuidor(distribuidor);
    }

    @Override
    public Distribuidor retornarDistribuidor(Integer id) throws Exception {
        return distribuidorDAO.retornarDistribuidor(id);
    }

    @Override
    public ArrayList<Distribuidor> retornarDistribuidores() throws Exception {
        return distribuidorDAO.retornarDistribuidores();
    }

    @Override
    public ArrayList<Distribuidor> pesquisaDistribuidorRazaoSocial(String razaoSocial) throws Exception {
        return distribuidorDAO.pesquisaDistribuidorNome(razaoSocial);
    }

    @Override
    public ArrayList<Distribuidor> pesquisaDistribuidorCNPJ(String cnpj) throws Exception {
        return distribuidorDAO.pesquisaDistribuidorCNPJ(cnpj);
    }

}
