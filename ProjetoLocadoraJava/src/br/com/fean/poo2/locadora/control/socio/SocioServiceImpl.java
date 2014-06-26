
package br.com.fean.poo2.locadora.control.socio;

import br.com.fean.poo2.locadora.modelo.socio.SocioDAO;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import java.util.ArrayList;

public class SocioServiceImpl implements SocioService{
    
    SocioDAO socioDAO = new SocioDAO();

    @Override
    public void inserirSocio(String nome) throws Exception {        
        Socio socio = new Socio();
        socio.setNome(nome);        
        socioDAO.inserirSocio(socio);        
    }

    @Override
    public void alterarSocio(Integer id, String nome) throws Exception {
        Socio socio = new Socio();
        socio.setId(id);
        socio.setNome(nome);  
        socioDAO.alterarSocio(socio);        
    }

    @Override
    public void deletarSocio(Socio socio) throws Exception {
        socioDAO.deletarSocio(socio);        
    }

    @Override
    public Socio retornarSocio(int cpf) throws Exception {
        return socioDAO.retornarSocio(cpf);
    }

    @Override
    public Socio retornarSocio(String nome) throws Exception {
        return socioDAO.retornarSocio(nome);
    }

    @Override
    public ArrayList<Socio> retornarTodosSocio() throws Exception {
        return socioDAO.retornarTodosSocio();
    }

    @Override
    public ArrayList<Socio> pesquisarSocioNome(String nome) throws Exception {
        return socioDAO.pesquisarSocioNome(nome);
    }

    @Override
    public Socio pesquisarSocioCPF(String cpf) throws Exception {
        return socioDAO.pesquisarSocioCPF(cpf);
    }    
}