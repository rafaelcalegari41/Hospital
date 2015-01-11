package br.com.hospital.business;

import java.util.List;

import br.com.hospital.model.AgendamentoDAO;
import br.com.hospital.pojo.Agendamento;
import br.com.hospital.pojo.Pessoa;

public class AgendamentoBO {
	
	private AgendamentoDAO dao = new AgendamentoDAO();
		
	public boolean salvar(Agendamento agendamento){
		return dao.save(agendamento);
	}
	
	public boolean atualizar(Agendamento agendamento){
		return dao.update(agendamento);
	}
	
	public boolean deletar(Agendamento agendamento){
		return dao.delete(agendamento);
	}
	
	public List<Agendamento> listar(){
		return dao.findAll();
	}

}
