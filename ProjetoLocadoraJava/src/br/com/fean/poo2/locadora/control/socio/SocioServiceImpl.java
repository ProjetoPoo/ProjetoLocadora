package br.com.fean.poo2.locadora.control.socio;
import br.com.fean.poo2.locadora.modelo.socio.SocioDAO;
import br.com.fean.poo2.locadora.modelo.socio.Socio;
import java.util.ArrayList;
import br.com.fean.poo2.locadora.control.socio.*;
import br.com.fean.poo2.locadora.modelo.socio.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocioServiceImpl implements SocioService {

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
    public Socio retornarSocioId(int id) throws Exception {
        return socioDAO.retornarSocio(id);
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

    @Override
    public ArrayList<Socio> pesquisaSocioCodigo(Integer codigo) {
        ArrayList<Socio> socios = new ArrayList<Socio>();
        try {
            socios = socioDAO.pesquisaSocioCodigo(codigo);
        } catch (Exception ex) {
            Logger.getLogger(SocioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return socios;
    }

    @Override
    public ArrayList<Socio> pesquisaSocioNome(String nome) {
        ArrayList<Socio> socios = new ArrayList<Socio>();
        try {
            socios = socioDAO.pesquisaSocioNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(SocioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return socios;
    }
    
    @Override
    public ArrayList<Socio> pesquisaSocioCPF(String cpf) {
        ArrayList<Socio> socios = new ArrayList<Socio>();
        try {
            socios = socioDAO.pesquisaSocioCPF(cpf);
        } catch (Exception ex) {
            Logger.getLogger(SocioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return socios;
    }

    @Override
    public ArrayList<Socio> retornarSocios() {
        ArrayList<Socio> socios = new ArrayList<Socio>();
        try {
            socios = socioDAO.retornaSocios();
        } catch (Exception ex) {
            Logger.getLogger(SocioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return socios;
    }

}