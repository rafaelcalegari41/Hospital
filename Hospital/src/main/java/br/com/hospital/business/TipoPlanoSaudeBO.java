package br.com.hospital.business;

import java.util.List;

import br.com.hospital.model.TipoPlanoSaudeDAO;
import br.com.hospital.pojo.TipoPlanoSaude;

public class TipoPlanoSaudeBO {
	
	private TipoPlanoSaudeDAO dao = new TipoPlanoSaudeDAO();
		
	public List<TipoPlanoSaude> listar(){
		return dao.findAll();
	}

}
