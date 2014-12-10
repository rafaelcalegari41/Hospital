package br.com.hospital.business;

import java.util.List;

import br.com.hospital.model.UnidadeFederativaDAO;
import br.com.hospital.pojo.UnidadeFederativa;

public class UnidadeFederativaBO {
	
	private UnidadeFederativaDAO dao = new UnidadeFederativaDAO();
		
	public List<UnidadeFederativa> listar(){
		return dao.findAll();
	}

}
