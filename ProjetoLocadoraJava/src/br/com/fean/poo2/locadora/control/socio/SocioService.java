package br.com.fean.poo2.locadora.control.socio;

import br.com.fean.poo2.locadora.control.socio.*;
import br.com.fean.poo2.locadora.modelo.socio.*;
import java.util.ArrayList;

public interface SocioService {
    
    public void inserirSocio (Socio socio); 
    public void alterarSocio (Socio socio); 
    public void deletarSocio (Socio socio); 
    public ArrayList<Socio> pesquisaSocioNome (String nome);
    public ArrayList<Socio> pesquisaSocioCPF (String cpf);
    public ArrayList<Socio> pesquisaSocioCodigo (Integer codigo);
    public ArrayList<Socio> retornarSocios(); 
}
