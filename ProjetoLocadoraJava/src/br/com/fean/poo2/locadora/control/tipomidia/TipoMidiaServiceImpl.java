package br.com.fean.poo2.locadora.control.tipomidia;

import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidia;
import br.com.fean.poo2.locadora.modelo.tipomidia.TipoMidiaDAO;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author Usuario
 */
public class TipoMidiaServiceImpl implements TipoMidiaService {

    TipoMidiaDAO tipomidiaDAO = new TipoMidiaDAO();

    @Override
    public void inserirTipoMidia(String nome) throws Exception {
            TipoMidia tipomidia = new TipoMidia();
            tipomidia.setNome(nome);
            tipomidiaDAO.inserirTipoMidia(tipomidia);
    }

    @Override
    public void alterarTipoMidia(Integer id, String nome) throws Exception {

        TipoMidia tipomidia = new TipoMidia();
        tipomidia.setId(tipomidia.getId());
        tipomidia.setNome(tipomidia.getNome());

        tipomidiaDAO.alterarTipoMidia(tipomidia);

    }

    @Override
    public void deletarTipoMidia(TipoMidia tipomidia) throws Exception {
        tipomidiaDAO.deletarCurso(tipomidia);
    }

    @Override
    public TipoMidia retornarTipoMidia(int id) throws Exception {
        return tipomidiaDAO.retornarTipoMidia(id);
    }

    @Override
    public TipoMidia retornarTipoMidia(String nome) throws Exception {
        return tipomidiaDAO.retornarTipoMidia(nome);
    }

    @Override
    public ArrayList<TipoMidia> retornarTipoMidia() throws Exception {
        return tipomidiaDAO.retornarTipoMidias();
    }
 
    @Override
    public boolean pesquisaCampoTabela(JTable tabela, String campo) {
        for (int i = 0; i < tabela.getRowCount(); i++) {
            if (tabela.getValueAt(i, 1).toString().equals(campo)) {
                return true;
            }
        }
        return false;
    }
}