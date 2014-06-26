package br.com.fean.poo2.locadora.control.socio;

import br.com.fean.poo2.locadora.control.socio.*;
import br.com.fean.poo2.locadora.modelo.socio.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocioServiceImpl implements SocioService {

    SocioDAO socioDAO = new SocioDAO();

    @Override
    public void inserirSocio(Socio socio) {
        if (socio.getNome().length() > 3) {
            try {
                socioDAO.inserirSocio(socio);
            } catch (Exception ex) {
                Logger.getLogger(SocioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void alterarSocio(Socio socio) {
        try {
            socioDAO.alterarSocio(socio);
        } catch (Exception ex) {
            Logger.getLogger(SocioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletarSocio(Socio socio) {
        try {
            socioDAO.deletarSocio(socio);
        } catch (Exception ex) {
            Logger.getLogger(SocioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
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
