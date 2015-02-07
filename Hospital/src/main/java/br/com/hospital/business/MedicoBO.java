package br.com.hospital.business;

import br.com.hospital.model.MedicoDAO;
import java.util.List;

import br.com.hospital.pojo.Medico;

public class MedicoBO {
	
	private MedicoDAO dao = new MedicoDAO();
		
	public boolean salvar(Medico pessoa){
		
		
		return dao.save(pessoa);
	}
	
	public boolean atualizar(Medico pessoa){
		return dao.update(pessoa);
	}
	
	public boolean deletar(Medico pessoa){
		return dao.delete(pessoa);
	}
	
	public List<Medico> listar(){
		return dao.findAll();
	}

}
