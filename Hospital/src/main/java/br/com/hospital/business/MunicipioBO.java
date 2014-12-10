package br.com.hospital.business;

import java.util.List;

import br.com.hospital.model.MunicipioDAO;
import br.com.hospital.pojo.Municipio;

public class MunicipioBO {
	
	private MunicipioDAO dao = new MunicipioDAO();
		
	public List<Municipio> listarPorNome(String parametro, String valor){
		return dao.findByName(parametro, valor);
	}

}
