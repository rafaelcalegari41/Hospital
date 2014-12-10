package br.com.hospital.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import br.com.hospital.business.PessoaBO;
import br.com.hospital.model.MunicipioDAO;
import br.com.hospital.model.PessoaDAO;
import br.com.hospital.model.TipoPlanoSaudeDAO;
import br.com.hospital.model.UnidadeFederativaDAO;
import br.com.hospital.pojo.Municipio;
import br.com.hospital.pojo.Paciente;
import br.com.hospital.pojo.Pessoa;
import br.com.hospital.pojo.TipoPlanoSaude;
import br.com.hospital.pojo.UnidadeFederativa;


@ManagedBean
@RequestScoped
public class AtendenteMB {
	
	@PostConstruct
	public void inicio(){
		
	}
}
