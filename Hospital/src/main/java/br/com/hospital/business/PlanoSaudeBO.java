package br.com.hospital.business;

import java.util.List;

import br.com.hospital.model.PlanoSaudeDAO;
import br.com.hospital.pojo.PlanoDeSaude;

public class PlanoSaudeBO {
	
	private PlanoSaudeDAO dao = new PlanoSaudeDAO();
		
	public boolean salvar(PlanoDeSaude pessoa){
		
		
		return dao.save(pessoa);
	}
	
	public boolean atualizar(PlanoDeSaude pessoa){
		return dao.update(pessoa);
	}
	
	public boolean deletar(PlanoDeSaude pessoa){
		return dao.delete(pessoa);
	}
	
	public List<PlanoDeSaude> listar(){
		return dao.findAll();
	}

}
