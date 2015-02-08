package br.com.hospital.business;

import java.util.List;

import br.com.hospital.model.PacienteDAO;
import br.com.hospital.pojo.Paciente;

public class PacienteBO {
	
	private PacienteDAO dao = new PacienteDAO();
		
	public boolean salvar(Paciente paciente){
		return dao.save(paciente);
	}
	
	public boolean atualizar(Paciente paciente){
		return dao.update(paciente);
	}
	
	public boolean deletar(Paciente paciente){
		return dao.delete(paciente);
	}
	
	public List<Paciente> listar(){
		return dao.findAll();
	}
	
	public List<Paciente> listarPorNome(String nome){
		return dao.findByName(nome, "");
	}

}
